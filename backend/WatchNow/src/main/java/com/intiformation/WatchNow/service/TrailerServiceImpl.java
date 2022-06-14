package com.intiformation.WatchNow.service;

import com.intiformation.WatchNow.model.Trailer;

import org.springframework.stereotype.Service;

import kong.unirest.Unirest;

@Service
public class TrailerServiceImpl implements TrailerService
{
	private static final String requestURL_mdblist = "https://mdblist.p.rapidapi.com/";
	private static final String rapidAPI_key = "e09070b4b4msh250a66c95cbf5b5p1bfc62jsna373a4d2b8c1";
	
	
	@Override
	public Trailer getTrailerUrlbyId(String id) {
		Trailer resultRequest = null;
		resultRequest = Unirest.get(requestURL_mdblist + "?i=" + id)
			    .header("X-RapidAPI-Host", "mdblist.p.rapidapi.com")
			    .header("X-RapidAPI-Key", rapidAPI_key)
			    .asObject(Trailer.class)
			    .getBody();
		
		return resultRequest;
	}
	
	
}
