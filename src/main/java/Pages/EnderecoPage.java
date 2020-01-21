package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnderecoPage extends BasePage {

    public EnderecoPage (WebDriver driver){
        super(driver);
    }

    WebDriverWait espera = new WebDriverWait(driver, 20);

    WebElement cepCampo = espera.until( ExpectedConditions.elementToBeClickable(By.id("CEP1")));
    Select tipoCampo = new Select(driver.findElement(By.id("Tipo1")));
    WebElement logradouroCampo = espera.until( ExpectedConditions.elementToBeClickable(By.id("Logadouro1")));
    WebElement numeroCampo = espera.until( ExpectedConditions.elementToBeClickable(By.id("Numero1")));
    WebElement bairroCampo = espera.until( ExpectedConditions.elementToBeClickable(By.id("Bairro1")));
    WebElement cidadeCampo = espera.until( ExpectedConditions.elementToBeClickable(By.id("Cidade1")));
    WebElement estadoCampo = espera.until( ExpectedConditions.elementToBeClickable(By.id("Estado1")));
    WebElement confirmarTelefoneBtn = espera.until( ExpectedConditions.elementToBeClickable(By.id("Incluir1")));

    public void CadastrarEndereco (String cep, String tipo, String logradouro, String numero){
        cepCampo.click();
        cepCampo.sendKeys(cep);
        tipoCampo.selectByVisibleText("Residencial");

        logradouroCampo.click();
        logradouroCampo.sendKeys(logradouro);
        numeroCampo.click();
        numeroCampo.sendKeys(numero);
        /**
        bairroCampo.click();
        bairroCampo.sendKeys(bairro);
        cidadeCampo.click();
        cidadeCampo.sendKeys(cidade);
        estadoCampo.click();
        estadoCampo.sendKeys(estado);*/
        confirmarTelefoneBtn.click();

    }

}
