package com.cydeo.library.pages;

import com.cydeo.library.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authorization {
    public Authorization() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

    Actions actions = new Actions( Driver.getDriver() );
    //Authorization page
    @FindBy(css = "button[type='submit']")
    public WebElement sign_In;
    @FindBy(id = "inputEmail-error")
    public WebElement error_msg;
    @FindBy(css = "label[for='inputEmail']")
    public WebElement email;
    @FindBy(css = "label[for='inputPassword']")
    public WebElement passwordWin;
}


