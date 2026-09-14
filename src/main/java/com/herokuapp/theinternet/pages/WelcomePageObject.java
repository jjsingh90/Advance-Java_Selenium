package com.herokuapp.theinternet.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

	private WebDriver driver;
	private Logger log;
	
	private String pageUrl = "http://the-internet.herokuapp.com/";
	
	private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
	
	public WelcomePageObject(WebDriver driver, Logger log) {
		// TODO Auto-generated constructor stub
		super(driver,log);
		
	}
	/** Open WelcomePage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	/** Open LoginPage by clicking on Form Authentication Link */
	public LoginPage clickFormAuthenticationLink() {
		log.info("Clicking Form Authentication link on Welcome Page");
		click(formAuthenticationLinkLocator);
		return new LoginPage(driver, log);
	}

}
