package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;

public class loginStepDefs {


    @Given("the user is logged in")
    public void the_user_is_logged_in() throws InterruptedException{
        //String url = ConfigurationReader.get("url");
        // Driver.get().get(url);

        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("valid_username"),ConfigurationReader.get("valid_password"));
        loginPage.passSecurity();
        Assert.assertEquals(Driver.get().getTitle(),"Zero - Account Summary");
        //Thread.sleep(3000);

    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException{
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        //Thread.sleep(2000);
        Driver.get().get(url);
       // Driver.get().manage().window().maximize();

    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() throws InterruptedException{
        //
        String username= ConfigurationReader.get("valid_username");
        String password= ConfigurationReader.get("valid_password");

        LoginPage loginpage = new LoginPage();
        loginpage.login(username,password);

        //for step up to security precaution
        loginpage.passSecurity();


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException{
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Summary",actualTitle);
    }



    @When("user enters invalid credentials")
    public void user_enters_invalid_credentials() throws InterruptedException{
        String username= ConfigurationReader.get("invalid_username");
        String password= ConfigurationReader.get("invalid_password");

        LoginPage loginpage = new LoginPage();
        loginpage.login(username,password);
        //Thread.sleep(3000);

    }
    @Then("user should get {string} message")
    public void user_should_get_message(String string) throws InterruptedException{
        String expectedMessage = "Login and/or password are wrong.";
        String actualMessage = new LoginPage().message();
        //String actualMessage = Driver.get().findElement(By.xpath("//*[@class='alert alert-error']")).getText();
       //String actualMessage = new LoginPage().alert.getText();
       // new LoginPage().

        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage );





    }



}
