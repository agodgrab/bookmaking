package org.agodgrab.mapper;

import org.agodgrab.domain.BetOutput;
import org.agodgrab.domain.BetOutputDto;
import org.springframework.stereotype.Component;

@Component
public class BetOutputMapper implements Mapper<BetOutput, BetOutputDto> {

    @Override
    public BetOutputDto mapToDto(BetOutput entity) {
        return new BetOutputDto(entity.getFixture(), entity.getFirst(), entity.getDraw(), entity.getSecond());
    }

    @Override
    public BetOutput mapToEntity(BetOutputDto dto) {
        return new BetOutput(dto.getFixture(), dto.getFirst(), dto.getDraw(), dto.getSecond());
    }
}
