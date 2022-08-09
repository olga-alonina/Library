package com.cydeo.library.pages;

import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.library.utilities.utility_driver.BrowserUtils.waitFor;
import static com.cydeo.library.utilities.utility_driver.useful_method.Login.login;

public class Authorization {
    public Authorization() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

    Actions actions = new Actions( Driver.getDriver() );
    //Authorization page
    @FindBy(css = "#login-form [type='submit']")
    public WebElement sign_In;
    @FindBy(css = "#login-form [class='alert alert-danger']")
    public WebElement error_msg;
    @FindBy(id = "inputEmail")
    public WebElement email;
    @FindBy(id = "inputPassword")
    public WebElement passwordWin;

    public void on_page( String credentials, String pageName){
        switch (pageName.toLowerCase()){
            case "login":
                Driver.getDriver().get(ConfigurationReader.getProperty("urlLibrary"));
                break;
            case"library":
                Driver.getDriver().get(ConfigurationReader.getProperty("urlLibrary"));
                System.out.println("credentials = " + credentials);
                login(credentials);
                sign_In.click();
                waitFor(2);

        }
    }
}


