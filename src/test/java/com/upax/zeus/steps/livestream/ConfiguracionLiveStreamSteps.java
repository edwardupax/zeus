package com.upax.zeus.steps.livestream;

import com.upax.zeus.model.LiveStream;
import com.upax.zeus.page.livestream.FormularioLiveStreamPage;
import com.upax.zeus.page.livestream.LiveStreamPage;
import com.upax.zeus.util.JsonUtil;
import com.upax.zeus.util.TestUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConfiguracionLiveStreamSteps {

    private final LiveStreamPage liveStreamPage;
    private final FormularioLiveStreamPage formularioLiveStreamPage;

    @When("Selecciona siguiente y procede a cerrar las instrucciones")
    public void selecciona_siguiente_y_procede_a_cerrar_las_instrucciones() {
        liveStreamPage.cerrarTutoriales();
    }

    @When("El usuario hace tap en el boton para agregar un live stream")
    public void el_usuario_hace_tap_en_el_boton_para_agregar_un_live_stream() {
        liveStreamPage.tapAgregarLiveStream();
    }

    @When("Completa el formulario de live stream")
    public void completa_el_formulario_de_live_stream() {
        LiveStream evento = JsonUtil.jsonToPojo("/livestream/livestream.json", LiveStream.class);
        evento.setTitulo(evento.getTitulo().concat(" ").concat(TestUtil.generateRandomString(6)));
        formularioLiveStreamPage.completarFormulario(evento);
    }

    @Then("Se muestra la informacion agregada y se habilita el campo agendar")
    public void se_muestra_la_informacion_agregada_y_se_habilita_el_campo_agendar() {
        formularioLiveStreamPage.verifyAgendarButtonIsEnabled();
    }
}
