package com.upax.zeus.steps.chatzeus;

import com.upax.zeus.page.login.ChatZeusPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class EnviarVideoGrupoSteps {

    private final ChatZeusPage chatZeusPage;

    @When("El usuario hace tap sobre el icono de adjuntar archivos")
    public void el_usuario_hace_tap_sobre_el_icono_de_adjuntar_archivos() {
            chatZeusPage.seleccionarBotonAdjuntar();
    }
    @When("Selecciona la opcion fotos y videos")
    public void selecciona_la_opcion_fotos_y_videos() {
        chatZeusPage.cargarImagen("image.jpg");
        chatZeusPage.seleccionarFotoVideo();
    }

    @When("Selecciona mas de dos fotos y videos")
    public void selecciona_mas_de_dos_fotos_y_videos() {
        chatZeusPage.cargarImagen("image.jpg");
        chatZeusPage.cargarImagen("image.jpg");

        chatZeusPage.seleccionarFotoVideo();
    }

    @When("Selecciona video de mas de 30 mb")
    public void Selecciona_video_de_mas_de_30_mb() {
        //chatZeusPage.cargarVideo("video50.mov");
        chatZeusPage.cargarVideo("video50.mov");
        chatZeusPage.seleccionarFotoVideo();
    }

    @When("Selecciona mas de dos imagenes y videos")
    public void Selecciona_mas_de_dos_imagenes_y_videos() {
        chatZeusPage.cargarVideo("videoMenor1.mp4");
        chatZeusPage.cargarVideo("videoMenor.mp4");
        chatZeusPage.cargarVideo("videoMenor2.mp4");
        chatZeusPage.cargarImagen("image.jpg");
        chatZeusPage.cargarImagen("image1.jpg");
        chatZeusPage.cargarImagen("image2.jpg");
        chatZeusPage.seleccionarFotoVideo();
    }

    @When("Carga localmente las imagenes a enviar")
    public void carga_localmente_las_imagenes_a_enviar() {
        chatZeusPage.cargarImagenes("image",31,".jpg");
        chatZeusPage.seleccionarFotoVideo();
    }

    @When("Selecciona la imagen")
    public void selecciona_el_video() {
        chatZeusPage.seleccionarFotoVideoGaleria();
    }

    @When("Hace click sobre el boton enviar")
    public void hace_click_sobre_el_boton_enviar() {
        chatZeusPage.enviarMedia();
    }

    @Then("Se muestra la validacion del tamaño del archivo")
    public void Se_muestra_la_validacion_del_tamaño_del_archivo() {
        chatZeusPage.validatesVideoSize();
    }

    @SneakyThrows
    @Then("Se muestra en el chat la imagen enviada")
    public void se_muestra_en_el_chat_la_imagen_enviada() {
        chatZeusPage.verifyImageSent();

    }

    @When("Selecciona la imagenes")
    public void selecciona_las_imagenes() {
        chatZeusPage.seleccionarFotoVideoTapLargo();
        chatZeusPage.selectFiveElements();
    }

    @When("El usuario presiona Seleccionar")
    public void El_usuario_presiona_Seleccionar() {
        chatZeusPage.pressSelectFromMedia();
    }

    @When("El usuario agrega comentarios a imagenes y videos")
    public void El_usuario_agrega_comentarios_a_imagenes_y_videos() {
        chatZeusPage.AddCommentsToMedia();
    }

    @When("El usuario envia los archivos y videos")
    public void El_usuario_envia_los_archivos_y_videos() {
        chatZeusPage.sendImagesAndVideos();
    }

    @When("Selecciona las imagenes hasta llegar a mas de 20")
    public void Selecciona_las_imagenes_hasta_llegar_a_mas_de_20() {
        chatZeusPage.seleccionarFotoVideoTapLargo();
        chatZeusPage.selectFiveElements();
        chatZeusPage.continueNavigating();
        chatZeusPage.selectnextFour();
        chatZeusPage.selectnextFour();
        chatZeusPage.selectnextFour();
        chatZeusPage.selectnextFour();
    }

}
