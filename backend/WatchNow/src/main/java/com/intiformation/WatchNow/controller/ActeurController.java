package com.intiformation.WatchNow.controller;

import com.intiformation.WatchNow.service.ActeurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acteur")
public class ActeurController
{
	@Autowired
	private ActeurService acteurService;
	
//	@GetMapping("/index")
//liste = index
//save = save
//un seul = get
//uppdate
//delet
}
