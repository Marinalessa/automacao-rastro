package Pages;

import Logic.CadastroUsuarioLogic;
import org.openqa.selenium.By;

public class CadastroUsuarioPage {
    CadastroUsuarioLogic cadastroUsuarioLogic = new CadastroUsuarioLogic();
    private By subMenuUsuario = By.xpath("//span[text()='Usuários']");
    private By btnNovoUsuario = By.id("button-new");
    private By campoNomeUsuario = By.id("txt-name");
    private By campoUsuario = By.id("txt-username");
    private By campoEmail = By.id("txt-email");
    private By campoSenha = By.id("txt-password");
    private By campoConfirmeSenha = By.id("txt-password-confirm");
    private By btnAdm = By.xpath("//p-inputswitch[@id='chk-is-admin']//following::span[@class='p-inputswitch-slider']");
    private By btnUserMatriz = By.xpath("//p-inputswitch[@id='chk-is-matrix']//following::span[@class='p-inputswitch-slider']");
    private By btnSalvarNovoUsuario = By.id("button-save");
    private By txtCadastroUsuario = By.xpath("//p[text()='O usuário foi cadastrado com sucesso!']");
    private By btnOK = By.id("button-ok");

    private By columUserName = By.id("column-user");


    public By getSubMenuUsuario() {
        return subMenuUsuario;
    }

    public By getBtnNovoUsuario() {
        return btnNovoUsuario;
    }

    public By getCampoNomeUsuario() {
        return campoNomeUsuario;
    }

    public By getCampoUsuario() {
        return campoUsuario;
    }

    public By getCampoEmail() {
        return campoEmail;
    }

    public By getCampoSenha() {
        return campoSenha;
    }

    public By getCampoConfirmeSenha() {
        return campoConfirmeSenha;
    }

    public By getBtnAdm() {
        return btnAdm;
    }

    public By getBtnUserMatriz() {
        return btnUserMatriz;
    }

    public By getBtnSalvarNovoUsuario() {
        return btnSalvarNovoUsuario;
    }

    public By getTxtCadastroUsuario() {
        return txtCadastroUsuario;
    }

    public By getBtnOK() {
        return btnOK;
    }

    public By getColumUserName() {
        return columUserName;
    }
}

