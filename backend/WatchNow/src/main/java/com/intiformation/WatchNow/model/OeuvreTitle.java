package com.intiformation.WatchNow.model;

public class OeuvreTitle {
	private String id;
	private String title;
	private String titleType;
	private Integer runningTimeInMinutes;
	private OeuvreImage image;
	private Integer numberOfEpisodes;
	private Integer seriesStartYear;
	private Integer seriesEndYear;
	private Integer episode;
	private Integer season;
	private String nextEpisode;
	private String previousEpisode;
	private OeuvreTitle parentTitle;
	
	public String getId() {
		return id.split("/")[id.split("/").length-1];
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public Integer getSeason() {
		return season;
	}
	public void setSeason(Integer season) {
		this.season = season;
	}
	public Integer getRunningTimeInMinutes() {
		return runningTimeInMinutes;
	}
	public void setRunningTimeInMinutes(Integer runningTimeInMinutes) {
		this.runningTimeInMinutes = runningTimeInMinutes;
	}
	public String getNextEpisode() {
		if (nextEpisode == null) {
			return nextEpisode;
		}
		return nextEpisode.split("/")[id.split("/").length-1];
	}
	public void setNextEpisode(String nextEpisode) {
		this.nextEpisode = nextEpisode;
	}
	public String getPreviousEpisode() {
		if (previousEpisode == null) {
			return previousEpisode;
		}
		return previousEpisode.split("/")[id.split("/").length-1];
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
	public OeuvreImage getImage() {
		return image;
	}
	public void setImage(OeuvreImage image) {
		this.image = image;
	}
	public OeuvreTitle getParentTitle() {
		return parentTitle;
	}
	public void setParentTitle(OeuvreTitle parentTitle) {
		this.parentTitle = parentTitle;
	}
}
