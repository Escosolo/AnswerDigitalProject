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

	@FindBy(how=How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Your shopping cart'])[1]/following::span[1]")
	public static WebElement DeleteButtonDisplayed;

	@FindBy(how=How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Your shopping cart'])[1]/following::span[1]")
	public static WebElement VerifyItemIsInCart;


	public void i_want_to_click_on_delete_button() {
		CartDeleteButton.click();
	}

	public String i_verify_i_see_banner_message() {
			WebDriverWait wait = new WebDriverWait(driver,30);
			  WebElement element = wait.until(
			  ExpectedConditions.visibilityOf(BannerMessage));
		return	BannerMessage.getText();
		}

	public boolean i_want_to_verify_delete_button_is_displayed() {
		return DeleteButtonDisplayed.isDisplayed();
	}

	public String i_verify_item_is_in_cart() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOf(VerifyItemIsInCart));
	return 	VerifyItemIsInCart.getText();
	}
}
