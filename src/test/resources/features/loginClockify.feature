@login
Feature: Login

  @logIn
  Scenario Outline: Login exitoso
    Given la aplicacion cargo correctamente
    When el usuario registrado ingresa mail '<mail>' , contraseña '<pass>'
    When hace click en el boton LOG IN
    Then valido que el texto Time Entries sea visible

    Examples:
      | mail                       | pass       |
      | marcelolamas2495@gmail.com | Marcelo123 |

  @logOut
  Scenario: Log Out APK
    Given me encuentro logeado y en la pagina home
    When hago click en el boton MENU
    When hago click LOGOUT
    When hago click en CONFIRM
    Then valido que el texto LOG IN sea visible