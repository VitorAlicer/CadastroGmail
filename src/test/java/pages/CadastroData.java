package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroData {
    static WebDriver driver;

    public CadastroData(WebDriver driver){
        this.driver = driver;
    }

    public void preencherCampo(){

        WebElement dia = driver.findElement(By.id("day"));
        dia.sendKeys("12");

        WebElement mes = driver.findElement(By.xpath("//span[contains(text(), '" + "Agosto" + "')]"));
        mes.click();

        WebElement ano = driver.findElement(By.id("year"));
        dia.sendKeys("1975");

        WebElement genero = driver.findElement(By.xpath("//span[contains(text(), '" + "Homem" + "')]"));
        genero.click();

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        botaoAvancar.click();

    }
}
