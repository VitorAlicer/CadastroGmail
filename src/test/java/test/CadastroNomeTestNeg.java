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
import pagesnegativo.CadastroNomeNegativo;

import static org.junit.Assert.assertEquals;

public class CadastroNomeTestNeg {
    static WebDriver driver;
    static CadastroNomeNegativo cadastroNomeNegativo;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");

        cadastroNomeNegativo = new CadastroNomeNegativo(driver);
    }

    @Test
    public void test(){
        cadastroNomeNegativo.preencherCampo();
        assertEquals(cadastroNomeNegativo.ValidarMensagemNome(), "Digite o nome");
    }

    @After
    public void tearDown() throws Exception {
    }
}

