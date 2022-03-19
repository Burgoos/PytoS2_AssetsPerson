package com.bootcamp.PytoS2_AssetsPerson.service;

import com.bootcamp.PytoS2_AssetsPerson.model.Credit;
import com.bootcamp.PytoS2_AssetsPerson.model.CreditCard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditCardServiceInterface {

    void addCreditCard(CreditCard creditCard);

    Mono<CreditCard> findCreditCardById(Integer id);

    Flux<CreditCard> findAllCreditCard();

    Mono<CreditCard> updateCreditCard(CreditCard credit);

    Mono<Void> deleteCreditCard(Integer id);

    Mono<CreditCard> findCreditCardByIdClient(Integer id);
}
