package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.BreakIterator;

public class LoginPage {

    @FindBy(name = "username") private WebElement userName;
    @FindBy(name = "password") private WebElement password;
    @FindBy(css = ".oxd-button") private WebElement loginButton;

    WebDriver driver = Browser.getWebDriver();

    public DashboardPage login(){
        userName.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();
        return PageFactory.initElements(driver, DashboardPage.class);
    }
}
