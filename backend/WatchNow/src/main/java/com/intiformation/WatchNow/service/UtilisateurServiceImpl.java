package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Utilisateur;
import com.intiformation.WatchNow.repository.UtilisateurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceImpl implements UtilisateurService
{
	@Autowired
	UtilisateurRepository utilisateurRepository;

	@Override
	public List<Utilisateur> get()
	{
		
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur get(int id)
	{
		
		return utilisateurRepository.findById(id).get();
	}

	@Override
	public Utilisateur save(Utilisateur u)
	{
		
		return utilisateurRepository.save(u);
	}

	@Override
	public void delete(int id)
	{
		utilisateurRepository.deleteById(id);
	}

	@Override
	public void update(Utilisateur u)
	{
		utilisateurRepository.save(u);
		
	}

	@Override
	public Utilisateur getByLogin(String login) {
		return get(utilisateurRepository.findIdByLoginOrEmail(login));
	}
}
