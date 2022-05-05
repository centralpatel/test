package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    ShippingPage shippingPage = new ShippingPage();
    NewPage newPage = new NewPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingLink();
        Assert.assertEquals("Shipping", shippingPage.getVerifyTextShipping());
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewLink();
        Assert.assertEquals("New arrivals", newPage.getVerifyNew());
    }
    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully(){
        homePage.clickOnComingSoonLink();
        Assert.assertEquals("Coming soon", comingSoonPage.getVerifyTextComingSoon());
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUsLink();
        Assert.assertEquals("Contact us", contactUsPage.getVerifyContactUs());
    }
}
