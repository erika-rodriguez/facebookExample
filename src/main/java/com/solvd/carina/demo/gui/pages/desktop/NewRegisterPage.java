package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.pages.common.NewRegisterPageBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = NewRegisterPageBase.class)
public class NewRegisterPage extends NewRegisterPageBase {
    @FindBy(xpath = "//input[@name='firstname']")
    private ExtendedWebElement firstnameInput;
    @FindBy(xpath = "//input[@name='lastname']")
    private ExtendedWebElement lastnameInput;
    @FindBy(xpath = "//input[@name='reg_email__']")
    private ExtendedWebElement emailInput;
    @FindBy(xpath = "//input[@id='password_step_input']")
    private ExtendedWebElement passwordInput;
    @FindBy(xpath = "//select[@id='day']/descendant::option[@value='8']")
    private ExtendedWebElement selectDay;
    @FindBy(xpath = "//select[@id='month']/descendant::option[@value='10']")
    private ExtendedWebElement selectMonth;
    @FindBy(xpath = "//select[@id='year']/descendant::option[@value='1992']")
    private ExtendedWebElement selectYear;
    @FindBy(xpath = "//input[@name='sex'][@value='1']")
    private ExtendedWebElement selectGender;
    @FindBy(xpath = "//button[@name='websubmit']")
    private ExtendedWebElement registerBtn;
    @FindBy(xpath = "//input[@name='firstname']")
    private ExtendedWebElement invalidMessage;

    public NewRegisterPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeInformation() {
        firstnameInput.type(R.TESTDATA.get("firstname"));
        lastnameInput.type(R.TESTDATA.get("lastname"));
        emailInput.type(R.TESTDATA.get("email"));
        passwordInput.type(R.TESTDATA.get("password"));
    }

    @Override
    public void selectDOB() {
        selectDay.click();
        selectMonth.click();
        selectYear.click();
    }

    @Override
    public void selectGender() {
        selectGender.click();
    }

    @Override
    public void submitNewRegister() {
        registerBtn.click();
    }

    @Override
    public void isInvalidRegister() {

    }


}
