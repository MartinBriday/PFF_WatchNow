package com.intiformation.WatchNow.controller;

import com.intiformation.WatchNow.service.LangueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/langue")
public class LangueController
{
	@Autowired
	LangueService langueService;
	
//	@GetMapping("/index")
}
