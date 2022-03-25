package co.com.sofka.Random.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class RandomDice {

    @Id
    private String id;

    private List<Integer> randomDice;

    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Integer> getRandomDice() {
        return randomDice;
    }

    public void setRandomDice(List<Integer> randomDice) {
        this.randomDice = randomDice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
