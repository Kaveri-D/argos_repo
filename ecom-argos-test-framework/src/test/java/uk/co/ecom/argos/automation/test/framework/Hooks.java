package uk.co.ecom.argos.automation.test.framework;


import cucumber.api.java.Before;
import org.junit.Test;

public class Hooks

{
    private BaseMain baseMain = new BaseMain();
    @cucumber.api.java.Before()
    public void setup()
    {
        baseMain.openBrowser();
        baseMain.maximiseBrowser();
        baseMain.navigateTo("http://www.argos.co.uk/");
        baseMain.applyImpWait();
        baseMain.applyActions();
    }
    @cucumber.api.java.After
    public void tearDown()
    {
        baseMain.closeBrowser();
    }

}
