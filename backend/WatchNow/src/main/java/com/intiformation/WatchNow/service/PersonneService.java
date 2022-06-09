package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Personne;

public interface PersonneService
{
	public List<Personne> get();
    public Personne get(int id);
    public void save(Personne p);
    public void delete(int id);
    public void update(Personne p);
}
