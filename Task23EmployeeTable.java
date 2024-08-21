package javapackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Task23EmployeeTable {

	public static void main(String[] args) throws SQLException {
		//1.create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/guvi", "root", "HANA2@legend");
		
		//2.create statement
		Statement stmt = con.createStatement();
		String s = "INSERT INTO EmployeeSalary (empcode, empname, empage, esalary) VALUES (101,'Jenny',25, 10000),(102,'Jacky',30, 20000), (103,'Joe',20, 40000), (104,'John',40, 80000), (105,'Shameer',25, 90000)";
		
		//3.execute statement
		
		stmt.execute(s);
		//4.close connection
		con.close();
		System.out.println("Query executed successfully");
		
		//

	}

}
