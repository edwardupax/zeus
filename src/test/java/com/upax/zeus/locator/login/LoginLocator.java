package com.upax.zeus.locator.login;

import com.upax.zeus.core.BaseLocator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginLocator extends BaseLocator {

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zlo_button_key")
    public WebElement ingresaLlaveMaestraButton;

    @AndroidFindBy(id = "input27")
    public WebElement llaveMaestraTextbox;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public WebElement permitirAndroidButton;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement permitirAccesoAndroidButton;

    public By getSiguienteButton(){
        return getButtonElement("Siguiente");
    }


}
