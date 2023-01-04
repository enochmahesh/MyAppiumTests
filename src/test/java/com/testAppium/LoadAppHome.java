package com.testAppium;
import pageObjects.LaunchScreen;
import java.net.MalformedURLException;

public class LoadAppHome {
    TestSetUp setUp = new TestSetUp();
    LaunchScreen launch = new LaunchScreen();

    public void LoadApp() throws InterruptedException, MalformedURLException {

                launch.setLanguage().click();
                launch.btnContinue().click();
                //launch.denySignUp().click();
                launch.iconClose().click();
    }
}

