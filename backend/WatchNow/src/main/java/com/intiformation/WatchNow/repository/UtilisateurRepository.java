package com.intiformation.WatchNow.repository;

import javax.transaction.Transactional;

import com.intiformation.WatchNow.model.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>
{
	
}
