Feature: Utilizar el modulo chat zeus

  @login @regression
  Scenario: Abrir el modulo de Chat Zeus
    Given El usuario ingresa a Zeus utilizando su llave maestra
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a otro usuario
    And El usuario selecciona el chat
    And El usuario escribe y envia mensaje de texto
    ##Then Aparece el splash screen e ingresa a todos los posts del día.
  ##/Users/jafitismaelgarciacervantes/IdeaProjects/git/zeus/src/test/java/com/upax/zeus/core/BasePage.java