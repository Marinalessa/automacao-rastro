package Logic;

import Pages.CadastroUsuarioPage;
import Utils.Utils;

public class CadastroUsuarioLogic {
    CadastroUsuarioPage cadastroUsuarioPage = new CadastroUsuarioPage();
    Utils utils = new Utils();


    public void acessarOSubMenuUsuarios(){
        utils.clicar(cadastroUsuarioPage.getSubMenuUsuario());

    }

    public String incluirNovoUsuario() throws InterruptedException {
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
        String nome = incluirNovoUsuario();


    }
}
