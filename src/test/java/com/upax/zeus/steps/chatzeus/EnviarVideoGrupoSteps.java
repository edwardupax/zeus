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
    @When("Selecciona la imagen")
    public void selecciona_el_video() {
        chatZeusPage.seleccionarFotoVideoGaleria();
    }

    @When("Hace click sobre el boton enviar")
    public void hace_click_sobre_el_boton_enviar() {
        chatZeusPage.enviarMedia();
    }

    @SneakyThrows
    @Then("Se muestra en el chat la imagen enviada")
    public void se_muestra_en_el_chat_la_imagen_enviada() {
        chatZeusPage.verifyImageSent();

    }

}
