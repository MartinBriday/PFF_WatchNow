package com.intiformation.WatchNow.model;

import java.util.HashMap;

import lombok.Data;

@Data
public class OeuvreWatchOption {
	private HashMap<String, String> link;
	private HashMap<String, String> provider;
	private String primaryText;
	private String secondaryText;

}
