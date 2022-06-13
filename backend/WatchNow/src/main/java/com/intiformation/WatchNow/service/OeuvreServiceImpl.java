package com.intiformation.WatchNow.service;

import java.util.ArrayList;
import java.util.List;

import com.intiformation.WatchNow.model.Episode;
import com.intiformation.WatchNow.model.Film;
import com.intiformation.WatchNow.model.Oeuvre;
import com.intiformation.WatchNow.model.OeuvreBuffer;
import com.intiformation.WatchNow.model.OeuvreBufferResult;
import com.intiformation.WatchNow.model.OeuvreResultObject;
import com.intiformation.WatchNow.model.Serie;

import org.springframework.stereotype.Service;

import kong.unirest.Unirest;

@Service
public class OeuvreServiceImpl implements OeuvreService {

	private static final String requestURL_OMD = "https://online-movie-database.p.rapidapi.com/";
	private static final String requestURL_mdblist = "https://mdblist.p.rapidapi.com/";
	private static final String rapidAPI_key = "f8c66a27d0msh5fb0123b6da76c7p12ef0cjsna74230c7548d";
	

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
		Oeuvre resultRequest = null;
		resultRequest = Unirest.get(requestURL_OMD + "title/get-overview-details?tconst=" + id)
		    .header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
		    .header("X-RapidAPI-Key", rapidAPI_key)
		    .asObject(Oeuvre.class)
            .getBody();
		if (resultRequest.getType().equals("movie")) {
			return new Film(resultRequest);
		}
		else if (resultRequest.getType().equals("tvSeries")) {
			return new Serie(resultRequest);
		}
		else if (resultRequest.getType().equals("tvEpisode")) {
			return new Episode(resultRequest);
		}
		else {
			return null;
		}
	}


	@Override
	public List<Oeuvre> getByTitre(String titre) {
		int ii_max = 3;
		List<Oeuvre> listOeuvre = new ArrayList<Oeuvre>();
		OeuvreBufferResult resultRequest = null;
		resultRequest = Unirest.get(requestURL_mdblist + "?s=" + titre)
			.header("X-RapidAPI-Key", rapidAPI_key)
			.header("X-RapidAPI-Host", "mdblist.p.rapidapi.com")
		    .asObject(OeuvreBufferResult.class)
            .getBody();
		for (int ii = 0; ii < ii_max; ii++) {
			listOeuvre.add(getById(resultRequest.getSearch().get(ii).getID()));
		}
		return listOeuvre;
	}

	
}