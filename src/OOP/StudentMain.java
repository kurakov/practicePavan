package OOP;

public class StudentMain {

	public static void main(String[] args) {
		//Student stu =new Student();
		
		//approach 1: by using objects referance variables
		
		/*stu.sid=101;
		stu.sname="Ram";
		stu.grade='A';
		
		stu.display();*/
		
		//approach 2: by using a method
		
		/*stu.setData(102, "Deny", 'B');
		stu.display();*/
		
		
		//approach 3: by using constructor
		Student stu=new Student(103,"Scott", 'C');
		stu.display();
		
	}

}
