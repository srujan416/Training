package automationTesting;

import java.util.ArrayList;
import java.util.List;




public class Arrays {

	public static void main(String[] args) {
		
		MethodsDemo d= new MethodsDemo();
		
		//d.getData();
		
		// TODO Auto-generated method stub
//Array
//To get how many values are stored in an array the syntax is "arrayname.length"
		//5 bowls(Index) - one gulabjamun (values)
int [] user1 = new int[5];
user1[0]= 1;
user1[1]= 9;
user1[2]= 476454;
user1[3]= 34;
user1[4]= 45;

// At the same time you are getting a bowl and also gulbajamun. Zero bowl - 1st gulab

//Length of this array is 9 - it starts from 1,2,3,4,.....
//max index value is 8 - it starts from 0,1,2,3,....
int [] integers = {2,3,4,5,6,789,76,87,65};
System.out.println(integers[0] + " This is a value of an integer array");
System.out.println(integers.length + " This is the length of the integer array");

//****************----0th Index---**---1st Index---**--2nd Index--**--3rd Index-----**
String [] user = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};

//Length of the array
System.out.println(user.length + " This is the length of String array");
System.out.println(user[2] + " This is the 2nd index value of a String array");

//Array syntax - Datatype [] variable name = {value1, value2, value3};

//******************************Angular brackets*****
//Array List syntax - ArrayList <Data type> variable name = new ArrayList<Data type>;

//Array List - Both Static and Dynamic Arrays.

ArrayList <String> usernameList = new ArrayList<String>();
//array a[1] = "standard_user"
usernameList.add("standard_user");
usernameList.add("locked_out_user");
usernameList.add("another user");
System.out.println("********************************");

System.out.println("********************************");

//Size of the array list
System.out.println(usernameList.size() + " This is the size of the array list");
System.out.println("********************************");
System.out.println(usernameList.get(1)+ " This is the 1st index value of the array list");

usernameList.remove(2);

//To get how many values are stored in an array the syntax is "arrayname.size()"
System.out.println(usernameList.size() +" Size of the array after removing");

System.out.println(usernameList.get(2));	

List<String> convertUserList = Arrays.asList(user);

System.out.println(convertUserList.size()+" This is the size of converted array list");

//Instead of writing for loop standard syntax ( i=0; i<arraylist.size; i++)
for(String completeList:convertUserList ) {

System.out.println(completeList + " This is complete list at a time");
}


ArrayList <String> name = new ArrayList<String>();
name.add("Shrujan kumar Selenium");

//name.get(1)
//Split and Trim
String s = "Shrujan kumar Selenium";
System.out.println(s);
String[] a = s.split(" ");

System.out.println(a[1]);
	}

	private static List<String> asList(String[] user) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
