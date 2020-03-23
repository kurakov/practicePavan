package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		
		//1) Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Kurakov1990!");

		//2 & 3) Statement - create & execute execute statement(query)
		Statement stmt=con.createStatement();
		stmt.execute("insert into student values(103,'abc', 12);");
		stmt.execute("update student set sname='JOHN' where sno=103;");
		stmt.execute("delete from student where sno=102;");
		
		ResultSet rs=stmt.executeQuery("select * from student;");
		
//		4) print data from rs
		while(rs.next())
		{
			String sNumber=rs.getString("sno");
			String sName=rs.getString("sname");
			String sMarks=rs.getString("marks");
			
			System.out.println(sNumber+"   "+sName+"   "+sMarks);
		}
		
		
		con.close();
		
		System.out.println("Program is completed....");
	}

}