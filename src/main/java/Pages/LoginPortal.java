package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPortal extends BasePage {
    public LoginPortal(WebDriver driver) {
        super( driver );
    }

    //Tempo de espera do elemento em tela
    WebDriverWait espera = new WebDriverWait(driver, 20);


    //Mapear os elementos
    WebDriver frame1 = this.driver.switchTo().frame("geral");
    WebElement campoLogin = espera.until( ExpectedConditions.elementToBeClickable( By.xpath("/html/body/table/tbody/tr[1]/td[2]/table[2]/tbody/tr[2]/td/font/form/p[3]/table/tbody/tr[3]/td[2]/input")));
    WebElement campoSenha = espera.until( ExpectedConditions.elementToBeClickable( By.xpath("/html/body/table/tbody/tr[1]/td[2]/table[2]/tbody/tr[2]/td/font/form/p[3]/table/tbody/tr[4]/td[2]/input")));
    WebElement btnEntrar = espera.until( ExpectedConditions.elementToBeClickable( By.xpath("/html/body/table/tbody/tr[1]/td[2]/table[2]/tbody/tr[2]/td/font/form/p[3]/table/tbody/tr[7]/td/input[1]")));


    public void acessarPortal(String user, String password) throws InterruptedException {


        campoLogin.click();
        campoLogin.sendKeys(user);
        campoSenha.click();
        campoSenha.sendKeys(password);
        Thread.sleep( 5000 );
        btnEntrar.click();


    }

}

