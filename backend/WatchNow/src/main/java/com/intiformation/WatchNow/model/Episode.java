package com.intiformation.WatchNow.model;


import java.util.*;

public class Episode extends Oeuvre {
	
	private Saison saison;
	
	public Episode() {
    }
	
	public Episode(Oeuvre o) {
		super(o);
	}

	public Saison getSaison() {
		return saison;
	}

	public void setSaison(Saison saison) {
		this.saison = saison;
	}

	public Integer getNumero() {
		return this.title.getEpisode();
	}
	
	public void setNumero(Integer numero) {
		this.title.setEpisode(numero);
	}
	
	public String getNextEpisodeId() {
		return this.title.getNextEpisode();
	}
	
	public void setNextEpisodeId(String id) {
		this.title.setNextEpisode(id);
	}
	
	public String getPreviousEpisodeId() {
		return this.title.getPreviousEpisode();
	}
	
	public void setPreviousEpisodeId(String id) {
		this.title.setPreviousEpisode(id);
	}
}