package co.com.sofka.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class RandomApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomApplication.class, args);
	}

}
