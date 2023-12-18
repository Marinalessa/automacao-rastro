package Steps;

import Logic.Logic;
import Pages.CadastroProdutosGS1Page;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class CadastroProdutosGS1Steps {
    private LoginStep loginStep;
    public void LoginStep(){
        loginStep = new LoginStep();
    }

    Logic l = new Logic();
    LoginPage lp = new LoginPage();
    CadastroProdutosGS1Page cp1 = new CadastroProdutosGS1Page();

    @Given("que o usuario faça o login no Rastro")
    public void que_o_usuario_faça_o_login_no_Rastro()throws InterruptedException {

            String url = "https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login";
            l.abrirNavegador(url);

            l.pausa(2000);
            l.preencher(lp.getCampoUsuario(), "marina.lessa@rastreabilidadebrasil.com.br");
            l.preencher(lp.getCampoSenha(), "102030");
            l.clicar(lp.getBtnEntrar());

            l.pausa(2000);
            l.clicar(lp.getBtnEscolhaUmSite());
            l.clicar(lp.getBtnSite());
            l.clicar(lp.getBtnEntrarSite());

            l.pausa(2000);
            l.validarTexto(lp.getTxtDashboard(), "Dashboard");




    }
    @When("ir em cadastro e selecionar a aba produtos")
    public void ir_em_cadastro_e_selecionar_a_aba_produtos()throws InterruptedException {

        l.pausa(2000);
        l.clicar(cp1.getMenuCadastros());
        l.pausa(2000);
        l.clicar(cp1.getSubMenuProduto());
        l.pausa(2000);

    }
    @Then("ele ira selecionar novo")
    public void ele_ira_selecionar_novo() {
        l.clicar(cp1.getBtnNovoProduto());

    }
    @Then("ira adicionar um SKU, um GTIN, uma descricao, uma categoria e salvar o produto")
    public void ira_adicionar_um_SKU_um_GTIN_uma_descricao_uma_categoria_e_salvar_o_produto() throws InterruptedException {
            l.preencher(cp1.getCampoSKU(), "1324567");
            l.preencher(cp1.getCampoGTIN(), "05602185700017");
            l.preencher(cp1.getCampoDescricao(),"produto teste automacao");
            l.preencher(cp1.getCampoCategoria(), "categoria teste automacao");
            l.clicar(cp1.getBtnSalvar());
        l.pausa(2000);
            l.validarTexto(cp1.getTxtCadastroProduto(), "O produto foi cadastrado com sucesso!");
            l.fecharNavegador();
    }
}
