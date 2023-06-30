package com.upax.zeus.steps.notificaciones;

import com.upax.zeus.page.notificaciones.NotificacionesPage;
import com.upax.zeus.page.redsocial.PublicacionPage;
import com.upax.zeus.page.redsocial.RedSocialPage;
import com.upax.zeus.util.TestUtil;
import io.cucumber.java.en.Given;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConsultarNotificacionesSteps {

    private final RedSocialPage redSocialPage;
    private final PublicacionPage publicacionPage;

    @Given("Se realiza una publicacion en el grupo donde eres administrador")
    public void se_realiza_una_publicacion_en_el_grupo_donde_eres_administrador() {
        String texto = "Prueba QA ".concat(TestUtil.generateRandomString(4));
        redSocialPage.hacerPublicacion();
        publicacionPage.escribirTexto(texto);
        publicacionPage.tapPublicaButton();
    }
}
