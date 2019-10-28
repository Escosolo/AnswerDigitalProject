package com.workflow.newprojectMaven;
import java.io.File;
import java.io.IOException;

import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.SignInPage;

import java.io.IOException;

public class stepDefinitions3 extends testBase {
    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I click the SignIn link$")
    public void i_click_the_SignIn_link() throws Throwable {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.click_Sign_in();
    }

    @And("^I enter my email address$")
    public void iEnterMyNewEmailAddress() {
        random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
        System.out.println(random);
        driver.findElement(By.id("email_create")).sendKeys("switch" + random + "@gmail.com");
    }


    @Given("^I click on the create account button$")
    public void I_click_on_the_create_account_button() throws Throwable {
        driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
        Thread.sleep(3000);
    }

    @Given("^I click on male radio button$")
    public void i_click_on_male_radio_button() throws Throwable {
        driver.findElement(By.name("id_gender")).click();
    }

    @Given("^I enter a firstname \"([^\"]*)\"$")
    public void i_enter_a_firstname(String firstname) throws Throwable {
        driver.findElement(By.id("customer_firstname")).sendKeys(firstname);
    }

    @Given("^I enter a lastname \"([^\"]*)\"$")
    public void i_enter_a_lastname(String lastname) throws Throwable {
        driver.findElement(By.id("customer_lastname")).sendKeys(lastname);
    }


    @Given("^I enter a \"([^\"]*)\"$")
    public void i_enter_a(String password) throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    @Given("^I enter my date of birth$")
    public void i_enter_my_date_of_birth() throws Throwable {
        new Select(driver.findElement(By.id("days"))).selectByValue("1");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("months"))).selectByValue("1");
        new Select(driver.findElement(By.id("years"))).selectByValue("1998");
        Thread.sleep(2000);
    }

    @Given("^I enter address$")
    public void i_enter_address() throws Throwable {
        driver.findElement(By.id("company")).sendKeys("BP Ltd");
        driver.findElement(By.id("address1")).sendKeys("1");
        driver.findElement(By.id("address2")).sendKeys("Park Road");
    }

    @Given("^I enter city$")
    public void i_enter_city() throws Throwable {
        driver.findElement(By.id("city")).sendKeys("Chicago");
    }

    @Given("^I enter state$")
    public void i_enter_state() throws Throwable {
        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Illinois");
        //driver.findElement(By.cssSelector("#id_state > option[value=\"13\"]")).click();
    }

    @Given("^I enter postal code$")
    public void i_enter_postal_code() throws Throwable {
        driver.findElement(By.id("postcode")).sendKeys("24378");
    }

    @Given("^I enter country$")
    public void i_enter_country() throws Throwable {

    }

    @Given("^I enter mobile number$")
    public void i_enter_mobile_number() throws Throwable {
        driver.findElement(By.id("phone")).sendKeys("0207 8876 920");
    }

    @When("^I click register button$")
    public void i_click_register_button() throws Throwable {
        driver.findElement(By.id("submitAccount")).click();
    }

    @Then("^I verify that \"([^\"]*)\" is logged in$")
    public void iVerifyThatIsLoggedIn(String user) throws Throwable {
        Assert.assertEquals(user, driver.findElement(By.cssSelector("span")).getText());
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Esco\\Documents\\AnswerDigital\\Screenshots\\AccountNameDisplayed.jpeg"));
        System.out.println("Completed Registration has taken user to My Account Page and Account Name is seen on top right");
        Thread.sleep(5000);
    }

    @Then("^I sign out$")
    public void i_sign_out() throws Throwable {
        driver.findElement(By.linkText("Sign out")).click();

    }

    @Then("^I see an error \"([^\"]*)\" message details$")
    public void i_see_an_error_message_details(String errormessage) throws Throwable {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        signInPage.I_see_registeruser_error_message(errormessage);
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Esco\\Documents\\AnswerDigital\\Screenshots\\errormessage.jpeg"));
        System.out.println("Error message displayed as a result of invalid credentials inputted");
    }
}