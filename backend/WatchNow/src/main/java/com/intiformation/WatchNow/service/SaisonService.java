package com.intiformation.WatchNow.service;

import java.util.List;

import com.intiformation.WatchNow.model.Saison;

public interface SaisonService {

	List<Saison> getByTitleId(String id);
}
