package com.intiformation.WatchNow.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

//@Entity
//@Table
//@Data
public class Film extends Oeuvre {

    public Film() {
    }

    private double _duree;
    private Date _dateSortie;

}