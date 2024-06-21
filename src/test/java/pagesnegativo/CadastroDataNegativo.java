package pagesnegativo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroDataNegativo {
    static WebDriver driver;
    static WebDriverWait wait;

    public CadastroDataNegativo(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void preencherCampo(){

        WebElement dia = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
        dia.sendKeys("");

        WebElement mes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
        mes.sendKeys("");
        mes.click();

        WebElement ano = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        ano.sendKeys("");

        WebElement genero = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender")));
        genero.sendKeys("");
        genero.click();

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        botaoAvancar.click();

    }

    public String ValidarMensagemData() {
        return driver.findElement(By.xpath("//div[contains(text(), 'Insira uma data de nascimento completa')]")).getText();
    }

    public String ValidarMensagemGenero() {


        return driver.findElement(By.xpath("//div[contains(text(), 'Selecione seu gênero')]")).getText();
    }

}
