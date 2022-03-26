package co.com.sofka.Random;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
class RandomDiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void TestRandom(){
		Random random =new Random();
		List<Integer>prueba= new ArrayList<>();
		var pruebitas=Flux.just(prueba)
				.repeat(5)
				.subscribe(p->{
					int intRandoms= random.nextInt(6-1)+1;
					prueba.add(intRandoms);});

		System.out.println(prueba);



	}

}
