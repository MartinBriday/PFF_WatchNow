package com.intiformation.WatchNow.controller;

import java.util.List;

import com.intiformation.WatchNow.model.Oeuvre;
import com.intiformation.WatchNow.service.OeuvreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Test
@RestController
@RequestMapping("/oeuvre")
@CrossOrigin(origins = "http://localhost:4200/")
public class OeuvreController {

	@Autowired
	private OeuvreService oeuvreService;
	
	@GetMapping("/oeuvre/id/{id}")
	public ResponseEntity<Oeuvre> getOeuvreById(@PathVariable String id) {
		return new ResponseEntity<Oeuvre>(oeuvreService.getById(id), HttpStatus.OK);
	}
	
	@GetMapping("/oeuvre/titre/{titre}")
	public ResponseEntity<List<Oeuvre>> getOeuvreByTitre(@PathVariable String titre, 
			@RequestParam(name = "nbResults", required = false) Integer nbResults) {
		if (nbResults != null && nbResults > 0) {
			return new ResponseEntity<List<Oeuvre>>(oeuvreService.getByTitre(titre, nbResults), HttpStatus.OK);
		}
		return new ResponseEntity<List<Oeuvre>>(oeuvreService.getByTitre(titre), HttpStatus.OK);
	}
	
	@GetMapping("/oeuvre/more_like_this/{id}")
	public ResponseEntity<List<Oeuvre>> getMoreLikeThis(@PathVariable String id, 
			@RequestParam(name = "nbResults", required = false) Integer nbResults) {
		if (nbResults != null && nbResults > 0) {
			return new ResponseEntity<List<Oeuvre>>(oeuvreService.getMoreLikeThis(id, nbResults), HttpStatus.OK);
		}
		return new ResponseEntity<List<Oeuvre>>(oeuvreService.getMoreLikeThis(id), HttpStatus.OK);
	}
	
	@GetMapping("/index/type/{type}")
	public ResponseEntity<List<Oeuvre>> getMostPopularByType(@PathVariable String type, 
			@RequestParam(name = "nbResults", required = false) Integer nbResults) {
		if (nbResults != null && nbResults > 0) {
			return new ResponseEntity<List<Oeuvre>>(oeuvreService.getMostPopularByType(type, nbResults), HttpStatus.OK);
		}
		return new ResponseEntity<List<Oeuvre>>(oeuvreService.getMostPopularByType(type), HttpStatus.OK);
	}
	
	@GetMapping("/index/type/{type}/genre/{genre}")
	public ResponseEntity<List<Oeuvre>> getMostPopularByType(@PathVariable String type, @PathVariable String genre, 
			@RequestParam(name = "nbResults", required = false) Integer nbResults) {
		if (nbResults != null && nbResults > 0) {
			return new ResponseEntity<List<Oeuvre>>(oeuvreService.getMostPopularByTypeAndGenre(type, genre, nbResults), HttpStatus.OK);
		}
		return new ResponseEntity<List<Oeuvre>>(oeuvreService.getMostPopularByTypeAndGenre(type, genre), HttpStatus.OK);
	}
}
