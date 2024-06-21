package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroNome;
import pagesnegativo.CadastroDataNegativo;

import static org.junit.Assert.assertEquals;

public class CadastroDataTestNeg {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroDataNegativo cadastroDataNegativo;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");

        cadastroNome = new CadastroNome(driver);
        cadastroDataNegativo = new CadastroDataNegativo(driver);
    }

    @Test
    public void test(){
        cadastroNome.preencherCampo();
        cadastroDataNegativo.preencherCampo();
        assertEquals(cadastroDataNegativo.ValidarMensagemData(), "Insira uma data de nascimento completa");
        assertEquals(cadastroDataNegativo.ValidarMensagemGenero(), "Selecione seu gênero");
    }

    @After
    public void tearDown() throws Exception {
    }
}
