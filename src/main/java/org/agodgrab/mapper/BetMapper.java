package org.agodgrab.mapper;

import org.agodgrab.domain.Bet;
import org.agodgrab.domain.BetDto;
import org.springframework.stereotype.Component;

@Component
public class BetMapper {

    public Bet mapToBet(BetDto betDto) {
        return new Bet(betDto.getFixture(), betDto.getOutcome(), betDto.getStake(), betDto.getOdds());
    }
}
