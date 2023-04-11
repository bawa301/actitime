package com.actiTime.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home
{
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement lgObt;
	
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement tasks;
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setLout()
	{
		lgObt.click();
	}
	public WebElement getTasks() {
		return tasks;
	}
}
