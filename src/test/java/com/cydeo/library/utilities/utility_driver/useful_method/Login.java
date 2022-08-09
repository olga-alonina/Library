package com.cydeo.library.utilities.utility_driver.useful_method;


import com.cydeo.library.pages.AddBook;
import com.cydeo.library.pages.AddUser;
import com.cydeo.library.pages.Authorization;
import com.cydeo.library.pages.Library;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.utility_driver.Driver;
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
    public static void login(String name) {
        Authorization authorization = new Authorization();
        Actions actions = new Actions( Driver.getDriver() );
        actions.click( authorization.email ).sendKeys( ConfigurationReader.getProperty("username"+name)).perform();
        actions.click( authorization.passwordWin ).sendKeys(ConfigurationReader.getProperty("password"+name)).perform();
    }

        public static void enter(String name) {
            Authorization authorization = new Authorization();
            Actions actions = new Actions( Driver.getDriver() );
            switch (name.toLowerCase()) {
                case "librarian username":
                    actions.click( authorization.email ).sendKeys( ConfigurationReader.getProperty( "usernameLibrarian" ) ).perform();
                    break;
                case "librarian password":
                    actions.click( authorization.passwordWin ).sendKeys( ConfigurationReader.getProperty( "passwordLibrarian" ) ).perform();
                   authorization.sign_In.click();
                    break;
                case "student username":
                    actions.click( authorization.email ).sendKeys( ConfigurationReader.getProperty( "usernameStudent" ) ).perform();
                    break;
                case "student password":
                    actions.click( authorization.passwordWin ).sendKeys( ConfigurationReader.getProperty( "passwordStudent" ) ).perform();
                    break;
                case "user":
                    actions.click( authorization.email ).sendKeys( ConfigurationReader.getProperty( "usernameInvalid" ) ).perform();
                    actions.click( authorization.passwordWin ).sendKeys( ConfigurationReader.getProperty( "passwordInvalid" ) ).perform();
                    break;
            }
        }

        public static void click_on(String name) {
            Authorization authorization = new Authorization();
            Library library = new Library();
            AddUser addUser = new AddUser();
            AddBook addBook = new AddBook();
            Actions actions = new Actions( Driver.getDriver() );
            switch (name.toLowerCase()) {
                case "sign in":
                    authorization.sign_In.click();
                    break;
                case "users":
                    library.users_button.click();
                    break;
                case "add user":
                    addUser.addUser.click();
                    break;
                case"save changes":
                    addUser.save_changes.click();
                    break;
                case "add book":
                 addBook.addBook.click();
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
