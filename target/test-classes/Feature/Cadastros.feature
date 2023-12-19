
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



