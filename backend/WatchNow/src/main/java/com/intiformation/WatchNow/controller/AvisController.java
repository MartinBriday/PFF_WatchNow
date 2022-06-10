package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Avis;
import com.intiformation.WatchNow.service.AvisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avis")
public class AvisController {

	@Autowired
	private AvisService avisService;
	
//	@GetMapping("/index/{id}")
//	public ResponseEntity<List<Avis>> getAvisById(@PathVariable String id) {
//		return new ResponseEntity<List<Avis>>(avisService.getByOeuvreId(id), HttpStatus.OK);
//	}
}
