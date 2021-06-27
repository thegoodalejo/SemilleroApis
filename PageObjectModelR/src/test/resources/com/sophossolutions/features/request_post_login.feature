Feature: Loguear usuario metodo Post
  Yo quiero aprender a consumir apis para automatizar las peticiones

  Scenario: Logear usuario Post
    Given Quiero realizar un login en la api "https://reqres.in/"
    When Envio la informacion del usuario para el endpoint "api/login"
      | email    | eve.holt@reqres.in |
      | password | cityslicka         |
    Then Valido que la respuesta tenga status 200 y contenga token "QpwL5tke4Pnpja7X4"
