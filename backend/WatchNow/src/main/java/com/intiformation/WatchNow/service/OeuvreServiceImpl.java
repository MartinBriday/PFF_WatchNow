package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Oeuvre;
import com.intiformation.WatchNow.model.OeuvreResultObject;

import org.springframework.stereotype.Service;

import kong.unirest.Unirest;

@Service
public class OeuvreServiceImpl implements OeuvreService {
	
	private static final String requestURL = "https://online-movie-database.p.rapidapi.com/";
	private OeuvreResultObject resultRequest;

	@Override
	public List<Oeuvre> getByTitre(String titre) {
		resultRequest = Unirest.get(requestURL + "auto-complete?q=" + titre)
		    .header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
		    .header("X-RapidAPI-Key", "e09070b4b4msh250a66c95cbf5b5p1bfc62jsna373a4d2b8c1")
		    .asObject(OeuvreResultObject.class)
            .getBody();
		return resultRequest.getListOeuvre();
	}

}
