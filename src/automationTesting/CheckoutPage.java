package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//It opened an empty browser
		//person is finding element by the locator that we have given.

		//getting the URL opened in the browser.
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("user-name")).sendKeys("standard_user");

		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		driver.findElement(By.name("login-button")).click();
		
		//Product
		driver.findElement(By.id("item_1_title_link"));

		
		//logout.click();
	}

}
