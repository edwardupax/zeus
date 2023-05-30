package com.upax.zeus.page.login;

import com.upax.zeus.core.BasePage;
import com.upax.zeus.locator.login.ChatZeusLocator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ChatZeusPage extends BasePage {
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

    public void enviarMensajeVoz(String textoMensaje){

        try {
            largeTap(chatLocator.chatZeusSendButton);
           // tap(chatLocator.chatZeusAttachSendButton);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
