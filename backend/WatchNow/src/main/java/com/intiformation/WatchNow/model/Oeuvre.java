package com.intiformation.WatchNow.model;


import java.util.*;

public class Oeuvre {

    private String imdbID;
    private String title;
    private Integer imdbRating;
    private Integer year;
    private String overview;



	public Oeuvre() {
    }

    public String getId() {
    	return imdbID;
    }
    
    public void setId(String id) {
    	this.imdbID = id;
    }
    
    public String getTitre() {
        return title;
    }
    
    public void setTitre(String titre) {
    	this.title = titre;
    }
    
    public Integer getNote() {
        return imdbRating;
    }
    
    public void setNote(Integer note) {
    	this.imdbRating = note;
    }
    
    public Integer getDateSortie() {
        return year;
    }
    
    public void setDateSortie(Integer annee) {
    	this.year = annee;
    }
    
    public String getSynopsis() {
		return overview;
	}

	public void setSynopsis(String overview) {
		this.overview = overview;
	}
}