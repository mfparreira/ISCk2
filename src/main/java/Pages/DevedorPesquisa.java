package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DevedorPesquisa extends  BasePage {
    public DevedorPesquisa(WebDriver driver) {
        super(driver);
    }

    WebDriverWait espera = new WebDriverWait(driver, 20);

    WebElement campoCPF = espera.until( ExpectedConditions.elementToBeClickable(By.id("CPF_dev")));
    WebElement btnPesquisar = espera.until( ExpectedConditions.elementToBeClickable(By.id("submit1")));


    public void pesquisarDevedorPorCPF (String cpfPesquisar){
        campoCPF.click();
        campoCPF.sendKeys(cpfPesquisar);
        btnPesquisar.click();
    }
}
