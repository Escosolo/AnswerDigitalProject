package pages;

import base.testBase;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SummerDressesPage extends testBase {
    @FindBy(how = How.XPATH, using = "//*[@id= 'layered_price_slider']/a[1]")
    public static WebElement PriceRangeSlider1;

    @FindBy(how = How.XPATH, using = "//*[@id= 'layered_price_slider']/a[2]")
    public static WebElement PriceRangeSlider2;


//    public void I_want_to_change_price_range() {
//        Dimension dim = PriceRangeSlider1.getSize();
//        int x = dim.getWidth();
//		Actions action = new Actions(driver);
//        action.clickAndHold(PriceRangeSlider1).moveByOffset(0, 0).release().build().perform();
//    }

    public void I_want_to_change_price_range2(){
        Dimension dime = PriceRangeSlider2.getSize();
        int y = dime.getWidth();
		Actions action = new Actions(driver);
        action.clickAndHold(PriceRangeSlider2).moveByOffset(-142, 0).release().build().perform();
    }


}
