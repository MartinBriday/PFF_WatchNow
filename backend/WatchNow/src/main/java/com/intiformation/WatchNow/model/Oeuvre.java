package com.intiformation.WatchNow.model;


import java.util.*;

public class Oeuvre {

    private String id;
    private String l;
    private Integer rank;
    private Integer y;

    public Oeuvre() {
    }

    public String getId() {
    	return id;
    }
    
    public void setId(String id) {
    	this.id = id;
    }
    
    public String getTitre() {
        return l;
    }
    
    public void setTitre(String titre) {
    	this.l = titre;
    }
    
    public Integer getRank() {
        return rank;
    }
    
    public void setRank(Integer rank) {
    	this.rank = rank;
    }
    
    public Integer getDateSortie() {
        return y;
    }
    
    public void setDateSortie(Integer annee) {
    	this.y = annee;
    }
}