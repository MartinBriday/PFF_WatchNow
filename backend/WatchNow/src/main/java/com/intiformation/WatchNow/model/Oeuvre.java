package com.intiformation.WatchNow.model;


import java.time.LocalDate;

public class Oeuvre {

    protected String id;
    protected String[] genres;
    protected LocalDate releaseDate;
    protected OeuvreTitle title;
    protected OeuvreRatings ratings;
    protected OeuvrePlotSummary plotSummary;

	public Oeuvre() {
    }

	public Oeuvre(Oeuvre o) {
		super();
		this.id = o.id;
		this.title = o.title;
		this.ratings = o.ratings;
		this.genres = o.genres;
		this.releaseDate = o.releaseDate;
		this.plotSummary = o.plotSummary;
	}

	public String getId() {
		return id.split("/")[id.split("/").length-1];
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getGenres() {
		return genres;
	}

	public void setGenres(String[] genres) {
		this.genres = genres;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

    public String getTitre() {
    	return title.getTitle();
    }
    
    public void setTitre(String title) {
    	this.title.setTitle(title);
    }

    public String getType() {
    	return title.getTitleType();
    }
    
    public void setType(String type) {
    	this.title.setTitleType(type);
    }
    
    public Integer getDureeInMinutes() {
    	return this.title.getRunningTimeInMinutes();
    }
    
    public void setDureeInMinutes(Integer duree) {
    	this.title.setRunningTimeInMinutes(duree);
    }

    public OeuvreRatings getRatings() {
    	return ratings;
    }
    
    public void setRatings(OeuvreRatings ratings) {
    	this.ratings = ratings;
    }

    public OeuvrePlotSummary getPlotSummary() {
    	return plotSummary;
    }
    
    public void setPlotSummary(OeuvrePlotSummary plotSummary) {
    	this.plotSummary = plotSummary;
    }

	public OeuvreImage getImage() {
		return this.title.getImage();
	}

	public void setImageUrl(OeuvreImage image) {
		this.title.setImage(image);
	}
}
