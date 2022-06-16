package com.intiformation.WatchNow.model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int _idPersonne;
    protected String _nom;
    protected String _prenom;
    protected Date _dateNaissance;
    
    @ManyToMany
    @JoinTable(name = "Personne_Nationalite",
    		joinColumns = @JoinColumn(name = "_idPersonne"),
    		inverseJoinColumns = @JoinColumn(name = "_idNationalite"))
    protected List<Nationalite> _listeNationalite;
    
    public Personne(Personne p) {
    	this._idPersonne = p._idPersonne;
    	this._nom = p._nom;
    	this._prenom = p._prenom;
    	this._dateNaissance = p._dateNaissance;
    }

}