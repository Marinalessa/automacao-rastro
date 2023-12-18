
@cadastros
Feature: Cadastros no Rastro app
  I want to use this template for my feature file



  @cadastroproduto
  Scenario: Cadastro de produto
    Given que o usuario faça o login no Rastro
    When ir em cadastro e selecionar a aba produtos
    Then ele ira selecionar novo
    And ira adicionar um SKU, um GTIN, uma descricao, uma categoria e salvar o produto

  @cadastrosite
  Scenario: Cadastro de site


