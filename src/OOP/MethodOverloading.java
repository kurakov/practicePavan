package OOP;

public class MethodOverloading {

	int x=100, y=200; //global variables/instance variables/class variables
//	void sum() {
//		int a,b;//local variables
//	}
	
	void sum() {
		System.out.println(x+y);
	}
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(int a, double b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
	MethodOverloading mo=new MethodOverloading();
	mo.sum();//1
	mo.sum(10,20);//2
	mo.sum(10,20.5);//3
	

	}

}
