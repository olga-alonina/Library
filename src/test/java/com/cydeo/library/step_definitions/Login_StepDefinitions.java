package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.Authorization;
import com.cydeo.library.pages.Library;
import com.cydeo.library.utilities.utility_driver.ConfigurationReader;
import com.cydeo.library.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import static com.cydeo.library.utilities.browserUtils.browser.waitFor;
import static com.cydeo.library.utilities.utility_driver.Login.enter;
import static com.cydeo.library.utilities.utility_driver.Login.login;

public class Login_StepDefinitions {
    Authorization authorization = new Authorization();
    Actions actions = new Actions( Driver.getDriver() );
    Library library = new Library();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get( ConfigurationReader.getProperty( "urlLibrary" ) );
    }

    @When("user enters {string}")
    public void user_enters(String name) {
        enter( name );
        waitFor( 2 );
    }

    @Then("user should see the {string} page")
    public void user_should_see_the_page(String title) {
        System.out.println( "Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle() );
        Assert.assertEquals( title, Driver.getDriver().getTitle() );
    }

    @When("user enter username {string}")
    public void user_enter_username(String username) {
        actions.click( authorization.email ).sendKeys( username ).perform();
    }

    @When("user enter password {string}")
    public void user_enter_password(String password) {
        actions.click( authorization.passwordWin ).sendKeys( password ).perform();
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        authorization.sign_In.click();
        waitFor( 2 );
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        Assert.assertTrue( "test fail, dashboard is not displayed",
                library.dashboard_sign.isDisplayed() );

    }

    @Then("there should be {string} users")
    public void there_should_be_users(String amountUsers) {
        System.out.println( "library.user_count.getText() = " + library.user_count.getText() );
        Assert.assertEquals( "test fail, different amount of users is not displayed",
                amountUsers, library.user_count.getText() );

    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String login, String password) {
        login( login, password );

    }
}