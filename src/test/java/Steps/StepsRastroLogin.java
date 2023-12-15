package Steps;

import Logic.Logic;
import Pages.PageRastroLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class StepsRastroLogin {

    Logic l = new Logic();
    PageRastroLogin p1 = new PageRastroLogin();
    @Given("que eu acesso o Rastro")
    public void que_eu_acesso_o_rastro() {
        String url = null;
        l.abrirNavegador(url);
        url = "https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login";
    }
    @When("inserir usuário e senha")
    public void inserir_usuário_e_senha() {
        l.preencher((By) p1.getCampoUsuario(), "marina.lessa@rastreabilidadebrasil.com.br");
        l.preencher((By) p1.getCampoSenha(), "102030");
        l.clicar((By)p1.getBtnEntrar());

    }
    @When("escolher um site")
    public void escolher_um_site() {
        l.clicar((By) p1.getBtnEscolhaUmSite());
        l.clicar((By) p1.getBtnSite());
        l.clicar((By) p1.getBtnEntrarSite());

    }
    @Then("serei direcionado ao Dashboard")
    public void serei_direcionado_ao_dashboard() {
        l.validarTexto((By) p1.getTxtDashboard(), "Dashboard");
    }

}
