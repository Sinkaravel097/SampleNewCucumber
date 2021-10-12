package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.AmazonLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonLogin extends BaseClass {
	
	AmazonLoginPojo a;
	
	@Given("To launch chrome browser and hit the amazon url")
	public void toLaunchChromeBrowserAndHitTheAmazonUrl() {
	   
		
		launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
	}

	@When("To pass the value in email or phno field")
	public void toPassTheValueInEmailOrPhnoField() {
	   
		a = new AmazonLoginPojo();
		passText(a.getEmailTxt(), "abc@gmail.com");
		
	}

	@When("To click the continue button")
	public void toClickTheContinueButton() {
		
		a = new AmazonLoginPojo();
		clickWebelement(a.getContinueBtn());
	}

	@When("To pass the values to password field")
	public void toPassTheValuesToPasswordField() {
	   
		a = new AmazonLoginPojo();
		passText(a.getPassTxt(), "542345678");
		Assert.assertTrue(false);
	}

	@When("To click the signin button")
	public void toClickTheSigninButton() {
	   
		a = new AmazonLoginPojo();
		clickWebelement(a.getSignInBtn());
	}

	@Then("To close the chrome browser")
	public void toCloseTheChromeBrowser() {
	    
		browserClose();
	}
	
	@When("pass valid username in email field")
	public void passValidUsernameInEmailField() {
	    
		a = new AmazonLoginPojo();
		passText(a.getEmailTxt(), "cucumber@gmail.com");
	}

	@When("click continue button")
	public void clickContinueButton() {
		
		a = new AmazonLoginPojo();
		clickWebelement(a.getContinueBtn());
	}

	@When("pass valid password in password field")
	public void passValidPasswordInPasswordField() {
	   
		a = new AmazonLoginPojo();
		passText(a.getPassTxt(), "hgf8765");
	}

	@When("click signin button")
	public void clickSigninButton() {
	   
		a = new AmazonLoginPojo();
		clickWebelement(a.getSignInBtn());
	}

}
