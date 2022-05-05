package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellerPage bestSellerPage = new BestSellerPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    LogInPage logInPage = new LogInPage();
    SecureCheckOutPage secureCheckOutPage = new SecureCheckOutPage();

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {

        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mouseHoverOnBestSellerLinkOnHomePageLink();
        homePage.clickOnBestSellerLinkOnHomePage();
        Assert.assertEquals("Bestsellers", bestSellerPage.getVerifyTextBestSeller());
        bestSellerPage.clickOnNameZToA();
        Thread.sleep(2000);
        bestSellerPage.clickOnAddToCart();
        Assert.assertEquals("Product has been added to your cart", bestSellerPage.verifyProductAdded());
        bestSellerPage.clickCloseAlert();
        Thread.sleep(1000);
        bestSellerPage.clickOnYourCart();
        bestSellerPage.clickOnViewCart();
        Assert.assertEquals("Your shopping cart - 1 item", shoppingPage.verifyYourShoppingCart1());
        Assert.assertEquals("$299.00", shoppingPage.getVerifySubTotal());
        Assert.assertEquals("$310.74", shoppingPage.getVerifyTotal());
        shoppingPage.clickCheckOutButton();
        Assert.assertEquals("Log in to your account", logInPage.getVerifyLogInYourAccountOnLogInPage());
        logInPage.enterEmailAddressInLoginPage();
        logInPage.clickOnTheContinueButton();
        Assert.assertEquals("Secure Checkout", secureCheckOutPage.getVerifySecureCheckOut());
        secureCheckOutPage.enterFirstName();
        secureCheckOutPage.enterLastNameOn();
        secureCheckOutPage.enterAddress();
        secureCheckOutPage.enterCity();
        secureCheckOutPage.enterCountryCode();
        secureCheckOutPage.enterState();
        secureCheckOutPage.enterZipCode();
        secureCheckOutPage.enterEmail();
        secureCheckOutPage.clickOnLocalShipping();
        secureCheckOutPage.clickOnPaymentMethod();
        Assert.assertEquals(" $311.03.00", secureCheckOutPage.verify311TotalText());
        secureCheckOutPage.clickOnPlaceOrder();
        Assert.assertEquals("Thank you for your order", secureCheckOutPage.getVerifyThankYouForYourOrder());


    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mouseHoverOnBestSellerLinkOnHomePageLink();
        homePage.clickOnBestSellerLinkOnHomePage();
        Assert.assertEquals("Bestsellers", bestSellerPage.getVerifyTextBestSeller());
        bestSellerPage.mouseHoverOnSortByOnBestSellerPage();
        bestSellerPage.clickOnNameAtoZ();
        Thread.sleep(2000);
        bestSellerPage.setHoverOnProduct();
        Thread.sleep(2000);
        bestSellerPage.clickOnAddToCartAndSelectProduct();
        Assert.assertEquals("Product has been added to your cart", bestSellerPage.getVerifyProductAddedInYourCart());
        bestSellerPage.clickCloseAlertCart();
        bestSellerPage.clickOnYourCart1();
        bestSellerPage.clickOnViewCart1();
        Thread.sleep(2000);
        Assert.assertEquals("Your shopping cart - 1 items", bestSellerPage.getVerifyYourShoppingCart());
        bestSellerPage.clickOnEmptyYourCart();
        acceptAlert();
        Assert.assertEquals("Item(s) deleted from your cart", bestSellerPage.getVerifyDeletedFromYourCart());
        Assert.assertEquals("Your cart is empty", bestSellerPage.getVerifyYourCartIsEmpty());

    }
}
