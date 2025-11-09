package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {
	//encapsulation
	// variable
	@FindBy(xpath = "//*[text()='Female']")
	private WebElement femaleOption;

//constructor
	public CoverFoxHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//methods
	public void clickOnFemaleOption() {
		femaleOption.click();
		System.out.println("Clicking on female option button");
	}
}
