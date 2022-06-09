package com.intiformation.WatchNow.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class UtilisateurLogin extends Personne{
    private String _login;
    private String _password;

}