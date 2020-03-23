package AssignmentsDenys;
//Ref Link: https://www.youtube.com/watch?v=Jrr0bNcPFgo
public class MaxMinElementArray {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60};
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("maximum element is "+max);
	
	int min=a[0];
	for(int x=1;x<a.length;x++) {
		if(a[x]<min) {
			min=a[x];
		}
	}
	System.out.println("Minimum element is "+min);
	}

}
