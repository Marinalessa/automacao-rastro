package Pages;
import org.openqa.selenium.By;
public class CadastroPage {
    private By menuCadastros = By.xpath("//span[text()='Cadastros']");
    public By getMenuCadastros() {
        return menuCadastros;
    }

}
