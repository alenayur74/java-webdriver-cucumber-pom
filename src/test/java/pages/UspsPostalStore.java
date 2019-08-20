package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UspsPostalStore extends Page {

    @FindBy(xpath = "//select[@id='Ns']")
    private WebElement sortBy;

    @FindBy(xpath="(//div[@class='results-product-info'])[1]")
    private WebElement firstFoundItem;

    public void selectSortBy(String text) {
        new Select(sortBy).selectByVisibleText(text);
    }
    public String getFirstFoundItem() {
        return firstFoundItem.getText();
    }
}
