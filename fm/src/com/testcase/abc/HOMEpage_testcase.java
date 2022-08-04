package com.testcase.abc;

import org.testng.annotations.Test;

import com.pom.abc.Home_page;

public class HOMEpage_testcase {
	
		@Test()
		public void TC3() {
		//	broswerlaunch obj = new broswerlaunch();
		//	obj.launch();

			Home_page home = new Home_page("Admin","admin123");
		//	home.HomePage("Admin","admin123");
			home.GetTheDisplayInformation();

			if (home.getDisplayAbout().isDisplayed()) {
				System.out.println("test case-pass");
				System.out.println(home.getDisplayAbout().getText());
			} else {
				System.out.println("test case- fail");
			}
		}
}
