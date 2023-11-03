package automationTesting;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Dynamic Testing - To capture elements or values dynamically from the page instead of hard coding in the code.

public class ProductsList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		
		MethodsDemo getMethod = new MethodsDemo();	
		//invoke the browser and get the URL and login functionality.
		WebDriver driver = new ChromeDriver();
		getMethod.ChromeBrowser();
		
		//getMethod.EdgeBrowser();
		
		//Initiating a array list
		ArrayList <String> proNameList = new ArrayList<String>();

		//Products List
		List<WebElement>  proList = driver.findElements(By.xpath("//*[@class=\"inventory_item_name\"]"));
		
	//this is the output for the size of the array list.			
	System.out.println(proList.size());
	
	//String variable - we can store only 1 value and String Array - we can store more than 1, arrayList.add("Izzat")
//arrayList - both Shrujan and Izzat
	int proSize=proList.size();

//Initialize the variable - We have a dabba in our kitchen with name -"Salt" - Empty dabba

	

	String proName= null;
	
for(int i=0; i<proSize; i++) {
	
	//Replaces the value in the variable.
	//In array only we can store multiple values
	
	//Storing the product name into a variable.
	String [] productNames = driver.findElement(By.id("item_"+i+"_title_link")).getText().split("Sauce Labs");
try {
	

			//Getting the 1st index of splitted name value
	 System.out.println(productNames[1]);
	 
	 //Trimming the splitted value.
		  proName = productNames[1].trim();
	
} catch (Exception e) {
	// TODO: handle exception
}

	
	
	/*1st loop - 1st pro from the variable productNames - 0th index
	2nd loop - 2nd pro from the variable productNames - 1st index
	3rd loop - 3rd pro from the variable productNames - 2nd index
	5th loop - 5th pro from the variable productNames - 4th index
	
	Array List - proNameList - All the 5 products

	*/
	// System.out.println("*********************************");
	//System.out.println(productNames + i + " This is the product name that is stored in the variable");
	
	//Adding the stored product name to an Array list.
	
	proNameList.add(proName);
	
	
	
	//System.out.println(proNameList.get(0));
	//
	//System.out.println(proNameList.get(i)+ " This is the product name that is stored in the array list.");
}

//System.out.println(proNameList + " What is the output that we get here?");



//We will get entire list of values.
//The syntax to get all the values in an array list - Data type..variable name : ArrayList Name
for ( String entireList:proNameList) {
	
	System.out.println(entireList);
	
}


System.out.println(proNameList.get(1)+ " This is the product name that is stored in the array list.");



String[] splittedString=proNameList.get(1).split("Sauce Labs");

//System.out.println(splittedString[1].trim());


//all the products or only 1 product  - All the products.


Thread.sleep(2000);
try {
	
} catch (Exception e) {
	driver.close();
}

	}

}
