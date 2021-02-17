package com.zerobank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(id = "aa_accountId")
    public List<WebElement> dropDownMenu;

    @FindBy(css = "aa_account")
    public WebElement savingsLinkButton;

    @FindBy(linkText = "Brokerage")
    public WebElement brokerage;

    @FindBy(linkText = "Find Transactions")
    public WebElement findTransButton;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]")
    public List<WebElement> dates;

    @FindBy(id="aa_fromDate")
    public WebElement fromDate;

    @FindBy(id="aa_toDate")
    public WebElement toDate;

    @FindBy(xpath="//*[@type='submit']")
    public WebElement submit;

    public void menutabs(String str) {
        System.out.println("menuOptions = " + menuOptions);
        List<WebElement> mainpages = menuOptions;
        for (WebElement elem : mainpages) {
            if (elem.getText().equals(str)) {
                elem.click();
                break;
            }
        }
    }


    public boolean comp_Dates(String date, String fromDate, String toDate) throws ParseException {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

            Date Fdate = fmt.parse(fromDate);
            Date Tdate = fmt.parse(toDate);
            Date ActualDate = fmt.parse(date);
            if (ActualDate.compareTo(Fdate)>=0 && ActualDate.compareTo(Tdate)<=0 ){
                return true;
            }
        } catch (Exception FAIL) {
            System.out.println(FAIL);
        }
        return false;
    }



}











