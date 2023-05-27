package com.upax.zeus.core;

import org.openqa.selenium.By;

public class BaseLocator {

    public By getTextViewElement(String text){
        String expression = "//android.widget.TextView[contains(@text,'%s')]";
        String format = String.format(expression, text);
        return By.xpath(format);
    }

    public By getButtonElement(String text){
        String expression = "//android.widget.Button[contains(@text,'%s')]";
        String format = String.format(expression, text);
        return By.xpath(format);
    }
}
