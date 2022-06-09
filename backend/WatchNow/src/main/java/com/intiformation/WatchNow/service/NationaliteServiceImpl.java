package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Nationalite;
import com.intiformation.WatchNow.repository.NationaliteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NationaliteServiceImpl implements NationaliteService
{
	@Autowired
	NationaliteRepository nationaliteRepository;

	@Override
	public List<Nationalite> get()
	{
		return nationaliteRepository.findAll();
	}

	@Override
	public Nationalite get(int id)
	{
		return nationaliteRepository.getReferenceById(id);
	}

	@Override
	public void save(Nationalite n)
	{
		nationaliteRepository.save(n);
		
	}

	@Override
	public void delete(int id)
	{
		nationaliteRepository.deleteById(id);
		
	}

	@Override
	public void update(Nationalite n)
	{
		nationaliteRepository.save(n);
		
	}
}
