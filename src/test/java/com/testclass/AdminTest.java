package com.testclass;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.POM.AdminPom;
import com.POM.LoginPom;

public class AdminTest extends BaseClass {

	@BeforeMethod
	public void setup() {
		try {
			LaunchTheWeb();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		@Test
		public void LoginTest(String key) {
			AdminPom adminpom=new AdminPom();
			adminpom.setUsername(key);
			adminpom.setEMPName(key);
			adminpom.setStatus(key);
			adminpom.setUserRole(key);
			adminpom.ResetClick();
			adminpom.SearchClick();
			

}
}
