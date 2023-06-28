package com.upax.zeus.locator.livestream;

import com.upax.zeus.core.BaseLocator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LiveStreamLocator extends BaseLocator {

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zcds_txt_title")
    public WebElement tituloLabel;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zslFABNewLiveStreaming")
    public WebElement agregarLiveStreamButton;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_tfw_btn_next")
    public WebElement siguienteButton;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsl_is_btn_close")
    public WebElement cerrarTutorialButton;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.upax.zeusgeneric:id/zsl_item_sche_name'])[last()]")
    public WebElement ultimoLiveStreamItem;






}
