package com.intiformation.WatchNow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Plateforme {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;
    private String _nom;
    private String _url;

}