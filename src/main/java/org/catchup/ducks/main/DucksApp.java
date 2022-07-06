package org.catchup.ducks.main;

import org.catchup.ducks.seed.FlyInDuckSquadToPond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DucksApp {
	
	// This needs to be moved to a configuration class
	@Autowired
	private static FlyInDuckSquadToPond flyInDuckSquadToPond;

	public static void main(String[] args) {
		SpringApplication.run(DucksApp.class, args);
		// This needs to be moved to a configuration class
		flyInDuckSquadToPond.flyIn();
	}

}
