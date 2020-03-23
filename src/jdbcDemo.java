import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo{
	
	public static void main(String[] args) throws SQLException {
		// Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","Kurakov1990!");
		
		//2&3) statement  - create&execute statement(query);
		Statement stmt= con.createStatement();
		stmt.executeQuery("insert into student values(103, 'abc'), 90");
		
		con.close();
	}
	
}

