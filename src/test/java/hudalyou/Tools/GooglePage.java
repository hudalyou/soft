package hudalyou.Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GooglePage {

    private WebDriver driver;
    public GooglePage(WebDriver dreiver){
       this.driver=dreiver;}

    private By log= By.xpath("//*[@id='identifierId']");
    private By nxt1= By.xpath("//*[@id='identifierNext']");
    private By paswd= By.xpath("//*[@id='password']/div[1]/div/div[1]/input");
    private By nxt2= By.xpath("//*[@id=\"passwordNext\"]/span/span");
    private By chmmp= By.xpath("//*[@id=\":2j\"]");

    private By name= By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a/span");
    private By esc= By.xpath("//*[@id='gb_71']");
    private By chatzp= By.xpath("//*[@id='forgotPassword']/span/span");

    private By wrt= By.xpath("//*[@id=':4h']/div/div");//*[@id=':3t']/div/div"||
    private By whom= By.xpath("//*[@id=\":ao\"]");//*[@id=\":9c\"]");
    private By topic= By.xpath("//*[@id=\":96\"]");//*[@id=\":8u\"]");
    private By text= By.xpath("//*[@id=\":ab\"]");//*[@id=\":9z\"]");
    private By send= By.xpath("//*[@id=\":8w\"]");//*[@id=\":8k\"]");
    private By chmail= By.xpath("//*[@id=\":4c\"]/div/div[2]/div");//*[@id=\":8k\"]");

    public GooglePage selectWrite() {
        Util.shortWait(driver);
        Util.find(driver, wrt).click();
        Util.shortWait(driver);
       // System.out.println("111");
        return this;
    }
    public GooglePage setWhom(String origin) {
        WebElement setWhm = Util.find(driver, whom);
        setWhm.sendKeys(origin);
    //    System.out.println("!!!"+origin);
        return this;
    }
    public GooglePage setTopic(String origin) {
        WebElement setTpc = Util.find(driver, topic);
        setTpc.sendKeys(origin);
        Util.shortWait(driver);
      //  System.out.println("%%%");
        return this;
    }
    public GooglePage setText(String origin) {
        WebElement setTxt = Util.find(driver, text);
        setTxt.sendKeys(origin);
        Util.shortWait(driver);
        System.out.println(origin+" oridin");
        return this;
    }
    public GooglePage selectSend() {

        Util.find(driver, send).click();
      //  System.out.println("____");
        Util.shortWait(driver);
        return this;
    }
    public GooglePage setLogin(String origin) {
        WebElement setLog = Util.find(driver, log);
        setLog.sendKeys(origin);
        Util.shortWait(driver);
        return this;
    }
        public GooglePage setPassword(String origin) {
        WebElement setPaswrd = Util.find(driver, paswd);
        setPaswrd.sendKeys(origin);
        return this;
    }
       public GooglePage selectNext1 (){
       Util.find(driver, nxt1).click();
       return this;
    }
    public GooglePage selectNext2 (){
        Util.find(driver, nxt2).click();
        return this;
    }
    public String checkMainMailPage () {
        Util.shortWait(driver);
        System.out.println("Проверка наличия блока '"
        + Util.find(driver, chmmp).getText()+"' на странице");
        WebElement check=driver.findElement(chmmp);
               return (check.getText()) ;
    }

    public GooglePage selectName() {
        Util.find(driver, name).click();
        return this;
    }
    public GooglePage selectEscape() {
        Util.find(driver, esc).click();
        return this;
    }
    public String checktAutorizePage () {
        Util.shortWait(driver);
        System.out.println("Проверка наличия блока '"
                + Util.find(driver, chatzp).getText()+"' на странице");
        WebElement check=driver.findElement(chatzp);
        return (check.getText()) ;
    }

    public String checkMail() {
        Util.shortWait(driver);
        System.out.println("Проверка наличия блока '"
                + Util.find(driver, chmail).getText()+"' на странице");
        WebElement check=driver.findElement(chmail);
        return (check.getText()) ;
    }
}
