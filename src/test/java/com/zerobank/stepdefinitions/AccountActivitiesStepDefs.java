package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.List;

public class AccountActivitiesStepDefs {



    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() throws InterruptedException{

       //new AccountActivityPage().savingsLinkButton.click();
        Driver.get().findElement(By.linkText("Savings")).click();


    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String pageName1) throws InterruptedException{
        String expectedTitle = "Zero - "+pageName1;
        String actualTitle = Driver.get().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals("expected title is ",expectedTitle, actualTitle);


    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string)throws InterruptedException {

        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert

        String actual = Driver.get().findElement(By.xpath("//*[@value=\"1\"]")).getText();


        Assert.assertEquals(string,actual);
        System.out.println("menuOptions = " + string);
        System.out.println("actualOptions = " + actual);

    }

    @When("the user clicks on	Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        //System.out.println("brokerage");
        //Driver.get().findElement(By.linkText("Brokerage")).click();
        //BrowserUtils.waitFor(5);
        //new AccountActivityPage().brokerage.click();
        Driver.get().findElement(By.linkText("Brokerage")).click();

    }
    @Then("Account drop down should have been {string} selected")
    public void account_drop_down_should_have_been_selected(String string)throws InterruptedException {

        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        String actual="";
        switch (string) {
            case "Savings":
                actual = Driver.get().findElement(By.xpath("//*[@value=\"1\"]")).getText();
                break;
            case "Checking":
                actual = Driver.get().findElement(By.xpath("//*[@value=\"2\"]")).getText();
                break;
            case"Loan":
                actual = Driver.get().findElement(By.xpath("//*[@value=\"4\"]")).getText();
                break;
            case "Credit Card":
                actual = Driver.get().findElement(By.xpath("//*[@value=\"5\"]")).getText();
                break;
            case "Brokerage":
                actual = Driver.get().findElement(By.xpath("//*[@value=\"6\"]")).getText();
                break;
            default:
                actual="";
        }
        Assert.assertEquals(string,actual);
        System.out.println("menuOptions = " + string);
        System.out.println("actualOptions = " + actual);

    }
    @When("the user clicks on	Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        //System.out.println("Checking");
        Driver.get().findElement(By.linkText("Checking")).click();

    }
    @When("the user clicks on	Credit Card link on the Account Summary page")
    public void the_user_clicks_on_Credit_Card_link_on_the_Account_Summary_page() {
        Driver.get().findElement(By.linkText("Credit Card")).click();
    }
    @When("the user clicks on	Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        Driver.get().findElement(By.linkText("Loan")).click();
    }

}
