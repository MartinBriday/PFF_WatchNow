package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Utilisateur;
import com.intiformation.WatchNow.service.UtilisateurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilisateur")
@CrossOrigin(origins = "http://localhost:4200/")
public class UtilisateurController
{
	@Autowired
	private UtilisateurService utilisateurService;
	
	
	@GetMapping("/index")
	public ResponseEntity<List<Utilisateur>> getListeUtilisateur() {
		return new ResponseEntity<List<Utilisateur>>(utilisateurService.get(), HttpStatus.OK);
	}
	
	@GetMapping("/index/{id}")
	public ResponseEntity<Utilisateur> getUtilisateur(@PathVariable int id) {
		return new ResponseEntity<Utilisateur>(utilisateurService.get(id), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Utilisateur> saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		BCryptPasswordEncoder bcp = new BCryptPasswordEncoder();
		utilisateur.get_utilisateurLogin().set_password(bcp.encode(utilisateur.get_utilisateurLogin().get_password()));
		return new ResponseEntity<Utilisateur>(utilisateurService.save(utilisateur), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUtilisateur(@PathVariable int id) {
		utilisateurService.delete(id);
		return "redirect:/utilisateur/index";
	}
	
	@PutMapping("/update")
	public String updateUtilisateur(@RequestBody Utilisateur utilisateur) {
		utilisateurService.update(utilisateur);
		return "redirect:/utilisateur/index";
	}

}
