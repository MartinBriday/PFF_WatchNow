package com.intiformation.WatchNow.service;

import java.util.ArrayList;
import java.util.List;

import com.intiformation.WatchNow.model.Episode;
import com.intiformation.WatchNow.model.Film;
import com.intiformation.WatchNow.model.Oeuvre;
import com.intiformation.WatchNow.model.OeuvreBuffer;
import com.intiformation.WatchNow.model.OeuvreBufferResult;
import com.intiformation.WatchNow.model.OeuvreResultObject;
import com.intiformation.WatchNow.model.Saison;
import com.intiformation.WatchNow.model.Serie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kong.unirest.GenericType;
import kong.unirest.Unirest;

@Service
public class OeuvreServiceImpl implements OeuvreService {
	
	@Autowired
	SynopsisService synopsisService;
	@Autowired
	TrailerService trailerService;
	@Autowired
	SaisonService saisonService;

	private static final String requestURL_OMD = "https://online-movie-database.p.rapidapi.com/";
	private static final String requestURL_mdblist = "https://mdblist.p.rapidapi.com/";
	private static final String rapidAPI_key = "f8c66a27d0msh5fb0123b6da76c7p12ef0cjsna74230c7548d";
	
	@Override
	public Oeuvre getById(String id) {
		Oeuvre resultRequest = null;
		resultRequest = Unirest.get(requestURL_OMD + "title/get-overview-details?tconst=" + id)
		    .header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
		    .header("X-RapidAPI-Key", rapidAPI_key)
		    .asObject(Oeuvre.class)
            .getBody();
		resultRequest.setSynopsis(synopsisService.getByTitleID(id));
		resultRequest.setTrailer(trailerService.getTrailerUrlbyId(id));
		
		if (resultRequest.getType().equals("movie")) {
			Film resultFilm = new Film(resultRequest);
			return resultFilm;
		}
		else if (resultRequest.getType().equals("tvSeries") || resultRequest.getType().equals("tvMiniSeries")) {
			Serie resultSerie = new Serie(resultRequest);
			resultSerie.setSaisons(saisonService.getByTitleId(id));
			return resultSerie;
		}
		else if (resultRequest.getType().equals("tvEpisode")) {
			Episode resultEpisode = new Episode(resultRequest);
			return resultEpisode;
		}
		return null;
	}

	@Override
	public List<Oeuvre> getByTitre(String titre) {
		List<Oeuvre> listOeuvre = new ArrayList<Oeuvre>();
		OeuvreBufferResult resultRequest = null;
		resultRequest = Unirest.get(requestURL_mdblist + "?s=" + titre)
			.header("X-RapidAPI-Key", rapidAPI_key)
			.header("X-RapidAPI-Host", "mdblist.p.rapidapi.com")
		    .asObject(OeuvreBufferResult.class)
            .getBody();
		for (OeuvreBuffer _ob : resultRequest.getSearch()) {
			listOeuvre.add(getById(_ob.getID()));
		}
		return listOeuvre;
	}


	@Override
	public List<Oeuvre> getByTitre(String titre, Integer nbResults) {
		List<Oeuvre> listOeuvre = new ArrayList<Oeuvre>();
		OeuvreBufferResult resultRequest = null;
		resultRequest = Unirest.get(requestURL_mdblist + "?s=" + titre)
			.header("X-RapidAPI-Key", rapidAPI_key)
			.header("X-RapidAPI-Host", "mdblist.p.rapidapi.com")
		    .asObject(OeuvreBufferResult.class)
            .getBody();
		for (int ii = 0; ii < nbResults; ii++) {
			listOeuvre.add(getById(resultRequest.getSearch().get(ii).getID()));
		}
		return listOeuvre;
	}

	@Override
	public List<Oeuvre> getMostPopularByType(String type) {
		String _requestURL_type = null;
		List<Oeuvre> listOeuvre = new ArrayList<Oeuvre>();
		if (type.equals("film")) {
			_requestURL_type = "title/get-most-popular-movies?currentCountry=US&purchaseCountry=US&homeCountry=US";
		}
		else if (type.equals("serie")) {
			_requestURL_type = "title/get-most-popular-tv-shows?currentCountry=US&purchaseCountry=US&homeCountry=US";
		}
		List<String> listOeuvreId = null;
		listOeuvreId = Unirest.get(requestURL_OMD + _requestURL_type)
				.header("X-RapidAPI-Key", rapidAPI_key)
				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
			    .asObject(new GenericType<List<String>>(){})
	            .getBody();
		String _id;
		for (String _oid : listOeuvreId) {
			_id = _oid.split("/")[_oid.split("/").length-1];
			listOeuvre.add(getById(_id));
		}
		return listOeuvre;
	}

