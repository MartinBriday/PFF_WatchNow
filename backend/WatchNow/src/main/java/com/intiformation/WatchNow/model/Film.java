package com.intiformation.WatchNow.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

//@Entity
//@Table
//@Data
public class Film extends Oeuvre {

    private double _duree;
    private Date _dateSortie;

    public Film() {
    }
    
    public Film(Oeuvre o) {
    	super(o);
    }

}