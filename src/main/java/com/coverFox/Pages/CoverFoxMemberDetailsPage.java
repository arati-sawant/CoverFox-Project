package com.coverFox.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coverFox.Utils.Utility;

public class CoverFoxMemberDetailsPage {
// variables
	@FindBy(id = "Age-You") private WebElement youDropdown;
	@FindBy(id = "Age-Mother") private WebElement motherDropdown;
	@FindBy(xpath = "//*[text()='Next']") private WebElement nextBtnMemberDetailsPage;
	
	//constructor
	public CoverFoxMemberDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//methods 
	public void handlingDropdown(String age) {
		Utility.selectDropdownByVisibleText(youDropdown," "+ age + " years");
		//Utility.selectDropdownByVisibleText(motherDropdown," "+age1 + " years");
		System.out.println("handling you dropdown");
	}
	
	public void clickOnNextBtnMemberDetailsPage() {
		nextBtnMemberDetailsPage.click();
		System.out.println("clicking on next button");
	}
}
