package com.upax.zeus.core;

import com.google.common.collect.ImmutableMap;
import com.upax.zeus.constants.Direction;
import com.upax.zeus.constants.ElementLocation;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@Slf4j
public class BasePage {

    private final AppiumDriver driver;
    private final WebDriverWait wait;

    public BasePage() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, Config.getTimeout());
        this.wait.ignoreAll(Arrays.asList(NoSuchElementException.class, StaleElementReferenceException.class));
    }

    protected AppiumDriver getDriver() {
        return driver;
    }

    protected void waitForVisibility(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            log.warn("Timeout waiting for ".concat(element.toString()), e);
            Assert.fail(e.getMessage());
        }
    }

    protected WebElement waitForVisibility(By locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            log.warn("Timeout waiting for ".concat(locator.toString()), e);
            Assert.fail(e.getMessage());
            return null;
        }
    }

    protected void waitExpectedConditions(ExpectedCondition<?> condition) {
        try {
            wait.until(condition);
        } catch (TimeoutException e) {
            Assert.fail(e.getMessage());
        }
    }

    protected void waitForInvisibility(WebElement element) {
        waitExpectedConditions(ExpectedConditions.invisibilityOf(element));
    }

    protected void waitForNumberOfElements(By locator, int number) {
        waitExpectedConditions(ExpectedConditions.numberOfElementsToBe(locator, number));
    }

    protected Boolean waitCheckboxSelection(WebElement element) {
        try {
            return wait.until(ExpectedConditions.attributeToBe(element, "checked", "true"));
        } catch (TimeoutException e) {
            log.warn("Timeout waiting for ".concat(element.toString()), e);
            Assert.fail(e.getMessage());
            return false;
        }
    }

    protected void tap(WebElement element) {
        waitForVisibility(element);
        element.click();
    }

    protected void tap(By locator) {
        WebElement webElement = waitForVisibility(locator);
        tap(webElement);
    }


    public void tapCoordinates(int x, int y) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(x, y)).perform();
    }

    public void sendKeys(WebElement element, String text) {
        waitForVisibility(element);
        element.sendKeys(text);
        hideKeyboard();
    }

    public void clearAndSendKeys(WebElement element, String text) {
        waitForVisibility(element);
        element.clear();
        element.sendKeys(text);
        hideKeyboard();
    }

    protected void sendKeysUsingKeyboard(String text) {
        driver.getKeyboard().sendKeys(text);
    }

    protected void enterKeyAndroid(WebElement element) {
        tap(element);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    protected void searchKeyAndroid(WebElement element) {
        tap(element);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    protected void sendKeysUsingKeyboard(WebElement element, String text) {
        tap(element);
        driver.getKeyboard().sendKeys(text);
    }

    protected void hideKeyboard() {
        driver.hideKeyboard();
        driver.getKeyboard();
    }


    protected void scroll(Direction direction, long duration) {
        Dimension size = driver.manage().window().getSize();

        int startX = 0;
        int endX = 0;
        int startY = 0;
        int endY = 0;

        switch (direction) {
            case RIGHT:
                startY = (int) (size.height / 2);
                startX = (int) (size.width * 0.90);
                endX = (int) (size.width * 0.05);
                new TouchAction(driver)
                        .press(new PointOption<>().withCoordinates(startX, startY))
                        .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(duration)))
                        .moveTo(new PointOption<>().withCoordinates(endX, startY))
                        .release()
                        .perform();
                break;

            case LEFT:
                startY = (int) (size.height / 2);
                startX = (int) (size.width * 0.05);
                endX = (int) (size.width * 0.90);
                new TouchAction(driver)
                        .press(new PointOption<>().withCoordinates(startX, startY))
                        .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(duration)))
                        .moveTo(new PointOption().withCoordinates(endX, startY))
                        .release()
                        .perform();

                break;

            case UP:
                endY = (int) (size.height * 0.70);
                startY = (int) (size.height * 0.30);
                startX = (size.width / 2);
                new TouchAction(driver)
                        .press(new PointOption<>().withCoordinates(startX, startY))
                        .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(duration)))
                        .moveTo(new PointOption().withCoordinates(startX, endY))
                        .release()
                        .perform();
                break;


            case DOWN:
                startY = (int) (size.height * 0.70);
                endY = (int) (size.height * 0.30);
                startX = (size.width / 2);
                new TouchAction(driver)
                        .press(new PointOption<>().withCoordinates(startX, startY))
                        .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(duration)))
                        .moveTo(new PointOption().withCoordinates(startX, endY))
                        .release()
                        .perform();
                break;

        }
    }

    private ElementLocation getElementLocation(WebElement element) {
        Dimension size = driver.manage().window().getSize();
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        return new ElementLocation(size, x, y);
    }

    protected void scrollDown(WebElement element, double scrollPercentage) {
        ElementLocation elementLocation = getElementLocation(element);
        int endY = (int) (elementLocation.getSize().height * scrollPercentage);
        verticalScrollAction(elementLocation.getX(), elementLocation.getY(), endY);
    }

    protected void scrollUp(WebElement element, double scrollPercentage) {
        ElementLocation elementLocation = getElementLocation(element);
        int endY = elementLocation.getY() + (int) (elementLocation.getSize().height * scrollPercentage);
        verticalScrollAction(elementLocation.getX(), elementLocation.getY(), endY);
    }

    private void verticalScrollAction(int x, int y, int endY) {
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(x, y))
                .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(x, endY))
                .release()
                .perform();
    }

    protected boolean isElementPresent(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }

    }

    @SneakyThrows
    protected void waitFixedTime(int seconds) {
        TimeUnit.SECONDS.sleep(seconds);
    }


    protected void clickOnBoundsElement(WebElement element) {
        Rectangle rect = element.getRect();
        int x = rect.x;
        int y = rect.y;
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(x, y)).perform();
    }

    protected void goBack(){
        driver.navigate().back();
    }


}
