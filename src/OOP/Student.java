package OOP;

public class Student {
	int sid;
	String sname;
	char grade;
	
	//Approach3: using constructor
	
	Student(int id, String name, char g){//Constructor
		sid=id;
		sname=name;
		grade=g;
	}
	
	//approach 2: by using a method
	
	void setData(int id, String name, char g) {
		sid=id;
		sname=name;
		grade=g;
	}
	
	void display() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(grade);
	}
}
