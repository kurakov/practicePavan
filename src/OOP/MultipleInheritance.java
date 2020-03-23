package OOP;

interface ABC{
	int a=10;
	void m1();
}

interface XYZ{
	int b=20;
	void m2();
}





public class MultipleInheritance implements ABC,XYZ{
	
	public void m1() {
		System.out.println(a);
	}
	public void m2() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		MultipleInheritance mi= new MultipleInheritance();
		mi.m1();
		mi.m2();
		

	}

}
