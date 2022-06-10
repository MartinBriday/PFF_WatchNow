package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Avis;
import com.intiformation.WatchNow.repository.AvisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvisServiceImpl implements AvisService
{
	@Autowired
	AvisRepository avisRepository;
	
	@Autowired
	private OeuvreService oeuvreService;

	@Override
	public List<Avis> get()
	{
		return avisRepository.findAll();
	}

	@Override
	public Avis get(int id)
	{
		return avisRepository.getReferenceById(id);
	}

	@Override
	public Avis save(Avis a)
	{
		return avisRepository.save(a);
		
	}

	@Override
	public void delete(int id)
	{
		avisRepository.deleteById(id);
		
	}

	@Override
	public void update(Avis a)
	{
		avisRepository.save(a);
		
	}

//	@Override
//	public List<Avis> getByOeuvreId(String id) {
//		// TODO Auto-generated method stub
//		return oeuvreService.getById(id).getListAvis();
//	}
}
