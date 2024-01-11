package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.*;
import Pages.Cadastros.CadastroLeitoresPage;
import Pages.Cadastros.MenuCadastroPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class CadastroLeitorLogic {

    Utils utils = new Utils();
    LoginPage loginPage = new LoginPage();

    MenuCadastroPage menuCadastroPage = new MenuCadastroPage();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroLeitoresPage cadastroLeitoresPage = new CadastroLeitoresPage();

    public void acessoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro();
    }

    public void menuCadastros()throws InterruptedException{
        menuCadastrosLogic.cadastros();

    }

    public void subMenuLeitores() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroLeitoresPage.getSubMenuLeitores());
    }

    public void cadastroNovoLeitor() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroLeitoresPage.getBtnNovoLeitor());
        utils.preencher(cadastroLeitoresPage.getCampoNomeLeitor(), "LEITOR 7");
        utils.preencher(cadastroLeitoresPage.getCampoEnderecoIPLeitor(), "123456");
        utils.preencher(cadastroLeitoresPage.getCampoPortaLeitor(), "123");
        utils.clicar(cadastroLeitoresPage.getCampoMododaLista());
        utils.clicar(cadastroLeitoresPage.getMododaListaNormal());
        utils.clicar(cadastroLeitoresPage.getCampoLimitacaodaLista());
        utils.clicar(cadastroLeitoresPage.getLimitacaoClear());
        utils.clicar(cadastroLeitoresPage.getCampoModoLeitor());
        utils.clicar(cadastroLeitoresPage.getNomeModoLeitor());
        utils.clicar(cadastroLeitoresPage.getCampoModoPesquisa());
        utils.clicar(cadastroLeitoresPage.getNomeModoPesquisa());
        utils.clicar(cadastroLeitoresPage.getCampoSessaoLeitor());
        utils.clicar(cadastroLeitoresPage.getNomeSessaoLeitor());
        utils.apagar(cadastroLeitoresPage.getCampoEstimativaTag());
        utils.preencher(cadastroLeitoresPage.getCampoEstimativaTag(), "5");
        utils.preencher(cadastroLeitoresPage.getCampoIDServidor(), "12365");
        utils.preencher(cadastroLeitoresPage.getCampoIPServidor(), "13625");
        utils.preencher(cadastroLeitoresPage.getCampoIdentificacaoServidor(), "35184");
        utils.clicar(cadastroLeitoresPage.getBtnSalvarLeitor());


    }
    public void validarNovoLeitor() throws InterruptedException {
        utils.pausa(2000);
        utils.validarTexto(cadastroLeitoresPage.getValidarCadastroLeitor(), "O leitor foi cadastrado com sucesso!");
        utils.fecharNavegador();
    }
}
