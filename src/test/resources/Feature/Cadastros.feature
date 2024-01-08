
@cadastros
Feature: Cadastros no Rastro app
  I want to use this template for my feature file



  @cadastroproduto
  Scenario: Cadastro de produto
    Given que o usuario faça o login no Rastro
    When ir em cadastro e selecionar a aba produtos
    And ele ira selecionar novo e preencher os campos obrigatorios
    Then sera exibida a mensagem O produto foi cadastrado com sucesso

  @cadastrosite
  Scenario: Cadastro de site
    Given que o usuário faça o login e esteja no dashboard
    When ir em cadastro e selecionar a aba sites
    And clilcar em novo e inserir os dados solicitados
    Then aparecera a mensagem "O site foi cadastrado com sucesso!"

  @cadastrousuario
  Scenario: Cadastro de usuario
    Given que o usuário faça o login e esteja no dashboard



    When ir em cadastro e selecionar a aba usuarios
    And clicar em novo e inserir os dados do usuario
    Then aparecera a mensagem O usuário foi cadastrado com sucesso!

  @cadastroimpressora
  Scenario: Cadastro de impressora
    Given que o usuário faça o login e esteja no dashboard
    And ir em cadastro e selecionar a aba impressoras
    When clicar em novo e inserir os dados da impressora
    Then a impressora sera cadastrada






