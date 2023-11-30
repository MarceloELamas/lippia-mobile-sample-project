@timeEntry
Feature: Entrada de Horas
  @timeEntryOK
  Scenario Outline: Ingresar un registro de horas
    Given me encuentro logeado y en la pagina home
    When hago clic en el boton ADD celeste
    When visualizo el texto Add Entry
    When hago click en hora e ingreso el valor '<hora>'
    When hago click en minutos e ingreso el valor '<min>'
    When hago click en el boton SEND
    Then valido que el texto Time Entries sea visible
    Then valido que el texto This Week sea visible

    Examples:
      | hora | min |
      | 10   | 30  |
  @SinTerminar
  Scenario Outline: Ingresar un registro de horas con fecha determinada
    Given me encuentro logeado y en la pagina home
    When hago clic en el boton ADD celeste
    When visualizo el texto Add Entry
    When hago click en hora e ingreso el valor '<hora>'
    When hago click en minutos e ingreso el valor '<min>'
    When hago click en la fecha actual
    When hago click en la fecha <fecha>
    When hago click en el boton SEND
    Then valido que el texto Time Entries sea visible
    Then valido que el texto This Week sea visible

    Examples:
      | hora | min | fecha             |
      | 5    | 10  | 03 noviembre 2023 |

    @SinTerminar
    Scenario Outline: Cancelar entrada de horas
      Given me encuentro logeado y en la pagina home
      When hago clic en el boton ADD celeste
      When visualizo el texto Add Entry
      When hago click en hora e ingreso el valor '<hora>'
      When hago click en minutos e ingreso el valor '<min>'
      When hago click en la felcha Back
      When hago click en DISCARD
      Then valido que el texto Time Entries sea visible
      Then valido que el texto This Week sea visible

      Examples:
        | hora | min |
        | 2    | 5   |

      @changeDarkMode
      Scenario: Cambiar APK a modo Oscuro
        Given me encuentro logeado y en la pagina home
        When hago click en el boton MENU
        When hago click en SETTINGS
        When hago click en el Switch dark mode
        Then valido la existencia de la opcion Enable dark mode
