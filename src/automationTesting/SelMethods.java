package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver", "D:\\Training\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
	/*	driver.findElement(By.name("user-name")).sendKeys("standard_user");

		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		driver.findElement(By.name("login-button")).click();
		
		boolean displayed = driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed();
		
		System.out.println(displayed);
		
		boolean enabled = driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isEnabled();
		
		System.out.println(enabled);
		
		if (enabled==true) {
			
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		}
		*/
		
		//AutoIT code here
driver.findElement(By.id("isAgeSelected")).click();		 
		 Thread.sleep(2000);
		boolean selected = driver.findElement(By.id("isAgeSelected")).isSelected();
	System.out.println(selected);
	
	
	
	}

}
