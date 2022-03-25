package co.com.sofka.Random.controllers;

import co.com.sofka.Random.dtos.RandomDiceDto;
import co.com.sofka.Random.models.RandomDice;
import co.com.sofka.Random.services.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class RandomDiceController {

    @Autowired
    RandomService diceServices;

    @PostMapping("")
    public Flux<RandomDice> defaultRandomDice(@RequestBody RandomDiceDto dices){
        return diceServices.RandomDices(dices.getDices());
    }
}
