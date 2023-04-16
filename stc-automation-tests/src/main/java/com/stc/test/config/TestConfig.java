package com.stc.test.config;

import java.io.*;

import java.util.Properties;

public class TestConfig {

	private static Properties prop = null;
	
	public static Properties getProjectProperties(){
		if(prop == null){
	    	try {
	    		String res = new File("").getAbsolutePath() + File.separatorChar + "src//test//resources" + File.separatorChar + "test.properties";
	    		InputStream input = new FileInputStream(res);
	    		prop = new Properties();
	    		prop.load(input);
	 
	    	} catch (Exception ex) {
	    		ex.printStackTrace();
	        }
    	}
    	
    	return prop;
	}
	
	public static String getPropertyValue(String property) {
		String specifiedProperty = null;
		try {
			Properties prop = getProjectProperties();
			specifiedProperty = prop.getProperty(property);

		} catch (Exception e) {
			specifiedProperty = null;
		}
		return specifiedProperty;
	}
	
}
