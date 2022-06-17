package com.intiformation.WatchNow.service;

import java.util.HashMap;

import com.intiformation.WatchNow.configuration.RapidAPIKey;
import com.intiformation.WatchNow.model.Oeuvre;
import com.intiformation.WatchNow.model.OeuvreBuffer;
import com.intiformation.WatchNow.model.OeuvreWatch;

import org.springframework.stereotype.Service;

import kong.unirest.GenericType;
import kong.unirest.Unirest;

@Service
public class OeuvreWatchServiceImpl implements OeuvreWatchService {
	private static final String rapidAPI_key = RapidAPIKey.rapidAPIKey;

	@Override
	public OeuvreWatch getByOeuvreId(String id) {
		HashMap<String, OeuvreBuffer> response = Unirest.get("https://online-movie-database.p.rapidapi.com/title/get-meta-data?ids=" + id + "&region=US")
				.header("X-RapidAPI-Key", rapidAPI_key)
				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
				.asObject(new GenericType<HashMap<String, OeuvreBuffer>>() {})
				.getBody();
		return response.get(id).getWaysToWatch();
	}

}
