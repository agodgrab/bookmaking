package org.agodgrab.service;

import org.agodgrab.domain.Bet;
import org.agodgrab.repository.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BetService {

    private BetRepository betRepository;
    private BetOutputService betOutputService;

    @Autowired
    public BetService(BetRepository betRepository, BetOutputService betOutputService) {
        this.betRepository = betRepository;
        this.betOutputService = betOutputService;
    }

    public Bet saveBet(Bet bet) {
        return betRepository.save(bet);
    }

    public void uploadData(Bet bet) {
        betOutputService.uploading(bet);
    }

}
