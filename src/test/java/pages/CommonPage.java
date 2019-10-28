package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {
	@FindBy(how = How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Search'])[1]/following::b[1]")
	public static WebElement CartButton;

	@FindBy(how = How.LINK_TEXT, using = "Our stores")
	public static WebElement OurStores;



    public void click_on_cart_button(){
	CartButton.click();


    }
    public void click_on_our_stores_button(){
    	OurStores.click();
	}
}


