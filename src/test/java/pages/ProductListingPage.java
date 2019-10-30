package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductListingPage {
    @FindBy(how = How.CSS, using="a.button.ajax_add_to_cart_button.btn.btn-default > span")
    public static WebElement AddedItem;

    @FindBy(how = How.CSS, using="span.cross")
    public static WebElement CancelButton;

    public void i_want_to_add_new_item (){
         AddedItem.click();
    }

    public void i_want_to_click_cancel_button(){
        CancelButton.click();
    }
}
