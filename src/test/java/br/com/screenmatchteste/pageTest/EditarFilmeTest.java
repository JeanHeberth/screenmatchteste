package br.com.screenmatchteste.pageTest;

import br.com.screenmatchteste.core.DriverFactory;
import br.com.screenmatchteste.page.EditarPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditarFilmeTest {

    private DriverFactory driveFactory = new DriverFactory();
    private WebDriver driver;
    private EditarPage editarPage;


    @BeforeMethod
    public void beforeMethod(){
        driver = driveFactory.setUp();
        editarPage = new EditarPage(driver);
    }
    @AfterMethod
    public void afterMethod(){
        driveFactory.tearDown(driver);
    }

    @Test
    public void editarFilmeTeste(){
        editarPage.clicaBtnListar();
        editarPage.clicaBtnEditar();
        editarPage.limparCampos();
        editarPage.digitaNomeFilme("fsdafsa");
        editarPage.digitaDuracao("1203");
        editarPage.digitaAno("202232");
        editarPage.digitaGenero("Acadsdso");
        editarPage.clicaCadastrar();
//        editarPage.clicaNovo();
    }
}
