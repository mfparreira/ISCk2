package Pages;

import Suporte.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbasPage  extends BasePage {
    public AbasPage(WebDriver driver) {
        super(driver);
    }

    //Tempo de espera do elemento em tela
    WebDriverWait espera = new WebDriverWait(driver, 20);

    WebElement abaPhone = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form1\"]/div/table/tbody/tr[2]/td[5]/a")));
    WebElement abaemail = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form1\"]/div/table/tbody/tr[2]/td[8]/a")));
    WebElement abaEndereco = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form1\"]/div/table/tbody/tr[2]/td[11]/a")));
    WebElement abaTitulos = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form1\"]/div/table/tbody/tr[2]/td[14]/a")));
    WebElement abaAcordo = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form1\"]/div/table/tbody/tr[2]/td[17]/a")));
    WebElement abaPagamento = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form1\"]/div/table/tbody/tr[2]/td[20]/a")));
    WebElement abaHistorico = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form1\"]/div/table/tbody/tr[2]/td[23]/a")));



    public void acessarAbaPhone() {

        abaPhone.click();
    }


    public void acessarAbaEmail() {

        abaemail.click();
    }


    public void acessarAbaEndereco() {

        abaEndereco.click();
    }

    public void acessarAbaTitulo() {

        abaTitulos.click();
    }

    public void acessarAbaAcordo() {

        abaAcordo.click();
    }

    public void acessarAbaPagamento() {

        abaPagamento.click();
    }

    public void acessarAbaHistorico() {

        abaHistorico.click();
    }
}
