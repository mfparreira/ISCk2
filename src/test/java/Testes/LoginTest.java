
package Testes;


import Pages.*;
import Suporte.Web;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;


public class LoginTest {
    private WebDriver driver;



    @Before
    public void setUp() {

        driver = Web.createChrome();
        driver.get ("http://k2hml.mfmti.com.br/lang_portbr/");
    }



    @After
    public void TearDown(){
    driver.quit();
    }



        @Test
        public void LoginPositivoTest () throws InterruptedException {


            driver.get ("http://k2hml.mfmti.com.br/lang_portbr/");
        new LoginPortal( driver )
                .acessarPortal( "master", "master01");
            WebElement aux = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/table[1]/tbody/tr[2]/td[1]/font/b"));
            String compare = aux.getText();

            assertEquals(compare, " INTERSIC - Gestor de Cobrança ");
    }

    @Test
    public void LoginNegativoTest () throws InterruptedException {



        new LoginPortal( driver )
                .acessarPortal( "master", "master02");

        Thread.sleep(4000);

        String aux = driver.switchTo().alert().getText();
        System.out.println(aux);
        assertEquals(aux, "Usuário e/ou Senha inválido!");
    }


    @Test
    public void pesquisarDevedor () throws InterruptedException {
        new LoginPortal(driver)
                .acessarPortal("master", "master01" );
        new PrincipalPage(driver)
                .acessarDevedor();
        new DevedorPesquisa (driver)
                .pesquisarDevedorPorCPF("91205115820 ");
        WebElement pesquisado = driver.findElement(By.xpath("//*[@id=\"form2\"]/table/tbody/tr/td/p/table/tbody/tr[2]/td[2]"));
        pesquisado.click();
        Thread.sleep(5000);
       // assertEquals("", );
    }

    @Test
    public void cadastrarPhone () throws  InterruptedException {
        new LoginPortal(driver)
                .acessarPortal("master", "master01" );
        new PrincipalPage(driver)
                .acessarDevedor();
        new DevedorPesquisa (driver)
                .pesquisarDevedorPorCPF("91205115820 ");
        WebElement pesquisado = driver.findElement(By.xpath("//*[@id=\"form2\"]/table/tbody/tr/td/p/table/tbody/tr[2]/td[2]"));
        pesquisado.click();
        new AbasPage(driver)
                .acessarAbaPhone();
        new PhonePage(driver)
                .cadastrarPhone("11", "988456331" );
        Thread.sleep(10000);
    }

    @Test
    public void cadastrarEmail () throws  InterruptedException {
        new LoginPortal(driver)
                .acessarPortal("master", "master01" );
        new PrincipalPage(driver)
                .acessarDevedor();
        new DevedorPesquisa (driver)
                .pesquisarDevedorPorCPF("91205115820 ");
        WebElement pesquisado = driver.findElement(By.xpath("//*[@id=\"form2\"]/table/tbody/tr/td/p/table/tbody/tr[2]/td[2]"));
        pesquisado.click();
        new AbasPage(driver)
                .acessarAbaEmail();
        new EmailPageAux(driver)
                .cadastrarNovoEmailAux();
        new EmailPage(driver)
                .cadastrarEmail("teste@teste.com.br");
    }

    @Test
    public void CadastrarEndereco () throws  InterruptedException {
        new LoginPortal(driver)
                .acessarPortal("master", "master01" );
        new PrincipalPage(driver)
                .acessarDevedor();
        new DevedorPesquisa (driver)
                .pesquisarDevedorPorCPF("91205115820 ");
        WebElement pesquisado = driver.findElement(By.xpath("//*[@id=\"form2\"]/table/tbody/tr/td/p/table/tbody/tr[2]/td[2]"));
        pesquisado.click();
        new AbasPage(driver)
                .acessarAbaEndereco();
        new EnderecoPageAux(driver).
                novoEnderecoAux();
        new EnderecoPage(driver)
                .CadastrarEndereco("03211130", "1", "Dalymount", "5" );
        Thread.sleep(10000);
    }

    @Test
    public void RealizarAcordo () throws InterruptedException {
        new LoginPortal(driver)
                .acessarPortal("master", "master01" );
        new PrincipalPage(driver)
                .acessarDevedor();
        new DevedorPesquisa (driver)
                .pesquisarDevedorPorCPF("91205115820 ");
        WebElement pesquisado = driver.findElement(By.xpath("//*[@id=\"form2\"]/table/tbody/tr/td/p/table/tbody/tr[2]/td[2]"));
        pesquisado.click();
        new SecondMenuPage(driver)
                .realizarAcordoMenuAcessar();
        new QuestionPage(driver)
                .responderPesquisa();
        new QuestionPage2(driver)
                .inserirTelefoneAcordo("11967678900");
        new SelecaoDeTitulos(driver)
                .ValidarPaginaDeTitulo();


    }


}







