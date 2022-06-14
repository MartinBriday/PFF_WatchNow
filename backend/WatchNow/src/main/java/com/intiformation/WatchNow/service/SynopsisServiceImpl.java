package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Synopsis;

import org.springframework.stereotype.Service;

import kong.unirest.GenericType;
import kong.unirest.Unirest;

@Service
public class SynopsisServiceImpl implements SynopsisService{

	private static final String requestURL_OMD = "https://online-movie-database.p.rapidapi.com/";
	private static final String rapidAPI_key = "e09070b4b4msh250a66c95cbf5b5p1bfc62jsna373a4d2b8c1";
	
	
	@Override
	public Synopsis getByTitleID(String id) {
		List<Synopsis> resultRequest = null;
		resultRequest = Unirest.get(requestURL_OMD + "title/get-synopses?tconst=" + id)
			    .header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
			    .header("X-RapidAPI-Key", rapidAPI_key)
			    .asObject(new GenericType<List<Synopsis>>(){})
			    .getBody();
		try {
			return resultRequest.get(0);
		}
		catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

}
