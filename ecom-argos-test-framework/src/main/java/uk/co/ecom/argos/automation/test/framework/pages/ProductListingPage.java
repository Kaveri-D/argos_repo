package uk.co.ecom.argos.automation.test.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.ecom.argos.automation.test.framework.BaseMain;

import java.util.List;

public class ProductListingPage extends BaseMain
{
    public void selectProduct()
    {
         List <WebElement> allProductList = webDriver.findElements(By.cssSelector(".ac-product-name.ac-product-card__name"));
          allProductList.get(0).click();

    }


}
