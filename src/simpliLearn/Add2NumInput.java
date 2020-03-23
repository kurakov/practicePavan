package simpliLearn;

import java.util.Scanner;

public class Add2NumInput {

	public static void main(String[] args) {
		// declare vatiables
		
		int num1, num2, result;
		String myString="";
		
		//to get input from user scanner class is used
		// create an instance of the scanner class
		
		Scanner inputobj = new Scanner(System.in);
		
		System.out.println("type yout string...");
		myString = inputobj.nextLine(); 
		System.out.println(myString);
		
		
		System.out.println("enter first number.....");
		
		num1= inputobj.nextInt();
		
		
		
		System.out.println("enter second number...");
		num2=inputobj.nextInt();
		
		result=num1+num2;
		
		System.out.println("result is.."+result);
		
		
		
		
		inputobj.close();
	}

}
