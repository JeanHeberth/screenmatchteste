package br.com.screenmatchteste.pageTest;

import br.com.screenmatchteste.core.DriverFactory;
import br.com.screenmatchteste.page.CadastroPage;
import br.com.screenmatchteste.page.EditarPage;
import br.com.screenmatchteste.page.ListarPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExcluiFilmeTest {

    private WebDriver driver;
    private DriverFactory driverFactory = new DriverFactory();

    private ListarPage listarPage;
    private CadastroPage cadastroPage;
    private EditarPage editarPage;

    @BeforeMethod
    public void beforeMethod() {
        driver = driverFactory.setUp();
        listarPage = new ListarPage(driver);
        cadastroPage = new CadastroPage(driver);
        editarPage = new EditarPage(driver);
    }

    @AfterMethod
    public void afterMethod() {
        driverFactory.tearDown(driver);
    }

    @Test
    public void excluiFilme() {
        cadastroPage.clicaListar();
        for (int i = 0; i < 2; i++) {
            listarPage.excluiFilme();

        }
    }
}
