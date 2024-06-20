package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroNome;
import pagesnegativo.CadastroDataNegativo;

public class CadastroDataTestNeg {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroDataNegativo cadastroDataNegativo;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");

        cadastroNome = new CadastroNome(driver);

        cadastroDataNegativo = new CadastroDataNegativo(driver);

        cadastroNome.preencherCampo();
        cadastroDataNegativo.preencherCampo();

    }

    @After
    public void tearDown() throws Exception {
    }
}
