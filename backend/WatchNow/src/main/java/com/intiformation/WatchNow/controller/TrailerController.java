package com.intiformation.WatchNow.controller;

import com.intiformation.WatchNow.model.Trailer;
import com.intiformation.WatchNow.service.TrailerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/trailer")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class TrailerController {

	@Autowired
	private TrailerService trailerService;
	
	@GetMapping("/index/{id}")
	public ResponseEntity<Trailer> getTrailerByOeuvreId(@PathVariable String id) {
		return new ResponseEntity<Trailer>(trailerService.getTrailerUrlbyId(id), HttpStatus.OK);
	}
}
