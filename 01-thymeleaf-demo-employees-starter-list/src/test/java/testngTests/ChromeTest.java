package testngTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest extends BaseTest {


@Test
    public  void launch() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("");
}

}