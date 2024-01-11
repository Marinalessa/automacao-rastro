package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.MenuCadastroPage;
import Pages.Cadastros.CadastroProdutosGS1Page;
import Pages.Cadastros.CadastroSitesPage;
import Pages.LoginPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class CadastroSitesLogic {



    Utils utils = new Utils();
    LoginPage loginPage = new LoginPage();
    CadastroProdutosGS1Page cadastroProdutosGS1Page = new CadastroProdutosGS1Page();
    MenuCadastroPage menuCadastroPage = new MenuCadastroPage();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroSitesPage cadastroSitesPage = new CadastroSitesPage();


    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro();


    }

    public void menuCadastros()throws InterruptedException{
        menuCadastrosLogic.cadastros();

    }

    public void subMenuSites() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroSitesPage.getSubMenuSites());


    }

    public void cadastrarNovoSite() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroSitesPage.getBtnNovoSite());
        utils.pausa(2000);
        utils.preencher(cadastroSitesPage.getCampoNomeSite(), "TESTE 2");
        utils.preencher(cadastroSitesPage.getCampoCNPJ(), "78946325986541");
        utils.clicar(cadastroSitesPage.getBtnSalvarSite());

    }


    public void validarCadastrSite() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.validarTexto(cadastroSitesPage.getTxtCadastroSite(), "O site foi cadastrado com sucesso!");
        utils.fecharNavegador();


    }

}
