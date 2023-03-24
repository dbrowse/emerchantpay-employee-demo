package testngTests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;
import testngTests.context.WebDriverContext;
import testngTests.listeners.LogListener;
import testngTests.listeners.ReportListener;
import testngTests.util.LoggerUtil;
import testngTests.util.TestProperties;

import java.util.concurrent.TimeUnit;


@Listeners({ ReportListener.class, LogListener.class })
public class BaseTest {

    /** The driver. */
    protected WebDriver driver;

    /**
     * Global setup.
     */
    @BeforeSuite(alwaysRun = true)
    public void globalSetup() {
        LoggerUtil.log("************************** Test Execution Started ************************************");
        TestProperties.loadAllPropertie();
    }

    /**
     * Wrap all up.
     *
     * @param context the context
     */
    @AfterSuite(alwaysRun = true)
    public void wrapAllUp(ITestContext context) {
        int total = context.getAllTestMethods().length;
        int passed = context.getPassedTests().size();
        int failed = context.getFailedTests().size();
        int skipped = context.getSkippedTests().size();
        LoggerUtil.log("Total number of testcases : " + total);
        LoggerUtil.log("Number of testcases Passed : " + passed);
        LoggerUtil.log("Number of testcases Failed : " + failed);
        LoggerUtil.log("Number of testcases Skipped  : " + skipped);

        LoggerUtil.log("************************** Test Execution Finished ************************************");
    }

    /**
     * Setup.
     */
    @BeforeClass
    protected void setup() {
//		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("disable-infobars");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverContext.setDriver(driver);
    }

    /**
     * Wrap up.
     */
    @AfterClass
    public void wrapUp() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
