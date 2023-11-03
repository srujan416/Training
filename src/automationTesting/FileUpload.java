package automationTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "D:\\Training\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd");
		
		driver.findElement(By.xpath("//*[@id=\"ajaxUpload\"]")).click();
		
		
		Runtime.getRuntime().exec("D:\\Training\\AutoIT\\ImageUpload.exe");
		
		
		
		
	}

}
