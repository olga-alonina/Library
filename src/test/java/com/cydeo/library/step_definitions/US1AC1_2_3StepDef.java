package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.Authorization;
import com.cydeo.library.pages.Library;
import com.cydeo.library.utilities.utility_driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import static com.cydeo.library.utilities.utility_driver.useful_method.Login.click_on;
import static com.cydeo.library.utilities.utility_driver.useful_method.Login.login;

public class US1AC1_2_3StepDef {
    Authorization authorization = new Authorization();
    Library library = new Library();
    public static final Logger logger = LogManager.getLogger();
    @Given("{string} is on the {string} page")
    public void is_on_the_page(String credentials, String pageName) {
        logger.info("abracadabra");
        System.out.println("Alohomora");
        authorization.on_page(credentials, pageName);

    }

    @Then("verify that the title is {string}")
    public void verify_that_the_title_is(String title) {
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(), title);
    }

    @When("{string} enters valid email address and password")
    public void enters_valid_email_address_and_password(String credentials) {
        System.out.println("credentials = " + credentials);
      login(credentials);
    }
    @When("{string} click on {string}")
    public void clickOn(String role, String name) {
        click_on(name);
    }

    @Then("verify that there are {int} modules on the page")
    public void verify_that_there_are_modules_on_the_page(int amount) {
        System.out.println("library amount= " + library.moduleTable.size());
        Assert.assertEquals(library.moduleTable.size(), amount);
    }

    @Then("verify that the URL is {string}")
    public void verify_that_the_url_is(String givenUrl) {
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), givenUrl);
    }

    @When("{string} enters invalid email address or password")
    public void enters_invalid_email_address_or_password(String invCredentials) {
      login(invCredentials);
    }

    @Then("verify the error message {string}")
    public void verify_the_error_message(String expectErrMessage) {
        Assert.assertEquals(authorization.error_msg.getText(), expectErrMessage);
    }

}
