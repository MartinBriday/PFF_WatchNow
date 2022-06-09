package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Oeuvre;

public interface OeuvreService {

	List<Oeuvre> getByTitre(String titre);
}
