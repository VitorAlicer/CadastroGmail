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
import pagesnegativo.CadastroEmailNegativo;

public class CadastroEmailTestNeg {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroData cadastroData;
    static CadastroEmailNegativo cadastroEmailNegativo;


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

        cadastroEmailNegativo = new CadastroEmailNegativo(driver);


        cadastroNome.preencherCampo();
        cadastroData.preencherCampo();
        cadastroEmailNegativo.preencherCampo();

    }

    @After
    public void tearDown() throws Exception {
    }
}