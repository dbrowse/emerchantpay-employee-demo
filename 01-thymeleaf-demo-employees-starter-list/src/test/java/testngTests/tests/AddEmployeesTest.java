package testngTests.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import testngTests.factory.PageinstancesFactory;
import testngTests.pages.EmployeesPage;

@Test(testName = "Add employee test", description = "Add employee test")
public class AddEmployeesTest extends example.example.tests.BaseTest {

	@Test
	public void addEmployeeTest() {
		driver.get("http://localhost:8080/employees/list");
		EmployeesPage employeesPage = PageinstancesFactory.getInstance(EmployeesPage.class);
		employeesPage.addNewEmployee("Diayn" , "Georgiev", "dgeorgiev@gmail.com");

		Assert.assertTrue(false, "Login failed : Test failed");
	}
}
