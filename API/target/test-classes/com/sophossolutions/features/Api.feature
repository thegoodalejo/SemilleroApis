#Author: jonathan.castro@sophossolutions.com
Feature: Crear un Usuario usando Post
  Yo deseo aprender a consumir apis

  @tag1
  Scenario: Crear un usuario
    Given Deseo Crear un usuario en "https://reqres.in/"
    When Envio la información del usuario para "api/users"
      | name | pepitoPerez  |
      | job  | documentador |
    Then Valido que la respuesta tenga status 200 y contenga id 10
