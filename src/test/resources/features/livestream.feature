Feature: Utilizar el submodulo Live Stream que se encuentra en el modulo Red Social

  @livestream @regression
  Scenario: Validar que se permita consultar el modulo de live streaming desde la red social
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    And Ingresa al home de Zeus y hace tap sobre el modulo Red Social
    When El usuario hace tap sobre el grupo donde es administrador
    And El usuario hace tap sobre el boton de agregar
    And Selecciona la opcion Programar live stream
    Then Se muestra el submodulo de Live Stream

  @livestream @regression
  Scenario: Validar que se permita configurar un live streaming
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    And Ingresa al home de Zeus y hace tap sobre el modulo Red Social
    When El usuario hace tap sobre el grupo donde es administrador
    And El usuario hace tap sobre el boton de agregar
    And Selecciona la opcion Programar live stream
    And Selecciona siguiente y procede a cerrar las instrucciones
    And El usuario hace tap en el boton para agregar un live stream
    And Completa el formulario de live stream
    Then Se muestra la informacion agregada y se habilita el campo agendar

  @livestream @regression @only
  Scenario: Validar que se permita configurar un live streaming
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    And Ingresa al home de Zeus y hace tap sobre el modulo Red Social
    When El usuario hace tap sobre el grupo donde es administrador
    And El usuario hace tap sobre el boton de agregar
    And Selecciona la opcion Programar live stream
    And Selecciona siguiente y procede a cerrar las instrucciones
    And El usuario hace tap en el boton para agregar un live stream
    And Completa el formulario de live stream
    And El usuario hace tap sobre el boton agendar
    And Hace tap sobre el boton confirmar
    And Cerrar el aviso de live stream agendado
    Then Se muestra en el chat zeus con la informacion del live creado


