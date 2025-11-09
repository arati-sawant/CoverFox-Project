package com.coverFox.Pages;
//import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.events.EventException;

public class CoverFoxAddressDetailPage {
	//variables
	@FindBy(className = "mp-input-text") private WebElement pinCodeField;
	@FindBy(id = "want-expert") private WebElement mobNumField;
	@FindBy(xpath = "//*[text()='Continue']") private WebElement continueBtnAddressDetailsPage;
	@FindBy(xpath="//div[contains(text(),'pincode ')]") private WebElement pincodeErrormsg;
	@FindBy(xpath="//div[contains(text(),'mobile ')]") private WebElement mobileNoErrormsg;
	//constructor
	public CoverFoxAddressDetailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void enterPincode(String pincode) throws EventException {
		pinCodeField.sendKeys(pincode);
		System.out.println("entering pincode");
	}
	
	public void enterMobileNumber(String mobNum) throws EventException{
		mobNumField.sendKeys(mobNum);
		System.out.println("entering mobile Number");
	}
	
	public void ClickOnContinueButton() {
		continueBtnAddressDetailsPage.click();
		System.out.println("clicking on continue button");
	}
	
	public String getPincodeErrorMsg() {
		return pincodeErrormsg.getText();
	}
	
	public String getMobileNoErrorMsg() {
		return mobileNoErrormsg.getText();
	}
}
