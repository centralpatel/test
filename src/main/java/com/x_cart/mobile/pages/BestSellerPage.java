package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSellerPage extends Utility {
    By verifyBestSeller = By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSort = By.xpath("//span[@class='sort-by-label']");
    By nameZtoA = By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='desc']");
    By highToLow = By.xpath("//a[normalize-space()='Price Low - High']");
    By rates = By.xpath("//a[normalize-space()='Rates']");
    By nameAtoZ = By.xpath(("//a[normalize-space()='Name A - Z']"));
    By addToCart = By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-42')]//span[contains(text(),'Add to cart')]");
    By verifyProductAdded = By.xpath("//li[@class='info']");
    By closeAlert = By.xpath("//a[@title='Close']");
    By yourCart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]");
    By viewCart = By.xpath("//a[@class='regular-button cart']");
    By hoverOnProduct = By.xpath("//img[@alt='Vinyl Idolz: Ghostbusters']");
    By products = By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-13')]");
    By verifyProductAdded1 = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeAlertCart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1] ");
    By yourCart1 = By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By viewCart1 = By.xpath("//span[contains(text(),'View cart')]");
    By verifyYourShoppingCart = By.xpath("//h1[@id='page-title']");
    By emptyYourCart = By.xpath("//a[contains(text(),'Empty your cart')]");
    By verifyDeleteFromCart = By.xpath(" //li[contains(text(),'Item(s) deleted from your cart')]\n");
    By verifyYourCartEmpty = By.xpath("(//h1[normalize-space()='Your cart is empty'])[1]");


    public String getVerifyTextBestSeller() {
        return getTextFromElement(verifyBestSeller);
    }

    public void mouseHoverOnSortByOnBestSellerPage() {
        mouseHoverToElement(mouseHoverOnSort);
    }

    public void clickOnNameZToA() {
        clickOnElement(nameZtoA);
    }

    public void clickOnHighToLow() {
        clickOnElement(highToLow);
    }

    public void clickOnRates() {
        clickOnElement(rates);
    }

    public void clickOnNameAtoZ() {
        clickOnElement(nameAtoZ);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String verifyProductAdded() {
        return getTextFromElement(verifyProductAdded);
    }

    public void clickCloseAlert() {
        clickOnElement(closeAlert);
    }

    public void clickOnYourCart() {
        clickOnElement(yourCart);
    }

    public void clickOnViewCart() {
        clickOnElement(viewCart);
    }

    public void setHoverOnProduct() {
        mouseHoverToElement(hoverOnProduct);
    }

    public void clickOnAddToCartAndSelectProduct() {
        clickOnElement(products);
    }

    public String getVerifyProductAddedInYourCart() {
        return getTextFromElement(verifyProductAdded1);
    }

    public void clickCloseAlertCart() {
        clickOnElement(closeAlertCart);
    }

    public void clickOnYourCart1() {
        clickOnElement(yourCart1);
    }

    public void clickOnViewCart1() {
        clickOnElement(viewCart1);
    }

    public String getVerifyYourShoppingCart() {
        return getTextFromElement(verifyYourShoppingCart);
    }

    public void clickOnEmptyYourCart() {
        clickOnElement(emptyYourCart);
    }

    public String getVerifyDeletedFromYourCart() {
        return getTextFromElement(verifyDeleteFromCart);
    }

    public String getVerifyYourCartIsEmpty() {
        return getTextFromElement(verifyYourCartEmpty);
    }
}
