package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
     By shippingLink = By.xpath("//div[@id='header-area']//span[contains(text(),'Shipping')]");
     By newLink = By.xpath("//div[@id='header-area']//span[contains(text(),'New!')]");
     By comingSoonLink = By.xpath("//div[@id='header-area']//span[contains(text(),'Coming soon')]");
     By contactUsLink = By.xpath("//div[@id='header-area']//span[contains(text(),'Contact us')]");
     By mouseHoverOnhotDealLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");
     By mouseHoverOnSale =By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]");
     By clickSaleLink = By.xpath("//div[@id='header-area']//span[contains(text(),'Sale')]");
     By mouseHoverOnBestSellers = By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]");
     By clickBestSellers = By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]");


     public void clickOnShippingLink(){
         clickOnElement(shippingLink);
     }
    public void clickOnNewLink(){
        clickOnElement(newLink);
    }
    public void clickOnComingSoonLink(){
        clickOnElement(comingSoonLink);
    }
    public void clickOnContactUsLink(){
        clickOnElement(contactUsLink);
    }
    public void mouseHoverOnHotDealLinkOnHomePage (){
         mouseHoverToElement(mouseHoverOnhotDealLink);
    }
    public void mouseHoverOnSaleLinkOnHomePage(){
         mouseHoverToElement(mouseHoverOnSale);
    }
    public void clickOnSaleLinkOnHomePage(){
         clickOnElement(clickSaleLink);
    }
    public void mouseHoverOnBestSellerLinkOnHomePageLink(){
         mouseHoverToElement(mouseHoverOnBestSellers);
    }
    public void clickOnBestSellerLinkOnHomePage(){
         clickOnElement(clickBestSellers);
    }

}
