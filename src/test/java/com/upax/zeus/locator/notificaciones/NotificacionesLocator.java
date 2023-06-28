package com.upax.zeus.locator.notificaciones;

import com.upax.zeus.core.BaseLocator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NotificacionesLocator extends BaseLocator {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.upax.zeusgeneric:id/tvNameNotificationsUser']")
    public List<WebElement> notificacionesItems;
}
