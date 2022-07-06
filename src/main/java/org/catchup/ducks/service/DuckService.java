package org.catchup.ducks.service;

import java.util.List;

import org.catchup.ducks.domain.Duck;
import org.catchup.ducks.repository.DuckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DuckService {

	@Autowired
	private DuckRepository duckRepo;

	public List<Duck> findAll() {
		return duckRepo.findAll();
	}
	public Duck upsertDuck (Duck duck) {
		return duckRepo.save(duck);
	}
	public Duck findDuckById (String duckId) {
		return duckRepo.findById(duckId).orElse(null);
	}
}
