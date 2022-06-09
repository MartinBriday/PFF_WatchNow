package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Admin;
import com.intiformation.WatchNow.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	AdminRepository adminRepository;

	@Override
	public List<Admin> get()
	{
		return adminRepository.findAll();
	}

	@Override
	public Admin get(int id)
	{
		return adminRepository.getReferenceById(id);
	}

	@Override
	public void save(Admin a)
	{
		adminRepository.save(a);
		
	}

	@Override
	public void delete(int id)
	{
		adminRepository.deleteById(id);
		
	}

	@Override
	public void update(Admin a)
	{
		adminRepository.save(a);
		
	}
}
