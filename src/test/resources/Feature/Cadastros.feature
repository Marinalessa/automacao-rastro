
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
    Given que o usuário faça login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba usuarios
    And clicar em novo e inserir os dados do usuario
    Then aparecera a mensagem O usuário foi cadastrado com sucesso!

  @cadastroimpressora
  Scenario: Cadastro de impressora
    Given que o usuário faça login no Rastro e esteja no dashboard
    And ir em cadastro e selecionar a aba impressoras
    When clicar em novo e inserir os dados da impressora
    Then a impressora sera cadastrada

  @cadastroleitor
  Scenario: Cadastro de Leitor
    Given que o usuário faça login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba leitores
    And clicar em novo e inserir os dados do leitor
    Then o leitor será cadastrado com sucesso

  @cadastrospooler
  Scenario: Cadastro de Spooler
    Given que o usuário faça login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba Spoolers de Impressão
    And clicar em novo e inserir as informaçoes do novo Spooler
    Then o Spooler será cadastrado com sucesso

  @cadastroetiquetaitem
  Scenario: Cadastro de Etiqueta por Item
    Given que o usuário faça login no Rastro e esteja no dashboard
    When ir em cadastro, selecionar a aba Etiquetas e selecionar Item
    And clicar em novo e inserir as informacoes da nova etiqueta
    Then a etiqueta por item sera cadastrada com sucesso

  @cadastroetiquetaagregacao
  Scenario: Cadastro de Etiqueta por Agregação
    Given que o usuário faça login no Rastro e esteja no dashboard
    When ir em cadastro, selecionar a aba Etiquetas e selecionar agregacao
    And  clicar em novo e inserir as informacoes da nova etiqueta
    Then a etiqueta por item sera cadastrada com sucesso

  @cadastrocheckpoint
  Scenario: Cadastro de Checkpoint
    Given que o usuário faça login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba Checkpoints
    And clicar em novo e inserir as informacoes do novo checkpoint
    Then o checkpoint será cadastrado com sucesso






