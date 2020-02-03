package org.agodgrab.domain;

import java.math.BigDecimal;

public class BetOutputDto {

    private String fixture;
    private BigDecimal first;
    private BigDecimal draw;
    private BigDecimal second;

    public BetOutputDto() {
    }

    public BetOutputDto(String fixture, BigDecimal first, BigDecimal draw, BigDecimal second) {
        this.fixture = fixture;
        this.first = first;
        this.draw = draw;
        this.second = second;
    }

    public BetOutputDto(String fixture) {
        this.fixture = fixture;
        this.first = BigDecimal.ZERO;
        this.draw = BigDecimal.ZERO;
        this.second = BigDecimal.ZERO;
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

    @Override
    public String toString() {
        return String.format("%s 1: %s X: %s 2: %s",
                fixture, first, draw, second);
    }
}
