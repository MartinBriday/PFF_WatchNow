package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Plateforme;

public interface PlateformeService
{
	public List<Plateforme> get();
	public Plateforme get(int id);
	public Plateforme save(Plateforme p);
	public void delete(int id);
	public void update(Plateforme p);
}
