package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;

public class BaseTests {

    public static final String PORTFOLIO_URL = "https://ruthmoog.dev/";
    private WebDriver driver;

    /**
     * Set up tests in the web browser;
     *  - instantiate the chromedriver
     *  - navigate to portfolio url
     *  - log page title to console
     */
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(PORTFOLIO_URL);
        System.out.println(format("Arrived at webpage: \"%s\"", driver.getTitle()));
    }

    /**
     * Finish test in the web browser;
     * - close any open windows
     * - quit session
     */
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
        test.tearDown();
    }

}
