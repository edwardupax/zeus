package com.upax.zeus.steps.livestream;

import com.google.common.truth.Truth;
import com.upax.zeus.page.livestream.FormularioLiveStreamPage;
import com.upax.zeus.page.login.ChatZeusPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AbrirChatLiveStreamSteps {

    private final FormularioLiveStreamPage formularioLiveStreamPage;
    private final ChatZeusPage chatZeusPage;

    @When("El usuario hace tap sobre el boton agendar")
    public void el_usuario_hace_tap_sobre_el_boton_agendar() {
        formularioLiveStreamPage.tapAgendarButton();
    }

    @When("Hace tap sobre el boton confirmar")
    public void hace_tap_sobre_el_boton_confirmar() {
        formularioLiveStreamPage.tapConfirmarLiveButton();
    }

    @When("Cerrar el aviso de live stream agendado")
    public void cerrar_el_aviso_de_live_stream_agendado() {
        formularioLiveStreamPage.tapContinuarButton();
    }

    @Then("Se muestra en el chat zeus con la informacion del live creado")
    public void se_muestra_en_el_chat_zeus_con_la_informacion_del_live_creado() {
        String textoUltimoChat = chatZeusPage.getTextoUltimoChat();
        Truth.assertThat(textoUltimoChat).contains("QA Automatizado");
    }
}
