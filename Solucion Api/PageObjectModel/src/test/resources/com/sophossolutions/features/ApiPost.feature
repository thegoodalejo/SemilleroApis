#Autor: maria.cala@sophossolutions.com
Feature: Registrar usuario metodo Post
  Yo quiero realizar una peticion Post
  Scenario: Hacer peticion Post
    Given Quiero hacer una peticion en la api "https://reqres.in/"
    When Envio la informacion para la peticion "api/register"
      |email   | eve.holt@reqres.in|
      |password|pistol             |
    Then Valido la respuesta tenga status 200 id 4 y token "QpwL5tke4Pnpja7X4"
