package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		
		WebElement account = driver.findElement(By.id("nav-link-accountList"));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		builder.moveToElement(account).build().perform();
	 builder.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hEllo").doubleClick().build().perform();
		
	// builder.contextClick(account).build().perform();
	// builder.scrollToElement(driver.findElement(By.xpath("//*[@href=\"/privacyprefs?ref_=footer_iba\"]"))).build().perform();
	 driver.findElement(By.xpath("//*[@href=\"/privacyprefs?ref_=footer_iba\"]")).click();
	}

}
