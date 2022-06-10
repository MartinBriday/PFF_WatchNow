package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Utilisateur;

public interface UtilisateurService
{
	public List<Utilisateur> get();
	public Utilisateur get(int id);
    public Utilisateur save(Utilisateur u);
    public void delete(int id);
    public void update(Utilisateur u);
}
