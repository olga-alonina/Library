package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.AddBook;
import com.cydeo.library.pages.Authorization;
import com.cydeo.library.pages.Library;
import com.cydeo.library.utilities.utility_driver.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import static com.cydeo.library.utilities.utility_driver.BrowserUtils.waitFor;

public class US3AC1StepDef {
    Authorization authorization = new Authorization();
    Library library = new Library();
    AddBook addBook = new AddBook();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @When("{string} enter {string}, {string},{string},{string},{string}")
    public void enter(String credentials, String bookname, String isbn, String year, String author, String description) {
        waitFor(2);
        actions.click(addBook.bookName).sendKeys(faker.book().title()).perform();
        actions.click(addBook.isbn).sendKeys("" + faker.number().randomDigit()).perform();
        actions.click(addBook.year).sendKeys("" + faker.number().numberBetween(1800, 2020)).perform();
        actions.click(addBook.author).sendKeys(faker.book().author()).perform();
        actions.click(addBook.description).sendKeys(faker.gameOfThrones().city()).perform();
    }
}

