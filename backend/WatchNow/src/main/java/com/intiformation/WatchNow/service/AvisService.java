package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Avis;

public interface AvisService
{
	public List<Avis> get();
	public Avis get(int id);
	//public List<Avis> getByOeuvreId(String id);
	public void save(Avis a);
	public void delete(int id);
	public void update(Avis a);
}
