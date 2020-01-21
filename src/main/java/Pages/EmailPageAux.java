package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailPageAux extends BasePage {
    public EmailPageAux(WebDriver driver) {
        super(driver);
    }


    WebDriverWait espera = new WebDriverWait(driver, 20);
    WebElement novoEmailBtn = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm_ate_atender_cab_gr\"]/font/table[2]/tbody/tr/td/u/a")));

    public void cadastrarNovoEmailAux (){
        novoEmailBtn.click();
    }
}
