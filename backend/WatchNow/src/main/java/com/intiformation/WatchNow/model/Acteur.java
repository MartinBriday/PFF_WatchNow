package com.intiformation.WatchNow.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Acteur extends Personne {

    public Acteur() {
    }

    private String _nomNaissance;

}