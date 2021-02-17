package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class PurchaseForeignCurrencyStepDefs {


    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() throws InterruptedException {
        new loginStepDefs().the_user_is_logged_in();
        new NavigationMenuStepDefs().the_page_selected("Pay Bills");

        new PayBillsPage().purchaseForeign.click();




    }
    @Then("following currencies should be	available")
    public void following_currencies_should_be_available(List<String> menuOptions) {
        BrowserUtils.waitFor(2);
       new PayBillsPage().selectone.click();
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(new PayBillsPage().currencies);

        assertEquals(menuOptions,actualOptions);
        System.out.println("menuOptions = " + menuOptions);
       System.out.println("actualOptions = " + actualOptions);

    }

    @When("user tries	to	calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        PayBillsPage calc = new PayBillsPage();
        calc.calculate.click();

    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

        BrowserUtils.waitFor(3);

       // String popupText = new PayBillsPage().alert.getText();
        String popupText = Driver.get().switchTo().alert().getText();
        System.out.println(popupText);
        Assert.assertEquals(popupText, "Please, ensure that you have filled all the required fields with valid values.");
        //Driver.get().switchTo().alert().accept();
        //new PayBillsPage().alert.ac
        Driver.get().switchTo().alert().accept();

    }

    @When("user tries	to	calculate cost without entering	a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        new PayBillsPage().selectoneCurrency.click();
        PayBillsPage calc = new PayBillsPage();
        calc.calculate.click();

    }


}
