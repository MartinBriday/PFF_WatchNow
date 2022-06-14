package com.intiformation.WatchNow.model;

public class Trailer 
{
	private String trailer;

	public Trailer() 
	{
	
	}

	public String getTrailerUrl() {
		return trailer;
	}

	public void setTrailerUrl(String trailer) {
		this.trailer = trailer;
	}

	@Override
	public String toString() {
		return "Trailer [trailer=" + trailer + "]";
	}
	
	
}

