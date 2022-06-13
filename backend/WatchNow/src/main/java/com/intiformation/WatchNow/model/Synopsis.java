package com.intiformation.WatchNow.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
    


	@Override
	public String toString() {
		return "Synopsis [id=" + id + ", language=" + language + ", text=" + text + "]";
	}
    
}
