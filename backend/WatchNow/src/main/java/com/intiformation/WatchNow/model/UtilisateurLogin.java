package com.intiformation.WatchNow.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
public class UtilisateurLogin extends Personne{
    private String _login;
    private String _password;

    @OneToOne
    @JoinColumn(name = "_idUtilisateur")
    private Utilisateur utilisateur;
}