package AssignmentsDenys;

class ComputerTeacher {
	   String designation = "Teacher";
	   String collegeName = "BestQA";
	   void does(){
		System.out.println("Teaching");
	   }
	}

	public class TeacherDay6 extends ComputerTeacher{
	   String mainSubject = "Java";
	   public static void main(String args[]){
		TeacherDay6 obj = new TeacherDay6();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		obj.does();
	   }
	}