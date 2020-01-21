package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionPage2 extends  BasePage {
    public QuestionPage2(WebDriver driver) {
        super(driver);
    }

    WebDriverWait espera = new WebDriverWait(driver, 20);

    WebElement telefoneInserir = espera.until( ExpectedConditions.elementToBeClickable(By.id("TelefoneConfirmado")));
    WebElement confirmarTelefoneAcordo = espera.until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divTelefone\"]/div/h5/div[4]/button"))));

    public void inserirTelefoneAcordo(String telInserir){
        telefoneInserir.click();
        telefoneInserir.sendKeys(telInserir);
        confirmarTelefoneAcordo.click();
    }
}
