package uk.co.ecom.argos.automation.test.framework.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.ecom.argos.automation.test.framework.pages.HomePage;
import uk.co.ecom.argos.automation.test.framework.pages.ProductListingPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class SearchProductDef {
    private HomePage  homePage= new HomePage();
    private ProductListingPage productListingPage = new ProductListingPage();
    @Given("^I am on home page$")
    public void i_am_on_home_page() {
        String expected = homePage.isOnHomePage();
       // Assert.assertTrue(expected.endsWith("/co,uk"));
        assertThat(expected, endsWith("co.uk/"));
    }
    @When("^I search for the product \"([^\"]*)\"$")
    public void i_search_for_the_product(String url)  {
                homePage.searchProduct();

    }

    @Then("^I should see the the nike product list$")
    public void i_should_see_the_the_nike_product_list() {
        productListingPage.selectProduct();

    }
}
