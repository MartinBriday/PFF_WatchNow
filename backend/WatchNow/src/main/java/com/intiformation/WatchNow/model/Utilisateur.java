package com.intiformation.WatchNow.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "_idPersonne")
@AllArgsConstructor @NoArgsConstructor
public class Utilisateur extends Personne {
    private String _email;

}