package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.google.common.io.Files;

import base.testBase;
import junit.framework.Assert;

public class HomePage {

	@FindBy(how = How.LINK_TEXT, using="Sign in")
	public static WebElement Sign_in;
	
	@FindBy(how=How.ID, using = "search_query_top")
	public static WebElement SearchItem;

	
	@FindBy(how=How.NAME, using = "submit_search")
	public static WebElement Searchbutton;




	public void click_Sign_in(){
		Sign_in.click();

	}

	public void i_search_for_an_item() {
		SearchItem.sendKeys("dress");
		
	}
	
	public void i_click_on_search_button() {
		Searchbutton.click();
		
	}
}


		

