package com.upax.zeus.page.livestream;

import com.google.common.truth.Truth;
import com.upax.zeus.core.BasePage;
import com.upax.zeus.locator.livestream.LiveStreamLocator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
@Slf4j
public class LiveStreamPage extends BasePage {

    private LiveStreamLocator locator = new LiveStreamLocator();

    public LiveStreamPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), locator);
    }

    public void cerrarTutoriales() {
        try {
            if (locator.siguienteButton.isDisplayed()) {
                tap(locator.siguienteButton);
                tap(locator.cerrarTutorialButton);
            }
        } catch (NoSuchElementException e) {
            log.info("Tutoriales o guia de uso de live stream no estaba presente");
        }
    }

    public void verifyLiveStreamIsVisible() {
        waitForVisibility(locator.tituloLabel);
        String text = locator.tituloLabel.getText();
        Truth.assertThat(text).contains("Live");
    }

    public void tapAgregarLiveStream() {
        verifyLiveStreamIsVisible();
        tap(locator.agregarLiveStreamButton);
    }
}
