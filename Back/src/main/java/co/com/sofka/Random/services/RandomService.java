package co.com.sofka.Random.services;

import co.com.sofka.Random.models.RandomDice;
import co.com.sofka.Random.repository.RandomDiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class RandomService {
    @Autowired
    public RandomDiceRepository diceRepository;

    public Mono<RandomDice> defaltRandomDice(){

        return Mono.empty();
    }
}
