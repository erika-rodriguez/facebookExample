package com.solvd.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CredentialsPageBase extends AbstractPage{
    public CredentialsPageBase (WebDriver driver){
        super(driver);
    }

    public abstract boolean areCredentialsInvalid();

}
