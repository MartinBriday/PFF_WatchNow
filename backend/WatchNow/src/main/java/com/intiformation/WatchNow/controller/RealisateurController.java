package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Realisateur;
import com.intiformation.WatchNow.service.RealisateurService;

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
@RequestMapping("/realisateur")
public class RealisateurController
{
	@Autowired
	RealisateurService realisateurService;
	
	@GetMapping("/index")
	public ResponseEntity<List<Realisateur>> getListRealisateur()
	{
		return new ResponseEntity<List<Realisateur>>(realisateurService.get(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Realisateur> saveRealisateur(@RequestBody Realisateur n)
	{
		return new ResponseEntity<Realisateur>(realisateurService.save(n), HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public String updateRealisateur(@RequestBody Realisateur n)
	{
		realisateurService.save(n);
		return "redirect:/index";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteRealisateur(@PathVariable("id") int id)
	{
		realisateurService.delete(id);
		return "redirect:/index";
	}
}
