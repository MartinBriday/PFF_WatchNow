package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.OeuvreObject;

public interface OeuvreService {

	List<OeuvreObject> getByTitre(String titre);
}
