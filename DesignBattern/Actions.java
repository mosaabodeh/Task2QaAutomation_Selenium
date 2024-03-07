package QaCArt.OpenWebSite.TestingThePage.TestingTaskes.DesignBattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Actions {
    private WebDriver driver;

    public Actions(WebDriver driver) {
        this.driver = driver;
    }

    public  Actions  LoginActions(){
     Elements elements=new Elements(driver);
         WebElement UserName= elements.userName();
        UserName .sendKeys("problem_user");

     WebElement password =elements.password();
        password.sendKeys("secret_sauce");

     WebElement ButtonLogin=elements.buttonLogin();
             ButtonLogin.click();
     return this;
    }
    public Actions AddAction(){
        Elements elements=new Elements(driver);
        WebElement AddCartButton= elements.AddToCart();
        AddCartButton.click();
        return this;
    }
    public Actions ClickCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Elements elements=new Elements(driver);
        WebElement CArtIcon= elements.ClickToCart();
        CArtIcon.click();
        return this;
    }

    public Actions ClickCheackOut() {
        Elements elements=new Elements(driver);
        WebElement CheckoutButton= elements.clickCheckout();
        CheckoutButton.click();
        return this;
    }

    public Actions FillFirstNameAction() {
        Elements elements=new Elements(driver);
        WebElement FirstNameInput= elements.FillFirstName();
        FirstNameInput.sendKeys("Mosaab");
        return this;
    }
    public Actions FillLastNameAction() {
        Elements elements=new Elements(driver);
        WebElement LastNameInput= elements.FillLastName();
        LastNameInput.sendKeys("odeh");
        return this;
    }
    public Actions FillZipAction() {
        Elements elements=new Elements(driver);
        WebElement FirstZip= elements.FillZipCode();
        FirstZip.sendKeys("123");
        return this;
    }
    public Actions CancleAction(){
        Elements elements=new Elements(driver);
        WebElement CancelButton= elements.Cancle();
        CancelButton.click();
        return this;
    }
    public Actions ContinueShopping(){
        Elements elements=new Elements(driver);
        WebElement ContinueShopping= elements.ContenueShopping();
        ContinueShopping.click();
        return this;
    }
    public Actions MenuIcon(){
        Elements elements=new Elements(driver);
        WebElement MenuIconButton= elements.MenuClick();
        MenuIconButton.click();
        return this;
    }
    public Actions LogOutAction(){
        Elements elements=new Elements(driver);
        WebElement logOutButton= elements.logOutAction();
        logOutButton.click();
        return this;
    }



}
