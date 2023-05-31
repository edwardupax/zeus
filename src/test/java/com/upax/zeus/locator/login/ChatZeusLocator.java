package com.upax.zeus.locator.login;

import com.upax.zeus.core.BaseLocator;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ChatZeusLocator extends BaseLocator {

    @AndroidFindBy(id="com.upax.zeusgeneric:id/ZChatZeus")
    public WebElement chatZeusButton;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/action_new_chat")
    public WebElement newChatButton;

    @AndroidFindBy(id="com.upax.zeusgeneric:id/wz_edit_search_group")
    public WebElement chatzeusSearchBar;

    @AndroidFindBy(id="com.upax.zeusgeneric:id/wz_chat_name")
    public WebElement chatZeusUniqueResult;

    @AndroidFindBy(id="com.upax.zeusgeneric:id/et_text")
    public WebElement chatZeusMessageEditText;

    @AndroidFindBy(id="com.upax.zeusgeneric:id/wz_fab_recorder")
    public WebElement chatZeusSendButton;

    @AndroidFindBy(id="com.upax.zeusgeneric:id/iv_send_attachment")
    public WebElement chatZeusAttachSendButton;

    @AndroidFindBy(id="com.upax.zeusgeneric:id/wz_fab_recorder")
    public WebElement chatZeusVoiceButton;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Fotos y videos']")
    public WebElement chatZeusAttachImageVideoButton;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Documentos']")
    public WebElement chatZeusAttachDocsButton;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Audio']")
    public WebElement chatZeusAttachAudioButton;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'])[1]")
    public WebElement firstPhoto;

    @AndroidFindBy(xpath = "//android.widget.ImageView[3]")
    public WebElement sendMediaButton;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/iv_image")
    public WebElement imageSent;



}
