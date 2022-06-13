package com.intiformation.WatchNow.model;


import java.util.*;

public class Episode extends Oeuvre {
	
	public Episode() {
    }
	
	public Episode(Oeuvre o) {
		super(o);
	}

	public Integer getNumero() {
		return this.title.getEpisode();
	}
	
	public void setNumero(Integer numero) {
		this.title.setEpisode(numero);
	}
	
	public Integer getNumeroSaison() {
		return this.title.getSeason();
	}
	
	public void setNumeroSaison(Integer numero) {
		this.title.setSeason(numero);
	}
	
	public String getSerieId() {
		return this.title.getParentTitle().getId();
	}
	
	public void setSerieId(String id) {
		this.title.getParentTitle().setId(id);
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