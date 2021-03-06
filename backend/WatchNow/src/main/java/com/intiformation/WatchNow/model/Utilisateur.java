package com.intiformation.WatchNow.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@PrimaryKeyJoinColumn(name = "_idPersonne")
@AllArgsConstructor @NoArgsConstructor
public class Utilisateur extends Personne {
	@Column(unique = true)
    private String _email;
    
    @OneToMany(mappedBy = "_utilisateur")
    private List<Avis> _listeAvis;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "_idUtilisateurLogin")
    private UtilisateurLogin _utilisateurLogin;
    
    //ListFavoris et ListeOeuvresVues seront une joinTable

    
    public Utilisateur(Utilisateur u) {
    	super(u);
    	this._email = u._email;
    	this._utilisateurLogin = u._utilisateurLogin;
    }
}