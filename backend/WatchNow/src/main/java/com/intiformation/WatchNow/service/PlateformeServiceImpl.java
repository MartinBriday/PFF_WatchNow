package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Plateforme;
import com.intiformation.WatchNow.repository.PlateformeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlateformeServiceImpl implements PlateformeService
{
	@Autowired
	PlateformeRepository plateformeRepository;

	@Override
	public List<Plateforme> get()
	{
		return plateformeRepository.findAll();
	}

	@Override
	public Plateforme get(int id)
	{
		return plateformeRepository.getReferenceById(id);
	}

	@Override
	public Plateforme save(Plateforme p)
	{
		return plateformeRepository.save(p);
		
	}

	@Override
	public void delete(int id)
	{
		plateformeRepository.deleteById(id);
		
	}

	@Override
	public void update(Plateforme p)
	{
		plateformeRepository.save(p);		
	}
}
