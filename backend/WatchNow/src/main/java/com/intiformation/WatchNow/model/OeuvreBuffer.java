package com.intiformation.WatchNow.model;

public class OeuvreBuffer {
	//MDBList
	private String imdbid;
	private String type;
	
	//Online Movie Database
	private String id;
    protected OeuvreWatch waysToWatch;

	public String getId_MDBList() {
		return imdbid;
	}

	public void setId_MDBList(String imdbid) {
		this.imdbid = imdbid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId_OMD() {
		return id;
	}

	public void setId_OMD(String id) {
		this.id = id;
	}

	public OeuvreWatch getWaysToWatch() {
		return waysToWatch;
	}

	public void setWaysToWatch(OeuvreWatch waysToWatch) {
		this.waysToWatch = waysToWatch;
	}
}
