package automationTesting;

import java.util.Iterator;

public class Products {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Declaration
		int a;
//initialization by assigning a value to the declared variable.
		 a=2;
		int i=10;
		 
		//for(Data type(mandatory unless we declare the variable beforehand)
		//Declaring/initializing the variable, condition i>5, incremental/decremental
		//login credentials - to validate all credentials working fine
		//Get the dynamic values from the application.
		
		//Lowest rating first to highest rating - Incremental - lowest to highest rating
		//Display the highest rate to lowest rate - decremental - highest cost to lowest cost
		
		//i=0 ---> after meeting the condition, enters in to the loop
		//i=0, i<=20 - these 2 will work in the 1st loop
		//from the 2nd loop onwards, i++, i<=20 will work.
		//********  <---- <---
		for( i=1; i<=50; i++) {
		
			//20 is the last value that is stored in the i variable.
		System.out.println(i+ " This is the value from the for loop");
		//loop did not end here.
		//i value got incremented again and now i =21.
		//As condition did not meet it ended with i=21 value.
		
				}
		//i value here? 
		System.out.println(i + " This is the value from the out of for loop");
		
	}

}
