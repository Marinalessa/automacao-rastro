package Steps.Cadastros;

import Logic.Cadastros.CadastroImpressoraLogic;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroImpressoraStep {

Utils utils = new Utils();
CadastroImpressoraLogic cadastroImpressorasLogic = new CadastroImpressoraLogic();
    @Given("ir em cadastro e selecionar a aba impressoras")
    public void ir_em_cadastro_e_selecionar_a_aba_impressoras() throws InterruptedException {

        cadastroImpressorasLogic.subMenuImpressoras();


    }
    @When("clicar em novo e inserir os dados da impressora")
    public void clicar_em_novo_e_inserir_os_dados_da_impressora() throws InterruptedException {
        cadastroImpressorasLogic.cadastrarNovaImpressora();


    }
    @Then("a impressora sera cadastrada")
    public void a_impressora_sera_cadastrada() throws InterruptedException {
        cadastroImpressorasLogic.validarCadastroImpressora();


    }
}
