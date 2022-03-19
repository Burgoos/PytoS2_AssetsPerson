package com.bootcamp.PytoS2_AssetsPerson.controller;

import com.bootcamp.PytoS2_AssetsPerson.model.CreditCard;
import com.bootcamp.PytoS2_AssetsPerson.service.CreditCardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/creditCard")
public class CreditCardController {

    @Autowired
    private CreditCardServiceImpl creditCardService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCreditCard(@RequestBody CreditCard creditCard){
        creditCardService.addCreditCard(creditCard);
    }

    @GetMapping
    @ResponseBody
    public Flux<CreditCard> findAll(){
        return creditCardService.findAllCreditCard();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mono<CreditCard>> findById(@PathVariable("id") Integer id){
        Mono<CreditCard> creditCardMono = creditCardService.findCreditCardById(id);
        return new ResponseEntity<Mono<CreditCard>>(creditCardMono, creditCardMono != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Mono<CreditCard> update(@RequestBody  CreditCard creditCard){
        return creditCardService.updateCreditCard(creditCard);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id){
        creditCardService.deleteCreditCard(id).subscribe();

    }
}
