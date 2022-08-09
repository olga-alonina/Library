package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.AddUser;
import com.cydeo.library.pages.Authorization;
import com.cydeo.library.pages.Library;
import com.cydeo.library.utilities.utility_driver.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US2AC1StepDef {
    Authorization authorization = new Authorization();
    Library library = new Library();
    AddUser addUser = new AddUser();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());


    @When("{string} click {string} module")
    public void click_module(String credentials, String moduleName) {
        library.click_module(moduleName);
    }

    @When("{string} enter {string}, {string},{string}, {string}")
    public void enter(String credentials, String full_name, String password, String email, String address) {
        actions.click(addUser.full_name).sendKeys(faker.name().fullName()).perform();
        actions.click(addUser.password).sendKeys(faker.internet().password()).perform();
        actions.click(addUser.email).sendKeys(faker.internet().emailAddress()).perform();
        actions.click(addUser.address).sendKeys(faker.address().fullAddress()).perform();
    }

    @Then("verify {string}")
    public void verify(String message) throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
//        wait.until(ExpectedConditions.visibilityOf(library.confirmationMess));

        System.out.println("library.confirmationMess.getText() = " + library.confirmationMess.getText());
        Assert.assertTrue(library.confirmationMess.isDisplayed());
        Assert.assertEquals(library.confirmationMess.getText().toLowerCase(), message);

    }
}
