#Author: elber.ceballos@sophossolutions.com
Feature: Registrar usuario metodo Post
  Yo como automatizador necesito aprender a consumir apis

  Scenario: Registro Usuario Post
    Given quiero realizar un registro en la api "https://reqres.in/"
    When Envio la informacion del usuario para el endpoint "api/register"
      | email    | eve.holt@reqres.in |
      | password | pistol             |
    Then valido que la respuesta tenga status 200, contenga id 4 y token "QpwL5tke4Pnpja7X4"
