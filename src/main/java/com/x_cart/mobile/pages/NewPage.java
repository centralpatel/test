package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewPage extends Utility {
    By verifyNew = By.xpath("//h1[@id='page-title']");

    public String getVerifyNew(){
        return getTextFromElement(verifyNew);
    }
}
