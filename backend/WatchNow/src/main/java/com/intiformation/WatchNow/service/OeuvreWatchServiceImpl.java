package com.intiformation.WatchNow.service;

import java.util.HashMap;

import com.intiformation.WatchNow.model.Oeuvre;
import com.intiformation.WatchNow.model.OeuvreBuffer;
import com.intiformation.WatchNow.model.OeuvreWatch;

import org.springframework.stereotype.Service;

import kong.unirest.GenericType;
import kong.unirest.Unirest;

@Service
public class OeuvreWatchServiceImpl implements OeuvreWatchService {

	@Override
	public OeuvreWatch getByOeuvreId(String id) {
		HashMap<String, OeuvreBuffer> response = Unirest.get("https://online-movie-database.p.rapidapi.com/title/get-meta-data?ids=tt4574334&region=US")
				.header("X-RapidAPI-Key", "45750039f2msh69035bbd7f696d3p12eea6jsn8b9291576d29")
				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
				.asObject(new GenericType<HashMap<String, OeuvreBuffer>>() {})
				.getBody();
		return response.get(id).getWaysToWatch();
	}

}
