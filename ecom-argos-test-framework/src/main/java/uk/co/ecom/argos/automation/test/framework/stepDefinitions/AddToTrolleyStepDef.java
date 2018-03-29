package uk.co.ecom.argos.automation.test.framework.stepDefinitions;

import com.sun.javafx.scene.traversal.ContainerTabOrder;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import uk.co.ecom.argos.automation.test.framework.pages.AddToTrolley;
import uk.co.ecom.argos.automation.test.framework.pages.HomePage;
import uk.co.ecom.argos.automation.test.framework.pages.ProductListingPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class AddToTrolleyStepDef
{
    HomePage homePage = new HomePage();
    ProductListingPage productListingPage = new ProductListingPage();
    AddToTrolley addToTrolley = new AddToTrolley();

    @Given("^I search for the \"([^\"]*)\"$")
    public void i_search_for_the(String arg1)
    {
       String expected = homePage.isOnHomePage();
        assertThat(expected,endsWith("co.uk/"));
    }

    @When("^I select a product \"([^\"]*)\"$")
    public void i_select_a_product(String arg1)
    {
        homePage.searchProduct();
      productListingPage.selectProduct();
    }

    @When("^I add product to the trolley$")
    public void i_add_product_to_the_trolley()
    {
      addToTrolley.addToTrolley();

    }

    @When("^I go to the trolley$")
    public void i_go_to_the_trolley()
    {
        addToTrolley.goToTrolleyPopUp();

    }

    @Then("^I should see \"([^\"]*)\" in the trolley$")
    public void i_should_see_in_the_trolley(String arg1)
    {
        String productname= addToTrolley.productAdded();
       // String productname1= "Nike Brasilia Medium Holdall - Blue";

             //assertTrue(isTextPresent(productname));
                     }


}
