package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

public class stepDefination extends base {
	
	@Given("^User is having application id and date$")
	public void user_is_having_application_id_and_date()  {
	  
	}

	@When("^Enter the app id and date$")
	public void enter_the_app_id_and_date(DataTable arg1) {
	    
	}

	@Then("^verify it displays latest version of app\\.$")
	public void verify_it_displays_latest_version_of_app() {
	  
	}
	
	@Given("^user is having date$")
	public void user_is_having_date() {
	   
	}

	@When("^Enter the date$")
	public void enter_the_date(DataTable arg1)  {
	   
	}

	@Then("^verify user is getting all the versions of Application with date$")
	public void verify_user_is_getting_all_the_versions_of_Application_with_date()  {
	   
	}

	
}
