package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanPage {
//variable
	@FindBy(xpath = "//*[text()='Mother']") private WebElement motherOption;
	@FindBy(xpath = "//*[text()=' Next ']") private WebElement nextBtnHealthPlanPage;
	
	//constructor
	public CoverFoxHealthPlanPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//methods
	
	public void clickonNextButton() {
		nextBtnHealthPlanPage.click();
		System.out.println("clicking on next button");
		
	}
}
