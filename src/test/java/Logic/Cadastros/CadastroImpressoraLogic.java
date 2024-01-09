package Logic.Cadastros;

import Pages.Cadastros.CadastroImpressorasPage;
import Utils.Utils;

public class CadastroImpressoraLogic {
    Utils utils = new Utils();
    CadastrosLogic cadastrosLogic = new CadastrosLogic();
    CadastroImpressorasPage cadastroImpressorasPage = new CadastroImpressorasPage();
    public void subMenuImpressoras() throws InterruptedException {
        cadastrosLogic.cadastros();
        utils.clicar(cadastroImpressorasPage.getSubMenuImpressoras());

    }

    public void cadastrarNovaImpressora() throws InterruptedException {
        utils.clicar(cadastroImpressorasPage.getBtnNovaImpressora());
        utils.pausa(2000);
        utils.preencher(cadastroImpressorasPage.getCampoNomeImpressora(), "Impressora Teste"); //consigo incluir letras, numeros, simbolos, até 100 caracteres
        utils.preencher(cadastroImpressorasPage.getCampoEnderecoIP(), "693258122222222222/96.9644787"); //consigo incluir letras, numeros, simbolos, até 255 caracteres
        utils.preencher(cadastroImpressorasPage.getCampoPorta(), "96532658712"); // até 11 caracteres, somente numeros
        utils.preencher(cadastroImpressorasPage.getCampoTempoSpooler(), "10000"); // até 9 caratcteres, somente números - 1 segundo = 100
        utils.pausa(1000);
        utils.clicar(cadastroImpressorasPage.getCampoModelo());
        utils.pausa(1000);
        utils.clicar(cadastroImpressorasPage.getSelectModelo());
        utils.preencher(cadastroImpressorasPage.getCampoDescricao(), "descrição teste automação");
        utils.clicar(cadastroImpressorasPage.getBtnSalvarImpressora());
    }

    public void validarCadastroImpressora() throws InterruptedException {
        utils.pausa(2000);
        utils.validarTexto(cadastroImpressorasPage.getTxtCadastroImpressora(), "O usuário foi cadastrado com sucesso!");    }
}
