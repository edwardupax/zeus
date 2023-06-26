Feature: Utilizar el modulo chat zeus

  @regression
  Scenario: Abrir el modulo de Chat Zeus y enviar mensaje a una persona
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a otro usuario
    And El usuario selecciona el chat
    And El usuario escribe y envia mensaje de texto

  @regression
  Scenario: Abrir el modulo de Chat Zeus y enviar mensaje a un grupo
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a un grupo
    And El usuario selecciona el chat
    And El usuario escribe y envia mensaje de texto


  @regression
  Scenario: Abrir el modulo de Chat Zeus y enviar una imagen a un grupo
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040494"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And El usuario hace tap sobre el icono de adjuntar archivos
    And Selecciona la opcion fotos y videos
    And Selecciona la imagen
    And Hace click sobre el boton enviar
    Then Se muestra en el chat la imagen enviada



  Scenario: Abrir el modulo de Chat Zeus y enviar mensaje  de voz a una persona
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a otro usuario
    And El usuario selecciona el chat
    And El usuario graba envia mensaje de voz

  Scenario: Abrir el modulo de Chat Zeus y enviar mensaje de voz  a un grupo
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a un grupo
    And El usuario selecciona el chat
    And El usuario graba envia mensaje de voz






