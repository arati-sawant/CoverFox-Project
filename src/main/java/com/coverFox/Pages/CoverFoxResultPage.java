package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {
// variables
	@FindBy(xpath = "//div[contains(text(),'Insurance Plans')]") private WebElement matchingResults;
	
	//constructor
	public CoverFoxResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public String getMatchingResultNumber() {
		String result = matchingResults.getText();
		System.out.println("fetching matching reuslt");
		String[] temp = result.split(" ");
		String finalResult = temp[0];
		return finalResult;
	}
}
