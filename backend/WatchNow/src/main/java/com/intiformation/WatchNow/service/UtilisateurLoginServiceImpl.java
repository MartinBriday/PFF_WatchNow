package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.UtilisateurLogin;
import com.intiformation.WatchNow.repository.UtilisateurLoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurLoginServiceImpl implements UtilisateurLoginService
{
	@Autowired
	UtilisateurLoginRepository utilisateurLoginRepository;

	@Override
	public List<UtilisateurLogin> get()
	{
		return utilisateurLoginRepository.findAll();
	}

	@Override
	public UtilisateurLogin get(int id)
	{
		return utilisateurLoginRepository.getReferenceById(id);
	}

	@Override
	public UtilisateurLogin save(UtilisateurLogin ul)
	{
		return utilisateurLoginRepository.save(ul);
	}

	@Override
	public void delete(int id)
	{
		utilisateurLoginRepository.deleteById(id);
	}

	@Override
	public void update(UtilisateurLogin ul)
	{
		utilisateurLoginRepository.save(ul);
	}

	@Override
	public UtilisateurLogin getByLoginOrEmail(String login) {
		return utilisateurLoginRepository.findByLoginOrEmail(login);
	}
}
