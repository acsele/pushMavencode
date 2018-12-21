import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeTest1 {
  
	
	@Test
	public void locationSelection(){
		
	System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
	WebDriver driver;
	driver= new ChromeDriver();
	driver.get("http://redbus.in");
	
	}
	
	
}
