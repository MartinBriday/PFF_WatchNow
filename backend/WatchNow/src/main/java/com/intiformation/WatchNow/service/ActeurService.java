package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Acteur;

public interface ActeurService
{
	public List<Acteur> get();
	public Acteur get(int id);
	public void save(Acteur a);
	public void delete(int id);
	public void update(Acteur a);

}
