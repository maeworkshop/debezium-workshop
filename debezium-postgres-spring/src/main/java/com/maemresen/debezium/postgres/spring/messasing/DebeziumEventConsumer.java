package com.maemresen.debezium.postgres.spring.messasing;

import com.maemresen.debezium.postgres.spring.dto.DebeziumEventDto;
import com.maemresen.debezium.postgres.spring.service.AuditService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@RequiredArgsConstructor
@Component
public class DebeziumEventConsumer implements Consumer<DebeziumEventDto> {

    private final AuditService auditService;

    @Override
    public void accept(DebeziumEventDto debeziumEventDto) {
        try {
            auditService.logEvent(debeziumEventDto);
        } catch (Exception e) {
            log.error("Failed to processing consumed message {}", debeziumEventDto, e);
        }
    }
}
