package com.cydeo.library.step_definitions;


import com.cydeo.library.utilities.utility_driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setup() {
        System.out.println( "before scenario running" );
    }

    @After

    public void tearDown(Scenario scenario) {
        System.out.println( "After scenario running" );
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs( OutputType.BYTES );
            scenario.attach( screenshot, "image/png", scenario.getName() );
        }
        Driver.closeDriver();
    }
}

