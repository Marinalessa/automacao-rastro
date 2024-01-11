@impressoes
Feature: Impressoes no Rastro app
  I want to use this template for my feature file

@impressaoavulsa
Scenario: Impressão Avulsa
  Given que o usuário faça login no Rastro
  When ir em impressoes e selecionar a aba Impressao Avulsa
  And preencher as informacoes da impressao Avulsa
  Then a impressao sera enviada com sucesso

