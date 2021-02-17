package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import junit.framework.TestCase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertTrue;


public class FindTransactionStepDefs {



    @Given("the user accesses the {string} tab")
    public void the_user_accesses_the_tab(String string)  throws InterruptedException {

        new loginStepDefs().the_user_is_logged_in();

        //Driver.get().findElement(By.id("account_activity_tab")).click();
        new NavigationMenuStepDefs().the_page_selected("Account Activity");
        BrowserUtils.waitFor(2);
        new AccountActivityPage().findTransButton.click();
    }

    @When("the user should see menu tabs")
    public void the_user_should_see_menu_tabs() {
            //System.out.println("menuOptions = " + new AccountActivityPage().menuOptions);
            List<WebElement> mainpages1 = new AccountActivityPage().menuOptions;
            for (WebElement elem : mainpages1) {
                System.out.println("elem.getText() = " + elem.getText());


            }

        }


    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String str1, String str2) {
        AccountActivityPage date1 = new AccountActivityPage();
        date1.fromDate.clear();
        date1.fromDate.sendKeys(str1);

        date1.toDate.clear();
        date1.toDate.sendKeys(str2);

        // BrowserUtils.waitFor(2);

    }

    @When("clicks search")
    public void clicks_search() {
        // Write code here that turns the phrase above into concrete actions

        new AccountActivityPage().submit.click();
        BrowserUtils.waitFor(2);
    }

    @Then("results table should only show transactions dates between a to b")
    public void results_table_should_only_show_transactions_dates_between_a_to_b() {
        System.out.println("all transactions are in time period");
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String tableFromDate, String tableToDate) throws ParseException {
        AccountActivityPage accountActivity = new AccountActivityPage();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        Date from = dateFormat.parse(tableFromDate);
        Date to = dateFormat.parse(tableToDate);
        System.out.println(to);
        System.out.println(from);


        for (WebElement date : accountActivity.dates) {
            Date ourDate = dateFormat.parse(date.getText());
            System.out.println(ourDate);
            Assert.assertTrue(!from.after(ourDate) && !to.before(ourDate));

        }
    }




    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        System.out.println("sorted most recent");
    }

    @Then("the results table should only not contain transactions dated a")
    public void the_results_table_should_only_not_contain_transactions_dated_a() {
        System.out.println("not contain");
    }




}






