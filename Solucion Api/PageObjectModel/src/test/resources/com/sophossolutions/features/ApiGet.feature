#Autor: maria.cala@sophossolutions.com
Feature: Realizar get
  Yo quiero realizar una peticion get

  Scenario: Hacer peticion Get
    Given Quiero hacer una peticion en la api "https://reqres.in/"
    When Envio peticion "/api/users?page=2"
    Then Valido la respuesta 200