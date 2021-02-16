package com.zerobank.stepdefinitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

  @Before
    public void setup() throws InterruptedException {
        System.out.println("\tcoming from Before method in cucumber");
        String url = ConfigurationReader.get("url");
       Driver.get().get(url);

        Driver.get().manage().window().maximize();
       Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

   @After
    public void tearDown() throws InterruptedException {
        System.out.println("\tcoming from after method in cucumber");
        //Driver.closeDriver();

    }


}
