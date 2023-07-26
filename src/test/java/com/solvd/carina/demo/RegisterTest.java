package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.pages.common.HomePageFacebookBase;
import com.solvd.carina.demo.gui.pages.common.NewRegisterPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest implements IAbstractTest {
    @Test
    public void newRegisterTest(){
        HomePageFacebookBase homepage=initPage(getDriver(),HomePageFacebookBase.class );
        homepage.open();
        NewRegisterPageBase register =homepage.clickOnRegister();
        register.typeInformation();
        register.selectDOB();
        register.selectGender();
        register.submitNewRegister();

        Assert.assertTrue(register.isInvalidRegister());
    }
}
