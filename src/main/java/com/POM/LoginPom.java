package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class LoginPom extends BaseClass {
	{
		driver =new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Username : Admin']")
	private WebElement username;
	
	@FindBy(xpath="	//input[@placeholder='username']\r\n")
	private WebElement inputusername;
	
	@FindBy(xpath="//p[text()='Password : admin123']")
	private WebElement password;
	
	@FindBy(xpath="	//input[@name='password']")
	private WebElement inputpassword;
		
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutton;
    
	@FindBy(xpath="//p[contains(@class,'oxd-text oxd-text--p orangehrm-login-forgot-header')]")
	private WebElement forgetpassword;

	public String  getUserName() {
	String uname=username.getText();
	uname.substring(uname.indexOf(':'),uname.length()-1);
	return uname;
	}
	
	public String getPassword() {
		String pass= password.getText();
		return pass.substring(pass.indexOf(':'));
		}
	public void loginButtonClick() {
		loginbutton.click();
		}
public void setInputUsername(String setUsername) {
	//this.inputusername=InputUsername;
	String username=inputusername.toString();
	
}
public void setInputPassword(String InputPassword) {
	//this.inputPassword=InputPassword;
	String password=inputpassword.toString();

}

	}
