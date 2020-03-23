package accessmodifier2;

import accessmodifiers.A;

//public class Test {
//
//	public static void main(String[] args) {
//		
//		A aobj=new A();
//		aobj.a=100;
//		aobj.m1();
//	}
//
//}

// protected access
//public class Test extends A {
//
//	public static void main(String[] args) {
//		
//		Test aobj=new Test();
//		aobj.a=100;
//		aobj.m1();
//	}
//
//}

public class Test{

	public static void main(String[] args) {
		
		A aobj=new A();
		aobj.a=100;
		aobj.m1();
	}

}
