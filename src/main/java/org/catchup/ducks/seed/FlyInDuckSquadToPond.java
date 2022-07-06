package org.catchup.ducks.seed;

import org.catchup.ducks.domain.Duck;
import org.catchup.ducks.service.DuckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlyInDuckSquadToPond {
	@Autowired
	private DuckService duckService;
	
	public void flyIn() {
		duckService.upsertDuck(new Duck("Billy", "blue"));
		duckService.upsertDuck(new Duck("Mary", "blue"));
		duckService.upsertDuck(new Duck("Sally", "green"));
		duckService.upsertDuck(new Duck("Harry", "green"));
		duckService.upsertDuck(new Duck("Marta", "grey"));
		duckService.upsertDuck(new Duck("Barry", "sploched"));
		duckService.upsertDuck(new Duck("Fred", "green"));
		duckService.upsertDuck(new Duck("Sam", "grey"));
		duckService.upsertDuck(new Duck("Sue", "blue"));
		duckService.upsertDuck(new Duck("Betty", "salmon"));
		duckService.upsertDuck(new Duck("Terry", "white"));
		
	}
}
