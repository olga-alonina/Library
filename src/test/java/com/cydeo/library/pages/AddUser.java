package com.cydeo.library.pages;

import com.cydeo.library.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddUser {
    public AddUser() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "#users [href='tpl/add-user.html']")
    public WebElement addUser;
    @FindBy(css = "[name=full_name]")
    public WebElement full_name;
    @FindBy(css = "[name=password]")
    public WebElement password;
    @FindBy(id = "address")
    public WebElement address;
    @FindBy(css = "[name=email]")
    public WebElement email;
    @FindBy(css ="div.modal-footer > button.btn.btn-primary")
    public WebElement save_changes;

    @FindBy(id = "user_group_id")
    public WebElement user_group;
    @FindBy(css = "[name=start_date]")
    public WebElement start_date;
    @FindBy(id = "status")
    public WebElement status;
    @FindBy(css = "#add_user_form .form-control")
    public List<WebElement> allFormsAddUsers;

}
