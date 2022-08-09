package com.cydeo.library.pages;


import com.cydeo.library.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Library {
    public Library() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //library page(dashboard) as librarian//todo check as student too
    //top line
    @FindBy(css = "a[class='navbar-brand']")
    public WebElement library_sign;
    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboard_sign;
    @FindBy(css = "#menu_item > li:nth-child(2) > a > span.title")
    public WebElement users_button;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement books_sign;
    @FindBy(css = "#tbl_users_wrapper th")
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
    @FindBy(xpath = "//div[@id='navbarCollapse']//span[@class='title']")
    public List<WebElement> moduleTable;
    @FindBy(css = "#users a")
    public List<WebElement> userButtons;
    @FindBy(css = "#books a")
    public List<WebElement> booksButtons;

    @FindBy(css = "#add_user_form,button")
    public List<WebElement> addUserButtons;

    @FindBy(css = "[class='toast-message']")
    public WebElement confirmationMess;



    //*******methods*************
    public void click_module(String name) {
        for (WebElement module : moduleTable) {
            if (module.getText().equalsIgnoreCase(name)) {
                module.click();
            }
        }
    }

    public void click_button(String name) {
        for (WebElement button2 : addUserButtons) {
            if (button2.getText().equalsIgnoreCase(name)) {
                button2.click();
            }
        }
        for (WebElement button3 : booksButtons) {
            if (button3.getText().equals(name)) {
                button3.click();
            }
        }
    }
}
