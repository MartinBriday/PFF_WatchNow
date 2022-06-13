package com.intiformation.WatchNow.model;

import java.util.List;

public class Serie extends Oeuvre {
	
	private List<Saison> saisons;

	public Serie(Oeuvre o) {
		super(o);
	}

	public List<Saison> getSaisons() {
		return saisons;
	}

	public void setSaisons(List<Saison> saisons) {
		this.saisons = saisons;
	}
	
	public Integer getNbEpisodes() {
		return this.title.getNumberOfEpisodes();
	}
	
	public void setNbEpisodes(Integer nbEpisodes) {
		this.title.setNumberOfEpisodes(nbEpisodes);
	}
	
	public Integer getAnneeDebut() {
		return this.title.getSeriesStartYear();
	}
	
	public void setAnneeDebut(Integer anneeDebut) {
		this.title.setSeriesStartYear(anneeDebut);
	}
	
	public Integer getAnneeFin() {
		return this.title.getSeriesEndYear();
	}
	
	public void setAnneeFin(Integer anneeFin) {
		this.title.setSeriesEndYear(anneeFin);
	}
}