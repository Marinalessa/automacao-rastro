package Logic;

import Pages.CadastroPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;


public class CadastrosLogic {

private WebDriver driver = null;
private final Utils utils;
private final CadastroPage cadastroPage;




    public CadastrosLogic() {
        this.driver = driver;
        this.utils = new Utils();
        this.cadastroPage = new CadastroPage();
    }


    public void cadastros() throws InterruptedException {




        utils.pausa(2000);
        utils.clicar(cadastroPage.getMenuCadastros());


    }


}