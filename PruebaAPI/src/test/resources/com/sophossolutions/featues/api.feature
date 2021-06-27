#Author: julian.rodriguez@sophossolutions.com

Feature: Realizar realizar prueba de API
  Yo quiero hacer una pruba de API con el metodo POST

  Scenario: Realizar registro de usuario con POST
    Given Quiero probar registro en la pagina "https://reqres.in/" en api "api/users/2" 
    When Envio informacion al endpoint "api/register"
      | email    | eve.holt@reqres.in |
      | password | pistol             |
    Then Valido que la respuesta tenga status 200
