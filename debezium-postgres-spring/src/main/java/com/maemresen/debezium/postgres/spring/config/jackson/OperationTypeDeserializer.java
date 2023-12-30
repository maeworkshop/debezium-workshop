package com.maemresen.debezium.postgres.spring.config.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.maemresen.debezium.postgres.spring.dto.DebeziumEventDto;

import java.io.IOException;

public class OperationTypeDeserializer extends JsonDeserializer<DebeziumEventDto.OperationType> {

    @Override
    public DebeziumEventDto.OperationType deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return DebeziumEventDto.OperationType.fromCode(jsonParser.getValueAsString());
    }
}