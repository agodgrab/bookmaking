package org.agodgrab.mapper;

import org.agodgrab.domain.Bet;
import org.agodgrab.domain.BetDto;
import org.springframework.stereotype.Component;

@Component
public class BetMapper implements Mapper<Bet, BetDto>{

    @Override
    public BetDto mapToDto(Bet entity) {
        return new BetDto(entity.getFixture(), entity.getOutcome(), entity.getStake(), entity.getOdds());
    }

    @Override
    public Bet mapToEntity(BetDto dto) {
        return new Bet(dto.getFixture(), dto.getOutcome(), dto.getStake(), dto.getOdds());
    }
}
