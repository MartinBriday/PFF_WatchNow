package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Avis;
import com.intiformation.WatchNow.service.AvisService;
import com.intiformation.WatchNow.service.PersonneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personne")
public class PersonneController
{
	@Autowired
	private PersonneService personneService;
}
