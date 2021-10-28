package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage {

    private WebDriver driver;
    private By linkUserManual = By.linkText("USER MANUAL");
    private By linkAboutMe = By.linkText("ABOUT ME");
    private By headingText = By.cssSelector("h2");

    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public ManualPage clickLinkUserManual() {
        driver.findElement(linkUserManual).click();
        return new ManualPage(driver);
    }

    public IndexPage clickLinkAboutMe() {
        driver.findElement(linkAboutMe).click();
        return new IndexPage(driver);
    }

    public String getHeadingText() {
        return driver.findElement(headingText).getText();
    }
}
