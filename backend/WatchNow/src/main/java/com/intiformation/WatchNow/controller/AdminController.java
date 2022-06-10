package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Admin;
import com.intiformation.WatchNow.service.AdminService;

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
@RequestMapping("/admin")
public class AdminController
{
	@Autowired
	AdminService adminService;
	
	@GetMapping("/index")
	public ResponseEntity<List<Admin>> getListAdmin()
	{
		return new ResponseEntity<List<Admin>>(adminService.get(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin n)
	{
		return new ResponseEntity<Admin>(adminService.save(n), HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public String updateAdmin(@RequestBody Admin n)
	{
		adminService.save(n);
		return "redirect:/index";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAdmin(@PathVariable("id") int id)
	{
		adminService.delete(id);
		return "redirect:/index";
	}
}
