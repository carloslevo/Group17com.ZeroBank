package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{




         public LoginPage(){
            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(id="signin_button")
        public WebElement signinButton;

        @FindBy(id="user_login")
        public WebElement username;

        @FindBy(id="user_password")
        public WebElement password;

        @FindBy(xpath = "//*[@id=\"login_form\"]/div[2]/input")
        public WebElement submit;

        @FindBy(id="details-button")
        public WebElement advanced;

        @FindBy(id="proceed-link")
        public WebElement proceed;

        @FindBy(xpath="//*[@id=\"login_form\"]/div[1]")
        public WebElement alert;


        public void login(String user, String pass){
            signinButton.click();
            username.sendKeys(user);
            password.sendKeys(pass);
            submit.click();
            /*for security page uncrack
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

        }
        public void passSecurity(){
            advanced.click();
            proceed.click();
        }

            public String message(){

            return alert.getText();
    }



}
