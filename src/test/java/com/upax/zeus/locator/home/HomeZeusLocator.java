package com.upax.zeus.locator.home;

import com.upax.zeus.core.BaseLocator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeZeusLocator extends BaseLocator {

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zContainerLogo")
    public WebElement logo;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/ZChatZeus")
    public WebElement chatZeus;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zEditSearch")
    public WebElement buscarZeusSearchBar;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zsg_et_search")
    public WebElement searchText;




}
