package com.abc.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.pom.abc.Login_Page;

public class Broswer_Launch {
	public static  WebDriver driver;

//	 public void launch(String broswername, String url) {
	
//	@BeforeSuite
	public void launch() {
		
		UtilityMethods utility = new UtilityMethods();
		utility.loadprop();
		System.out.println(UtilityMethods.prop.getProperty("browsername"));

		if (UtilityMethods.prop.getProperty("broswername").equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
			driver = new ChromeDriver();
			// driver.get("https://opensource-demo.orangehrmlive.com/");
		} else if (UtilityMethods.prop.getProperty("broswername").equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			// driver.get("https://opensource-demo.orangehrmlive.com/");
		} else {

			System.setProperty("webdriver.edge.driver", "resources\\msedgedriver.exe");
			driver = new EdgeDriver();
			// driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		driver.get(UtilityMethods.prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	@AfterSuite(alwaysRun = true)
    public void close() {
	driver.close();
}

	}


