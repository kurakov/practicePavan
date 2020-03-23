
public class OperatorsDemo {
	public static void main(String[] args) {
		
		//1) Arithmetic operators + - * / %
		//works on number data types
		
		int a=10;
		int b= 20;
		
		System.out.println("Sum of a and b is:"+(a+b));//30
		System.out.println("Diff of b and a is:"+(b-a));//10
		System.out.println("Mul of aand b is:"+(a*b));//200
		System.out.println("Div of a and b is:"+(b/a));//2
		System.out.println("Mod Dif of a and b is:"+(b%a));//0
		
		//2) Relational/comparison operators > >= < <= != ==
		//Relational operators always return true/false (boolean value)
		
		System.out.println(a>b);//false
		System.out.println(b>a);//true
		System.out.println(a<b);//true
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		System.out.println(a!=b);//true
		System.out.println(a==b);//false
		
		//3) Logical operators &&(and)  ||(or) !(not)
		// Returns true/false(boolean)
		//Works between 2 or more boolean variable
		
		boolean x=true;
		boolean y=false;
		
		
		System.out.println(x && y);//false
		System.out.println(x|| y);//true
		System.out.println((!x));//false
		
	
	}
}
