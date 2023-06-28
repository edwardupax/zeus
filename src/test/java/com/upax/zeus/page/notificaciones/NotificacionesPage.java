package com.upax.zeus.page.notificaciones;

import com.google.common.truth.Truth;
import com.upax.zeus.core.BasePage;
import com.upax.zeus.locator.notificaciones.NotificacionesLocator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class NotificacionesPage extends BasePage {

    NotificacionesLocator locator = new NotificacionesLocator();

    public NotificacionesPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()),locator);
    }

    public void verifyListaNotificaciones(){
        waitForVisibilityAllElements(locator.notificacionesItems);
        Truth.assertThat(locator.notificacionesItems.size()).isGreaterThan(0);
        final String TEXTO_NOTIFICACION_RECIENTE = "Hace un momento";
        waitForVisibility(locator.getTextViewElement(TEXTO_NOTIFICACION_RECIENTE));
    }


}
