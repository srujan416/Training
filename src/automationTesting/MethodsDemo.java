package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo object = new MethodsDemo();
		object.EdgeBrowser();
		
		
		
	}

	public void ChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("user-name")).sendKeys("standard_user");

		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		driver.findElement(By.name("login-button")).click();
	}
	
public void EdgeBrowser() {
		
		System.setProperty("webdriver.edge.driver", "D:\\Training\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("user-name")).sendKeys("standard_user");

		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		driver.findElement(By.name("login-button")).click();
	}
}
