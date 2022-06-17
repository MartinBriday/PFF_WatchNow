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
		HashMap<String, OeuvreBuffer> response = Unirest.get("https://online-movie-database.p.rapidapi.com/title/get-meta-data?ids=" + id + "&region=US")
				.header("X-RapidAPI-Key", "e09070b4b4msh250a66c95cbf5b5p1bfc62jsna373a4d2b8c1")
				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
				.asObject(new GenericType<HashMap<String, OeuvreBuffer>>() {})
				.getBody();
		return response.get(id).getWaysToWatch();
	}

}
