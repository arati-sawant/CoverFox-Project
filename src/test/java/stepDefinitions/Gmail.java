package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gmail {
	@Given("I am on login page")
	public void i_am_on_login_page() {
		System.out.println("I am on login page");
	}

	@When("I provide details and click on login button")
	public void i_provide_details_and_click_on_login_button(io.cucumber.datatable.DataTable dataTable) {
	    //reading table using list
		List<List<String>> testListData = dataTable.asLists();
		List<String> user1 = testListData.get(0);
		String userName1 = user1.get(0);// getting user1 username
		String password1 = user1.get(1);// getting user1 password
		String msg1 = user1.get(2);
		Reporter.log(userName1, true);
		Reporter.log(password1, true);
		Reporter.log(msg1, true);
		List<Map<String, String>> testMapData = dataTable.asMaps();
		System.out.println("----------");
		System.out.println(testMapData.get(1).get("userName"));
		System.out.println("-----------");
	}

	@Then("I should naviagte to inbox")
	public void i_should_naviagte_to_inbox() {
		System.out.println("I should naviagte to inbox");
	}
}
