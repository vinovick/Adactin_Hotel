package com.adactin.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Login_Page;

public class Page_Object_Manager {

	public static WebDriver driver;

	private Login_Page lp;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public Login_Page getInstanceLogin() {
		lp = new Login_Page(driver);
		return lp;
	}
}
