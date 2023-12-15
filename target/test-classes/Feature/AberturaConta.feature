
@aberturaconta
Feature: Abertura de conta
  I want to use this template for my feature file

  @pf
  Scenario: Abertura de conta pessoa fisica
    #Given que o usuario acesse a url "https://www.original.com.br/"
   # And selecionar o botao abrir conta
   # And selecionar o botao abrir conta para voce
   # When preencher o formulario de abertura de conta
   # And selecionar o botao quero ser cliente
   # Then sera exibido o texto falta pouco
    
 @pj
  Scenario: Abertura de conta pessoa juridica
    Given que o usuario acesse a url "https://www.original.com.br/"
    And selecionar o botao abrir conta
    And selecionar o botao abrir conta em para minha empresa
    And selecionar o botao abrir conta em pessoa unica
    When preencher o formulário de abertura de conta 
    And clicar no botão enviar
    Then sera exibido o texto falta pouco


