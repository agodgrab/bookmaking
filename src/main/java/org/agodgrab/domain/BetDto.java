package org.agodgrab.domain;

import java.math.BigDecimal;

public class BetDto {

    private String fixture;
    private String outcome;
    private BigDecimal stake;
    private BigDecimal odds;

    public String getFixture() {
        return fixture;
    }

    public String getOutcome() {
        return outcome;
    }

    public BigDecimal getStake() {
        return stake;
    }

    public BigDecimal getOdds() {
        return odds;
    }

    public BetDto() {
    }

    public BetDto(String fixture, String outcome, BigDecimal stake, BigDecimal odds) {
        this.fixture = fixture;
        this.outcome = outcome;
        this.stake = stake;
        this.odds = odds;
    }
}
