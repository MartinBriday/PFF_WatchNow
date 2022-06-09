package com.intiformation.WatchNow.repository;

import com.intiformation.WatchNow.model.Avis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Integer>
{

}
