package jDBCAssignment;

import java.sql.*;

import com.mysql.cj.xdevapi.Statement;
public class Employee{
	public static void main(String args[]) throws Exception
	{
		createTable();
		post();
		print();
	}
	public static void print() throws Exception
	{
		try 
		{
			Connection con = getConnection();
			PreparedStatement sort = con.prepareStatement("SELECT * FROM Employee ORDER BY age ASC");

			sort.executeQuery();

			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
			while (rs.next()) {
				int id = rs.getInt(1);
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				int age =rs.getInt("age");
				System.out.println("Id: " + id + ", First name: " + firstname + ", Last name: " + lastname+", Age: "+age);
			}} catch(Exception e){System.out.println(e);}
		finally {
			System.out.println("Insert Completed.");
		}
	}
	public static void post() throws Exception
	{
		final String str1="John";
		final String str2 ="Miller";
		final int age=22;
		try 
		{
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO Employee (firstname, lastname,age) VALUES ('"+str1+"', '"+str2+"', '"+age+"')");

			posted.executeUpdate();
		} catch(Exception e){System.out.println(e);}
		finally {
			System.out.println("Insert Completed.");
		}
	}
	public static void createTable() throws Exception
	{
		try
		{
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS Employee (id int NOT NULL AUTO_INCREMENT, firstname varchar(255), lastname varchar(255), age int, PRIMARY KEY(id))");
			create.executeUpdate();
		}catch(Exception e ){
			System.out.println(e);
		}
		finally{System.out.println("Function has been completed");}
	}
	public static Connection getConnection() throws Exception{
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/Employeedb";
			String username = "username";
			String password = "password";
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
		} catch(Exception e){System.out.println(e);}


		return null;
	}
}