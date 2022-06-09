package com.intiformation.WatchNow.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor
public class Nationalite {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;
    private String _nom;

    @ManyToMany
    @JoinTable(name = "Personne_Nationalite",
    		joinColumns = @JoinColumn(name = "_idNationalite"),
    		inverseJoinColumns = @JoinColumn(name = "_idPersonne"))
    private List<Personne> _listePersonne;
    
    @ManyToMany
    @JoinTable(name = "Langue_Nationalite",
    		joinColumns = @JoinColumn(name = "_idNationalite"),
    		inverseJoinColumns = @JoinColumn(name = "_idLangue"))
    private List<Langue> _listeLangue;
}