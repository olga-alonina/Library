package com.cydeo.library.pages;

import com.cydeo.library.utilities.utility_driver.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Book {
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    public Book() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#add_book_form .form-control")
    public List<WebElement> allFormsAddBook;


}
