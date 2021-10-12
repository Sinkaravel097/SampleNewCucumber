package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass {
	
	// 1. Non parametrized constructor
	public LoginPOJO() {

		PageFactory.initElements(driver, this);	
	}
	 
	
	// 2. Private WebElements  
	
	// instead of  WebElement email = driver.findElement(By.id("email"));
	@CacheLookup
	@FindBy(id="email")
	private WebElement emailTxt;
	
	// instead of WebElement password = driver.findElement(By.name("pass"));
	@CacheLookup
	@FindBy(name="pass")
	private WebElement passwordTxt;
	 
	@CacheLookup
	@FindBy(id="u_0_d_Mw")
	private WebElement loginBtn;
	
	
	@CacheLookup
	@FindBys({
		
		@FindBy(xpath="//button[@data-testid='royal_login_button']"),
		@FindBy(xpath="//button[text()='Log In']"),
		@FindBy(xpath="//button[@id='u_0_d_Mw']")
	})
	private WebElement loginFindBys;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//button[@data-testid='royal_login_button']"),
		@FindBy(xpath="//button[text()='Log In']"),
		@FindBy(xpath="//button[@id='u_0_d_Mw']")
	})
	private WebElement loginFindAll;

	
	
	// 3. Getters to access those webElements outside the class
	
	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getLoginFindBys() {
		return loginFindBys;
	}

	public WebElement getLoginFindAll() {
		return loginFindAll;
	}

}
