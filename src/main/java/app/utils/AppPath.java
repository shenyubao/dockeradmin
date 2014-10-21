 /**
 * Copyright (c) 2010-2012 love320.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * 
 * Founder admin@love320.com
 */
package app.utils;

import java.net.URL;


public class AppPath {
	private static URL URL = AppPath.class.getResource("/");
	public static String dockerPath = "http://192.168.0.177:2375";
	
	public static String path(){
		return APPath();
	}
	
	public static String RootPath(){
		String url = URL.toString();
		String path = url.substring(6, url.length());
		return "/"+path;
	}
	
	//APP
	public static String APPath(){
		String url = URL.toString();
		String path = url.substring(6, url.length());
		return path.replace('/','\\');
	}
	
	//WEB
	public static String WebPath(){
		return APPath();
	}
}
