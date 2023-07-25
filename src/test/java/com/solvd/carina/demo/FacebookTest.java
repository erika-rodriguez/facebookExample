package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.pages.common.HomePageFacebookBase;
import com.solvd.carina.demo.gui.pages.common.CredentialsPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class FacebookTest implements IAbstractTest {
    static Logger logger=Logger.getLogger(FacebookTest.class.getName());
    @Test
    public void invalidLoginTest(){
        HomePageFacebookBase homePage = initPage(getDriver(), HomePageFacebookBase.class);
        homePage.open();
        homePage.typeCredentials();
        CredentialsPageBase credentials= homePage.clickOnLoginBtn();
        if (credentials.areCredentialsInvalid()){
            logger.info("Credentials are invalid");
        }else {
            logger.info("Credentials are correct");
        }
        Assert.assertTrue(credentials.areCredentialsInvalid());
    }
}
