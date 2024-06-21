package pagesnegativo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroEmailNegativo {
    static WebDriver driver;
    static WebDriverWait wait;

    public CadastroEmailNegativo(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void preencherCampo(){

        WebElement seletor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("selectionc4")));
        seletor.click();

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Username")));
        email.sendKeys("");

        WebElement botaoAvancar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Avançar')]")));
        botaoAvancar.click();

    }
    public String ValidarMensagemEmail() {
        return driver.findElement(By.xpath("//div[contains(text(), 'Digite um endereço do Gmail')]")).getText();
    }
}
