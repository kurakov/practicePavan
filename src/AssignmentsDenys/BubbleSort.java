package AssignmentsDenys;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {
	
		int a[]= {1,3,5,2,4,9,89,87,67};
		
		System.out.println("Array before sorting..."+Arrays.toString(a));
		
		
		
		int n=a.length;
		
		for (int i=0; i<n-1;i++){ //number of passes
			for(int j=0;j<n-1;j++) { //iterations in each pass
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting...."+Arrays.toString(a));
		
		//approach2
		int b[]= {1,3,5,2,4,9,89,87,67};
		Arrays.parallelSort(b);
		
		System.out.println("Array after sorting using parallelSort...."+Arrays.toString(b));
		
		//approach3
		Integer c[]= {1,3,5,2,4,9,89,87,67};
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println("Array after sorting using Sort...."+Arrays.toString(c));
		
		
	}

}
