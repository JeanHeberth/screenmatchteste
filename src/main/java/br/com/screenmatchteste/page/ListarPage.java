package br.com.screenmatchteste.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListarPage {

    private WebDriver driver;


    public ListarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "excluir")
    private WebElement btnExcluir;

    public void excluiFilme() {
        btnExcluir.click();
    }


}
