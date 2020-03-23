
public class LoopsPracticse {

	public static void main(String[] args) {

		//for
		for( int i=1; i<=10; i++) {
			System.out.println(i);
			if(i%2==0) {
				System.out.println("Hi this is java");
			}
		}
		
		
		//while
		int a=1;
		while(a<=10) {
			System.out.println(a);
			a++;
			
			if(a%2==0) {
				System.out.println("this is java");
			}
		}
		
		//do-while
		
		int b=1;
		do {System.out.println(b);
		b++;
		}
		while (b<=10);
		

	}

}
