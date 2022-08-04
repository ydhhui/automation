package com.testcase.abc;

import org.testng.annotations.Test;

import com.abc.main.Broswer_Launch;
import com.pom.abc.Login_Page;

public class Login_Testcase extends Broswer_Launch {
	
//public static void main(String[] args) {
	/*	Broswer_Launch obj=new Broswer_Launch();
	Login_Page log= new Login_Page();
	obj.launch();   */
	
	//test case-1
   /*  log.getusername().sendKeys("Admin1");
	 log.getPassword().sendKeys("admin123");
	 log.getbLogin().click();
*/	
	//tc1-----
	@Test
	public void TC1() {
		
		Login_Page log= new Login_Page();
	
	log.userlogin("Admin1","admin123");
	if(!driver.getCurrentUrl().contains("dashboard")) {
		System.out.println(" TEST CAE-PASS USER can not LOGIN WITH INVALID CREADENTIALS");
	}else {
		System.out.println("TEST CASE_FAIL USER CAN login with invalid credentilas NAVIGATE TO HOME PAGE");
	}
	}
	//test case-2
	/*	 log.getusername().sendKeys("Admin");
	 log.getPassword().sendKeys("admin123");
	 log.getbLogin().click();
log.userlogin("Admin", "admin123")
*/	
	//tc2-----
	@Test
	public void TC2() {
		Login_Page log= new Login_Page();
		
		log.userlogin("Admin", "admin123");
	if(driver.getCurrentUrl().contains("dashboard")) {
		System.out.println(" TEST CAE-PASS USER can not LOGIN WITH VALID CREADENTIALS");
	}else {
		System.out.println("TEST CASE_FAIL USER CAN  NAVIGATE TO HOME PAGE with valid credentials");
	}
	
}
}
