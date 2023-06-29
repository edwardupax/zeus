package com.upax.zeus.page.redsocial;

import com.upax.zeus.core.BasePage;
import com.upax.zeus.locator.redsocial.GrupoLocator;
import com.upax.zeus.locator.redsocial.RedSocialLocator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class GrupoPage extends BasePage {

    private GrupoLocator locator = new GrupoLocator();

    public GrupoPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()),locator);
    }

    public void tapAgregarButton(){
        tap(locator.agregarButton);
    }

    public void tapProramarLiveStream(){
        tap(locator.programarLiveStreamOption());
    }
}
