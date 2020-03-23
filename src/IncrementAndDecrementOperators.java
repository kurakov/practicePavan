
public class IncrementAndDecrementOperators {
	public static void main(String[] args) {
		//++ increment
		//-- decfement
		
		int a= 10;
		//a++; //post increment
		//++a; // pre increment
		//System.out.println(a);//11
		
		int result1 = a++;
		System.out.println("post increment value is:"+result1);//10
		
		int b=10;
		int result2 = ++b;
		System.out.println("pre increment value is:"+result2);//11
		
		//--decrement
		int z=10;
		int result3=z--; //post decrement
		
		int y=10;
		int result4=--y;//pre decrement
		System.out.println("post decrement value is:"+result3);
		System.out.println("pre decrement value is:"+result4);
	}
}
 