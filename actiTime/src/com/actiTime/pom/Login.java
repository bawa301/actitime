package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	
	@FindBy (id="username")
	private WebElement usrn;
	
	@FindBy (name="pwd")
	private WebElement pswd;
	
	@FindBy (xpath = "//div[text()='Login ']")
	private WebElement lgbt;

	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setLogin(String un,String pw)
	{
		usrn.sendKeys("admin");
		pswd.sendKeys("manager");
		lgbt.click();
	}
	
}
