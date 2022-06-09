package com.intiformation.WatchNow.model;

import java.util.List;

public class OeuvreResultObject {
	private List<Oeuvre> d = null;

    //and these are the other instance variables of this class
    private String q; //your search querry

    public String getSearchQuerry() {
        return q;
    }

    public List<Oeuvre> getListOeuvre() {
        return d;
    }
}
