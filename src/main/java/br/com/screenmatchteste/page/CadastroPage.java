package br.com.screenmatchteste.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {

    private WebDriver driver;

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nome")
    private WebElement txtNome;
    @FindBy(id = "duracao")
    private WebElement txtDuracao;
    @FindBy(id = "ano")
    private WebElement txtAno;
    @FindBy(id = "genero")
    private WebElement txtGenero;

    @FindBy(id = "cadastrar")
    private WebElement btnCadastrar;
    @FindBy(id = "novo")
    private WebElement btnNovo;
    @FindBy(id = "listar")
    private WebElement btnListar;


    public void digitaNomeFilme(String nome) {
        txtNome.sendKeys(nome);
    }

    public void digitaDuracao(String duracao) {
        txtDuracao.sendKeys(duracao);
    }

    public void digitaAno(String ano) {
        txtAno.sendKeys(ano);
    }

    public void digitaGenero(String genero) {
        txtGenero.sendKeys(genero);
    }

    public void clicaCadastrar() {
        btnCadastrar.click();
    }

    public void clicaNovo() {
        btnNovo.click();
    }

    public void clicaListar() {
        btnListar.click();
    }
}

