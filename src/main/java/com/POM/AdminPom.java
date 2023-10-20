package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class AdminPom extends BaseClass{

	{
		driver =new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement Admin;
    @FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement Username;
    @FindBy(xpath="//div[text()='-- Select --']")
	private WebElement UserRole;
    @FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
    private WebElement EmployeeName;
    @FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']")
	private WebElement Status;
    
   @FindBy (xpath="//button[text()=' Reset ']")
   private WebElement Reset;
   
  @FindBy (xpath="//button[text()=' Search ']")
  private WebElement Search;
    
	public void AdminClick() {
		Admin.click();
	}
	public String  getUserName() {
	String uname=Username.getText();
	return uname;
    
}
	public String  getUserRole() {
	String role=UserRole.getText();
	return role;
	}
	public String  getEmpName() {
		String emp=EmployeeName.getText();
		return emp;
}
	public String getStatus() {
	String status=Status.getText();
	return status;
}
	public void ResetClick() {
		Reset.click();
	}
	public void SearchClick() {
		Search.click();
	}
	public void setUsername(String setUsername) {
		String username=Username.toString();
	}
	public void setUserRole(String setRole) {
		String Role=UserRole.toString();
	}
	public void setEMPName(String setEmp) {
		String emp=EmployeeName.toString();
	}
	public void setStatus(String setStatus) {
		String status=Status.toString();
	}
}
