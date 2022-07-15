package com.cydeo.library.pages;


import com.cydeo.library.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Library {
    public Library() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

    //library page(dashboard) as librarian//todo check as student too
    //top line
    @FindBy(css = "a[class='navbar-brand']")
    public WebElement library_sign;
    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboard_sign;
    @FindBy(xpath = "//span[.='Users']")
    public WebElement users_sign;
    @FindBy(xpath = "//span[.='Books']")
    public WebElement books_sign;
    @FindBy(xpath ="//thead/tr/th")
    public List<WebElement> topsTable;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement avatar;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement log_out_avatar;
    @FindBy(id = "user_count")
    public WebElement user_count;
    @FindBy(xpath = "//h6[.='Books']")
    public WebElement books_count;
    @FindBy(xpath = "//h6[.='Borrowed Books']")
    public WebElement borrowed_books;
    @FindBy(tagName = "strong")
    public WebElement version_library;

}
