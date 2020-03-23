package Exceptions;

public class FinnalyExample {

	public static void main(String[] args) {
		System.out.println("Programm is started....");
		
		try {
			System.out.println(100/2);
		}
		catch(Exception e) {
			System.out.println("Exception Occured. Handled.");
		}
		finally {
			System.out.println("Entered in to finally block");
		}
		System.out.println("Program completed......");
	}

}
