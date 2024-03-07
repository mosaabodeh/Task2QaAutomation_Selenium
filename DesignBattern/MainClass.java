package QaCArt.OpenWebSite.TestingThePage.TestingTaskes.DesignBattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainClass {
     WebDriver driver;
    Elements el;
    Actions ac;
    Assertions ass;
    @BeforeTest
   public void beforeTest(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
         el=new Elements(driver);
         ac=new Actions(driver);
         ass=new Assertions(driver);
    }



@Test(priority = 1)

     void TestingLogInPage() throws InterruptedException {

        ac.LoginActions();
        ass.LogInAssertions();
        Thread.sleep(2000);

    }
    @Test(priority = 2)
    void TestAddToCart() throws InterruptedException {
        ac.AddAction();
        ass.AddAssertions();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    void TestCartIcon() throws InterruptedException {
       ac.ClickCart();
        ass.ClickCartAssertions();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    void TestCheckOut() throws InterruptedException {
        ac.ClickCheackOut();
        ass.ClickCheackOutAssertions();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    void TestDatafile() {
        ac.FillFirstNameAction();
        //ass.FillFirstNameAssertions();
        ac.FillLastNameAction();
      //ass.FillLastNameAssertions();
        ac.FillZipAction();
       //ass.FillZipAssertions();
    }
    @Test(priority = 6)
    void TestLogOut() {
        ac.CancleAction();
        ac.ContinueShopping();
        ass.ContinueShoppingAssert();
        ac.MenuIcon();
        ass.MenuIconAssert();


    }

 @AfterClass
 void AfterClass()throws InterruptedException{
     ac.LogOutAction();
     ass.LogOutAssertion();
     Thread.sleep(3000);
        driver.quit();


 }
    }

