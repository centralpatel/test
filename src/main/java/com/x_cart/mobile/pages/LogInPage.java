package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class LogInPage extends Utility {
    By verifyLogInYourAccount = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By enterEmailAddress = By.xpath("//input[@id='email']");
    By clickOnContinue = By.xpath("//span[contains(text(),'Continue')]");

    public String getVerifyLogInYourAccountOnLogInPage(){
        return getTextFromElement(verifyLogInYourAccount);
    }
    public void enterEmailAddressInLoginPage(){
        sendTextToElement(enterEmailAddress, "rasi123455@gmail.com");
    }
    public void clickOnTheContinueButton(){
        clickOnElement(clickOnContinue);
    }
}
