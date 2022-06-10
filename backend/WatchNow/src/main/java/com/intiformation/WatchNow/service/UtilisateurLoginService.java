package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.UtilisateurLogin;

public interface UtilisateurLoginService
{
	public List<UtilisateurLogin> get();
    public UtilisateurLogin get(int id);
    public UtilisateurLogin save(UtilisateurLogin ul);
    public void delete(int id);
    public void update(UtilisateurLogin ul);
}
