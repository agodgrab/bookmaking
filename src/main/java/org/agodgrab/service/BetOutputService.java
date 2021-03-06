package org.agodgrab.service;

import org.agodgrab.domain.Bet;
import org.agodgrab.domain.BetOutput;
import org.agodgrab.repository.BetOutputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class BetOutputService {

    private BetOutputRepository repository;

    @Autowired
    public BetOutputService(BetOutputRepository repository) {
        this.repository = repository;
    }

    public BetOutput uploading(Bet bet) {
        return update(bet, findByFixture(bet.getFixture()).orElse(new BetOutput(bet.getFixture())));
    }

    public BetOutput generateResponse(Bet bet){
        return findByFixture(bet.getFixture()).orElse(BetOutput.getNullBetOutput());
    }

    private Optional<BetOutput> findByFixture(String fixture) {
        return repository.findByFixture(fixture);
    }

    private BetOutput update(Bet bet, BetOutput betOutput) {
        String outcome = bet.getOutcome();
        switch (outcome) {
            case "1":
                betOutput.updateFirst(bet.getStake());
                break;
            case "X":
                betOutput.updateDraw(bet.getStake());
                break;
            case "2":
                betOutput.updateSecond(bet.getStake());
                break;
        }
        return repository.save(betOutput);
    }
}
