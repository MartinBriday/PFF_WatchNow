package com.intiformation.WatchNow.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Data
//@AllArgsConstructor @NoArgsConstructor
public class Saison {
//	 @Id
//	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private int season;
    private Serie serie;
    private List<Episode> episodes;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumero() {
		return season;
	}
	public void setNumero(int season) {
		this.season = season;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public List<Episode> getEpisodes() {
		return episodes;
	}
	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
    
    
}