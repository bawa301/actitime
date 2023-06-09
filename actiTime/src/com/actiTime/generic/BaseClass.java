package com.actiTime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actiTime.pom.Home;
import com.actiTime.pom.Login;

public class BaseClass 
{
	static 
		{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	@AfterClass
	public void closeBrowser() 
	{
		driver.close();
	}
	@BeforeMethod
	public void logIn() throws Exception
	{
		FileLib f=new FileLib();
		String url = f.getPropertData("url");
		driver.get(url);
		String un = f.getPropertData("username");
		String pwd = f.getPropertData("password");
		Login l = new Login(driver);
		l.setLogin(un, pwd);
	}	
	@AfterMethod
	public void logOut()
	{
		Home h=new Home(driver);
		h.setLout();
		
	}
}
