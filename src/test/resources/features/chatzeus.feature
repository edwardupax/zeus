Feature: Utilizar el modulo chat zeus

  @login @regression
  Scenario: Abrir el modulo de Chat Zeus
    Given El usuario ingresa a Zeus utilizando su llave maestra
    When El usuario hace tap sobre el icono de chat en la parte inferior del app
    Then Aparece el splash screen e ingresa a todos los posts del día.