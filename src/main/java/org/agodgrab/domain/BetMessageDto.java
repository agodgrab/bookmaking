package org.agodgrab.domain;

public class BetMessageDto {

    private String type;

    private BetDto bet;

    public BetMessageDto() {
    }

    public BetMessageDto(String type, BetDto betDto) {
        this.type = type;
        this.bet = betDto;
    }

    public String getType() {
        return type;
    }

    public BetDto getBet() {
        return bet;
    }

    @Override
    public String toString() {
        return "BetMessageDto{" +
                "type='" + type + '\'' +
                ", betDto=" + bet +
                '}';
    }
}
