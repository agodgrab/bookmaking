package org.agodgrab.repository;

import org.agodgrab.domain.BetOutput;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Repository
public interface BetOutputRepository extends MongoRepository<BetOutput, String> {

    @Override
    <S extends BetOutput> S save(S entity);

    Optional<BetOutput> findByFixture(String fixture);


}
