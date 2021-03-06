package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/sign-up.shtml']")
    private WebElement joinNowLinkLocator;

    public void ClickOnJoinNowButton(){
        joinNowLinkLocator.click();
    }
}
