Feature: Listar usuarios metodo Get
  Yo quiero aprender a consumir apis para automatizar las peticiones

  Scenario: Listar usuarios Get
    Given Quiero realizar una consulta en la api "https://reqres.in/"
    When Solicito la informacion de los usuarios para el endpoint "api/users?page=2"
    Then Valido que la respuesta tenga status 200 y contenga total "12"