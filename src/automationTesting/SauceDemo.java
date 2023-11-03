package automationTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

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
		
		String productName = driver.findElement(By.id("item_4_title_link")).getText();
		//System.out.println(productName);
		
		ArrayList <String> usernameList = new ArrayList<String>();

	
		List<WebElement>  pro = driver.findElements(By.xpath("(//*[@class=\"inventory_item_name\"])"));
		

	System.out.println(pro.size());
	
	int proSize=pro.size();

		
for(int i=0; i<proSize; i++) {
	
	String productNames = driver.findElement(By.id("item_"+i+"_title_link")).getText();
	usernameList.add(productNames);
	System.out.println(usernameList.get(i)+ " This is the product name that is stored in the array list.");
}
System.out.println(usernameList.get(4)+ " This is the product name that is stored in the array list.");


String[] splittedString=usernameList.get(1).split("Sauce");

System.out.println(splittedString[1]);

driver.close();

	}

}
