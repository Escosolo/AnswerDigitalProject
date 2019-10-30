package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage {

    @FindBy(how = How.NAME, using = "id_gender")
    public static WebElement ClickMaleRadioBtn;

    @FindBy(how = How.ID, using = "customer_firstname")
    public static WebElement EnterFirstname;

    @FindBy(how = How.ID, using = "customer_lastname")
    public static WebElement EnterLastname;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement EnterPassword;

    @FindBy(how = How.ID, using = "city")
    public static WebElement EnterCity;

    @FindBy(how = How.ID, using = "postcode")
    public static WebElement EnterPostcode;

    @FindBy(how = How.ID, using = "company")
    public static WebElement EnterCompany;

    @FindBy(how = How.ID, using = "address1")
    public static WebElement EnterStreetnumber;

    @FindBy(how = How.ID, using = "address2")
    public static WebElement EnterStreetname;


    @FindBy(how = How.ID, using = "phone")
    public static WebElement EnterNumber;

    @FindBy(how = How.ID, using = "submitAccount")
    public static WebElement ClickRegisterbtn;

    @FindBy(how = How.LINK_TEXT, using = "Sign out")
    public static WebElement ClickSignOutbtn;

    @FindBy(how = How.ID, using = "days")
    public static WebElement EnterDays;

    @FindBy(how = How.ID, using = "months")
    public static WebElement EnterMonths;

    @FindBy(how = How.ID, using = "years")
    public static WebElement EnterYears;

    @FindBy(how = How.ID, using = "id_state")
    public static WebElement EnterState;


    public void I_Select_days() {
        Select dropdown = new Select(EnterDays);
        dropdown.selectByValue("1");
    }
    public void I_Select_months() {
        Select dropdown = new Select(EnterMonths);
        dropdown.selectByValue("1");
    }
    public void I_Select_years() {
        Select dropdown = new Select(EnterYears);
        dropdown.selectByValue("1998");
    }

    public void I_Select_state() {
        Select dropdown = new Select(EnterState);
        dropdown.selectByVisibleText("Illinois");
    }

    public void click_male_radio_btn() {
        ClickMaleRadioBtn.click();
    }

    public void i_want_to_enter_firstname(String firstname) {
        EnterFirstname.sendKeys(firstname);
    }

    public void i_want_to_enter_lastname(String lastname) {
        EnterLastname.sendKeys(lastname);
    }

    public void i_want_to_enter_password(String password) {
        EnterPassword.sendKeys(password);
    }

    public void i_want_to_enter_city() {
        EnterCity.sendKeys("Chicago");
    }

    public void i_want_to_enter_postcode() {
        EnterPostcode.sendKeys("24378");
    }

    public void i_enter_mobile_number() {
        EnterNumber.sendKeys("0207 8876 920");
    }

    public void i_click_on_register_btn() {
        ClickRegisterbtn.click();
    }

    public void i_click_on_sign_out() {
        ClickSignOutbtn.click();
    }
    public void i_enter_company() {
        EnterCompany.sendKeys("BP Ltd");
    }


    public void i_enter_streetnumber() {
        EnterStreetnumber.sendKeys("1");
    }
    public void i_enter_streetname() {
        EnterStreetname.sendKeys("Park Road");
    }
}