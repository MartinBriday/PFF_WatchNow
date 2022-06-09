package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Realisateur;
import com.intiformation.WatchNow.repository.RealisateurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealisateurServiceImpl implements RealisateurService
{
	@Autowired
	RealisateurRepository realisateurRepository;

	@Override
	public List<Realisateur> get()
	{
		return realisateurRepository.findAll();
	}

	@Override
	public Realisateur get(int id)
	{
		return realisateurRepository.getReferenceById(id);
	}

	@Override
	public void save(Realisateur r)
	{
		realisateurRepository.save(r);
	}

	@Override
	public void delete(int id)
	{
		realisateurRepository.deleteById(id);
	}

	@Override
	public void update(Realisateur r)
	{
		realisateurRepository.save(r);
	}
}
