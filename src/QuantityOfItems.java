import java.util.Scanner;

public class QuantityOfItems {

	public static void main(String[] args) {
		
		
		int money=100;
		
		int A=6;
		int B=7;
		
		int pA=7; //price of one A-item
		int pB=5; //price of one B-item
		
		
		int qpA =A*pA; //total price of items A
		int qpB =B*pB;; //total price of items B 
		int itemsTotal=qpA+qpB;
		
		System.out.println("Total price for item A...."+qpA);
		System.out.println("Total price for item B...."+qpB);
		System.out.println("total price for items...."+itemsTotal);
		
		boolean items=itemsTotal<money;
		if(items==true) {
			System.out.println("We can buy all items");
		}else {
			System.out.println("We need more money");
		}
	}

}
