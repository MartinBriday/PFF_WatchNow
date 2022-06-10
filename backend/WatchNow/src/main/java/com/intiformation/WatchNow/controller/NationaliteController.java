package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Nationalite;
import com.intiformation.WatchNow.repository.NationaliteRepository;
import com.intiformation.WatchNow.service.NationaliteService;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nationalite")
public class NationaliteController
{
	@Autowired
	NationaliteService nationaliteService;
	
	@GetMapping("/index")
	public ResponseEntity<List<Nationalite>> getListNationalite()
	{
		return new ResponseEntity<List<Nationalite>>(nationaliteService.get(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Nationalite> saveNationalite(@RequestBody Nationalite n)
	{
		return new ResponseEntity<Nationalite>(nationaliteService.save(n), HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public String updateNationalite(@RequestBody Nationalite n)
	{
		nationaliteService.save(n);
		return "redirect:/index";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteNationalite(@PathVariable("id") int id)
	{
		nationaliteService.delete(id);
		return "redirect:/index";
	}
	
}
