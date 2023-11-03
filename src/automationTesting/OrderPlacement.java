package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderPlacement {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.id("item_1_title_link")).click();
		
		//Add to cart button on Product Detail Page
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		
		//Cart icon
		driver.findElement(By.id("shopping_cart_container")).click();
		
		//Checkout button
		driver.findElement(By.id("checkout")).click();
		
		//First Name 
		driver.findElement(By.id("first-name")).sendKeys("Test");
		
		//Last Name
		driver.findElement(By.id("last-name")).sendKeys("Name");
		
		//Postal code
		driver.findElement(By.id("postal-code")).sendKeys("1234");
		
		//Continue button
		driver.findElement(By.id("continue")).click();
		
		//Finish
		driver.findElement(By.id("finish")).click();
		
		//Back to Home button
		driver.findElement(By.id("back-to-products")).click();
		
		//Menu button
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		//For thread.sleep, Selenium itself suggests to use a try catch block or a throws declaration to not get interrupted b any exceptions
		Thread.sleep(2000);
		//Logout button
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		driver.close();
		
		
	}

}
