package OOP;
//import OOP.Employee;

public class EmployeeMain {
	
	public static void main(String args[]) {
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Denys";
		emp1.deptno=10;
		emp1.job="Manager";
		emp1.display();

		Employee emp2=new Employee();
		emp2.eid=121;
		emp2.ename="Vasya";
		emp2.deptno=12;
		emp2.job="Mechanic";
		emp2.display();
	}
}
