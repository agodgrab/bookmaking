package org.agodgrab;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface BetRepository extends MongoRepository<Bet, String> {

    List<Bet> findByFixture(String fixture);
}
