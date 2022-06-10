package com.intiformation.WatchNow.model;

import java.util.List;

public class OeuvreBufferResult 
{
	private List<OeuvreBuffer> search = null;

	public List<OeuvreBuffer> getSearch() {
		return search;
	}

	
}




class OeuvreBuffer{
	private String imdbid;

	public String getID() {
		return imdbid;
	}

	public void setID(String imdbid) {
		this.imdbid = imdbid;
	}
}
