package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellerPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SalePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {
    HomePage homePage = new HomePage();
    SalePage salePage = new SalePage();
    BestSellerPage bestSellerPage = new BestSellerPage();

    @Test
    public void verifySaleProductsArrangeAlphabetically(){
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mouseHoverOnSaleLinkOnHomePage();
        homePage.clickOnSaleLinkOnHomePage();
        Assert.assertEquals("Sale", salePage.getVerifyTextSale());
        salePage.mouseHoverOnSortByOnSalePage();
        salePage.clickOnNameAToZ();
    }
    @Test
    public void verifySaleProductsPriceArrangeLowToHigh(){
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mouseHoverOnSaleLinkOnHomePage();
        homePage.clickOnSaleLinkOnHomePage();
        Assert.assertEquals("Sale", salePage.getVerifyTextSale());
        salePage.mouseHoverOnSortByOnSalePage();
        salePage.clickOnPriceLowToHigh();
    }
    @Test
    public void verifySaleProductsArrangeByRates() {
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mouseHoverOnSaleLinkOnHomePage();
        homePage.clickOnSaleLinkOnHomePage();
        Assert.assertEquals("Sale", salePage.getVerifyTextSale());
        salePage.mouseHoverOnSortByOnSalePage();
        salePage.clickOnRates();
    }
    @Test
    public void verifyBestSellersProductsArrangeByZToA(){
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mouseHoverOnBestSellerLinkOnHomePageLink();
        homePage.clickOnBestSellerLinkOnHomePage();
        Assert.assertEquals("Bestsellers", bestSellerPage.getVerifyTextBestSeller());
        bestSellerPage.mouseHoverOnSortByOnBestSellerPage();
        bestSellerPage.clickOnNameZToA();
    }
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mouseHoverOnBestSellerLinkOnHomePageLink();
        homePage.clickOnBestSellerLinkOnHomePage();
        Assert.assertEquals("Bestsellers", bestSellerPage.getVerifyTextBestSeller());
        bestSellerPage.mouseHoverOnSortByOnBestSellerPage();
        bestSellerPage.clickOnHighToLow();
    }
    @Test
    public void  verifyBestSellersProductsArrangeByRates() {
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mouseHoverOnBestSellerLinkOnHomePageLink();
        homePage.clickOnBestSellerLinkOnHomePage();
        Assert.assertEquals("Bestsellers", bestSellerPage.getVerifyTextBestSeller());
        bestSellerPage.mouseHoverOnSortByOnBestSellerPage();
        bestSellerPage.clickOnRates();
    }
}
