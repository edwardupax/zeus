package com.upax.zeus.page.login;

import com.upax.zeus.constants.Direction;
import com.upax.zeus.core.BasePage;
import com.upax.zeus.core.Config;
import com.upax.zeus.locator.login.ChatZeusLocator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.SneakyThrows;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class ChatZeusPage extends BasePage {
    public static final String IMAGES_FOLDER = "images";
    public static final String DOCS_FOLDER = "File";
    public static final String VIDEO_FOLDER = "video";
    public static final String ANDROID_IMAGE_PATH = "/storage/emulated/0/Download/";
    public static final String ANDROID_DOC_PATH = "/storage/emulated/0/Download/";
    public static final String ANDROID_VIDEO_PATH = "/storage/emulated/0/Download/";
    ChatZeusLocator chatLocator = new ChatZeusLocator();

    public ChatZeusPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), chatLocator);
    }

    public void entrarAchatZeus() {
        tap(chatLocator.chatZeusButton);
    }

    public void escribirNuevoMensaje() {
        tap(chatLocator.newChatButton);
    }

    public void escribirNuevoMensajeAUsuario(String numeroUsuario) {
        sendKeys(chatLocator.chatzeusSearchBar, numeroUsuario);
        searchKeyAndroid(chatLocator.chatzeusSearchBar);

    }

    public void escribirNuevoMensajeAUnGrupo(String numeroUsuario) {
        sendKeys(chatLocator.chatzeusSearchBar, numeroUsuario);
        searchKeyAndroid(chatLocator.chatzeusSearchBar);

    }

    public void seleccionarChat() {
        tap(chatLocator.chatZeusUniqueResult);
    }

    public void escribirMensajeYEnviar(String textoMensaje) {
        sendKeys(chatLocator.chatZeusMessageEditText, textoMensaje);
        tap(chatLocator.chatZeusSendButton);
    }


    public void seleccionarBotonAdjuntar() {
        tap(chatLocator.chatZeusAttachSendButton);
    }

    public void seleccionarFotoVideo() {
        tap(chatLocator.chatZeusAttachImageVideoButton);
    }
    public void seleccionarDocumento() {
        tap(chatLocator.chatZeusAttachDocsButton);
    }


    public void cargarImagen(String imageName) {
        AndroidDriver androidDriver = (AndroidDriver) getDriver();
        try {
            File imageDir = new File(Config.getResourcesPath(), IMAGES_FOLDER);
            File image = new File(imageDir.getCanonicalFile(), imageName);
            androidDriver.pushFile(ANDROID_IMAGE_PATH+imageName, image);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void cargarImagenes(String Filename, int numberFile, String extension ){
            for (int i = 1; i < numberFile; i++) {
                String imageName=Filename+i+extension;
                cargarImagen(imageName);
            }


    }

    public void cargardocumento(String docName) {
        AndroidDriver androidDriver = (AndroidDriver) getDriver();
        try {
            File imageDir = new File(Config.getResourcesPath(), DOCS_FOLDER);
            File document = new File(imageDir.getCanonicalFile(), docName);
            androidDriver.pushFile(ANDROID_DOC_PATH, document);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void cargarVideo(String videoName) {
        AndroidDriver androidDriver = (AndroidDriver) getDriver();
        try {
            File imageDir = new File(Config.getResourcesPath(), VIDEO_FOLDER);
            File video = new File(imageDir.getCanonicalFile(), videoName);
            androidDriver.pushFile(ANDROID_VIDEO_PATH+videoName, video);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void enviarMensajeVoz(String textoMensaje) {

        try {
            largeTap(chatLocator.chatZeusSendButton);
            // tap(chatLocator.chatZeusAttachSendButton);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void seleccionarFotoVideoGaleria() {
        tap(chatLocator.firstPhoto);
    }

    public void seleccionarDocumentoideoGaleria() {
        tap(chatLocator.firstDocument);
        tap(chatLocator.chatZeusSendButton);
    }

    public void enviarMedia() {
        tap(chatLocator.sendMediaButton);
    }

    public void verifyImageSent() {
        waitForVisibility(chatLocator.imagePreviewChat);
    }

    public void validatesVideoSize(){
        Assert.assertTrue(isElementPresent(chatLocator.messageValidationVideoSize));
    }

    @SneakyThrows
    public void seleccionarFotoVideoTapLargo() {
        largeTap(chatLocator.firstPhoto);
    }

    public void selectFiveElements() {
        tap(chatLocator.secondPhoto);
        tap(chatLocator.thirdPhoto);
        tap(chatLocator.fourPhoto);
        tap(chatLocator.fivePhoto);
        tap(chatLocator.sixPhoto);
    }

    public void selectnextFour() {
        ifIsAvaiableTap(chatLocator.photoSeven);
        ifIsAvaiableTap(chatLocator.photoEight);
        continueNavigating();
        ifIsAvaiableTap(chatLocator.photoSeven);
        ifIsAvaiableTap(chatLocator.photoEight);
        continueNavigating();
    }



    public void pressSelectFromMedia() {
        tap(chatLocator.selectButtonFromExplorer);
    }
    public void AddCommentsToMedia() {
        sendKeys(chatLocator.commentsTextField,"texto de prueba");
        tap(chatLocator.carrouselItem);
        sendKeys(chatLocator.commentsTextField,"texto de prueba");
        tap(chatLocator.carrouselItem2);
        sendKeys(chatLocator.commentsTextField,"texto de prueba");
        tap(chatLocator.carrouselItem3);
        sendKeys(chatLocator.commentsTextField,"texto de prueba");
        tap(chatLocator.carrouselItem4);
        sendKeys(chatLocator.commentsTextFieldvideo,"texto de prueba");
    }

    public void sendImagesAndVideos() {
        if(isElementPresent(chatLocator.sendButtonFile)){
            tap(chatLocator.sendButtonFile);
        }else{
            tap(chatLocator.sendButtonFilevideo);
        }
    }

    public void continueNavigating(){
        scroll(Direction.DOWN,10);
    }

}
