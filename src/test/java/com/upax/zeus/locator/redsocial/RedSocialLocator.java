package com.upax.zeus.locator.redsocial;

import com.upax.zeus.core.BaseLocator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class RedSocialLocator extends BaseLocator {

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/ivImageGroupCarousel")
    public WebElement grupoIcon;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/ivNotifications")
    public WebElement notificacionesIcon;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/tvLabel")
    public WebElement queEstasPensandoText;
}
