package com.intiformation.WatchNow;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import kong.unirest.Unirest;

public class Main {

	public static void main(String[] args) {
//		HttpRequest request = HttpRequest.newBuilder()
//				.uri(URI.create("https://online-movie-database.p.rapidapi.com/auto-complete?q=game&of&th"))
//				.header("X-RapidAPI-Key", "e09070b4b4msh250a66c95cbf5b5p1bfc62jsna373a4d2b8c1")
//				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
//				.method("GET", HttpRequest.BodyPublishers.noBody())
//				.build();
//		HttpResponse<String> response;
		
		
		String getRequestURL = "https://online-movie-database.p.rapidapi.com/auto-complete?q=" + "game&of&th";
        MoviesResultObject response = Unirest.get(getRequestURL)
		    .header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
		    .header("X-RapidAPI-Key", "e09070b4b4msh250a66c95cbf5b5p1bfc62jsna373a4d2b8c1")
		    .asObject(MoviesResultObject.class)
            .getBody();
        System.out.println(response);
//		try {
//			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//			System.out.println(response.body());
//		} catch (Exception e) {
//			e.printStackTrace();
//		
//		}
//		for (String string : response.body().) {
//			
//		}
		System.out.println(response.getMovieMatches().get(1).getMovieLabel());
	}

}

class MoviesResultObject {
    //this object has a collection of movie matches- which we call MovieMatchObject
    private List<MovieMatches> d = null;

    //and these are the other instance variables of this class
    private String q; //your search querry

    public String getSearchQuerry() {
        return q;
    }

    public List<MovieMatches> getMovieMatches() {
        return d;
    }
}

class MovieMatches {
    //It has an image object- which we refer to by the MoviePoster class
    //the URL here is a default image that will be downloaded if the resulting JSON object has no
    //URL to it's own image
    private MoviePoster i = new MoviePoster("https://drukasia.com/images/stripes/umaparo.jpg");

    //and these are other instance variables of interest that a single match 'may' have
    private String l = "Not Available"; //movie label (name) on IMDb servers
    private Integer rank = 0000; //movie rank on IMDb
    private String s = "Not Available"; //movie starrings
    private Integer y = 0000; //year the movie will be released

    public MoviePoster getMoviePoster() {
        return i;
    }
    
    public String getMovieLabel() {
        return l;
    }
    
    public String getMovieStarrings() {
        return s;
    }
    
    
    public Integer getIMDbMovieRank() {
        return rank;
    }
    
    public Integer getYearOfRelease() {
        return y;
    }
}

class MoviePoster {
    //these are the variables making up the image
    private String imageUrl; //URL to view the image

    public String getImageUrl() {
        return imageUrl;
    }
    
    public MoviePoster () {
        //default constructor
    }
    
    public MoviePoster (String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
