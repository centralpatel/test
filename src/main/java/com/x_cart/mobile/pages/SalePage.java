package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {
    By verifySale =By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortBy = By.xpath("//span[@class='sort-by-label']");
    By nameAtoZ = By.xpath("//a[normalize-space()='Name A - Z']");
    //1.5 verify that product arrange alphabetically
    By priceLowToHigh = By.xpath("//a[normalize-space()='Price Low - High']");
    //2.5 Verify that the product’s price arrange Low to High
    By rates = By.xpath("//a[normalize-space()='Rates']");
    //3.5 Verify that the product’s arrange Rates


    public String getVerifyTextSale(){
        return getTextFromElement(verifySale);
    }
    public void mouseHoverOnSortByOnSalePage(){
        mouseHoverToElement(mouseHoverOnSortBy);
    }
    public void clickOnNameAToZ(){
        clickOnElement(nameAtoZ);
    }
    //***********************************************
    // 1.5 verify that product arrange alphabetically
    public void productArrangeAlphabetically(){

    }
    //***********************************************
    public  void clickOnPriceLowToHigh(){
        clickOnElement(priceLowToHigh);
    }
    //**********************************************
    //2.5 Verify that the product’s price arrange Low to High
    public void productsPriceArrangeLowToHigh(){

    }
    //**************************************************
    public  void clickOnRates(){
        clickOnElement(rates);
    }
    //********************************************
    //3.5 Verify that the product’s arrange Rates
    public void productsArrangeRates(){

    }
    //*********************************************
}
