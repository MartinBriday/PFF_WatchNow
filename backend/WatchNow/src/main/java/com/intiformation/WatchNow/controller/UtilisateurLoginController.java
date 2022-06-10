package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Utilisateur;
import com.intiformation.WatchNow.model.UtilisateurLogin;
import com.intiformation.WatchNow.service.UtilisateurLoginService;
import com.intiformation.WatchNow.service.UtilisateurService;

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
@RequestMapping("/utilisateurLogin")
public class UtilisateurLoginController
{
	@Autowired
	private UtilisateurLoginService utilisateurLoginService;

	@GetMapping("/index")
	public ResponseEntity<List<UtilisateurLogin>> getListeUtilisateurLogin() {
		return new ResponseEntity<List<UtilisateurLogin>>(utilisateurLoginService.get(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<UtilisateurLogin> getUtilisateurLogin(@PathVariable int id) {
		return new ResponseEntity<UtilisateurLogin>(utilisateurLoginService.get(id), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<UtilisateurLogin> saveUtilisateurLogin(@RequestBody UtilisateurLogin utilisateurLogin) {
		return new ResponseEntity<UtilisateurLogin>(utilisateurLoginService.save(utilisateurLogin), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete{id}")
	public String deleteUtilisateurLogin(@PathVariable int id) {
		utilisateurLoginService.delete(id);
		return "redirect:/utilisateur/index";
	}
	
	@PutMapping("/update")
	public String updateUtilisateurLogin(@RequestBody UtilisateurLogin utilisateurLogin) {
		utilisateurLoginService.update(utilisateurLogin);
		return "redirect:/utilisateur/index";
	}


}
