package com.upax.zeus.steps.chatzeus;


import com.upax.zeus.page.login.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AbrirChatZeusSteps {

    private final LoginPage loginPage;

    @Given("El usuario ingresa a Zeus utilizando su llave maestra")
    public void el_usuario_ingresa_a_zeus_utilizando_su_llave_maestra() {
            loginPage.setLLaveMaestra("10040494");
    }
    @When("El usuario hace tap sobre el icono de chat en la parte inferior del app")
    public void el_usuario_hace_tap_sobre_el_icono_de_chat_en_la_parte_inferior_del_app() {

    }
    @Then("Aparece el splash screen e ingresa a todos los posts del día.")
    public void aparece_el_splash_screen_e_ingresa_a_todos_los_posts_del_día() {

    }
}
