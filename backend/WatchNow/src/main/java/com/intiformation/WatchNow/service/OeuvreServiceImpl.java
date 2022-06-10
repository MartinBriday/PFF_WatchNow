package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Oeuvre;
import com.intiformation.WatchNow.model.OeuvreResultObject;

import org.springframework.stereotype.Service;

import kong.unirest.Unirest;

@Service
public class OeuvreServiceImpl implements OeuvreService {
	
	private static final String requestURL = "https://streaming-availability.p.rapidapi.com/";
	

//	@Override
//	public List<Oeuvre> getByTitre(String titre) {
//		resultRequest = Unirest.get(requestURL + "search/basic?country=us&service=netflix&type=series&keyword=" + titre)
//		    .header("X-RapidAPI-Host", "streaming-availability.p.rapidapi.com")
//		    .header("X-RapidAPI-Key", "f69fe30c89msh67c47b9daafa953p14b7cdjsn133e63e7f94c")
//		    .asObject(OeuvreResultObject.class)
//            .getBody();
//		return resultRequest.getListOeuvre();
//	}
	
	@Override
	public Oeuvre getById(String id) {
		Oeuvre resultRequest;
		resultRequest = Unirest.get(requestURL + "get/basic?country=us&output_language=en&imdb_id=" + id)
		    .header("X-RapidAPI-Host", "streaming-availability.p.rapidapi.com")
		    .header("X-RapidAPI-Key", "f69fe30c89msh67c47b9daafa953p14b7cdjsn133e63e7f94c")
		    .asObject(Oeuvre.class)
            .getBody();
		return resultRequest;
	}


	@Override
	public List<Oeuvre> getByTitre(String titre) {
		
		return null;
	}

	
}