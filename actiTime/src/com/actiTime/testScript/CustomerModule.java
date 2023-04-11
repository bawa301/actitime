package com.actiTime.testScript;


import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLib;
import com.actiTime.pom.Home;
import com.actiTime.pom.TaskList;

@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass
{
	@Test
	public void creatCustomer() throws Throwable
	{
		Reporter.log("creatCustomer",true);
		
		FileLib f = new FileLib();
		String custName = f.getExcelData("Create Customer", 1, 1);
		String custDesc = f.getExcelData("Create Customer", 1, 2);
	
		Home h = new Home(driver);
		h.getTasks().click();
		
		TaskList t = new TaskList(driver);
		t.getAddNew().click();
		t.getNewCustomer().click();
		t.getWriteCustomerName().sendKeys(custName);
		t.getWriteDesc().sendKeys(custDesc);
		t.getCreateCustomerBtn().click();
		Thread.sleep(2000);
		String aResult = t.getCustTitle().getText();
		assertEquals(aResult, custName);		
	}
	
	@Test
	public void createNewProject() throws Throwable 
	{
		FileLib f = new FileLib();
		String proName = f.getExcelData("Create Project", 1, 1);
		String proDesc = f.getExcelData("Create Project", 1, 2);
		
		Home h = new Home(driver);
		h.getTasks().click();
		
		TaskList t = new TaskList(driver);
		t.getAddNew().click();
		t.getNewProject().click();
		t.getEnterProjectName().sendKeys(proName);
		t.getWriteProDesc().sendKeys(proDesc);
		t.getCreateProjectBtn().click();
		Thread.sleep(2000);
		String aResult = t.getProjectTitle().getText();
		assertEquals(aResult, proName);
	}
	
	@Test
	public void CreateNewTask() throws Throwable
	{
			FileLib f = new FileLib();
			String task = f.getExcelData("Create Task", 1, 1);
			
			Home h = new Home(driver);
			h.getTasks().click();
			
			TaskList t = new TaskList(driver);
			t.getAddNew().click();
			t.getNewTask().click();
			t.getWriteTaskName().sendKeys(task);
			t.getCreateTaskBtn().click();
			
			Thread.sleep(2000);
			
			String aResult = t.getAllTask().getText();		
			assertEquals(aResult, task);
	}
}