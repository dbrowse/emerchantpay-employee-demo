package testngTests.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EmployeesPage1 {

    WebDriver driver;

    public EmployeesPage1(WebDriver driver) {
        this.driver = driver;
    }

    //PageFactor
    @FindBy(id = "add-employ-button")
    WebElement addEmployeeButton;

    @FindBy(id = "firstName")
    WebElement firstNameInput;

    @FindBy(id = "lastName")
    WebElement lastNameInput;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(css = "button[type=’submit’]")
    WebElement save;


    public void addNewEmployee(String firstName, String lastName, String email) {

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        save.click();

    }

    public void goToEmployeesPage() {
        driver.get("http://localhost:8080/employees/list");
    }
}


