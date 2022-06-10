package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Personne;
import com.intiformation.WatchNow.repository.PersonneRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneServiceImpl implements PersonneService
{
	
	@Autowired
	PersonneRepository personneRepository;

	@Override
	public List<Personne> get()
	{
		return personneRepository.findAll();
	}

	@Override
	public Personne get(int id)
	{
		return personneRepository.getReferenceById(id);
	}

	@Override
	public Personne save(Personne p)
	{
		return personneRepository.save(p);
	}

	@Override
	public void delete(int id)
	{
		personneRepository.deleteById(id);
		
	}

	@Override
	public void update(Personne p)
	{
		personneRepository.save(p);	
		
	}

}
