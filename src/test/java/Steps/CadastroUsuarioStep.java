package Steps;

import Logic.CadastroUsuarioLogic;
import Logic.CadastrosLogic;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroUsuarioStep {
    CadastroUsuarioLogic cadastroUsuarioLogic = new CadastroUsuarioLogic();
    CadastrosLogic cadastrosLogic = new CadastrosLogic();
    Utils utils = new Utils();

    @Given("que o usuário faça o login e esteja no dashboard1")
    public void que_o_usuário_faça_o_login_e_esteja_no_dashboard1()throws InterruptedException {
        String url = "https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login";
        cadastroUsuarioLogic.acessoAoRastro();}

        @When("ir em cadastro e selecionar a aba usuarios")
    public void ir_em_cadastro_e_selecionar_a_aba_usuarios() throws InterruptedException {

        cadastroUsuarioLogic.menuCadastros();
        utils.pausa(2000);
        cadastroUsuarioLogic.acessarOSubMenuUsuarios();


    }
    @When("clicar em novo e inserir os dados do usuario")
    public void clicar_em_novo_e_inserir_os_dados_do_usuario() throws InterruptedException {
        cadastroUsuarioLogic.incluirNovoUsuario();

    }
    @Then("aparecera a mensagem O usuário foi cadastrado com sucesso!")
    public void aparecera_a_mensagem_o_usuário_foi_cadastrado_com_sucesso() throws InterruptedException {
        cadastroUsuarioLogic.validarCadastroUsuario();


    }
}
