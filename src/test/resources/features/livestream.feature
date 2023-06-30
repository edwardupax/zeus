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

  @livestream @regression
  Scenario: Validar que se permita enviar por chat la programación del live
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

  @livestream @regression
  Scenario: Validar que se permita consultar el live ya programado
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
    And El usuario hace tap en el boton back hasta regresar al submodulo de Live Stream
    Then Se muestra el live creado anteriormente

  @livestream @regression @only
  Scenario: Validar que se muestren las notificaciones cuando hacen una publicacion publicación
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    And Ingresa al home de Zeus y hace tap sobre el modulo Red Social
    And Se realiza una publicacion en el grupo donde eres administrador
    When El usuario hace tap en el centro de notificaciones
    Then Se muestra la pantalla con las notificaciones recibidas

  @livestream @regression
  Scenario: Validar que la notificación tenga la descripción solicitada cuando me mencionan en una publicacion
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    And Ingresa al home de Zeus y hace tap sobre el modulo Red Social
    And Se realiza una publicacion donde se arroja una notificacion al usuario
    When El usuario hace tap en el centro de notificaciones
    Then Se muestra la pantalla con las notificaciones recibidas