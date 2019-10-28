package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {

    @FindBy(how = How.CSS, using= "ol > li")
    public static WebElement registeruser_error_message;




    public void I_see_registeruser_error_message(String errormessage){
        Assert.assertEquals(errormessage, registeruser_error_message.getText());
    }
}

