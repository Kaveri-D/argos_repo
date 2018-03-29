package uk.co.ecom.argos.automation.test.framework.pages;

import org.openqa.selenium.By;
import uk.co.ecom.argos.automation.test.framework.BaseMain;

import java.awt.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AddToTrolley extends BaseMain {
    ProductListingPage productListingPage = new ProductListingPage();

    public void addToTrolley() {
        webDriver.findElement(By.xpath(".//*[@id='app']/div/div[2]/main/div[1]/div[2]/section[2]/section/div[4]/div[2]/button/span")).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
     //Handling the Go to trolley pop up window

    public void goToTrolleyPopUp() {
        Set afterPopup = webDriver.getWindowHandles();
        System.out.println("after pop up size is   " + afterPopup.size());
        if (afterPopup.size() == 1) {
            webDriver.switchTo().window((String) afterPopup.toArray()[0]);
            webDriver.findElement(By.cssSelector(".button.button--full.xs-hidden.sm-block")).click();
            // webDriver.findElement(By.cssSelector(".xs-hidden.sm-block")).click();
            //webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public String productAdded(){
        String productname = webDriver.findElement(By.cssSelector(".description>strong>a")).getText();

        return productname;
    }
}
