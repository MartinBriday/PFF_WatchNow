package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Avis;
import com.intiformation.WatchNow.service.AvisService;

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
@RequestMapping("/avis")
public class AvisController {

	@Autowired
	private AvisService avisService;
	
	@GetMapping("/index")
	public ResponseEntity<List<Avis>> getListAvis()
	{
		return new ResponseEntity<List<Avis>>(avisService.get(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Avis> saveAvis(@RequestBody Avis n)
	{
		return new ResponseEntity<Avis>(avisService.save(n), HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public String updateAvis(@RequestBody Avis n)
	{
		avisService.save(n);
		return "redirect:/index";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAvis(@PathVariable("id") int id)
	{
		avisService.delete(id);
		return "redirect:/index";
	}
}
