package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Nationalite;

public interface NationaliteService
{
	public List<Nationalite> get();
	public Nationalite get(int id);
	public Nationalite save(Nationalite n);
	public void delete(int id);
	public void update(Nationalite n);
	public List<Nationalite> getNationaliteByIdPersonne(int id);
}
