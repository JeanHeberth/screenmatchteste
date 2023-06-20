package br.com.screenmatchteste.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public WebDriver setUp() {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://localhost:8088/filmes/formulario");
        return driver;
    }

    public void tearDown(WebDriver driver){
        driver.quit();
    }
}
