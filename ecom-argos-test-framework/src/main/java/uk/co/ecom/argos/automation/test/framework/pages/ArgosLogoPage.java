package uk.co.ecom.argos.automation.test.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import uk.co.ecom.argos.automation.test.framework.BaseMain;

public class ArgosLogoPage extends BaseMain {

    public boolean verifyLogo()
    {
      return webDriver.findElement(By.cssSelector(".md-2--none")).isDisplayed();
      // Assert.assertTrue(logopresent);
    }
}
