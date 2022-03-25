package co.com.sofka.Random.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RandomDice {

    @Id
    private String id;

    private String randomNumber;
}
