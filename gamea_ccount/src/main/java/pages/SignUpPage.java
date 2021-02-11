package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "title")
    private WebElement titleLocator;


    @FindBy(name = "map(firstName)")
    private WebElement firstNameLocator;


    @FindBy(css = "input[name='map(lastName)']")
    private WebElement lastNameLocator;

    @FindBy (name ="map(dobDay)")
    private WebElement dayOfBirthLocator;

    @FindBy (name ="map(dobMonth)")
    private WebElement monthOfBirthLocator;

    @FindBy (name ="map(dobYear)")
    private WebElement yearOfBirthLocator;

    @FindBy (name ="map(address1)")
    private WebElement address1Locator;

    @FindBy (name ="map(address2)")
    private WebElement address2Locator;

    @FindBy (name ="map(addressCity)")
    private WebElement addressCityLocator;

    @FindBy (name ="map(stateProv)")
    private WebElement stateProvLocator;

    @FindBy (name ="map(postCode)")
    private WebElement postCodeLocator;

    @FindBy (name ="map(countryCode)")
    private WebElement countryCodeLocator;








    @FindBy(id = "checkbox")
    private WebElement termsAndConditionsCheckboxLocator;


    @FindBy(id = "form")
    private WebElement joinNowButtonLocator;

    @FindBy(xpath = "//label[@for='dob']")
    private WebElement dobFieldRequiredMsgLocator;

    public void selectTitle(String title) {

        selectFromDropDownUsingVisibilityOfText(titleLocator, title);
    }

    public void enterFirstName(String firstname) {

        sendKeys(firstNameLocator, firstname);
    }

    public void enterLastName(String lastname) {

        sendKeys(lastNameLocator, lastname);
    }
    public void selectDayOfBirth(String day){
        selectFromDropDownUsingVisibilityOfText(dayOfBirthLocator, day);
    }

    public void selectMonthOfBirth(String month){
        selectFromDropDownUsingVisibilityOfText(monthOfBirthLocator, month);
    }
    public void selectYearOfBirth(String year){
        selectFromDropDownUsingVisibilityOfText(yearOfBirthLocator, year);
    }

    public void enterAddress(String address1){
      sendKeys(address1Locator, address1);
    }

    public void enterBuildingAddress(String building){
        sendKeys(address2Locator, building);
    }
    public void enterCity(String city){
        sendKeys(addressCityLocator, city);
    }
    public void enterProvince(String state){
        sendKeys(stateProvLocator, state);
    }
    public void enterPostalCode(String pcode){
        sendKeys(postCodeLocator, pcode);
    }
    public void selectCountry(String country){
        selectFromDropDownUsingVisibilityOfText(countryCodeLocator, country);

    }

    public void clickOnTermsAndConditionsCheckBox() {

        click(termsAndConditionsCheckboxLocator);
    }

    public void clickOnJoinNowButton(){

        click(joinNowButtonLocator);
    }

    public String getDateofBirthFieldRequiredMessage(){
        String msg = dobFieldRequiredMsgLocator.getText();
        return msg;
    }

}
