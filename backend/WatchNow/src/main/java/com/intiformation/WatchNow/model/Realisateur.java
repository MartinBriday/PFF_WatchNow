package com.intiformation.WatchNow.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@PrimaryKeyJoinColumn(name = "_idPersonne")
@NoArgsConstructor
public class Realisateur extends Personne {

}