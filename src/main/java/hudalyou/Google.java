package hudalyou;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://gmail.com");
     //   By input= By.xpath("//*[@id='authorize']/div/a");
       // By log= By.xpath("//*[@id='identifierId']");//s
       // By nxt1= By.xpath("//*[@id='identifierNext']");
       // By paswd= By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
       // By nxt2= By.xpath("//*[@id='passwordNext']/span/span");
 By log= By.id("identifierId");//s
         By nxt1= By.id("identifierNext");
         By paswd= By.id("password");
         By nxt2= By.id("passwordNext");

        By nme= By.xpath("//*[@id='authorize']/div/a/span[1]");
        By mil= By.xpath("//*[@id='authorize']/div/div/div/div/ul/li[2]/a");
        By cnt= By.xpath("//*[@id='authorize']/div/div/div/div/ul/li[2]/span");

       // WebElement auth=driver.findElement(input);
       // auth.click();
        WebElement login=driver.findElement(log);
        login.sendKeys("iivnv4@gmail.com");//s
        WebElement next1=driver.findElement(nxt1);
        next1.click();
        Thread.sleep(1000);

        WebElement password=driver.findElement(paswd);
        password.sendKeys("iii555III");
        Thread.sleep(1000);
        WebElement next2=driver.findElement(nxt2);
        next2.click();

        Thread.sleep(10000);

      /*  WebElement name=driver.findElement(nme);
        name.click();
        WebElement mail=driver.findElement(mil);
      //  mail.click();
        System.out.print("Входящая "+ mail.getText());

        WebElement count=driver.findElement(cnt);
        System.out.println(". Новых писем: "+count.getText()+" шт.");

        //  Thread.sleep(5000);
       // WebElement count=driver.findElement(cnt);
       // count.click();
*/
        Thread.sleep(5000);
        driver.quit();
    }
}
