package com.upax.zeus.steps.chatzeus;


import com.upax.zeus.core.Config;
import com.upax.zeus.page.home.HomeZeusPage;
import com.upax.zeus.page.login.ChatZeusPage;
import com.upax.zeus.page.login.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AbrirChatZeusSteps {

    private final LoginPage loginPage;
    private final HomeZeusPage homeZeusPage;
    private final ChatZeusPage chatZeusPage;

    @Given("El usuario ingresa a Zeus utilizando su llave maestra {string}")
    public void el_usuario_ingresa_a_zeus_utilizando_su_llave_maestra(String llaveMaestra) {
          if(!Boolean.parseBoolean(Config.getNoReset())) {
              loginPage.setLLaveMaestra(llaveMaestra);
          }
    }
    @When("El usuario hace tap sobre el icono de chat en la parte inferior del app")
    public void el_usuario_hace_tap_sobre_el_icono_de_chat_en_la_parte_inferior_del_app() {
        homeZeusPage.abrirChatZeus();
    }
    @When("El usuario da un tap sobre el boton para escribir mensajes")
    public void el_usuario_da_un_tap_sobre_el_boton_para_escribir_mensajes() {
        chatZeusPage.escribirNuevoMensaje();
    }


    @When("EL usuario envia mensaje de texto a otro usuario")
    public void eL_usuario_envia_mensaje_de_texto_a_otro_usuario() {
        chatZeusPage.escribirNuevoMensajeAUsuario("10040494");
    }

    @When("EL usuario envia mensaje de texto a un grupo")
    public void eL_usuario_envia_mensaje_de_texto_a_un_grupo() {
        chatZeusPage.escribirNuevoMensajeAUnGrupo("QA Automatizadores");
    }

    @When("El usuario selecciona el chat")
    public void el_usuario_selecciona_el_chat() {
        chatZeusPage.seleccionarChat();
    }

    @When("El usuario escribe y envia mensaje de texto")
    public void eL_usuario_escribe_y_envia_mensaje_de_texto() {
        chatZeusPage.escribirMensajeYEnviar("Mensaje de prueba");
    }

    @When("El usuario graba envia mensaje de voz")
    public void el_usuario_graba_envia_mensaje_de_voz() {
        chatZeusPage.enviarMensajeVoz("Mensaje de prueba");
    }


    @Then("Aparece el splash screen e ingresa a todos los posts del día.")
    public void aparece_el_splash_screen_e_ingresa_a_todos_los_posts_del_día() {

    }
}
