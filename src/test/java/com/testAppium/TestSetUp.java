package com.testAppium;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestSetUp {

    public AndroidDriver driver;

    public void settingUp() throws InterruptedException, MalformedURLException {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "src/main/resources/apps");
        File app = new File(appDir, "Flipkart.apk");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "ANDROID");
        caps.setCapability("deviceName", "Enoch");
        caps.setCapability("platformVersion", "13");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("fullReset","true");
        caps.setCapability("app", app.getAbsolutePath());
        caps.setCapability("appPackage", "com.flipkart.android");
        caps.setCapability("appActivity", "com.flipkart.android.SplashActivity");


        URL url;

        url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void tearingDown(){

        //driver.close();
        driver.quit();
    }
}

