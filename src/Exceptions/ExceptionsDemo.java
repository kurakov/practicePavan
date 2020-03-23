package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("programm is started......");
		System.out.println("programm is in process.......");
		System.out.print("Enter a number:....");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		try {
		System.out.println(100/num);
		}
		catch(Exception e) {
			System.out.println("exception is occured and handled. You have provided invalid input....");
		}
		finally {
			
		}
		
		
		System.out.println("programm is completed.....");
		System.out.println("programm is exited.....");
		

	}

}
