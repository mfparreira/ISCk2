package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailPage extends BasePage {
    public EmailPage(WebDriver driver) {
        super(driver);
    }

    //Tempo de espera do elemento em tela
    WebDriverWait espera = new WebDriverWait(driver, 20);

    WebElement novoEmailInserir = espera.until( ExpectedConditions.elementToBeClickable(By.id("Email1")));
    WebElement confirmarEmailBtn = espera.until( ExpectedConditions.elementToBeClickable(By.id("Incluir1")));


    public void cadastrarEmail (String newEmail){

        novoEmailInserir.click();
        novoEmailInserir.sendKeys(newEmail);
        confirmarEmailBtn.click();

    }
}
