package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Admin;

public interface AdminService
{
	public List<Admin> get();
	public Admin get(int id);
	public void save(Admin a);
	public void delete(int id);
	public void update(Admin a);

}
