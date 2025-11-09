package stepDefinitions;

import io.cucumber.java.en.*;

public class CoverfoxCarBikeInsurance {
	@When("I click on carInsurance button")
	public void i_click_on_car_insurance_button() {
	    System.out.println("I click on carInsurance button");
	}

	@When("I provide  valid RTO number and click on view quotes button")
	public void i_provide_valid_rto_number_and_click_on_view_quotes_button() {
	   
	    System.out.println("I provide  valid RTO number and click on view quotes button");
	}
	@When("I provide valid details and click on view quotes button")
	public void i_provide_valid_details_and_click_on_view_quotes_button() {
	   
	    System.out.println("I provide valid details and click on view quotes button");
	}

	@Then("I should get plan details")
	public void i_should_get_plan_details() {
	    
	    System.out.println("I should get plan details");
	}
	
	@When("I click on bikeInsurance button")
	public void i_click_on_bike_insurance_button() {
	    
	    System.out.println("I click on bikeInsurance button");
	}


}
