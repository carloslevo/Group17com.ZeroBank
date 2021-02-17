package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {




    @FindBy(id = "account_activity_tab")
    public WebElement accountActivityTab;

    @FindBy(id="account_summary_tab")
    public WebElement accountsummaryTab;

    @FindBy(id = "transfer_funds_tab")
    public WebElement transferFundsTab;

    @FindBy(id = "pay_bills_tab")
    public WebElement payBillsTab;

    @FindBy(id = "money_map_tab")
    public WebElement moneyMapTab;

    @FindBy(id = "online_statements_tab")
    public WebElement onlinestatementsTab;



    /*public void setMenuOptions{
        for(int i=0; i<5;i++) {
            switch (menuOptions.(i)) {
                case "Account Summary":
                    accountsummaryTab.click();
                    break;
                case "Account Activity":
                    accountActivityTab.click();
                    break;
                case "Transfer Funds":
                    transferFundsTab.click();
                    break;
                case "Pay Bills":
                    payBillsTab.click();
                    break;
                case "My Money Map":
                    moneyMapTab.click();
                    break;
                default:
                    System.out.println();


            }
        }*/


    }









