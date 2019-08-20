package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Usps extends Page {

    public Usps() {
        setUrl("https://www.usps.com/");
    }

    @FindBy(xpath = "//a[@id='stampButton']")
    private WebElement stampsButton;

    public void clickStamps() {
        stampsButton.click();
    }
}
