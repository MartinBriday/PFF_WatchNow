package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Realisateur;

public interface RealisateurService
{
	public List<Realisateur> get();
    public Realisateur get(int id);
    public void save(Realisateur r);
    public void delete(int id);
    public void update(Realisateur r);
}
