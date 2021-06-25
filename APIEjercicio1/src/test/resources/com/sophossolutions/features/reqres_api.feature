#Author: angel.vivas@sophossolutions.com
Feature: Realizar registros en la api reqres
  Yo como automatizador quiero hacer un registro en la api reqres

  Scenario: Realizar registro en la api reqres.in
    Given Quiero realizar un registro en la api "https://reqres.in/"
    When Envio la información del usuario para el endpoint "api/register"
        | email | sydney@fife |
    Then Valido que la respuesta tenga status 400 y contenga error "Missing password"
    