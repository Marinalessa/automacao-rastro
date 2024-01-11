package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.MenuCadastroPage;
import Pages.Cadastros.CadastroProdutosGS1Page;
import Pages.LoginPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class CadastroProdutosGS1Logic {



        Utils utils = new Utils();
        LoginPage loginPage = new LoginPage();
        CadastroProdutosGS1Page cadastroProdutosGS1Page = new CadastroProdutosGS1Page();
        MenuCadastroPage menuCadastroPage = new MenuCadastroPage();
        LoginLogic loginLogic = new LoginLogic();
        MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();


        public void acessoAoRastro() throws InterruptedException {
            loginLogic.acessoAoRastro();


        }

        public void menuCadastros()throws InterruptedException{
            menuCadastrosLogic.cadastros();

        }

        public void subMenuProdutos() throws InterruptedException {
            WebDriver driver;
            utils.pausa(2000);
            utils.clicar(cadastroProdutosGS1Page.getSubMenuProduto());


        }

    public void cadastrarNovoProduto() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroProdutosGS1Page.getBtnNovoProduto());
        utils.pausa(2000);
        utils.preencher(cadastroProdutosGS1Page.getCampoSKU(), "1324567");
        utils.preencher(cadastroProdutosGS1Page.getCampoGTIN(), "05602185700017");
        utils.preencher(cadastroProdutosGS1Page.getCampoDescricao(), "produto teste automacao");
        utils.preencher(cadastroProdutosGS1Page.getCampoCategoria(), "categoria teste automacao");
        utils.clicar(cadastroProdutosGS1Page.getBtnSalvar());
    }


    public void validarCadastroProduto() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.validarTexto(cadastroProdutosGS1Page.getTxtCadastroProduto(), "O produto foi cadastrado com sucesso!");
        utils.fecharNavegador();
    }

}
