package com.maemresen.debezium.postgres.spring.service;

import com.maemresen.debezium.postgres.spring.dto.DebeziumEventDto;
import com.maemresen.debezium.postgres.spring.entity.Audit;
import com.maemresen.debezium.postgres.spring.repository.AuditRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuditService {

    private final AuditRepository auditRepository;

    public void logEvent(DebeziumEventDto eventDto) {
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
    }
}
