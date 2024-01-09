package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.CadastroUsuarioPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class CadastroUsuarioLogic {
    CadastroUsuarioPage cadastroUsuarioPage = new CadastroUsuarioPage();
    CadastrosLogic cadastrosLogic = new CadastrosLogic();
    Utils utils = new Utils();
    LoginLogic loginLogic = new LoginLogic();

    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro();


    }

    public void menuCadastros()throws InterruptedException{
        cadastrosLogic.cadastros();

    }
    public void acessarOSubMenuUsuarios() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroUsuarioPage.getSubMenuUsuario());

    }

    public String incluirNovoUsuario() throws InterruptedException {
        WebDriver driver;
        String nome = "Marina Teste";
        utils.clicar(cadastroUsuarioPage.getBtnNovoUsuario());
        utils.preencher(cadastroUsuarioPage.getCampoNomeUsuario(), (nome));
        utils.preencher(cadastroUsuarioPage.getCampoUsuario(), "teste@teste.com.br");
        utils.preencher(cadastroUsuarioPage.getCampoEmail(), "teste@teste.com.br");
        utils.preencher(cadastroUsuarioPage.getCampoSenha(), "102030");
        utils.preencher(cadastroUsuarioPage.getCampoConfirmeSenha(), "102030");
        utils.clicar(cadastroUsuarioPage.getBtnAdm());
        utils.clicar(cadastroUsuarioPage.getBtnUserMatriz());
        utils.clicar(cadastroUsuarioPage.getBtnSalvarNovoUsuario());
        utils.pausa(2000);
        utils.validarTexto(cadastroUsuarioPage.getTxtCadastroUsuario(), "O usuário foi cadastrado com sucesso!");
        utils.clicar(cadastroUsuarioPage.getBtnOK());
        utils.validarTexto(cadastroUsuarioPage.getColumUserName(), (nome));
        return nome;
    }


   public void validarCadastroUsuario() throws InterruptedException {
       WebDriver driver;
       utils.pausa(2000);
       utils.validarTexto(cadastroUsuarioPage.getTxtCadastroUsuario(), "O usuário foi cadastrado com sucesso!");
   }


    }

