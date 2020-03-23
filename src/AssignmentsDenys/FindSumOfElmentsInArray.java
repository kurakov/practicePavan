package AssignmentsDenys;
//https://www.youtube.com/watch?v=BDvYp3GbfU4
public class FindSumOfElmentsInArray {

	public static void main(String[] args) {
		//first  approach
		int a[]= {5,2,7,9,6}; 
		
		int sum=0;

		/*for(int i=0;i<=a.length-1; i++) { 
			sum=sum+a[i];
		}*/
		
		//Enhanced for loop
		
		for(int value:a) {
			sum=sum+value;
		}
		
		System.out.println("Sum of elements in array is: "+sum);
	}

}