	@Override
	public List<Oeuvre> getMostPopularByType(String type, Integer nbResults) {
		String _requestURL_type = null;
		List<Oeuvre> listOeuvre = new ArrayList<Oeuvre>();
		if (type.equals("film")) {
			_requestURL_type = "title/get-most-popular-movies?currentCountry=US&purchaseCountry=US&homeCountry=US";
		}
		else if (type.equals("serie")) {
			_requestURL_type = "title/get-most-popular-tv-shows?currentCountry=US&purchaseCountry=US&homeCountry=US";
		}
		List<String> listOeuvreId = null;
		listOeuvreId = Unirest.get(requestURL_OMD + _requestURL_type)
				.header("X-RapidAPI-Key", rapidAPI_key)
				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
			    .asObject(new GenericType<List<String>>(){})
	            .getBody();
		String _id;
		for (int ii = 0; ii < nbResults; ii++) {
			_id = listOeuvreId.get(ii).split("/")[listOeuvreId.get(ii).split("/").length-1];
			listOeuvre.add(getById(_id));
		}
		return listOeuvre;
	}

	@Override
	public List<Oeuvre> getMostPopularByTypeAndGenre(String type, String genre) {
		String _requestURL_type = null;
		List<Oeuvre> listOeuvre = new ArrayList<Oeuvre>();
		if (type.equals("film")) {
			_requestURL_type = "title/v2/get-popular-movies-by-genre?limit=100&genre=";
		}
//		else if (type.equals("serie")) {
//			_requestURL_type = "title/v2/get-popular-tv-shows-by-genre?limit=100&genre=";
//		}
		List<String> listOeuvreId = null;
		listOeuvreId = Unirest.get(requestURL_OMD + _requestURL_type + genre)
				.header("X-RapidAPI-Key", rapidAPI_key)
				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
			    .asObject(new GenericType<List<String>>(){})
	            .getBody();
		String _id;
		for (String _oid : listOeuvreId) {
			_id = _oid.split("/")[_oid.split("/").length-1];
			listOeuvre.add(getById(_id));
		}
		return listOeuvre;
	}

	@Override
	public List<Oeuvre> getMostPopularByTypeAndGenre(String type, String genre, Integer nbResults) {
		String _requestURL_type = null;
		List<Oeuvre> listOeuvre = new ArrayList<Oeuvre>();
		if (type.equals("film")) {
			_requestURL_type = "title/v2/get-popular-movies-by-genre?limit=100&genre=";
		}
//		else if (type.equals("serie")) {
//			_requestURL_type = "title/v2/get-popular-tv-shows-by-genre?limit=100&genre=";
//		}
		List<String> listOeuvreId = null;
		listOeuvreId = Unirest.get(requestURL_OMD + _requestURL_type + genre)
				.header("X-RapidAPI-Key", rapidAPI_key)
				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
			    .asObject(new GenericType<List<String>>(){})
	            .getBody();
		String _id;
		for (int ii = 0; ii < nbResults; ii++) {
			_id = listOeuvreId.get(ii).split("/")[listOeuvreId.get(ii).split("/").length-1];
			listOeuvre.add(getById(_id));
		}
		return listOeuvre;
	}

	@Override
	public List<Oeuvre> getMoreLikeThis(String id) {
		List<Oeuvre> listOeuvre = new ArrayList<Oeuvre>();
		List<String> listOeuvreId = null;
		listOeuvreId = Unirest.get(requestURL_OMD + "title/get-more-like-this?currentCountry=US&purchaseCountry=US&tconst=" + id)
				.header("X-RapidAPI-Key", rapidAPI_key)
				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
			    .asObject(new GenericType<List<String>>(){})
	            .getBody();
		String _id;
		for (String _oid : listOeuvreId) {
			_id = _oid.split("/")[_oid.split("/").length-1];
			listOeuvre.add(getById(_id));
		}
		return listOeuvre;
	}

	@Override
	public List<Oeuvre> getMoreLikeThis(String id, Integer nbResults) {
		List<Oeuvre> listOeuvre = new ArrayList<Oeuvre>();
		List<String> listOeuvreId = null;
		listOeuvreId = Unirest.get(requestURL_OMD + "title/get-more-like-this?currentCountry=US&purchaseCountry=US&tconst=" + id)
				.header("X-RapidAPI-Key", rapidAPI_key)
				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
			    .asObject(new GenericType<List<String>>(){})
	            .getBody();
		String _id;
		for (int ii = 0; ii < nbResults; ii++) {
			_id = listOeuvreId.get(ii).split("/")[listOeuvreId.get(ii).split("/").length-1];
			listOeuvre.add(getById(_id));
		}
		return listOeuvre;
	}
}