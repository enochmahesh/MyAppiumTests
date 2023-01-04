package com.testAppium;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomeScreen;

import java.net.MalformedURLException;


public class OpenApp {
    TestSetUp setUp = new TestSetUp();
    LoadAppHome load = new LoadAppHome();

    @BeforeTest
    public void appOpen() throws InterruptedException, MalformedURLException {
        load.LoadApp();
    }

    @Test
    public void verifyApp() throws MalformedURLException, InterruptedException {

    }

    @AfterTest
    public void close() throws MalformedURLException {

    }
}
