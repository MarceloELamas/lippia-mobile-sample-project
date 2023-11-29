Feature: Agregar horas a Workspace

  @Demo
  Scenario Outline: Login exitoso
    Given la aplicacion cargo correctamente
    When el usuario registrado ingresa mail '<mail>' , contraseña '<pass>'
    When hace click en el boton LOG IN
    Then valido que el texto Time Entries sea visible

    Examples:
      | mail                       | pass       |
      | marcelolamas2495@gmail.com | Marcelo123 |
