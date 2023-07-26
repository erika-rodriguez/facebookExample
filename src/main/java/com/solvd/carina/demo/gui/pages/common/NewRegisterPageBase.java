package com.solvd.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NewRegisterPageBase extends AbstractPage {

    public NewRegisterPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeInformation();

    public abstract void selectDOB();
    public abstract void selectGender();
    public abstract void submitNewRegister();
    public abstract boolean isInvalidRegister();
}
