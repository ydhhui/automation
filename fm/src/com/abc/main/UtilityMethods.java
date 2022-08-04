package com.abc.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityMethods {
	public static Properties prop;
	public void loadprop() {
	 prop=new Properties();
		 try {
			prop.load(new FileInputStream("F:\\workpace 2\\fm\\resources\\config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(prop.getProperty("browsername"));
		 System.out.println(prop.getProperty("url"));
	}

}
