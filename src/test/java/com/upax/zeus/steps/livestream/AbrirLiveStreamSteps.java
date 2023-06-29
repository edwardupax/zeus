package com.upax.zeus.steps.livestream;

import com.upax.zeus.page.home.HomeZeusPage;
import com.upax.zeus.page.livestream.LiveStreamPage;
import com.upax.zeus.page.redsocial.GrupoPage;
import com.upax.zeus.page.redsocial.RedSocialPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AbrirLiveStreamSteps {

    private final HomeZeusPage homeZeusPage;
    private final RedSocialPage redSocialPage;
    private final GrupoPage grupoPage;
    private final LiveStreamPage liveStreamPage;

    @Given("Ingresa al home de Zeus y hace tap sobre el modulo Red Social")
    public void ingresa_al_home_de_zeus_y_hace_tap_sobre_el_modulo_red_social() {
        homeZeusPage.abrirRedSocial();
    }

    @When("El usuario hace tap sobre el grupo donde es administrador")
    public void el_usuario_hace_tap_sobre_el_grupo_donde_es_administrador() {
        redSocialPage.seleccionarGrupo();
    }

    @When("El usuario hace tap sobre el boton de agregar")
    public void el_usuario_hace_tap_sobre_el_boton_de_agregar() {
        grupoPage.tapAgregarButton();
    }

    @When("Selecciona la opcion Programar live stream")
    public void selecciona_la_opcion_programar_live_stream() {
        grupoPage.tapProramarLiveStream();
    }

    @Then("Se muestra el submodulo de Live Stream")
    public void se_muestra_el_submodulo_de_live_stream() {
        liveStreamPage.verifyLiveStreamIsVisible();
    }
}
