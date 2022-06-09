package com.intiformation.WatchNow.repository;

import com.intiformation.WatchNow.model.Langue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LangueRepository extends JpaRepository<Langue, Integer>
{

}
