package com.upax.zeus.steps.livestream;

import com.google.common.truth.Truth;
import com.upax.zeus.page.livestream.LiveStreamPage;
import com.upax.zeus.page.login.ChatZeusPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CrearLiveStream {

    public static final String NOMBRE_LIVE_STREAM_QA_AUTO = "QA Automatizado";
    private final LiveStreamPage liveStreamPage;
    private final ChatZeusPage chatZeusPage;

    @When("El usuario hace tap en el boton back hasta regresar al submodulo de Live Stream")
    public void el_usuario_hace_tap_en_el_boton_back_hasta_regresar_al_submodulo_de_live_stream() {
        chatZeusPage.tapBackButton();
        chatZeusPage.tapBackButton();
    }
    @Then("Se muestra el live creado anteriormente")
    public void se_muestra_el_live_creado_anteriormente() {
        String ultimoLiveStream = liveStreamPage.getUltimoLiveStream();
        Truth.assertThat(ultimoLiveStream).contains(NOMBRE_LIVE_STREAM_QA_AUTO);

    }


}
