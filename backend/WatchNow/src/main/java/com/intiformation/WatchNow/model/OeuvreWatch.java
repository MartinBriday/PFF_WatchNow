package com.intiformation.WatchNow.model;

import java.util.List;

import lombok.Data;

@Data
public class OeuvreWatch {

	private String id;
	private List<OeuvreGroupOption> optionGroups;
	
	public String getId() {
		return id.split("/")[id.split("/").length - 1];
	}
}
