package com.upax.zeus.steps.notificaciones;

import com.upax.zeus.page.notificaciones.NotificacionesPage;
import com.upax.zeus.page.redsocial.PublicacionPage;
import com.upax.zeus.page.redsocial.RedSocialPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConsultaNotificacionEtiquetadaSteps {

    private final RedSocialPage redSocialPage;
    private final NotificacionesPage notificacionesPage;
    private final PublicacionPage publicacionPage;

    @Given("Se realiza una publicacion donde se arroja una notificacion al usuario")
    public void se_realiza_una_publicacion_donde_se_arroja_una_notificacion_al_usuario() {
        redSocialPage.hacerPublicacion();
        String nombre = "Edward Jose";
        String texto = "@E";
        publicacionPage.escribirTexto(texto);
        publicacionPage.seleccionarPersonaMention(nombre);
        publicacionPage.tapPublicaButton();
    }

    @When("El usuario hace tap en el centro de notificaciones")
    public void el_usuario_hace_tap_en_el_centro_de_notificaciones() {
        redSocialPage.abrirCentroNotificaciones();
    }
    @Then("Se muestra la pantalla con las notificaciones recibidas")
    public void se_muestra_la_pantalla_con_las_notificaciones_recibidas() {
       notificacionesPage.verifyListaNotificaciones();
    }
}
