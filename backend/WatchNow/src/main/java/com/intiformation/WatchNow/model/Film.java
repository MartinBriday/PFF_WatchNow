package com.intiformation.WatchNow.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor
public class Film extends Oeuvre {

    private double _duree;
    private Date _dateSortie;

}