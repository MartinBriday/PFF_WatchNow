package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Avis;
import com.intiformation.WatchNow.model.Utilisateur;
import com.intiformation.WatchNow.model.UtilisateurLogin;
import com.intiformation.WatchNow.service.AvisService;
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
@RequestMapping("/utilisateur")
public class UtilisateurController
{
	@Autowired
	private UtilisateurService utilisateurService;
	
	@Autowired
	private UtilisateurLoginService utilisateurLoginService;
	
	
	@GetMapping("/index")
	public ResponseEntity<List<Utilisateur>> getListeUtilisateur() {
		return new ResponseEntity<List<Utilisateur>>(utilisateurService.get(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Utilisateur> getUtilisateur(@PathVariable int id) {
		return new ResponseEntity<Utilisateur>(utilisateurService.get(id), HttpStatus.OK);
	}
	
	@PostMapping("/save/{idUtilisateurLogin}")
	public ResponseEntity<Utilisateur> saveUtilisateur(@PathVariable int idUtilisateurLogin, @RequestBody Utilisateur utilisateur) {
		utilisateur.set_utilisateurLogin(utilisateurLoginService.get(idUtilisateurLogin));
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
