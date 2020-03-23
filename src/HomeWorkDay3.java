import java.util.Scanner;

public class HomeWorkDay3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num=sc.nextInt(); //1234
		
		//1. Using algorithm
		
//		int rev=0;
//		while(num!=0) {
//			rev=rev*10+num%10;
//			num=num/10;
//		}
		
		//Using StringBuffer class
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//		System.out.println("Reverse Number is: "+rev);

		//StringBuilder class
		
		StringBuilder sbl= new StringBuilder();
		sbl.append(num);
		
		StringBuilder rev=sbl.reverse();
		System.out.println("Reverse Number is: "+rev);
		
		//StringBuffer
		
		System.out.println("Reverse value from StringBuffer is: "+new StringBuffer(String.valueOf(num)).reverse());
	}

}
