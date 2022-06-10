package com.intiformation.WatchNow.controller;

import com.intiformation.WatchNow.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController
{
	@Autowired
	AdminService adminService;
	
//	@GetMapping("/index")
}
