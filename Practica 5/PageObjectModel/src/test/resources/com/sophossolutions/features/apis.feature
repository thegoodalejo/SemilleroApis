#Author: andres.lopez@sophossolutions.com
Feature: Utilizar Apis
  Yo como automatizador quiero probar Apis

  Scenario: Registrar usuario POST
    Given Deseo realizar un registro en la API "https://reqres.in/"
    When Enviar los datos a la API "https://reqres.in/api/register"
      | email    | eve.holt@reqres.in |
      | password | pistol             |
    Then Verificar que la respuesta sea un 200
