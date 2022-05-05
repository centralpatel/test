package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SecureCheckOutPage extends Utility {
    By verifySecureCheckOut = By.xpath("//h1[@class='title']");
    By firstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By lastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By address = By.xpath("//input[@id='shippingaddress-street']");
    By city = By.xpath("//input[@id='shippingaddress-city']");
    By countryCode = By.xpath("//select[@id='shippingaddress-country-code']");
    By state = By.xpath("//input[@id='shippingaddress-custom-state']");
    By zipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By email = By.xpath("//input[@id='email']");
    By localShipping = By.xpath("//input[@id='method128']");
    By paymentMethod = By.xpath("//input[@id='pmethod6']");
    By verify311total = By.xpath("//div[@class='total clearfix']//span[@class='part-prefix'][normalize-space()='$']");
    By placeOrder = By.xpath("//span[normalize-space()='Place order: $311.03']");
    By verifyThankYouForYourOrder = By.xpath("//h1[@id='page-title']");

    public String getVerifySecureCheckOut() {
        return getTextFromElement(verifySecureCheckOut);
    }

    public void enterFirstName() {
        sendTextToElement(firstName, "Rasi");
    }

    public void enterLastNameOn() {
        sendTextToElement(lastName, "Patel");
    }

    public void enterAddress() {
        sendTextToElement(address, "4 Elms Park Avenue");
    }

    public void enterCity() {
        sendTextToElement(city, "Wembley");
    }

    public void enterCountryCode() {
        sendTextToElement(countryCode, "United Kingdom");
    }

    public void enterState() {
        sendTextToElement(state, "Middlesex");
    }

    public void enterZipCode() {
        sendTextToElement(zipCode, "HA0 2RS");
    }

    public void enterEmail() {
        sendTextToElement(email, "");
    }

    public void clickOnLocalShipping() {
        clickOnElement(localShipping);
    }

    public void clickOnPaymentMethod() {
        clickOnElement(paymentMethod);
    }

    public String verify311TotalText() {
        return getTextFromElement(verify311total);
    }

    public void clickOnPlaceOrder() {
        clickOnElement(placeOrder);
    }

    public String getVerifyThankYouForYourOrder() {
        return getTextFromElement(verifyThankYouForYourOrder);
    }
}
