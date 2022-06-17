package com.intiformation.WatchNow.repository;

import javax.transaction.Transactional;

import com.intiformation.WatchNow.model.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>
{
	@Query(value = "select u._id_personne from utilisateur as u, utilisateur_login as ul where u._id_utilisateur_login = ul._id and (ul._login=:login or u._email=:login)", nativeQuery = true)
	Integer findIdByLoginOrEmail(@Param("login") String login);
}
