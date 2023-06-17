package com.app.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		System.out.println("I am on the login page");
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
		System.out.println("I enter valid credentials");
	}

	@When("click the login button")
	public void click_the_login_button() {
		System.out.println("click the login button");
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		System.out.println("I should be logged in successfully");
	}
}
