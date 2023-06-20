package br.com.screenmatchteste.pageTest;

import br.com.screenmatchteste.core.DriverFactory;
import br.com.screenmatchteste.page.CadastroPage;
import br.com.screenmatchteste.page.ListarPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CadastroFilmeTest {

    CadastroPage cadastroPage;
    ListarPage listarPage;
    private DriverFactory driverFactory = new DriverFactory();
    private WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {
        driver = driverFactory.setUp();
        cadastroPage = new CadastroPage(driver);
        listarPage = new ListarPage(driver);
    }

    @AfterMethod
    public void afterMethod() {
        driverFactory.tearDown(driver);
    }

    @Test
    public void insereFilme() {

        for (int i = 0; i < 200; i++) {
            cadastroPage.digitaNomeFilme("Jean Heberth");
            cadastroPage.digitaDuracao("120");
            cadastroPage.digitaAno("2022");
            cadastroPage.digitaGenero("Acao");
            cadastroPage.clicaCadastrar();
            cadastroPage.clicaNovo();

        }
    }

}
