package OOP;


/*
 *1- no params no written value
 *2-no params return value
 *3-take params no return
 *4- take params return a value
 * 
 */
public class Calculation {

	int x,y;
	//1- no params no written value
	
//	void add() {
//		System.out.println(x+y);
//	}
	
	
	//2-no params return value
	
//	int add() {
//		return(x+y);
//	}
	
	//3-take params no return 
	
//		void add(int a, int b) {
//			System.out.println(a+b);
//		}
	
	
	//4-take params return value
	int add(int a, int b) {
		return(a+b);
	}
	
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		cal.x=100;
		cal.y=200;
		
//		cal.add(); //1
		
//		int res=cal.add();
//		System.out.println(res);//2
//		System.out.println(cal.add());
		
//		cal.add(10, 20); //3
		
		int res=cal.add(100, 200); //4
		System.out.println(res);
		
 
	}

}
