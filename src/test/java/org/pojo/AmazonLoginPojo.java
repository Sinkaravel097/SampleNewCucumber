package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPojo extends BaseClass {
	
	public AmazonLoginPojo() {

		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="email")
	private WebElement emailTxt;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(name="password")
	private WebElement passTxt;
	
	@FindBy(id="signInSubmit")
	private WebElement signInBtn;

	
	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
	
	

}
