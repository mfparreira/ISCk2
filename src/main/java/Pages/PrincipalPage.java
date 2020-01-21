package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrincipalPage extends  BasePage{
    public PrincipalPage(WebDriver driver) {
        super(driver);
    }


    //Tempo de espera do elemento em tela
    WebDriverWait espera = new WebDriverWait(driver, 20);

    WebElement Atendimento = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[2]/td/a")));
    WebElement Aplicativos = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[3]/td/a")));
    WebElement Balcao = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[4]/td/a")));
    WebElement Caixa = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[5]/td/a")));
    WebElement Cobranca = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[6]/td/a")));
    WebElement Distribuicao = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[7]/td/a")));
    WebElement Discador = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[8]/td/a")));
    WebElement Configuracoes = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[9]/td/a")));
    WebElement Relatorios = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[10]/td/a")));
    WebElement RelatoriosLayout = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[11]/td/a")));
    WebElement RestricaoAoCredito = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[12]/td/a")));
    WebElement Retaguarda = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[13]/td/a")));
    WebElement Sistema = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[14]/td/a")));
    WebElement Sair = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[17]/td/a")));

    public  void acessarDevedor (){
        Atendimento.click();
    }

}
