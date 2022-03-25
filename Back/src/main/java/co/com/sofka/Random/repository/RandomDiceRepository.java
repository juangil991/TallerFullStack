package co.com.sofka.Random.repository;

import co.com.sofka.Random.models.RandomDice;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RandomDiceRepository extends ReactiveCrudRepository<RandomDice, String> {
}
