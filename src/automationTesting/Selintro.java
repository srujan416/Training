package automationTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selintro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//initializing & invoking the chrome browser
		//driver is an object to access the methods of a class
		
System.setProperty("webdriver.chrome.driver", "D:\\Training\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//It opened an empty browser
//person is finding element by the locator that we have given.

//getting the URL opened in the browser.
driver.get("https://www.saucedemo.com");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.name("password")).sendKeys("secret_sauce");
driver.findElement(By.name("login-button")).click();

//Testing the git
/*


String [] user = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};


	//driver.findElement(By.id("react-burger-menu-btn")).click();
for(int s=0 ;s<user.length; s++) {
System.out.println(user[s]);
driver.findElement(By.name("user-name")).sendKeys(user[s]);
Thread.sleep(2000);
//driver.findElement(By.name("user-name")).clear();
driver.findElement(By.name("password")).sendKeys("secret_sauce");

//driver.findElement(By.name("login-button")).click();

WebElement loginButton = driver.findElement(By.name("login-button"));

loginButton.click();
//Where the automation user already know about the error requirement.
	if(user[s]=="locked_out_user")
	{
		System.out.println("Skip this username");
		driver.navigate().refresh();
	}

	else {
		WebElement product =driver.findElement(By.id("item_4_title_link"));
		
		//skipping the entire driver. syntax of the webelement and using the variable element.
		//product.click();
			String backpack = product.getText();
			//System.out.println(backpack);
		
		if(backpack.contains("Sauce Backpack")) {
			System.out.println("The product is available on the page");
		}
		
		else {
			System.out.println("It is not available");
		}
//Adding the product to cart	
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//Clicking on add to cart
		WebElement cart = driver.findElement(By.className("shopping_cart_link"));
		
		cart.click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
		
		
	}


//Where the automation user do not have data or don't know exactly where the error is, then we use try catch block.
	
	
/*
//initialization, Conditon, incremental/decremental
for(int s=0 ;s<user.length; s++) {
	
	System.out.println(user[s]);
	driver.findElement(By.name("user-name")).sendKeys(user[s]);
	Thread.sleep(2000);
	//driver.findElement(By.name("user-name")).clear();
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	
	driver.findElement(By.name("login-button")).click();
	
	
try {
	driver.findElement(By.id("react-burger-menu-btn")).click();	
	Thread.sleep(2000);
	driver.findElement(By.id("logout_sidebar_link")).click();
}
catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
	Thread.sleep(2000);
	driver.navigate().refresh();

}*/
	
//}

	}

}
