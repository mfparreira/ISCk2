package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionPage extends BasePage {
    public QuestionPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait espera = new WebDriverWait(driver, 20);

    WebElement refinanciar1 = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Consignado\"]")));
    WebElement refinanciar2 = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"CreditoDireto\"]")));
    WebElement avancarBtn = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divFormulario\"]/div/h5/div[6]/button")));


    public void responderPesquisa (){
        refinanciar1.click();
        refinanciar2.click();
        avancarBtn.click();
    }
}
