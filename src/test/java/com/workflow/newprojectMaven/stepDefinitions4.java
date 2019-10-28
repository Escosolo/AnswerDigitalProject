package com.workflow.newprojectMaven;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.OurStoresPage;

import java.io.File;
import java.io.IOException;

public class stepDefinitions4 extends testBase {
    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I click on Our stores button$")
    public void i_click_on_Our_stores_button() throws Throwable{
        CommonPage commonpage = PageFactory.initElements(driver, CommonPage.class);
        commonpage.click_on_our_stores_button();
    }

    @Given("^I drag the map to see a store in West Palm Beach$")
    public void i_drag_the_map_to_see_a_store_in_West_Palm_Beach() throws Throwable {
        OurStoresPage ourstorespage = PageFactory.initElements(driver, OurStoresPage.class);
        ourstorespage.i_click_OK_button();

//        WebElement frame = driver.findElement(By.cssSelector("div#eyein-modal iframe"));
//        driver.switchTo().frame(frame);
//        //driver.find_element_by_id('widget-zoom-in').click();
//
//        WebElement element = driver.findElement(By.id("content-container"));
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        js.executeScript("javascript:window.scrollBy(250,750)", element);
    }
    @Then("^I capture a screenshot$")
    public void i_capture_a_screenshot() throws Throwable {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Esco\\Documents\\AnswerDigital\\Screenshots\\WestPalmBeach.jpeg"));
        System.out.println("Bug Found - West Palm Beach Unreachable");
    }

}
