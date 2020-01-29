package org.agodgrab.controller;

import org.agodgrab.domain.Bet;
import org.agodgrab.domain.BetMessageDto;
import org.agodgrab.mapper.BetMapper;
import org.agodgrab.mapper.BetOutputMapper;
import org.agodgrab.service.BetOutputService;
import org.agodgrab.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/message")
@CrossOrigin("*")
public class BetController {

    private BetService betService;
    private BetOutputService betOutputService;
    private BetMapper betMapper;
    private BetOutputMapper betOutputMapper;

    @Autowired
    public BetController(BetService betService, BetOutputService betOutputService, BetMapper betMapper, BetOutputMapper betOutputMapper){
        this.betService = betService;
        this.betOutputService = betOutputService;
        this.betMapper = betMapper;
        this.betOutputMapper = betOutputMapper;
    }

    @PostMapping(value = "/bet")
    public @ResponseBody String postBetMessage(@RequestBody BetMessageDto messageDto) {
        Bet bet = betMapper.mapToEntity(messageDto.getBet());
        betService.saveBet(bet);
        betService.uploadData(bet);
        return betOutputMapper.mapToDto(betOutputService.generateResponse(bet)).toString();
    }
}
