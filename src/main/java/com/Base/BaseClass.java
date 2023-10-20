package com.Base;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Utility;

public class BaseClass {
	private static final Reader fileInputStream = null;
	public static WebDriver driver;

	public void LaunchTheWeb() throws IOException {
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Properties properties=new Properties();
		properties.load(fileInputStream);
		properties.getProperty("weburl");
		driver.get(properties.getProperty("weburl"));
		Utility.implicitWeight();
		
	}
	

}
