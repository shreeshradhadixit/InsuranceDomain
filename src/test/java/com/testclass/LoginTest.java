package com.testclass;

import org.apache.poi.sl.usermodel.Sheet;
import org.testng.annotations.AfterMethod;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.POM.LoginPom;
import com.utility.Utility;

public class LoginTest extends BaseClass {
	
	private String value;

	@BeforeMethod
	public void setup() {
		try {
		LaunchTheWeb();
		}catch(IOException e) {
			
		}
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void LoginTest(String key) {
		LoginPom loginpom=new LoginPom();
		loginpom.setInputUsername(loginpom.getUserName());
		loginpom.setInputPassword(loginpom.getPassword());
		loginpom.loginButtonClick();
	}
		
   public void testUsers(){
   
		LoginPom loginpom;
		//LoginPom loginpom=new LoginPom();
		loginpom.getUserName(); 
		String key;
		loginpom.setInputUsername(key);
		loginpom.setInputPassword(value);
		Utility.implicitWeight();
		loginpom.loginButtonClick();

   }
		public void getDataFromExcel1() {
			Utility utility =new Utility();
		   Sheet sh=utility.getSheet("Sheet1");
		
			String key1=(String) utility.getSingleData(1, 0, sh);
			String value=(String) utility.getSingleData(1, 1, sh);
			
				}


	private void getDataFromExcel() {
		// TODO Auto-generated method stub
		
	}



	private void testUsers1() {
		// TODO Auto-generated method stub
		
	}
	}


