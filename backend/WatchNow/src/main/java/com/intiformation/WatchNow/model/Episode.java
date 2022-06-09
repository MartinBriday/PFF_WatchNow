package com.intiformation.WatchNow.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Episode {

    public Episode() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;
    private double _duree;
    private String _titre;
    private String _synopsis;
    private Date _dateSortie;

}