import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testelogin {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Java/driverseleninum/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
