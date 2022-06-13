package com.intiformation.WatchNow.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Saison {

//    private String id;
    private int season;
    private List<EpisodeId> episodes;
    
//	public String getId() {
//		return id;
//	}
//	
//	public void setId(String id) {
//		this.id = id;
//	}
	
	public int getNumero() {
		return season;
	}
	
	public void setNumero(int season) {
		this.season = season;
	}
	
	public List<String> getEpisodes() {
		List<String> listEpisodeId = new ArrayList<String>();
		for (EpisodeId episodeId : episodes) {
			listEpisodeId.add(episodeId.getId());
		}
		return listEpisodeId;
	}
	
	public void setEpisodes(List<String> episodes) {
		for (int ii = 0; ii < episodes.size(); ii++) {
			this.episodes.get(ii).setId(episodes.get(ii));
		}
	}
}

@JsonIgnoreProperties(ignoreUnknown = true)
class EpisodeId {
	private String id;

	public String getId() {
		return id.split("/")[id.split("/").length-1];
	}

	public void setId(String id) {
		this.id = id;
	}
}