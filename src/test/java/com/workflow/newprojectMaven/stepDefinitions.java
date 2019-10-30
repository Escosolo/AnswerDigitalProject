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
import pages.ProductListingPage;
import pages.ShoppingCartPage;


public class stepDefinitions extends testBase {

	@Before
	public void setup() throws IOException {
		initialize();
	}


	@Given("^I go to the landing page and I validate title of page$")
	public void i_go_to_the_landing_page_and_I_validate_title_of_page() throws Throwable {
		driver.get(CONFIG.getProperty("URL"));

		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		String title = homepage.validate_HomePage_Title();
		System.out.println("The title of HomePage is  " + title);
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

		ProductListingPage productlistingpage = PageFactory.initElements(driver, ProductListingPage.class);
		productlistingpage.i_want_to_add_new_item();
		productlistingpage.i_want_to_click_cancel_button();
	}

	@Then("^I click on cart button$")
	public void i_click_on_cart_button() throws Throwable {
		CommonPage commonpage = PageFactory.initElements(driver, CommonPage.class);
		commonpage.click_on_cart_button();
	}

	@Then("^I verify item is added to cart$")
	public void i_verify_item_is_added_to_cart() throws Throwable {
		ShoppingCartPage shoppingcartpage = PageFactory.initElements(driver, ShoppingCartPage.class);
		String actualMessage = shoppingcartpage.i_verify_item_is_in_cart();
		String expectedMessage = "Your shopping cart contains: 1 Product";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^I verify Shopping cart has a delete button$")
	public void i_verify_Shopping_cart_has_a_delete_button() throws Throwable {
		ShoppingCartPage shoppingcartpage = PageFactory.initElements(driver, ShoppingCartPage.class);
		boolean DeleteButtonPresence = shoppingcartpage.i_want_to_verify_delete_button_is_displayed();
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
		String bannerMessage = shoppingcartpage.i_verify_i_see_banner_message();
		System.out.println("The title of the message is " + bannerMessage);
		String expectedBannerMessage = "Your shopping cart is empty.";
		Assert.assertEquals(expectedBannerMessage, bannerMessage);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Esco\\Documents\\AnswerDigital\\newprojectMaven\\Screenshots\\BannerDisplayed.jpeg"));

	}
}
	



