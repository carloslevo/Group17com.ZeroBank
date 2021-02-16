package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccSumPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccSumStepDefs {

    @Given("the user should be able to see {string} page")
    public void the_user_should_be_able_to_see_page(String string) {


    }

    @When("the user should search {string}")
    public void the_user_should_search(String string) {
        new AccSumPage().search.sendKeys("personal credits", Keys.ENTER);

    }

    @Then("the user should get {string} message")
    public void the_user_should_get_message(String string) {


        List<WebElement> textInsideBox = new AccSumPage().message;
        for(WebElement elem:textInsideBox){
            String actualMessage = elem.getText();
            if(actualMessage.contains("No results were found for the query:")){
                System.out.println("actualMessage = " + actualMessage+ " TEST PASSED ");
                break;
            }
        }

    }

    @Then("the user should click HOME button and go directly to home page without logout")
    public void the_user_should_click_HOME_button_and_go_directly_to_home_page_without_logout() {
        new AccSumPage().homeBtn.click();
        Assert.assertEquals("Zero - Personal Banking - Loans - Credit Cards",
                Driver.get().getTitle());
    }


}
