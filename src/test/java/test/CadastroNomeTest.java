package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CadastroData;
import pages.CadastroEmail;
import pages.CadastroNome;
import pages.CadastroSenha;

import java.time.Duration;

public class CadastroNomeTest {

    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroData cadastroData;
    static CadastroEmail cadastroEmail;
    static CadastroSenha cadastroSenha;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");

        cadastroNome = new CadastroNome(driver);

        cadastroData = new CadastroData(driver);

        cadastroEmail = new CadastroEmail(driver);

        cadastroSenha = new CadastroSenha(driver);

        cadastroNome.preencherCampo();
        cadastroData.preencherCampo();
        cadastroEmail.preencherCampo();
        cadastroSenha.preencherCampo();
    }

    @After
    public void tearDown() throws Exception {
    }
}