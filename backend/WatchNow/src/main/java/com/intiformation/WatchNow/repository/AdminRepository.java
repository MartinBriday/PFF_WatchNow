package com.intiformation.WatchNow.repository;

import com.intiformation.WatchNow.model.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>
{

}
