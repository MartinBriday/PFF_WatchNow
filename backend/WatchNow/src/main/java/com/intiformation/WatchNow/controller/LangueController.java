package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Langue;
import com.intiformation.WatchNow.service.LangueService;

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
@RequestMapping("/langue")
public class LangueController
{
	@Autowired
	LangueService langueService;
	
	@GetMapping("/index")
	public ResponseEntity<List<Langue>> getListLangue()
	{
		return new ResponseEntity<List<Langue>>(langueService.get(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Langue> saveLangue(@RequestBody Langue n)
	{
		return new ResponseEntity<Langue>(langueService.save(n), HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public String updateLangue(@RequestBody Langue n)
	{
		langueService.save(n);
		return "redirect:/index";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLangue(@PathVariable("id") int id)
	{
		langueService.delete(id);
		return "redirect:/index";
	}
}
