package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.pages.common.HomePageFacebookBase;
import com.solvd.carina.demo.gui.pages.common.NewRegisterPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = NewRegisterPageBase.class)
public class NewRegisterPage extends NewRegisterPageBase {
    public NewRegisterPage(WebDriver driver) {
        super(driver);
    }
}
