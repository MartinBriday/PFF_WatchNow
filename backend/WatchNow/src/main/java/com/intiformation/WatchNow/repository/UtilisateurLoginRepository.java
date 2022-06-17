package com.intiformation.WatchNow.repository;

import javax.transaction.Transactional;

import com.intiformation.WatchNow.model.UtilisateurLogin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UtilisateurLoginRepository extends JpaRepository<UtilisateurLogin, Integer>
{
	@Query(value = "select ul.* from utilisateurlogin as ul, utilisateur as l where l._utilisateurLogin = ul._id and (ul._login=:login or u._email=:login)", nativeQuery = true)
	UtilisateurLogin findByLoginOrEmail(@Param("login") String login);
}
