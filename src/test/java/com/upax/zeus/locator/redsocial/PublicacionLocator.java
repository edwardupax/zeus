package com.upax.zeus.locator.redsocial;

import com.upax.zeus.core.BaseLocator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PublicacionLocator extends BaseLocator {

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/etWhatsUpPost")
    public WebElement queQuieresCompartirText;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/tvFinishPost")
    public WebElement publicarButton;

}
