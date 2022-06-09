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
public class UtilisateurLogin extends Personne{
    private String _login;
    private String _password;

}