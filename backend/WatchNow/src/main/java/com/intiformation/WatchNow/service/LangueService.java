package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Langue;

public interface LangueService
{
	public List<Langue> get();
	public Langue get(int id);
	public Langue save(Langue l);
	public void delete(int id);
	public void update(Langue l);
}
