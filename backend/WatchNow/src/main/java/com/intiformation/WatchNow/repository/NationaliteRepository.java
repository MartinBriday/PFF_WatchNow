package com.intiformation.WatchNow.repository;

import com.intiformation.WatchNow.model.Nationalite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationaliteRepository extends JpaRepository<Nationalite, Integer>
{

}
