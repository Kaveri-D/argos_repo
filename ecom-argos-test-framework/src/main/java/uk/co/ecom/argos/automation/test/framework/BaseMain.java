package uk.co.ecom.argos.automation.test.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BaseMain
{
    public static WebDriver webDriver;
    public static Actions act;

     public void openBrowser()
  {
      WebDriverManager.chromedriver().setup();
      webDriver = new ChromeDriver();

  }
      public void maximiseBrowser()
  {
         webDriver.manage().window().maximize();
  }
      public void navigateTo(String url)
     {
          webDriver.get(url);
     }
      public void applyImpWait()
      {
         webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      }
      public void applyActions()
      {
          act=new Actions(webDriver);
      }
       public void closeBrowser()
  {
        webDriver.quit();
  }

}
