package Pages;

import Suporte.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhonePage extends BasePage {
    public PhonePage(WebDriver driver) {
        super(driver);
    }

    //Tempo de espera do elemento em tela
    WebDriverWait espera = new WebDriverWait(driver, 20);

    //mapear elementos da pagina de telefone do devedor
    WebElement dddAdd = espera.until(ExpectedConditions.elementToBeClickable(By.id("txtDDD1")));
    WebElement phoneAdd = espera.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"txtTEL1\"]")));
    WebElement confirmPhone = espera.until(ExpectedConditions.elementToBeClickable(By.id("cmdGravar")));

    // metodo que valida o cadastro de telefone do devedor
    public void cadastrarPhone (String ddd, String phone) {

        dddAdd.click();
        dddAdd.sendKeys(ddd);
        phoneAdd.click();
        phoneAdd.sendKeys();

        confirmPhone.click();


    }
}
