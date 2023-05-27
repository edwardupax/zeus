package com.upax.zeus.page.login;

import com.upax.zeus.core.BasePage;
import com.upax.zeus.locator.login.LoginLocator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    LoginLocator locator = new LoginLocator();

    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()),locator);
    }

    public void setLLaveMaestra(String numeroEmpleado){
        tap(locator.ingresaLlaveMaestraButton);
        tap(locator.permitirAccesoAndroidButton);
        tap(locator.permitirAndroidButton);

    }
}
