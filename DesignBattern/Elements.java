package QaCArt.OpenWebSite.TestingThePage.TestingTaskes.DesignBattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
    private WebDriver driver ;


    // Constructor to initialize the WebDriver instance
    public Elements(WebDriver driver) {
        this.driver = driver;
    }

  public WebElement userName() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement password() {
        return driver.findElement(By.id("password"));
    }

    public WebElement buttonLogin() {
        return driver.findElement(By.id("login-button"));
    }

    public WebElement assertTitle() {
        return driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
    }
    public WebElement AddToCart() {
        return driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));
    }
    public WebElement AssertAddToCart() {
        return driver.findElement(By.id("remove-sauce-labs-onesie"));
    }
    public WebElement ClickToCart(){
        return driver.findElement(By.className("shopping_cart_badge"));
    }
    public WebElement AssertClickCart(){
        return driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
    }


    public WebElement clickCheckout() {
        return  driver.findElement(By.id("checkout"));
    }

    public WebElement AssertCheckout() {
        return driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
    }

    public WebElement FillFirstName() {
        return driver.findElement(By.id("first-name"));
    }
    public WebElement FillLastName() {
        return  driver.findElement(By.id("last-name"));
    }
    public WebElement Cancle() {
       return  driver.findElement(By.id("cancel"));
    }
    public WebElement ContenueShopping() {
        return driver.findElement(By.id("continue-shopping"));
    }
    public WebElement FillZipCode() {
        return driver.findElement(By.id("postal-code"));
    }
    public WebElement MenuClick() {
       return  driver.findElement(By.id("react-burger-menu-btn"));
    }
    public WebElement logOutAction() {
        return driver.findElement(By.id("logout_sidebar_link"));
    }
    public WebElement LogOutAssertion(){
        return driver.findElement(By.cssSelector("div.login_logo"));
    }

}
