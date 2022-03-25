package co.com.sofka.Random.controllers;

import co.com.sofka.Random.models.RandomDice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RandomDiceController {

    @PostMapping("")
    public Mono<RandomDice> defaultRandomDice(){
        return Mono.empty();
    }
}
