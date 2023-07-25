package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.pages.common.CredentialsPageBase;
import com.solvd.carina.demo.gui.pages.common.HomePageFacebookBase;
import com.solvd.carina.demo.gui.pages.common.NewRegisterPageBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageFacebookBase.class)
public class HomePageFacebook extends HomePageFacebookBase {

    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    private ExtendedWebElement registerBtn;

    @FindBy(xpath = "//input[@data-testid='royal_email']")
    private ExtendedWebElement emailInput;
    @FindBy(xpath = "//input[@data-testid='royal_pass']")
    private ExtendedWebElement passwordlInput;
    @FindBy(xpath = "//button[@data-testid='royal_login_button']")
    private ExtendedWebElement loginBtn;

    public HomePageFacebook(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewRegisterPageBase clickOnRegister() {
        registerBtn.click();
        return initPage(driver, NewRegisterPageBase.class);
    }

    @Override
    public void typeCredentials() {
        emailInput.type(R.TESTDATA.get("email"));
        passwordlInput.type(R.TESTDATA.get("password"));
    }

    @Override
    public CredentialsPageBase clickOnLoginBtn() {
        loginBtn.click();
        return initPage(driver, CredentialsPageBase.class);
    }


}
