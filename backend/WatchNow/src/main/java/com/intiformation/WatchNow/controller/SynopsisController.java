package com.intiformation.WatchNow.controller;

import com.intiformation.WatchNow.model.Synopsis;
import com.intiformation.WatchNow.service.SynopsisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/synopsis")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class SynopsisController {

	@Autowired
	private SynopsisService synopsisService;
	
	@GetMapping("/index/{id}")
	public ResponseEntity<Synopsis> getSynopsisByOeuvreId(@PathVariable String id) {
		return new ResponseEntity<Synopsis>(synopsisService.getByTitleID(id), HttpStatus.OK);
	}
}
