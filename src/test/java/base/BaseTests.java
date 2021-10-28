package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.IndexPage;

import static java.lang.String.format;

public class BaseTests {

    public static final String PORTFOLIO_URL = "https://ruthmoog.dev/";
    private WebDriver driver;
    protected IndexPage indexPage;

    /**
     * Set up tests in the web browser;
     *  - instantiate the chromedriver
     *  - navigate to portfolio url
     *  - instantiate index page
     */
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(PORTFOLIO_URL);
        indexPage = new IndexPage(driver);
    }

    /**
     * Finish test in the web browser;
     * - close any open windows
     * - quit session
     */
    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
