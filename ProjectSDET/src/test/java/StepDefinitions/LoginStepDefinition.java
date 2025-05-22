package StepDefinitions;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	LoginPage loginPage= new LoginPage();

	@Given("the user enters usename")
	public void the_user_enters_usename() {
		loginPage.enterUsername();
	}
	@Given("the user enters password")
	public void the_user_enters_password() {
		loginPage.enterPassword();
	}
	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
		loginPage.clickOnLoginButton();
	}
	@Then("the user verifies the login")
	public void the_user_verifies_the_login() {
		System.out.println("Login Scucess");
	}


}
