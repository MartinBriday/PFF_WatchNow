package com.intiformation.WatchNow.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "_idPersonne")
@Data
@NoArgsConstructor
public class Admin extends Utilisateur {

	public Admin(Admin a) {
		super(a);
	}
}