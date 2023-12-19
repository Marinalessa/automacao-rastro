package Utils;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	public static WebDriver driver;


	
	public void clicar (By elemento) {
	
	driver.findElement(elemento).click();
	}
	
	public void preencher (By elemento, String texto) {
	
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void pausa (int tempo)  throws InterruptedException{
		
		Thread.sleep(tempo);
	
	}
	
	
public void fecharNavegador ()  {
		
		driver.quit();
	
	}
	
public void abrirNavegador (String url)  {
	System.setProperty("webdriver.chrome.driver", "./Drive/chromedriver.exe");
driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();

}

public void validarTexto(By elemento, String texto) {
	
	
String TextoTela = driver.findElement(elemento).getText();

  assertEquals(texto, TextoTela);
  
  

}
	
	
}
