package accessmodifiers;

public class A{
//	private int a=100;// access only within the class
//	private void m1() {
//		System.out.println(a); 
//	}
	
//	 int a=100;
//	 void m1() {
//		System.out.println(a);
//	}
	
//	protected int a;
//	 protected void m1() {
//		System.out.println(a);
//	}
	
	public int a;
	 public void m1() {
		System.out.println(a);
	}
}
//public class Test extends A{
//	public static void main(String[] args) {
//		Test aobj = new Test();
//		aobj.a=100;// here we cannot access for private
//		aobj.m1();// here we cannot access  for private
//	}
//}
