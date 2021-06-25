#Author: santiago.espinal@sophossolutions.com
Feature: Registrar usuario metodo post
  Yo como aprendiz de automatizacion 
  Necesito aprender a consumir apis 
  Para automatizar las peticiones

  Scenario: Registrar con Post un usuario
    Given Quiero relizar un registro en la api "https://reqres.in/"
    When Envio la informacion del usuario para el endpoint "/api/register"
      | email    | eve.holt@reqres.in |
      | password | pistol             |
    Then Valido que la respuesta tenga status 200
