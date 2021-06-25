#Author: andres.guarnizo@sophossolutions.com
Feature: Tomar datos del usuario 2 con metodo GET
  Yo como aprendiz de automatizacion
  Necesito aprender a consumir apis
  Para automatizar las peticiones

  Scenario: Tomar nombre y appellido del usuario 2 metodo GET
    Given Quiero consultar un registro en la api "https://reqres.in/"
    When Envio la consulta del usuario "2" con GET para el endpoint "api/users/"
    Then Valido que la respuesta tenga status 200 y tenga nombre "Janet" y apellido "Weaver"
