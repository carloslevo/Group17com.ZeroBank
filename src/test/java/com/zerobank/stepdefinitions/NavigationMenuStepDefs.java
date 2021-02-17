package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NavigationMenuStepDefs {

    @Given("the {string} page selected")
    public void the_page_selected(String str) {
        BrowserUtils.waitFor(2);

        List<WebElement> mainpages = new AccountActivityPage().menuOptions;

        for (WebElement elem : mainpages) {
            if (elem.getText().equals(str)) {
                elem.click();
                break;
            }

        }


        }






    }

