package org.agodgrab.controller;

import org.agodgrab.domain.Bet;
import org.agodgrab.domain.BetOutput;
import org.agodgrab.domain.BetMessageDto;
import org.agodgrab.mapper.BetMapper;
import org.agodgrab.service.BetOutputService;
import org.agodgrab.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/message")
@CrossOrigin("*")
public class BetController {

    @Autowired
    BetService betService;

    @Autowired
    BetOutputService betOutputService;

    @Autowired
    BetMapper betMapper;

    @PostMapping(value = "/bet")
    public @ResponseBody String postBetMessage(@RequestBody BetMessageDto messageDto) {
        Bet bet = betMapper.mapToBet(messageDto.getBet());
        betService.saveBet(bet);
        betService.uploadData(bet);
        return betOutputService.generateResponse(bet).toString();
    }
}
