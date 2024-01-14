package com.maemresen.debezium.postgres.spring.messasing;

import com.maemresen.debezium.postgres.spring.dto.DebeziumEventDto;
import com.maemresen.debezium.postgres.spring.entity.Audit;
import com.maemresen.debezium.postgres.spring.repository.AuditRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.function.Consumer;

@Slf4j
@RequiredArgsConstructor
@Component
public class DebeziumEventConsumer implements Consumer<DebeziumEventDto> {

    private final AuditRepository auditRepository;

    @Override
    public void accept(DebeziumEventDto eventDto) {
        try {
            final var payload = eventDto.getPayload();
            final var source = payload.getSource();
            final var audit = Audit.builder()
                    .tableName(source.getTable())
                    .operation(payload.getOperationType().name())
                    .time(source.getTransactionTime())
                    .value(Optional.ofNullable(payload.getAfter()).map(Object::toString).orElse(null))
                    .build();
            final Audit savedAudit = auditRepository.save(audit);
            log.info("{} event on {} table is audited as {}",
                    payload.getOperationType(),
                    source.getTable(),
                    savedAudit);
        } catch (Exception e) {
            log.error("Failed to processing consumed message {}", eventDto, e);
        }
    }
}
