package com.actiTime.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	
	//Create New Customer Elements Declaration
	@FindBy (xpath = "//div[text()='Add New']")
	private WebElement addNew;
	@FindBy (xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomer;
	@FindBy (xpath = "//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement writeCustomerName;
	@FindBy (xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement writeDesc;
	@FindBy (xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	@FindBy (xpath = "//div[@class='titleEditButtonContainer']")
	private WebElement custTitle;
	
	// Create New Project Elements Declaration
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProject;
	@FindBy(xpath = "//input[@placeholder='Enter Project Name' and @class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterProjectName;
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement writeProDesc;
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProjectBtn;
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement projectTitle;
	
	//Create New Task Elements Declaration
	@FindBy (xpath = "//div[text()='+ New Tasks']")
	private WebElement newTask;
	@FindBy (xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement writeTaskName;
	@FindBy (xpath = "//div[text()='Create Tasks']")
	private WebElement createTaskBtn;
	@FindBy (xpath = "//div[@class='taskRowCellWrapper']/div/div/div[@class='title']")
	private WebElement allTask;
	
	//initialization
	public TaskList(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	
	public WebElement getAddNew() 
	{
		return addNew;
	}
	
	//Create New Customer
	public WebElement getNewCustomer() 
	{
		return newCustomer;
	}
	public WebElement getWriteCustomerName() 
	{
		return writeCustomerName;
	}
	public WebElement getWriteDesc() 
	{
		return writeDesc;
	}
	public WebElement getCreateCustomerBtn() 
	{
		return createCustomerBtn;
	}
	public WebElement getCustTitle() 
	{
		return custTitle;
	}

	//Create New Project
	public WebElement getNewProject() 
	{
		return newProject;
	}
	public WebElement getEnterProjectName() 
	{
		return enterProjectName;
	}
	public WebElement getWriteProDesc() 
	{
		return writeProDesc;
	}
	public WebElement getCreateProjectBtn() 
	{
		return createProjectBtn;
	}
	public WebElement getProjectTitle() 
	{
		return projectTitle;
	}

	
	//Create New Task
	public WebElement getNewTask() 
	{
		return newTask;
	}
	public WebElement getWriteTaskName() 
	{
		return writeTaskName;
	}
	public WebElement getCreateTaskBtn() 
	{
		return createTaskBtn;
	}
	public WebElement getAllTask() {
		return allTask;
	}
	
	
	
	
	
}
