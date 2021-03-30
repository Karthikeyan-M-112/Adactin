package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties ps;
	public ConfigurationReader() throws IOException {
		

	File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Adactin\\Configuration.properties");
	FileInputStream fis=new FileInputStream(f);
	 ps=new Properties();
	ps.load(fis);
	}
	public static String getBrowser()

	{
		String browser = ps.getProperty("browser");
		System.out.println(browser);
		return browser;
	}
	public static String getUrl()
	{
		String url = ps.getProperty("url");
		System.out.println(url);
		return url;
		
		
	}
	
}

