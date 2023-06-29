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

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    public WebElement firstDocument;

    @AndroidFindBy(xpath = "//android.widget.ImageView[3]")
    public WebElement sendMediaButton;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/iv_image")
    public WebElement imageSent;

    @AndroidFindBy(id = "com.google.android.documentsui:id/action_menu_select")
    public WebElement selectButtonFromExplorer;
    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zw_fmfi_et_comment")
    public WebElement commentsTextField;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zw_fmfv_et_comment")
    public WebElement commentsTextFieldvideo;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")
    public WebElement carrouselItem2;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")
    public WebElement carrouselItem;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")
    public WebElement carrouselItem3;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")
    public WebElement carrouselItem4;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zw_tv_msg_error")
    public WebElement messageValidationVideoSize;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'])[2]")
    public WebElement secondPhoto;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'])[3]")
    public WebElement thirdPhoto;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'])[4]")
    public WebElement fourPhoto;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'])[5]")
    public WebElement fivePhoto;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'])[6]")
    public WebElement sixPhoto;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'])[7]")
    public WebElement photoSeven;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'])[8]")
    public WebElement photoEight;


    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zw_fmfi_iv_send_mediafile")

    public WebElement sendButtonFile;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zw_fmfv_iv_send_mediafile")
    public WebElement sendButtonFilevideo;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView[1]")
    public WebElement imagePreviewChat;
}
