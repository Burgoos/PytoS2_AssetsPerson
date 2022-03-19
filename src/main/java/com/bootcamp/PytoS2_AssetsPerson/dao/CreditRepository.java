package com.bootcamp.PytoS2_AssetsPerson.dao;

import com.bootcamp.PytoS2_AssetsPerson.model.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CreditRepository extends ReactiveMongoRepository<Credit, Integer> {
    public Mono<Credit> findByIdClient(Integer idClient);
}
