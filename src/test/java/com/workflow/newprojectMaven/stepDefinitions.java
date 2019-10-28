package com.workflow.newprojectMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.CommonPage;
import pages.HomePage;
import pages.ShoppingCartPage;


public class stepDefinitions extends testBase {

	@Before
	public void setup() throws IOException {
		initialize();
	}


	@Given("^I go to the landing page$")
	public void i_go_to_the_landing_page() throws Throwable {
		driver.get(CONFIG.getProperty("URL"));
	}

	@And("^I enter search details$")
	public void i_enter_search_details() throws Throwable {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.i_search_for_an_item();
	}

	@When("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.i_click_on_search_button();
	}

	@Then("^I add an item to cart$")
	public void i_add_an_item_to_cart() throws Throwable {
		driver.findElement(By.cssSelector("a.button.ajax_add_to_cart_button.btn.btn-default > span")).click();
		driver.findElement(By.cssSelector("span.cross")).click();

	}

	@Then("^I click on cart button$")
	public void i_click_on_cart_button() throws Throwable {
		CommonPage commonpage = PageFactory.initElements(driver, CommonPage.class);
		commonpage.click_on_cart_button();
	}

	@Then("^I verify item is added to cart$")
	public void i_verify_item_is_added_to_cart() throws Throwable {
		String expectedMessage = "Your shopping cart contains: 1 Product";
		String actualMessage = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Your shopping cart'])[1]/following::span[1]")).getText();
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^I verify Shopping cart has a delete button$")
	public void i_verify_Shopping_cart_has_a_delete_button() throws Throwable {
		boolean DeleteButtonPresence = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Your shopping cart'])[1]/following::span[1]")).isDisplayed();
		System.out.println(DeleteButtonPresence);

	}


	@Then("^I click on delete button$")
	public void i_click_on_delete_button() throws Throwable {
		ShoppingCartPage shoppingcartpage = PageFactory.initElements(driver, ShoppingCartPage.class);
		shoppingcartpage.i_want_to_click_on_delete_button();
		Thread.sleep(5000);
	}


	@Then("^I verify banner displayed$")
	public void i_verify_banner_displayed() throws Throwable {
		
		
		
		Thread.sleep(5000);
		ShoppingCartPage shoppingcartpage = PageFactory.initElements(driver, ShoppingCartPage.class);
	    String bannerMessage=	shoppingcartpage.i_verify_i_see_banner_message();
	    System.out.println("The title of the message is "+ bannerMessage);
		//String expectedMessage = "Your shopping cart is empty.";
		
		
		//System.out.println(expectedMessage);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// now copy the  screenshot to desired location using copyFile //method

		FileUtils.copyFile(src, new File("C:\\Users\\Esco\\Documents\\AnswerDigital\\Screenshots\\BannerDisplayed.jpeg"));
		
}
      }
	



