package com.upax.zeus.page.livestream;

import com.google.common.truth.Truth;
import com.upax.zeus.constants.Direction;
import com.upax.zeus.core.BasePage;
import com.upax.zeus.locator.livestream.FormularioLiveStreamLocator;
import com.upax.zeus.model.LiveStream;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FormularioLiveStreamPage extends BasePage {

    private FormularioLiveStreamLocator locator = new FormularioLiveStreamLocator();

    public FormularioLiveStreamPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), locator);
    }


    public void completarFormulario(LiveStream evento) {
        sendKeys(locator.titulo, evento.getTitulo());
        tap(locator.fecha);
        tapProximoDiaDisponible();
        seleccionarHora(Direction.DOWN, locator.horaInicio, 0.25);
        seleccionarHora(Direction.UP, locator.horaFin, 0.25);
        sendKeys(locator.linkEvento, evento.getLink());
        tap(locator.radio10kParticipantes);
    }

    private void seleccionarHora(Direction scrollDirection, WebElement horaComponent, double scrollPorcentage) {
        tap(horaComponent);
        tap(locator.hora);
        if (scrollDirection.equals(Direction.DOWN)) {
            scrollDown(locator.hora, scrollPorcentage);
        } else {
            scrollUp(locator.hora, scrollPorcentage);
        }
        tap(locator.timePickerButton);
    }

    private void tapProximoDiaDisponible() {
        waitForVisibilityAllElements(locator.diasCalendario);
        WebElement diaDisponible = locator.diasCalendario.stream()
                .filter(element -> element.isEnabled())
                .findFirst().get();
        tap(diaDisponible);
    }

    public void verifyAgendarButtonIsEnabled() {
        waitForVisibility(locator.agendarButton);
        Truth.assertThat(locator.agendarButton.isEnabled()).isTrue();
    }

    public void tapAgendarButton(){
        tap(locator.agendarButton);
    }

    public void tapConfirmarLiveButton(){
        tap(locator.confirmarButton);
    }

    public void tapContinuarButton(){
        tap(locator.continuarButton);
    }
}
