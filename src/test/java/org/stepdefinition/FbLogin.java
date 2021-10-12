package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.LoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {

	LoginPOJO l;

	@Given("User has to launch the chrome browser and hit the facebook url")
	public void user_has_to_launch_the_chrome_browser_and_hit_the_facebook_url() {

		
		launchUrl("https://en-gb.facebook.com/");

	}
	
	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {

		l = new LoginPOJO();
		clickWebelement(l.getLoginFindAll());
		
	}

	@When("User has to navigate to the home page")
	public void user_has_to_navigate_to_the_home_page() {

		System.out.println("Please check your email");
		
	}

	@When("User has to pass the invalid username in email field")
	public void user_has_to_pass_the_invalid_username_in_email_field(io.cucumber.datatable.DataTable d) {
	    
		l = new LoginPOJO();
		
		Map<String, String> mp = d.asMap(String.class, String.class);
		passText(l.getEmailTxt(), mp.get("email2"));  
		
	} 

	@When("User has to pass the valid password in password field")
	public void user_has_to_pass_the_valid_password_in_password_field(io.cucumber.datatable.DataTable d) {

		l = new LoginPOJO();
		
		List<Map<String, String>> mp = d.asMaps();
		passText(l.getPasswordTxt(),mp.get(2).get("password2")); 
		Assert.assertTrue(false);
		
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {

		 //browserClose();	
	}
	
	
}
