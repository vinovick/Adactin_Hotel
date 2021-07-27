package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.Login_Page;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Stepdefinition extends BaseClass{
	
	public static WebDriver driver = Runner.driver;

	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		getUrl("https://adactinhotelapp.com/");
	}
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@When("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
		inputValueElement(pom.getInstanceLogin().getUsername(), "vinovicky");
	}

	@When("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		inputValueElement(pom.getInstanceLogin().getPassword(), "Jan@2020");
	}

	@Then("^User validate the username and password$")
	public void user_validate_the_username_and_password() throws Throwable {
		clickOnElement(pom.getInstanceLogin().getLogin());
	}

}
