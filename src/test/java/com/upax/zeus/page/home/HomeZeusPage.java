package com.upax.zeus.page.home;

import com.upax.zeus.core.BasePage;
import com.upax.zeus.locator.home.HomeZeusLocator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomeZeusPage extends BasePage {

    HomeZeusLocator locator = new HomeZeusLocator();

    public HomeZeusPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()),this.locator);
    }

    public void abrirChatZeus(){
        tap(locator.chatZeus);
        waitFixedTime(5);
    }



}
