package com.upax.zeus.page.redsocial;

import com.upax.zeus.core.BasePage;
import com.upax.zeus.locator.redsocial.RedSocialLocator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class RedSocialPage extends BasePage {

    private RedSocialLocator locator = new RedSocialLocator();

    public RedSocialPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()),locator);
    }

    public void seleccionarGrupo(){
        tap(locator.grupoIcon);
    }

    public void abrirCentroNotificaciones(){
        tap(locator.notificacionesIcon);
    }

    public void hacerPublicacion(){
        tap(locator.queEstasPensandoText);
    }

}
