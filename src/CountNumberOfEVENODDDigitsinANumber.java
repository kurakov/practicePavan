
public class CountNumberOfEVENODDDigitsinANumber {

	public static void main(String[] args) {
		 int num=1234432111;
		 
		 int even_count=0;
		 int odd_count=0;
		 
		 while(num>0) {//1234  123   12 1
			  int remainder=num%10;//4  3  2 1
			  if(remainder%2==0) {
				  even_count++;//1 2
			  }
			  else {
				  odd_count++;//1 2
			  }
			  
			  num=num/10;//123  12  1
		 }
		 System.out.println("Even count is: "+even_count);
		 System.out.println("Odd count is: "+odd_count);

	}

}
