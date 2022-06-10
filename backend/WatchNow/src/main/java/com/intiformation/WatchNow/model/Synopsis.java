package com.intiformation.WatchNow.model;


public class Synopsis {
	private String id;
    private String language;
    private String text;
    
    public Synopsis() {
}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSynopsis() {
		return text;
	}

	public void setSynopsis(String text) {
		this.text = text;
	}
    
    
    
}
