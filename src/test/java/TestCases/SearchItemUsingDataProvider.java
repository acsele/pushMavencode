package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchItemUsingDataProvider {

	WebDriver driver;

	@BeforeMethod
	public void logIn() {
		System.setProperty("webdriver.chrome.driver", "C:\\NewWorkSpace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

	@Test(dataProvider="data")
	public void testCase1(String product) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	}

	@DataProvider(name="data")
	public Object[][] readdata() {

		Object[][] data = new Object[][] {

				{ "pixel" }, { "samsung" }, { "apple" } };
		return data;
	}

	@AfterMethod
	public void tearOut() {

		driver.quit();

	}

}
