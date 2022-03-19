package com.bootcamp.PytoS2_AssetsPerson.controller;

import com.bootcamp.PytoS2_AssetsPerson.model.Credit;
import com.bootcamp.PytoS2_AssetsPerson.service.CreditServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/credit")
public class CreditController {

    @Autowired
    private CreditServiceImpl creditService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCredit(@RequestBody Credit credit){
        creditService.addCredit(credit);
    }

    @GetMapping
    @ResponseBody
    public Flux<Credit> findAll(){
        return creditService.findAllCredit();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mono<Credit>> findById(@PathVariable("id") Integer id){
        Mono<Credit> creditMono = creditService.findCreditById(id);
        return new ResponseEntity<Mono<Credit>>(creditMono, creditMono != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Mono<Credit> update(@RequestBody Credit credit){
        return creditService.updateCredit(credit);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id){
        creditService.deleteCredit(id).subscribe();
    }
}
