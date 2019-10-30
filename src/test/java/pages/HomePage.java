package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.google.common.io.Files;

import base.testBase;
import junit.framework.Assert;

public class HomePage extends testBase{

	@FindBy(how = How.LINK_TEXT, using="Sign in")
	public static WebElement Sign_in;
	
	@FindBy(how=How.ID, using = "search_query_top")
	public static WebElement SearchItem;

	@FindBy(how=How.LINK_TEXT, using = "Summer Dresses")
	public static WebElement SummerDressLabel;

	@FindBy(how=How.NAME, using = "submit_search")
	public static WebElement Searchbutton;

	@FindBy(how=How.XPATH, using = "(.//*[normalize-space(text()) and normalize-space(.)='Categories'])[1]/following::a[1]")
	public static WebElement WomenButton;

	@FindBy(how=How.XPATH,using = "//img[@class='logo img-responsive']")
	public static WebElement Logolabel;


	public String validate_HomePage_Title(){
		return	driver.getTitle();
	}

	public boolean verify_Logo_label(){
		return Logolabel.isDisplayed();
	}

	public void click_Sign_in(){
		Sign_in.click();

	}

	public void i_search_for_an_item() {
		 SearchItem.sendKeys("dress");
		
	}

	public void i_click_on_summer_dresses_button () {
		SummerDressLabel.click();

	}
	
	public void i_click_on_search_button() {
		Searchbutton.click();
		
	}
	public void i_want_to_hover_on_women_button(){
		Actions action = new Actions(driver);
		action.moveToElement(WomenButton).build().perform();

	}
}


		

