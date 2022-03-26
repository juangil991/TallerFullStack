package co.com.sofka.Random.services;

import co.com.sofka.Random.models.RandomDice;
import co.com.sofka.Random.repository.RandomDiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class RandomService {
    @Autowired
    public RandomDiceRepository diceRepository;

    public Flux<RandomDice> RandomDices(int dices){
        Random random =new Random();
        List<Integer>numberDices= new ArrayList<>();
        Flux.just(numberDices).repeat(dices-1).subscribe(p->{
            int intRandoms= random.nextInt(6-1)+1;
            numberDices.add(intRandoms);
        });
       return  Flux.just(new RandomDice())
                .map(document->{
                    document.setRandomDice(numberDices);
                    document.setDate(new Date());
                    return document;})
               .flatMap(diceRepository::save);
    }

    public Flux<RandomDice> historyDices(){
        return diceRepository.findAll();
    }
}
