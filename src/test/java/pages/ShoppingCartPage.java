package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.testBase;
import junit.framework.Assert;

public class ShoppingCartPage extends testBase {
	@FindBy(how=How.XPATH	, using = "(.//*[normalize-space(text()) and normalize-space(.)='$28.98'])[6]/following::i[1]")
	public static WebElement CartDeleteButton;

	@FindBy(how=How.XPATH, using = "//p[contains(.,'Your shopping cart is empty.')]")
	public static WebElement BannerMessage;
	
	public void i_want_to_click_on_delete_button() {
		CartDeleteButton.click();
	}
	
	
	public String i_verify_i_see_banner_message() {
			WebDriverWait wait = new WebDriverWait(driver,30);
			  WebElement element = wait.until(
			  ExpectedConditions.visibilityOf(BannerMessage));
		return	BannerMessage.getText();
		}

		
	
}
