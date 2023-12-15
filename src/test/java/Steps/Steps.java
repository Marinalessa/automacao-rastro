package Steps;

import org.openqa.selenium.By;

import Pages.Page;
import Logic.Logic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Logic l = new Logic();
	Page p = new Page();

	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
		l.abrirNavegador(url);
	
	}

	@Given("selecionar o botao abrir conta")
	public void selecionar_o_botao_abrir_conta() {
		
		l.clicar(p.getBtnAbrirConta());
	}

	@Given("selecionar o botao abrir conta para voce")
	public void selecionar_o_botao_abrir_conta_para_voce() {
		l.clicar(p.getBtnAbrirContaParaVoce());
	}

	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() {
		l.preencher(p.getCampoNome(), "Marina");
		l.preencher(p.getCampoTelefone(), "123945698125");
		l.preencher(p.getCampoEmail(), "teste@teste.com.br");
		l.preencher(p.getCampoCpf(), "30104479060");
	}
	
	
	@When("selecionar o botao quero ser cliente")
	public void selecionar_o_botao_quero_ser_cliente() {
		l.clicar(By.id("onetrust-accept-btn-handler"));

		l.clicar(p.getBtnQueroSerCliente());

	}

	@Then("sera exibido o texto falta pouco")
	public void sera_exibido_o_texto_falta_pouco() throws InterruptedException {
		l.pausa(2000);
		l.validarTexto(p.getTextoFaltaPouco(), "Falta pouco!");
		l.fecharNavegador();
	}
	@Given("selecionar o botao abrir conta em para minha empresa")
	public void selecionar_o_botao_abrir_conta_em_para_minha_empresa() {
	    
	}

	@Given("selecionar o botao abrir conta em pessoa unica")
	public void selecionar_o_botao_abrir_conta_em_pessoa_unica() {
	    
	}

	@When("preencher o formulário de abertura de conta")
	public void preencher_o_formulário_de_abertura_de_conta() {
	   
	}

	@When("clicar no botão enviar")
	public void clicar_no_botão_enviar() {
	    
	}

	
}
