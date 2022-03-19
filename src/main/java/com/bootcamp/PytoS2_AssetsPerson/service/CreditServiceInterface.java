package com.bootcamp.PytoS2_AssetsPerson.service;

import com.bootcamp.PytoS2_AssetsPerson.model.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditServiceInterface {

    void addCredit(Credit credit);

    Mono<Credit> findCreditById(Integer id);

    Flux<Credit> findAllCredit();

    Mono<Credit> updateCredit(Credit credit);

    Mono<Void> deleteCredit(Integer id);

    Mono<Credit> findCreditByIdClient(Integer id);
}
