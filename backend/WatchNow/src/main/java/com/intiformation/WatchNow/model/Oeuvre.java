package com.intiformation.WatchNow.model;


import java.time.LocalDate;

public class Oeuvre {

    protected String id;
    protected OeuvreTitle title;
    protected OeuvreRatings ratings;
    protected String[] genres;
    protected LocalDate releaseDate;
    protected OeuvrePlotSummary plotSummary;
    protected Synopsis synopsis;
    protected Trailer trailer;

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
		this.synopsis = o.synopsis;
		this.trailer = o.trailer;
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

	public Synopsis getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(Synopsis synopsis) {
		this.synopsis = synopsis;
	}

	public Trailer getTrailer() {
		return trailer;
	}

	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}

	public OeuvreImage getImage() {
		return this.title.getImage();
	}

	public void setImageUrl(OeuvreImage image) {
		this.title.setImage(image);
	}
}
