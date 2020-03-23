package OOP;

public class ConstructorOverloading {

	int x,y;
	double z;
	
	ConstructorOverloading(){// #1 without arguments/parameters = default constructor
		x=100;
		y=200;
		System.out.println(x+y);
	}
	
	
	ConstructorOverloading(int a, int b){ //#2 parameterized constructor
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int a, int b, double d){ //#3 parameterized constructor
		System.out.println(a+b+d);
	}
	
	
	
	public static void main(String[] args) {
		
		//ConstructorOverloading co= new ConstructorOverloading();//1
		//ConstructorOverloading co= new ConstructorOverloading(10,20);//2
		ConstructorOverloading co= new ConstructorOverloading(10,20, 20.5);
		
		
	}

}
