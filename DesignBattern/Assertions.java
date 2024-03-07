package QaCArt.OpenWebSite.TestingThePage.TestingTaskes.DesignBattern;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assertions {
    private WebDriver driver;

    public Assertions(WebDriver driver) {
        this.driver = driver;
    }
    public Assertions LogInAssertions(){
        Elements elements=new Elements(driver);
        WebElement AsserPrepare= elements.assertTitle();

       String Title= AsserPrepare.getText();
        System.out.println(Title);
        Assert.assertEquals(Title,"Products");
        return this;
    }
    public Assertions AddAssertions(){
        Elements elements=new Elements(driver);
        WebElement AssertRemove= elements.AssertAddToCart();

        Assert.assertEquals( AssertRemove.getText(),"Remove");
        return this;
    }
    public Assertions ClickCartAssertions(){
        Elements elements=new Elements(driver);
        WebElement Assertcart= elements.AssertClickCart();


        Assert.assertEquals( Assertcart.getText(),"Your Cart");
        return this;
    }

    public Assertions ClickCheackOutAssertions() {
        Elements elements=new Elements(driver);
        WebElement AssertCheckOut= elements.AssertCheckout();


        Assert.assertEquals( AssertCheckOut.getText(),"Checkout: Your Information");
        return this;
    }

    public Assertions FillFirstNameAssertions() {
        Elements elements=new Elements(driver);
        WebElement FillFirstName= elements.FillFirstName();


        Assert.assertEquals( FillFirstName.getAttribute("value"),"Mosaab");
        return this;
    }

    public Assertions FillLastNameAssertions() {
        Elements elements=new Elements(driver);
        WebElement FillLastName= elements.FillLastName();


        Assert.assertEquals( FillLastName.getAttribute("value"),"odeh");
        return this;
    }

    public Assertions FillZipAssertions() {
        Elements elements=new Elements(driver);
        WebElement Fillzip= elements.FillZipCode();


        Assert.assertEquals( Fillzip.getAttribute("value"),"123");
        return this;
    }

    public Assertions ContinueShoppingAssert() {
        LogInAssertions();
        return this;
    }

    public Assertions MenuIconAssert() {
        Elements elements=new Elements(driver);
        WebElement logOutButton= elements.logOutAction();

        String Title= logOutButton.getText();
        Assert.assertEquals(Title,"Logout");

        return this;
    }
    public Assertions LogOutAssertion() {
        Elements elements=new Elements(driver);
        WebElement logOutAssert= elements.LogOutAssertion();

        String Title= logOutAssert.getText();
        Assert.assertEquals(Title,"Swag Labs");

        return this;
    }
}
