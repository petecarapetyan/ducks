package org.catchup.ducks.web;

import java.util.List;

import org.catchup.ducks.domain.Duck;
import org.catchup.ducks.service.DuckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DuckController {
	@Autowired
	private DuckService duckService;

	@GetMapping("/")
	public String ducksRedirect() {
		return "redirect:/ducks";
	}

	@GetMapping("/createDuck")
	public String createDuck (ModelMap model) {
		List<Duck> ducks = duckService.findAll();
		model.put("ducks", ducks);
		//not sure about this next line?
		return "ducks";
	}
	
	@GetMapping("/ducks")
	public String getDucks (ModelMap model) {
		List<Duck> ducks = duckService.findAll();
		model.put("ducks", ducks);
		//not sure about this next line?
		return "ducks";
	}
	
	@GetMapping("/ducks/{duckId}")
	public String updateDuck(ModelMap model, @PathVariable String duckId) {
		Duck duck = duckService.findDuckById(duckId);
		model.put("duck", duck);
		return "duckUpdate";
	}

	@PostMapping("/deleteDuck/{duckId}")
	public String deleteDuck(ModelMap model, @PathVariable String duckId) {
		Duck duck = duckService.findDuckById(duckId);
		model.put("duck", duck);
		return "redirect:/ducks";
	}
	
	@PostMapping("/upsertDuck")
	public String updateThisDuck(@RequestBody Duck duck) {
		duckService.upsertDuck(duck);
		return "redirect:/ducks";
	}
}
