package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Usps;
import pages.UspsPostalStore;

import static org.assertj.core.api.Assertions.assertThat;

public class UspsObjectStepDefs {

    @When("I go to {string} oop")
    public void iGoToOop(String buttonType) {
        new Usps().clickStamps();
    }

    @And("I sort by {string} oop")
    public void iSortByOop(String text) {
        new UspsPostalStore().selectSortBy(text);
    }

    @Then("I verify that {string} is cheapest oop")
    public void iVerifyThatIsCheapestOop(String expected) {
        String actualItem = new UspsPostalStore().getFirstFoundItem();
        System.out.println("Actual: " + actualItem);
        System.out.println("Expected: " + expected);
        assertThat(actualItem).contains(expected);
    }
}
