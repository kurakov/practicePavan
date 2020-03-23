package simpliLearn;

public class WelcomeTest {

//	public void addNumbers() {
//		int x,y;
//		x=10;
//		y=20;
//		System.out.println(x+y);
//	}
	
//	public int addNumbers(int x, int y) {
//		int result;
//		result=x+y;
//		System.out.println("the sum of two..."+result);
//		return result;
//	}
	
	public int addNumbers(int x, int y) {
		return (x+y);
	}
	
	public static void main(String[] args) {
//		WelcomeTest addN= new WelcomeTest();
//		addN.addNumbers();
		
//		WelcomeTest addN= new WelcomeTest();
//		addN.addNumbers(10, 20);
		
		WelcomeTest addN= new WelcomeTest();
		System.out.println("thw sum of two numbers...."+addN.addNumbers(10, 20));
		

	}

}
