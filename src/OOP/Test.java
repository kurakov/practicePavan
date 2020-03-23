package OOP;

interface A{
	int a=10; //by default static and final
	void m1();//abstract method by default public
}


public class Test implements A{//within the normal class methods by default are default

	public void m1() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
//		Test t=new Test();//Right
		
//		a t=new A();//incorrect
		
		A t= new Test();
		t.m1();
	}

}
