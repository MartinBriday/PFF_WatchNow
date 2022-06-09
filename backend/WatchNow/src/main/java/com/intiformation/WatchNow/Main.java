package com.intiformation.WatchNow;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

	public static void main(String[] args) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://online-movie-database.p.rapidapi.com/auto-complete?q=game&of&th"))
				.header("X-RapidAPI-Key", "e09070b4b4msh250a66c95cbf5b5p1bfc62jsna373a4d2b8c1")
				.header("X-RapidAPI-Host", "online-movie-database.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	}

}
