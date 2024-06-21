package pagesnegativo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroNomeNegativo {
    static WebDriver driver;

    public CadastroNomeNegativo(WebDriver driver){
        this.driver = driver;
    }

    public void preencherCampo(){
        WebElement nome = driver.findElement(By.id("firstName"));
        nome.sendKeys("");

        WebElement sobrenome = driver.findElement(By.id("lastName"));
        sobrenome.sendKeys("");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        botaoAvancar.click();

    }
    public String ValidarMensagemNome() {
     return driver.findElement(By.xpath("//span[contains(text(), 'Digite o nome')]")).getText();
    }
}
