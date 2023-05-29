package com.upax.zeus.locator.login;

import com.upax.zeus.core.BaseLocator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginLocator extends BaseLocator {

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zlo_button_key")
    public WebElement ingresaLlaveMaestraButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='input27']")
    public WebElement llaveMaestraTextbox;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public WebElement permitirAndroidButton;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement permitirAccesoAndroidButton;

    @AndroidFindBy(xpath = "//(//android.view.View[@content-desc=\"Seleccionar\"])[2]/android.widget.TextView")
    public WebElement botonSeleccionarPush;
     @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='input105']")
     public WebElement passwordTextbox;

     @AndroidFindBy(className = "android.widget.FrameLayout")
     public WebElement portada;

     @AndroidFindBy(id = "com.upax.zeusgeneric:id/btnLeft")
     public WebElement cancelarNotificacionesModalButton;

    public By getSiguienteButton(){
        return getButtonElement("Siguiente");
    }


}
