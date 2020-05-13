package base;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Swati Patil
 * Purpose:Intialize driver
 */
public class Base {
	
	public static WebDriver driver=null;
	
	public static void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.bookswagon.com");
		Set<String> allWindowHandles = driver.getWindowHandles();

		int count = allWindowHandles.size();
		System.out.println("Number of windows opened in the system is : " + count);
		for (String windowHandle : allWindowHandles) {

			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			System.out.println("Window handle id of page -->" + title + " --> is : " + windowHandle);
		}
	}
}
		