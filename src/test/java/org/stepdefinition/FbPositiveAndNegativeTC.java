package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.LoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbPositiveAndNegativeTC extends BaseClass {

	LoginPOJO l;

	@Given("To launch the browser and hit the fb url")
	public void to_launch_the_browser_and_hit_the_fb_url() {

		
		launchUrl("https://www.amazon.in/");

	}

	@When("To pass value in {string} email field")
	public void to_pass_value_in_email_field(String email) {

		l = new LoginPOJO();
		passText(l.getEmailTxt(), email);

	}

	@When("To pass value in {string} password field")
	public void to_pass_value_in_password_field(String password) {

		l = new LoginPOJO();
		passText(l.getPasswordTxt(), password);

	}

	@When("To click login button")
	public void to_click_login_button() {

		l = new LoginPOJO();
		clickWebelement(l.getLoginFindAll());

	}

	@Then("To close the browser")
	public void to_close_the_browser() {

		browserClose();

	}

}
