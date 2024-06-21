package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroData;
import pages.CadastroEmail;
import pages.CadastroNome;
import pages.CadastroSenha;
import pagesnegativo.CadastroSenhaNegativo;

import static org.junit.Assert.assertEquals;

public class CadastroSenhaTestNeg {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroData cadastroData;
    static CadastroEmail cadastroEmail;
    static CadastroSenhaNegativo cadastroSenhaNegativo;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");

        cadastroNome = new CadastroNome(driver);

        cadastroData = new CadastroData(driver);

        cadastroEmail = new CadastroEmail(driver);

        cadastroSenhaNegativo = new CadastroSenhaNegativo(driver);
    }

    @Test
    public void test(){
        cadastroNome.preencherCampo();
        cadastroData.preencherCampo();
        cadastroEmail.preencherCampo();
        cadastroSenhaNegativo.preencherCampo();
        assertEquals(cadastroSenhaNegativo.ValidarMensagemSenha(), "Digite uma senha");
    }

    @After
    public void tearDown() throws Exception {
    }
}
