package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OurStoresPage {

    @FindBy(how = How.CSS, using = "button.dismissButton")
    public static WebElement GoogleMapsPopUp;

    public void i_click_OK_button(){
        GoogleMapsPopUp.click();
    }
}
