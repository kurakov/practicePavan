/*
 * 1-declare an array
 * 2-insert values into array
 * 3-find size of an array
 * 4-read single value from an array
 * 5-read multiple values from an array
 */
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][]/*[]a[] or [][]a - three of these types are correct*/=new int[3][2];//first is rows second is colomns
		//approach 1
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		
		//approach2
		
		int b[][]= {{10,20}, {30,40}, {50,60}};
		
		//find size of an array
		
		
		
		System.out.println(a.length);//3
		System.out.println(a[0].length);

		//read single value from an array
		System.out.println(a[1][1]);//40
		
		
		//read multiple values from an array using classic for loop
		for(int r=0;r<=2; r++) {//r=0
			for(int c=0;c<=1; c++) {//c=0
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		
		//enhanced for loop
		
		for(int e[]:b) {
			for(int v:e) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
	}

}
