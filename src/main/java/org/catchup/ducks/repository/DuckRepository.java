package org.catchup.ducks.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.catchup.ducks.domain.Duck;

public class DuckRepository {
	
	private List<Duck> ducks = new ArrayList<>();

	public Optional<Duck> findById (String duckId) {
		return ducks.stream()
					   .filter(duck -> duck.getId().equals(duckId))
					   .findAny();
	}
	
	public Optional<Duck> findByName (String name) {
		return ducks.stream()
					   .filter(duck -> duck.getId().equals(name))
					   .findAny();
	}
	
	public List<Duck> findAll() {
		return ducks;
	}
	
	
	public Duck save(Duck duck) {
		// fix me to dedupe first
		ducks.add(duck);
		return duck;
	}

}
