package com.intiformation.WatchNow.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
    private String _email;
    
    @OneToMany(mappedBy = "_utilisateur")
    private List<Avis> _listeAvis;
    
    //ListFavoris et ListeOeuvresVues seront une joinTable

}