package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.Authorization;
import com.cydeo.library.pages.Library;
import com.cydeo.library.utilities.utility_driver.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import static com.cydeo.library.utilities.utility_driver.useful_method.Login.login;

public class LoginWithDifferentUser_stepDefinitions {
    Library library = new Library();
    Authorization authorization = new Authorization();
    Actions actions = new Actions( Driver.getDriver() );

    @When("user login using {string} and {string}")
    public void user_login_using_and(String login, String password) {
        login(login,password);
    }

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String name) {
        System.out.println( "library = " + library.avatar.getText() );
        System.out.println( "name = " + name );
        Assert.assertEquals( "Test failed, mismatch element", library.avatar.getText(), name );

    }
}
/*

      */