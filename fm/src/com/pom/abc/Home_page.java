package com.pom.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home_page extends Login_Page {
	
	public Home_page(String username,String password) {
		
		if (!getWelcome().isDisplayed()) { 
			userlogin(username, password);
		}
	}
	
	public WebElement getWelcome() {
		return driver.findElement(By.id("welcome"));
	}
	
	public WebElement getAbout() {
		return driver.findElement(By.id("aboutDisplayLink"));
		
	}
	
	public WebElement getDisplayAbout() {
		return driver.findElement(By.id("displayAbout"));
	}

	public void GetTheDisplayInformation() {
		getWelcome().click();
		getAbout().click();
		
	}}
