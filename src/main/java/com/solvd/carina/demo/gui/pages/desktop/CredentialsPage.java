package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.pages.common.CredentialsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CredentialsPageBase.class)
public class CredentialsPage extends CredentialsPageBase {
    @FindBy(xpath ="//div[@class='_9ay7']")
    private ExtendedWebElement invalidCredentialText;
    public CredentialsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean areCredentialsInvalid() {
        return invalidCredentialText.isElementPresent();
    }


}
