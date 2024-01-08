package Pages;

import org.openqa.selenium.By;

public class CadastroLeitoresPage {

    private By subMenuLeitores =  By.xpath("//span[text()='Leitores']");
    private By btnNovoLeitor = By.id("button-new");
    private By campoNomeLeitor = By.id("txt-name");
    private By campoEnderecoIPLeitor = By.id("txt-ip");
    private By campoPortaLeitor = By.id("txt-port");
    private By campoRFID =

            By.xpath("//span[text()='Modo da Lista']");
}
