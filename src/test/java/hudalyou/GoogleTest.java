package hudalyou;

import hudalyou.Tools.GooglePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void controlMail() throws Exception {
        driver.get("http://gmail.com");

        //   Case1
        GooglePage googlePage = new GooglePage(driver);
        GooglePage case1 = googlePage
                .setLogin("iivnv4@gmail.com")
                .selectNext1()
                .setPassword("iii555III")
                .selectNext2();

        String result1= googlePage.checkMainMailPage();
     //  System.out.println(result1+" Несортированные");
       Assert.assertEquals(result1,"Несортированные");

       //   Case2
         googlePage
                .selectName()
                .selectEscape();
        String result2= googlePage.checktAutorizePage();
       // System.out.println(result2+" Забыли пароль?");
        Assert.assertEquals(result2,"Забыли пароль?");

        //  Case3
        googlePage
                .setPassword("iii555III")
                .selectNext2()
                .selectWrite()
                .setWhom("iivnv@gmail.com")
                .setTopic("Hello")
                .setText("Hello World!!!")
                .selectSend();
        String result3= googlePage.checkMail();
      //  System.out.println(result3+" Входящие");
        Assert.assertTrue(result3 != null);

    }
@AfterMethod
public void tearDownBrowser() {
    driver.quit();
}
}
