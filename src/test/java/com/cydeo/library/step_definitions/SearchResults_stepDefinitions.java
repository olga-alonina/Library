package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.Authorization;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static com.cydeo.library.utilities.utility_driver.BrowserUtils.waitFor;
import static com.cydeo.library.utilities.utility_driver.useful_method.Login.*;

public class SearchResults_stepDefinitions {
    Authorization authorization = new Authorization();
    @When("user click on {string} link")
    public void user_click_on_link(String name) {
        click_on(name);
        waitFor(2);
    }


    @Then("table should have following column names")
    public void table_should_have_following_column_names(List<String> names) {
        verification_table(names);
    }
}
