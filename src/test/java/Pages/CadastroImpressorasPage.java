package Pages;

import org.openqa.selenium.By;

public class CadastroImpressorasPage {
    private By subMenuImpressoras =  By.xpath("//*[@id='MENU.PRINTERS']/a");
    private By btnNovaImpressora = By.xpath("//*[@id='button-new']");

    private By campoNomeImpressora = By.id("txt-name");
    private By campoEnderecoIP = By.id("txt-ipAddress");
    private By campoPorta = By.id("txt-portNumber");
    private By campoTempoSpooler = By.id("time-spooler");
    private By campoModelo = By.xpath("//*[@id='printer-list']/div/div[2]");
    private By selectModelo = By.xpath("//*[@id='pr_id_40_list']/p-dropdownitem[1]/li");
    private By campoDescricao = By.id("txt-descriptionName");
    private By btnSalvarImpressora = By.xpath("//*[@id='button-save']");
    private By txtCadastroImpressora = By.xpath("//p[text()='A impressora foi cadastrado com sucesso!']");

    public By getSubMenuImpressoras() {
        return subMenuImpressoras;
    }

    public By getCampoNomeImpressora() {
        return campoNomeImpressora;
    }

    public By getCampoEnderecoIP() {
        return campoEnderecoIP;
    }

    public By getCampoPorta() {
        return campoPorta;
    }

    public By getCampoTempoSpooler() {
        return campoTempoSpooler;
    }

    public By getCampoModelo() {
        return campoModelo;
    }

    public By getSelectModelo() {
        return selectModelo;
    }

    public By getCampoDescricao() {
        return campoDescricao;
    }

    public By getBtnSalvarImpressora() {
        return btnSalvarImpressora;
    }

    public By getBtnNovaImpressora() {
        return btnNovaImpressora;
    }

    public By getTxtCadastroImpressora() {
        return txtCadastroImpressora;
    }
}
