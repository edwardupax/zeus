Feature: Utilizar el modulo chat zeus

  @login @regression
  Scenario: Abrir el modulo de Chat Zeus y enviar mensaje a una persona
    Given El usuario ingresa a Zeus utilizando su llave maestra
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a otro usuario
    And El usuario selecciona el chat
    And El usuario escribe y envia mensaje de texto


  Scenario: Abrir el modulo de Chat Zeus y enviar mensaje a un grupo
    Given El usuario ingresa a Zeus utilizando su llave maestra
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a un grupo
    And El usuario selecciona el chat
    And El usuario escribe y envia mensaje de texto