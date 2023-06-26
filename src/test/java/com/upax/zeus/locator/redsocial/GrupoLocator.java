package com.upax.zeus.locator.redsocial;

import com.upax.zeus.core.BaseLocator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GrupoLocator extends BaseLocator {

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/ivHomeHeader")
    public WebElement grupoImageHeader;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zrs_ttg_btn_do_action")
    public WebElement agregarButton;

    public By programarLiveStreamOption(){
        return getTextViewElement("Programar live stream");
    }


}
