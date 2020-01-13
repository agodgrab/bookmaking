package org.agodgrab;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "bet")
public class Bet {

    @Id
    public String id;

    private String fixture;
    private String outcome;
    private BigDecimal stake;
    private BigDecimal odds;

    public Bet(String fixture, String outcome, BigDecimal stake, BigDecimal odds) {
        this.fixture = fixture;
        this.outcome = outcome;
        this.stake = stake;
        this.odds = odds;
    }

    public Bet() {
    }

    @Override
    public String toString() {
        return String.format("Bet[id=%s, fixcture='%s', outcome='%s', stake = %s, odds= %s]",
                id, fixture, outcome, stake, odds);
    }
}
