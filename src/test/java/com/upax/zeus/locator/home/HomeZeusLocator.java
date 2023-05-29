package com.upax.zeus.locator.home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeZeusLocator {

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zContainerLogo")
    public WebElement logo;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/ZChatZeus")
    public WebElement chatZeus;




}
