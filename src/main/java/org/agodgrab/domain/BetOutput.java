package org.agodgrab.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(collection = "bet_output")
public class BetOutput {

    @Id
    private String fixture;

    private BigDecimal first;
    private BigDecimal draw;
    private BigDecimal second;

    public BetOutput(String fixture, BigDecimal first, BigDecimal draw, BigDecimal second) {
        this.fixture = fixture;
        this.first = first;
        this.draw = draw;
        this.second = second;
    }

    public BetOutput(String fixture) {
        this.fixture = fixture;
        this.first = BigDecimal.ZERO;
        this.draw = BigDecimal.ZERO;
        this.second = BigDecimal.ZERO;
    }

    public BetOutput() {
    }

    public void updateFirst(BigDecimal newFirst) {
        this.first = this.first.add(newFirst);
    }

    public void updateDraw(BigDecimal newDraw) {
        this.draw = this.draw.add(newDraw);
    }

    public void updateSecond(BigDecimal newSecond) {
        this.second = this.second.add(newSecond);
    }

    public static BetOutput getNullBetOutput(){
        return new BetOutput("no fixture", BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO);
    }

    @Override
    public String toString() {
        return String.format("%s 1: %s X: %s 2: %s",
                fixture, first, draw, second);
    }

    public String getFixture() {
        return fixture;
    }

    public BigDecimal getFirst() {
        return first;
    }

    public BigDecimal getDraw() {
        return draw;
    }

    public BigDecimal getSecond() {
        return second;
    }
}
