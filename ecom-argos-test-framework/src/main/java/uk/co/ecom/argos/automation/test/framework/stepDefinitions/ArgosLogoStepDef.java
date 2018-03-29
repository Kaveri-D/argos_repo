package uk.co.ecom.argos.automation.test.framework.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.ecom.argos.automation.test.framework.pages.ArgosLogoPage;
import uk.co.ecom.argos.automation.test.framework.pages.HomePage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class ArgosLogoStepDef
{
    HomePage homePage = new HomePage();
    ArgosLogoPage argosLogoPage = new ArgosLogoPage();



    @Given("^I am on homepage$")
    public void i_am_on_homepage()
    {
        String expected =homePage.isOnHomePage();
        assertThat(expected,endsWith("co.uk/"));
        System.out.println("I am on home page");

    }

    @When("^I see left corner$")
    public void i_see_left_corner()  {
        System.out.println("Check on left side");
        boolean logopresent=argosLogoPage.verifyLogo();
        Assert.assertTrue(logopresent);

    }

    @Then("^I see \"([^\"]*)\" brand logo$")
    public void i_see_brand_logo(String arg1) {
        System.out.println("Verify Logo");

    }

}
