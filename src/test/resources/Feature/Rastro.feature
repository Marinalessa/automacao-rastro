@web

Feature: Acesso ao Rastro

  @login
  Scenario: Login no Rastro
    Given que eu acesso o Rastro
    When inserir usuário e senha
    And escolher um site
    Then serei direcionado ao Dashboard