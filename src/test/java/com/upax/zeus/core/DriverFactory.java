package com.upax.zeus.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class DriverFactory {

    private static ThreadLocal<AppiumDriver> appiumDriver = new ThreadLocal<>();
    @SneakyThrows
    public static AppiumDriver getDriver() {
        if (appiumDriver.get() == null) {
            appiumDriver.set(createDriver());
        }
        return appiumDriver.get();
    }

    private static AppiumDriver createDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Config.getPlatformName());
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, Config.getPlatformVersion());
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, Config.getAutomationName());
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, Config.getDeviceName());
        caps.setCapability(MobileCapabilityType.APP, Config.getAppPath(Config.getApp()));
        caps.setCapability("noReset", false);
        return new AndroidDriver(new URL(Config.getAppiumServer()), caps);
    }

    public static void cleanupDriver() {
        appiumDriver.get().quit();
        appiumDriver.remove();
    }

}
