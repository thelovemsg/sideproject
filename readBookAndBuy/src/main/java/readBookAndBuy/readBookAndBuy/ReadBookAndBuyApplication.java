package readBookAndBuy.readBookAndBuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ReadBookAndBuyApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReadBookAndBuyApplication.class, args);
	}
}
