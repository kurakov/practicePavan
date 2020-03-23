/*
 * 1-declare an array
 * 2-insert values into array
 * 3-find size of an array
 * 4-read single value from an array
 * 5-read multiple values from an array
 */
public class SingleDimArray {

	public static void main(String[] args) {
	//aproach 1
		//declare an array
		int a[]=new int[5];//declaration
		
		//insert  values into array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a.length);
		//approach 2
		int b[]= {10,20,30,40,50};
		
		//find size of an array
		System.out.println(b.length);
		
		//read a single value from an array
		System.out.println(a[2]);//30
		
		//read multiple values from an array
		
		for(int i=2; i<5;i++) {
			System.out.println(a[i]);
		}
		
		//read multiple values from array using enhanced for loop
		for(int x:b) {
			System.out.println(x);
		}
	}
	
}
