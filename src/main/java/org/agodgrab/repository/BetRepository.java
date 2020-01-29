package org.agodgrab.repository;

import org.agodgrab.domain.Bet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface BetRepository extends MongoRepository<Bet, String> {

    List<Bet> findByFixture(String fixture);
}
