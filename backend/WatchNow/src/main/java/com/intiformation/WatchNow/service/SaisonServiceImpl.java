package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.configuration.RapidAPIKey;
import com.intiformation.WatchNow.model.Saison;

import org.springframework.stereotype.Service;

import kong.unirest.GenericType;
import kong.unirest.Unirest;

@Service
public class SaisonServiceImpl implements SaisonService {

	private static final String requestURL_OMD = "https://online-movie-database.p.rapidapi.com/";
	private static final String rapidAPI_key = RapidAPIKey.rapidAPIKey;

	@Override
	public List<Saison> getByTitleId(String id) {
		List<Saison> resultRequest = null;
		resultRequest = Unirest.get(requestURL_OMD + "title/get-seasons?tconst=" + id)
			    .header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
			    .header("X-RapidAPI-Key", rapidAPI_key)
			    .asObject(new GenericType<List<Saison>>(){})
			    .getBody();
		return resultRequest;
	}

}
