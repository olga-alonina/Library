package com.cydeo.library.utilities.utility_driver;

import com.cydeo.library.pages.Authorization;
import com.cydeo.library.pages.Library;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Login {
    public static void login(String login, String password) {
        Authorization authorization = new Authorization();
        Actions actions = new Actions( Driver.getDriver() );
        actions.click( authorization.email ).sendKeys( login ).perform();
        actions.click( authorization.passwordWin ).sendKeys( password ).perform();
        authorization.sign_In.click();
    }

    public static void enter(String name) {
        Authorization authorization = new Authorization();
        Actions actions = new Actions( Driver.getDriver() );
        switch (name.toLowerCase()) {
            case "librarian username":
                actions.click( authorization.email ).sendKeys( ConfigurationReader.getProperty( "usernameLibrarian" ) ).perform();
                break;
            case "student username":
                actions.click( authorization.email ).sendKeys( ConfigurationReader.getProperty( "usernameStudent" ) ).perform();
                break;
            case "librarian password":
                actions.click( authorization.passwordWin ).sendKeys( ConfigurationReader.getProperty( "passwordLibrarian" ) ).perform();
                authorization.sign_In.click();
                break;
            case "student password":
                actions.click( authorization.passwordWin ).sendKeys( ConfigurationReader.getProperty( "passwordStudent" ) ).perform();
                authorization.sign_In.click();
                break;
        }
    }

    public static void click_on(String name) {
        Library library = new Library();
        Actions actions = new Actions( Driver.getDriver() );
        switch (name.toLowerCase()) {
            case "users":
                library.users_sign.click();
        }
    }

    public static void verification_table(List<String> names) {
        Library library = new Library();
        for (WebElement each : library.topsTable) {
            for (String name : names) {
                if (each.getText().equalsIgnoreCase( name )) {
                    System.out.println( "verified = " + each.getText() );
                }
            }
        }
    }
}
