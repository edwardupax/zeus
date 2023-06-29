Feature: Utilizar el modulo chat zeus



  @regression @only
  Scenario: Z2_TREN1_6_And_Validar envio de videos de mas de 30 MB a un chat Grupal
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a un grupo
    And El usuario selecciona el chat
    And El usuario hace tap sobre el icono de adjuntar archivos
    And Selecciona video de mas de 30 mb
    And Selecciona la imagen
    Then Se muestra la validacion del tamaño del archivo


  @regression @only
  Scenario: Z2_TREN1_2_And_Validar envio de mas de 2 imagenes y videos a un chat Grupal 2con texto
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a un grupo
    And El usuario selecciona el chat
    And El usuario hace tap sobre el icono de adjuntar archivos
    And Selecciona mas de dos imagenes y videos
    And Selecciona la imagenes
    And El usuario presiona Seleccionar
    And El usuario agrega comentarios a imagenes y videos
    And El usuario envia los archivos y videos
    Then Se muestra en el chat la imagen enviada

  Scenario: Z2_TREN1_4_And_Validar envio de mas de 20 archivos a un chat Grupal
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a un grupo
    And El usuario selecciona el chat
    And El usuario hace tap sobre el icono de adjuntar archivos
    And Carga localmente las imagenes a enviar
    And Selecciona las imagenes hasta llegar a mas de 20
    And El usuario presiona Seleccionar
    Then Se muestra la validacion del tamaño del archivo



  @regression @only
  Scenario: Z2_TREN1_6_And_Validar envio de videos de mas de 30 MB a un chat P2P
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a otro usuario
    And El usuario selecciona el chat
    And El usuario hace tap sobre el icono de adjuntar archivos
    And Selecciona video de mas de 30 mb
    And Selecciona la imagen
    Then Se muestra la validacion del tamaño del archivo


  @regression @only
  Scenario: Z2_TREN1_2_And_Validar envio de mas de 2 imagenes y videos a un chat P2P 2con texto
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a otro usuario
    And El usuario selecciona el chat
    And El usuario hace tap sobre el icono de adjuntar archivos
    And Selecciona mas de dos imagenes y videos
    And Selecciona la imagenes
    And El usuario presiona Seleccionar
    And El usuario agrega comentarios a imagenes y videos
    And El usuario envia los archivos y videos
    Then Se muestra en el chat la imagen enviada

  Scenario: Z2_TREN1_4_And_Validar envio de mas de 20 archivos a un chat P2P
    Given El usuario ingresa a Zeus utilizando su llave maestra "10040622"
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    And El usuario da un tap sobre el boton para escribir mensajes
    And EL usuario envia mensaje de texto a otro usuario
    And El usuario selecciona el chat
    And El usuario hace tap sobre el icono de adjuntar archivos
    And Carga localmente las imagenes a enviar
    And Selecciona las imagenes hasta llegar a mas de 20
    And El usuario presiona Seleccionar
    Then Se muestra la validacion del tamaño del archivo



  ## Z2_TREN1_6_And_Validar envio de videos de mas de 30 MB a un chat Grupal
  ## Z2_TREN1_5_And_Validar envio de videos de mas de 30 MB a un chat P2P
  ## Z2_TREN1_4_And_Validar envio de mas de 20 archivos a un chat Grupal
  ## Z2_TREN1_3_And_Validar envio de mas de 20 archivos a un chat P2P
  ## Z2_TREN1_2_And_Validar envio de mas de 2 imagenes y videos a un chat Grupal 2con texto
  ## Z2_TREN1_1_And_Validar envio de mas de 2 imagenes y videos a un chat P2P con texto
