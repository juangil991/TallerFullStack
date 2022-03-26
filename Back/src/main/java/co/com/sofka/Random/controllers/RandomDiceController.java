package co.com.sofka.Random.controllers;

import co.com.sofka.Random.dtos.RandomDiceDto;
import co.com.sofka.Random.models.RandomDice;
import co.com.sofka.Random.services.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class RandomDiceController {

    @Autowired
    RandomService diceServices;

    @PostMapping("")
    public Mono<RandomDice> defaultRandomDice(@RequestBody RandomDiceDto dices){
        return diceServices.RandomDices(dices.getDices());
    }

    @GetMapping("")
    public Flux<RandomDice> history(){
        return diceServices.historyDices();
    }
}
