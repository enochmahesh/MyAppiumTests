package com.testAppium;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomeScreen;

import java.net.MalformedURLException;

public class OpenCategories {
    TestSetUp setUp = new TestSetUp();
    LoadAppHome load=new LoadAppHome();
    HomeScreen home=new HomeScreen();

    @BeforeTest
    public void appOpen() throws InterruptedException, MalformedURLException {
        load.LoadApp();
    }
    @Test
    public void loadCategories() throws InterruptedException, MalformedURLException {
         home.btnCat().click();
    }
}
