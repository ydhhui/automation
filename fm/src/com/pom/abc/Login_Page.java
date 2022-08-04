package com.pom.abc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.main.Broswer_Launch;

public class Login_Page extends Broswer_Launch {
	
	@FindBy (id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement Password;
	
	@FindBy(id="btnLogin")
	private WebElement Login;
	
	public WebElement getusernametxt() {
		return username;
	}
	public WebElement getPasswordtxt() {
		return	Password;
	}
	public WebElement getbLogint() {
		return Login;
	}
	public void userlogin(String username,String password) {
		getusernametxt().sendKeys(username);;
		getPasswordtxt().sendKeys(password);;
		getbLogint().click();;
	}
	public Login_Page(){
		PageFactory.initElements(driver,this);
		
	}

}
