package com.intiformation.WatchNow.service;

import com.intiformation.WatchNow.model.Oeuvre;
import com.intiformation.WatchNow.model.Synopsis;

import org.springframework.stereotype.Service;

import kong.unirest.Unirest;

@Service
public class SynopsisServiceImpl implements SynopsisService{

	private static final String requestURL_OMD = "https://online-movie-database.p.rapidapi.com/";
	private static final String requestURL_mdblist = "https://mdblist.p.rapidapi.com/";
	private static final String rapidAPI_key = "e09070b4b4msh250a66c95cbf5b5p1bfc62jsna373a4d2b8c1";
	
	@Override
	public Synopsis getByTitleID(String id) {
		Synopsis resultRequest = null;
		resultRequest = Unirest.get(requestURL_OMD + "title/get-synopses?tconst=" + id)
			    .header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
			    .header("X-RapidAPI-Key", rapidAPI_key)
			    .asObject(Synopsis.class)
	            .getBody();
		return new Synopsis();
	}

}
