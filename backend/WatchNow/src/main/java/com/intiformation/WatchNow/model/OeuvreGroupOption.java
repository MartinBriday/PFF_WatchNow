package com.intiformation.WatchNow.model;

import java.util.List;

import lombok.Data;

@Data
public class OeuvreGroupOption {

	private String displayName;
	private List<OeuvreWatchOption> watchOptions;
}
