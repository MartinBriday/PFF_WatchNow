package com.intiformation.WatchNow.model;


import java.time.LocalDate;
import java.util.*;

public class Oeuvre {

    protected String id;
    protected Title title;
    protected Ratings ratings;
    protected String[] genres;
    protected LocalDate releaseDate;
    protected PlotSummary plotSummary;

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
		return id.split("/")[2];
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

    public String getTitle() {
    	return title.getTitle();
    }
    
    public void setTitle(String title) {
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

    public Double getRating() {
    	return ratings.getRating();
    }
    
    public void setRating(Double rating) {
    	this.ratings.setRating(rating);
    }

    public Integer getRatingCount() {
    	return ratings.getRatingCount();
    }
    
    public void setRatingCount(Integer ratingCount) {
    	this.ratings.setRatingCount(ratingCount);
    }

    public String getSummary() {
    	return plotSummary.getText();
    }
    
    public void setSummary(String summary) {
    	this.plotSummary.setText(summary);
    }

    public String getSummaryAuthor() {
    	return plotSummary.getAuthor();
    }
    
    public void setSummaryAuthor(String author) {
    	this.plotSummary.setAuthor(author);
    }
}

class Title {
	private String title;
	private String titleType;
	private Integer episode;
	private Integer runningTimeInMinutes;
	private String nextEpisode;
	private String previousEpisode;
	private Integer numberOfEpisodes;
	private Integer seriesStartYear;
	private Integer seriesEndYear;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitleType() {
		return titleType;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	public Integer getEpisode() {
		return episode;
	}
	public void setEpisode(Integer episode) {
		this.episode = episode;
	}
	public Integer getRunningTimeInMinutes() {
		return runningTimeInMinutes;
	}
	public void setRunningTimeInMinutes(Integer runningTimeInMinutes) {
		this.runningTimeInMinutes = runningTimeInMinutes;
	}
	public String getNextEpisode() {
		return nextEpisode.split("/")[2];
	}
	public void setNextEpisode(String nextEpisode) {
		this.nextEpisode = nextEpisode;
	}
	public String getPreviousEpisode() {
		return previousEpisode.split("/")[2];
	}
	public void setPreviousEpisode(String previousEpisode) {
		this.previousEpisode = previousEpisode;
	}
	public Integer getNumberOfEpisodes() {
		return numberOfEpisodes;
	}
	public void setNumberOfEpisodes(Integer numberOfEpisodes) {
		this.numberOfEpisodes = numberOfEpisodes;
	}
	public Integer getSeriesStartYear() {
		return seriesStartYear;
	}
	public void setSeriesStartYear(Integer seriesStartYear) {
		this.seriesStartYear = seriesStartYear;
	}
	public Integer getSeriesEndYear() {
		return seriesEndYear;
	}
	public void setSeriesEndYear(Integer seriesEndYear) {
		this.seriesEndYear = seriesEndYear;
	}
}

class Ratings {
	private Double rating;
	private Integer ratingCount;
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Integer getRatingCount() {
		return ratingCount;
	}
	public void setRatingCount(Integer ratingCount) {
		this.ratingCount = ratingCount;
	}
}

class PlotSummary {
	private String author;
	private String text;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}