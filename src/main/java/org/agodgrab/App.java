package org.agodgrab;

import org.agodgrab.domain.Bet;
import org.agodgrab.repository.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

@SpringBootApplication
public class App{ //implements CommandLineRunner {

    //private static MathContext mathContext = new MathContext(2, RoundingMode.HALF_UP);

    //@Autowired
    //private BetRepository betRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    /*
    @Override
    public void run(String... args) throws Exception {

        betRepository.save(new Bet("Liverpool FC - FC Porto", "1", new BigDecimal(20, mathContext), new BigDecimal(1.35, mathContext)));
        betRepository.save(new Bet("Liverpool FC - FC Porto", "x", new BigDecimal(10.50, mathContext), new BigDecimal(4.55, mathContext)));
        betRepository.save(new Bet("Ajax - Juventus", "x", new BigDecimal(5.50, mathContext), new BigDecimal(3.75, mathContext)));

        System.out.println("Bets found with findAll():");
        System.out.println("-------------------------------");
        for (Bet bet : betRepository.findAll()) {
            System.out.println(bet);
        }
        System.out.println();

        System.out.println("Bets found with findByFixture():");
        System.out.println("-------------------------------");
        betRepository.findByFixture("Liverpool FC - FC Porto").forEach(System.out::println);
    }
     */
}
