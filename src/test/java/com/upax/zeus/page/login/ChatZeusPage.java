package com.upax.zeus.page.login;

import com.upax.zeus.core.BasePage;
import com.upax.zeus.core.Config;
import com.upax.zeus.locator.login.ChatZeusLocator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class ChatZeusPage extends BasePage {
    public static final String IMAGES_FOLDER = "images";
    public static final String ANDROID_IMAGE_PATH = "/storage/emulated/0/Download/image.jpg";
    ChatZeusLocator chatLocator = new ChatZeusLocator();
    public ChatZeusPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()),chatLocator);
    }

    public void entrarAchatZeus(){
        tap(chatLocator.chatZeusButton);
    }

    public void escribirNuevoMensaje(){
        tap(chatLocator.newChatButton);
    }

    public void escribirNuevoMensajeAUsuario(String numeroUsuario){
        sendKeys(chatLocator.chatzeusSearchBar, numeroUsuario);
        searchKeyAndroid(chatLocator.chatzeusSearchBar);

    }

    public void escribirNuevoMensajeAUnGrupo(String numeroUsuario){
        sendKeys(chatLocator.chatzeusSearchBar, numeroUsuario);
        searchKeyAndroid(chatLocator.chatzeusSearchBar);

    }
    public void seleccionarChat(){
        tap(chatLocator.chatZeusUniqueResult);
    }
    public void escribirMensajeYEnviar(String textoMensaje){
        sendKeys(chatLocator.chatZeusMessageEditText,textoMensaje);
        tap(chatLocator.chatZeusSendButton);
    }

    public void seleccionarBotonAdjuntar(){
        tap(chatLocator.chatZeusAttachSendButton);
    }

    public void seleccionarFotoVideo(){
        tap(chatLocator.chatZeusAttachImageVideoButton);
    }


    public void cargarImagen(String imageName)  {
        AndroidDriver androidDriver = (AndroidDriver)getDriver();
        try {
            File imageDir = new File(Config.getResourcesPath(), IMAGES_FOLDER);
            File image = new File(imageDir.getCanonicalFile(),imageName);
            androidDriver.pushFile(ANDROID_IMAGE_PATH, image);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void seleccionarFotoVideoGaleria(){
        tap(chatLocator.firstPhoto);
    }

    public void enviarMedia(){
        tap(chatLocator.sendMediaButton);
    }

    public void verifyImageSent(){
        waitForVisibility(chatLocator.imageSent);
    }






}
