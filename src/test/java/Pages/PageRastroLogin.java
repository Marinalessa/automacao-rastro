package Pages;


import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Getter
public class PageRastroLogin {

    @FindBy( id = "username")
    private WebElement campoUsuario;

    @FindBy(id = "password")
    private WebElement campoSenha;

    @FindBy(id="login-button")
    private WebElement btnEntrar;

    @FindBy(xpath ="//span[text()='Esqueceu sua senha? Clique aqui.']")
    private WebElement btnEsqueciASenha;

    @FindBy(id="txt-name")
    private WebElement campoEmailRecSenha;

    @FindBy(xpath = "//span[text()='Enviar']")
    private WebElement btnEnviarRecSenha;

    @FindBy(xpath = "//span[text()='Escolha um site']")
    private WebElement btnEscolhaUmSite;

   // @FindBy(class ="p-ripple p-element p-dropdown-item") //migrar para elemento unico
    private WebElement btnSite;

    @FindBy(xpath = "//span[text()='Entrar']")
    private WebElement btnEntrarSite;

    @FindBy(xpath ="//span[text()='Dashboard']")
    private WebElement txtDashboard;
}
