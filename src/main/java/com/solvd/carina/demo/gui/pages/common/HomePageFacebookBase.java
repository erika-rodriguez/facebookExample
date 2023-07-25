package com.solvd.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageFacebookBase extends AbstractPage {
    public HomePageFacebookBase(WebDriver driver) {
        super(driver);
    }

    public abstract NewRegisterPageBase clickOnRegister();
    public abstract void typeCredentials();
    public abstract CredentialsPageBase clickOnLoginBtn();
}
