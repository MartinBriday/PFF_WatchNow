package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Langue;
import com.intiformation.WatchNow.repository.LangueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LangueServiceImpl implements LangueService
{
	@Autowired
	LangueRepository langueRepository;

	@Override
	public List<Langue> get()
	{
		return langueRepository.findAll();
	}

	@Override
	public Langue get(int id)
	{
		return langueRepository.getReferenceById(id);
	}

	@Override
	public void save(Langue l)
	{
		langueRepository.save(l);
		
	}

	@Override
	public void delete(int id)
	{
		langueRepository.deleteById(id);
		
	}

	@Override
	public void update(Langue l)
	{
		langueRepository.save(l);
		
	}

}
