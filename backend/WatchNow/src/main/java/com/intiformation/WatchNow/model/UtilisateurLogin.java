package com.intiformation.WatchNow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@AllArgsConstructor @NoArgsConstructor
public class UtilisateurLogin{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int _id;
	private String _login;
    private String _password;

}