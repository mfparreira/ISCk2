package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondMenuPage extends BasePage{

    public SecondMenuPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait espera = new WebDriverWait(driver, 20);

    WebElement dadosDoClienteMenu = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[2]/td/a")));
    WebElement acionamentoMenu = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[3]/td/a")));
    WebElement realizarAcordoMenu = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[4]/td/a")));
    WebElement recebimentoMenu = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[5]/td/a")));
    WebElement encaminharMenu = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"XXMENU\"]/table/tbody/tr[6]/td/a")));


    public void setDadosDoClienteMenuAcessar (){
        dadosDoClienteMenu.click();
    }

    public void acionamentoMenuAcessar (){
        acionamentoMenu.click();
    }

    public void realizarAcordoMenuAcessar (){
        realizarAcordoMenu.click();
    }

    public void recebimentoMenuAcessar (){
        recebimentoMenu.click();
    }

    public void encaminharMenuAcessar (){
        encaminharMenu.click();
    }


}

