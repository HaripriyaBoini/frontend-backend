package jdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
	
				 
		
				 
				
			 Class.forName("com.mysql.cj.jdbc.Driver");
			  
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school5","root","Mysql1@*,.");
			 
			
			
			 Statement stmt=con.createStatement();
			  
			 String insertQ="INSERT INTO students(name) VALUES('hp')";
			 
			 int result=stmt.executeUpdate(insertQ);
			 System.out.println(result);
			 System.out.println("inserted succesfully");
			 
			con.close();
			stmt.close();
			 
		 }
		 
		 


}
