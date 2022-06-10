package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Plateforme;
import com.intiformation.WatchNow.service.PlateformeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plateforme")
public class PlateformeController
{
	@Autowired
	private PlateformeService plateformeService;

	@GetMapping("/index")
	public ResponseEntity<List<Plateforme>> getListePlateforme() {
		return new ResponseEntity<List<Plateforme>>(plateformeService.get(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Plateforme> getPlateforme(@PathVariable int id) {
		return new ResponseEntity<Plateforme>(plateformeService.get(id), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Plateforme> savePlateforme(@RequestBody Plateforme plateforme) {
		return new ResponseEntity<Plateforme>(plateformeService.save(plateforme), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletePlateforme(@PathVariable int id) {
		plateformeService.delete(id);
		return "redirect:/plateforme/index";
	}
	
	@PutMapping("/update")
	public String updatePlateforme(@RequestBody Plateforme plateforme) {
		plateformeService.update(plateforme);
		return "redirect:/plateforme/index";
	}
	
//	@GetMapping("/get/{id}")
//	public ResponseEntity<Plateforme> getPlateformeByOeuvre(@PathVariable int id) {
//		return new ResponseEntity<Plateforme>(plateformeService.get(id), HttpStatus.OK);
//	}
}
