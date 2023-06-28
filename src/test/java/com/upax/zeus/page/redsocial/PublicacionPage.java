package com.upax.zeus.page.redsocial;

import com.upax.zeus.core.BasePage;
import com.upax.zeus.locator.redsocial.PublicacionLocator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PublicacionPage extends BasePage {

    private PublicacionLocator locator = new PublicacionLocator();

    public PublicacionPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()),locator);
    }


    public void escribirTexto(String texto){
        sendKeysUsingKeyboard(locator.queQuieresCompartirText, texto);
    }

    public void seleccionarPersonaMention(String nombre){
        waitFixedTime(2);
        tap(locator.getTextViewElement(nombre));
    }

    public void tapPublicaButton(){
        tap(locator.publicarButton);
    }
}
