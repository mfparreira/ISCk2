package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelecaoDeTitulos extends BasePage {
    public SelecaoDeTitulos(WebDriver driver) {
        super(driver);
    }

    WebDriverWait espera = new WebDriverWait(driver, 20);

    WebElement validacaoPagina = espera.until( ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form1\"]/table/tbody/tr/td/table/tbody/tr[1]/td")));



    public void ValidarPaginaDeTitulo () throws InterruptedException {



            WebElement opcaoTitulo1 = espera.until(ExpectedConditions.elementToBeClickable(By.id("optTitulo")));
            WebElement Titulo1Confirmar = espera.until(ExpectedConditions.elementToBeClickable(By.id("button1")));

            opcaoTitulo1.click();
            Titulo1Confirmar.click();



    }
}
