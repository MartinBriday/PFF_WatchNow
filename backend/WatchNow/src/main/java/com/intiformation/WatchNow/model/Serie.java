package com.intiformation.WatchNow.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Data
public class Serie extends Oeuvre {

	public Serie(Oeuvre o) {
		super(o);
	}
}