package gim.boss.finchirp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FinChirpApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinChirpApplication.class, args);
	}

}
