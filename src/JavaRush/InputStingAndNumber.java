package JavaRush;

import java.util.Scanner;

public class InputStingAndNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int age = scanner.nextInt();
		System.out.println("name is.."+name);
		System.out.println("age is..."+ age);
	}

//	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//	String name = reader.readLine();
//	String sAge = reader.readLine();
//	int nAge = Integer.parseInt(sAge);
}
