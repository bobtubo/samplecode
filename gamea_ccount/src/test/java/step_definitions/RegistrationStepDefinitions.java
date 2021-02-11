package step_definitions;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignUpPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegistrationStepDefinitions extends BaseUtil {
    private BaseUtil base;

    public RegistrationStepDefinitions(BaseUtil base) {

        this.base = base;
    }

    @Given("I am on {string}")
    public void iAmOn(String url) {
        base.driver.manage().window().maximize();
        base.driver.get(url);
    }

    @When("I go to the Sign up page")
    public void i_go_to_the_sign_up_page() {
        HomePage homePage = new HomePage(base.driver);
        homePage.ClickOnJoinNowButton();

    }
    @When("I select title as {string} from the dropdown menu")
    public void iSelectTitleAsFromTheDropdownMenu(String title) {
        SignUpPage signUpPage = new SignUpPage(base.driver);
        signUpPage.selectTitle(title);
    }
    @When("I enter firstname as {string} and surname as {string}")
    public void iEnterFirstnameAsAndSurnameAs(String fName, String sName) {
        SignUpPage signUpPage = new SignUpPage(base.driver);
        signUpPage.enterFirstName(fName);
        signUpPage.enterLastName(sName);
    }

    @And("I select {string}, {string} and {string} from the dropdown menu")
    public void iSelectAndFromTheDropdownMenu(String day, String month, String year) {
        SignUpPage signUpPage = new SignUpPage(base.driver);
        signUpPage.selectDayOfBirth(day);
        signUpPage.selectMonthOfBirth(month);
        signUpPage.selectYearOfBirth(year);

    }

    @When("I Check the tickbox with text {string}")
    public void i_check_the_tickbox_with_text(String accept) {
        SignUpPage signUpPage = new SignUpPage(base.driver);
        signUpPage.clickOnTermsAndConditionsCheckBox();

    }
    @And("I submit the form by clicking the  JOIN NOW button")
    public void i_submit_the_form_by_clicking_the_join_now_button() {
        SignUpPage signUpPage = new SignUpPage(base.driver);
        signUpPage.clickOnJoinNowButton();

    }
    @Then("text {string} appears under the date of birth box")
    public void textAppearsUnderTheDateOfBirthBox(String msg) {
        SignUpPage signUpPage = new SignUpPage(base.driver);
        assertThat(signUpPage.getDateofBirthFieldRequiredMessage(), is(equalTo(msg)));
    }

    @And("I enter the Address details as Number {string}, Building {string}, Street {string} County {string}, Postcode {string} and Country as {string}")
    public void iEnterTheAddressDetailsAsNumberBuildingStreetCountyPostcodeAndCountryAs(String num, String building, String street, String county, String postcode, String country) {
        SignUpPage signUpPage = new SignUpPage(base.driver);
        signUpPage.enterAddress(num);
        signUpPage.enterBuildingAddress(building);
        signUpPage.enterCity(street);
        signUpPage.enterProvince(county);
        signUpPage.enterPostalCode(postcode);
        signUpPage.selectCountry(country);
    }
}
