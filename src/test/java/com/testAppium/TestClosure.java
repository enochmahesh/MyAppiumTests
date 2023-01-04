package com.testAppium;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestClosure {
    TestSetUp setUp = new TestSetUp();

    public void tearingDown() throws MalformedURLException {

        setUp.driver.close();
        setUp.driver.quit();

    }
}

