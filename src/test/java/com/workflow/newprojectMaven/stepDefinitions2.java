package com.workflow.newprojectMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
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
import pages.SummerDressesPage;

public class stepDefinitions2 extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @When("^I move my mouse to hover on WOMEN button$")
    public void i_move_my_mouse_to_hover_on_WOMEN_button() throws Throwable {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.i_want_to_hover_on_women_button();
        Thread.sleep(5000);
    }



    @Then("^I validate that sub-navigation options appear$")
    public void i_validate_that_sub_navigation_options_appear() throws Throwable {
    	
    	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(src, new File("C:\\Users\\Esco\\Documents\\AnswerDigital\\newprojectMaven\\Screenshots\\subNavigationButtonsAppear.jpeg"));
    	System.out.println("subNavigationButtonsAppear");
    }



    @Then("^I click on Summer Dresses button$")

    public void i_click_on_Summer_Dresses_button() throws Throwable {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.i_click_on_summer_dresses_button();

    }

        @Then("^I verify only Summer items display in the search results$")
        public void i_verify_only_Summer_items_display_in_the_search_results () throws Throwable {
            SummerDressesPage summerDressesPage = PageFactory.initElements(driver, SummerDressesPage.class);
            summerDressesPage.I_want_to_check_for_visibility_of_summer_items();

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\Esco\\Documents\\AnswerDigital\\newprojectMaven\\Screenshots\\SummerItemsDisplayed.jpeg"));
			System.out.println("SummerItemsDisplayed");
     }

    @When("^I move the price range slider from \\$(\\d+) - \\$(\\d+)$")
    public void i_move_the_price_range_slider_from_$_$(int arg1, int arg2) throws Throwable {
        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)", "");
        SummerDressesPage summerDressesPage = PageFactory.initElements(driver, SummerDressesPage.class);
        summerDressesPage.I_want_to_change_price_range2();



    }
    @Then("^I verify search results are updated$")
    public void i_verify_search_results_are_updated() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-111)", "");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Esco\\Documents\\AnswerDigital\\newprojectMaven\\Screenshots\\Searchresultsloading.jpeg"));
        System.out.println("Bug Found - Search Results still loading");
    }

    @Then("^I validate that items returned are within the price range$")
    public void i_validate_that_items_returned_are_within_the_price_range() throws Throwable {

    }
    @Then("^I close the browser$")
    public void iCloseTheBrowser() {
        driver.quit();
    }
}
