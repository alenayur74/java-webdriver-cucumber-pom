package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.QuoteForm;

public class QuoteObjectStepDefs {

    @Given("I go to {string} page oop")
    public void iGoToPageOop(String page) {
        switch (page) {
            case "quote":
                new QuoteForm().open();
                break;
            default:
                throw new RuntimeException("Unknown page: " + page);
        }
    }

    @When("I fill out required fields oop")
    public void iFillOutRequiredFieldsOop() {
        QuoteForm form = new QuoteForm();
        form.fillUsername("skryabin");
        form.fillEmail("slava@skryabin.com");
        form.fillPassword("welcome");
        form.fillConfirmPassword("welcome");

    }
}
