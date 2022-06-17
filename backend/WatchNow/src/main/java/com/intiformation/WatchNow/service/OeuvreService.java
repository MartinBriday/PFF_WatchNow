package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Oeuvre;

public interface OeuvreService {

	Oeuvre getById(String id);
	List<Oeuvre> getByTitre(String titre);
	List<Oeuvre> getByTitre(String titre, Integer nbResults);
	List<Oeuvre> getMostPopularByType(String type);
	List<Oeuvre> getMostPopularByType(String type, Integer nbResults);
	List<Oeuvre> getMostPopularByTypeAndGenre(String type, String genre);
	List<Oeuvre> getMostPopularByTypeAndGenre(String type, String genre, Integer nbResults);
	List<Oeuvre> getMoreLikeThis(String id);
	List<Oeuvre> getMoreLikeThis(String id, Integer nbResults);
	List<Oeuvre> getByKeyword(String keyword);
	List<Oeuvre> getByKeyword(String keyword, Integer nbResults);
	List<Oeuvre> getComingSoonByType(String type);
	List<Oeuvre> getComingSoonByType(String type, Integer nbResults);
	List<Oeuvre> getByTitreAndType(String titre, String type);
	List<Oeuvre> getByTitreAndType(String titre, String type, Integer nbResults);
	List<Oeuvre> getByTitreAndAnnee(String titre, int annee);
	List<Oeuvre> getByTitreAndAnnee(String titre, int annee, Integer nbResults);
	List<Oeuvre> getByTitreAndTypeAndAnnee(String titre, String type, int annee);
	List<Oeuvre> getByTitreAndTypeAndAnnee(String titre, String type, int annee, Integer nbResults);
}
