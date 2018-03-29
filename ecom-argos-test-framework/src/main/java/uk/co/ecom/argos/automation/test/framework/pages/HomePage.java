package uk.co.ecom.argos.automation.test.framework.pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.ecom.argos.automation.test.framework.BaseMain;

import static org.hamcrest.core.StringEndsWith.endsWith;

public class HomePage extends BaseMain
{
   // @FindBy(id = "searchTerm")
    //private WebElement searchBox;

    public String isOnHomePage()
    {
         return webDriver.getCurrentUrl();
       // Assert.assertThat(expected,endsWith("/co.uk"));
    }

    public void searchProduct()
    {
      webDriver.findElement(By.id("searchTerm")).sendKeys("nike");
      webDriver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
    }
}
