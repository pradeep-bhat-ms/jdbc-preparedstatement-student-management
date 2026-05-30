package StudentDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");// LOAD DRIVER
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root", "root");// CREATE CONNECTION
		System.out.println("Connection Successful");
		// create database
//		Statement s=c.createStatement();
//		s.execute("create database if not exists student1");
//		System.out.println("database created Succefully");
		
		// CREATE TABLE
		
	
//		PreparedStatement ps=c.prepareStatement("create table if not exists std_details (std_id int primary key, std_name varchar(40), std_class int, std_subject varchar(30))");
//		ps.execute();
//		System.out.println("Table Created Successfully");
		
		// ---------------------------------------------------
		// INSERT OPERATION
		// ---------------------------------------------------

		Scanner sc = new Scanner(System.in);
//		
//		PreparedStatement insert =c.prepareStatement("insert into std_details(std_id,std_name, std_class, std_subject) values (?,?,?,?)");
//		System.out.println("enter id");
//		int id=sc.nextInt();
//		insert.setInt(1, id);
//		
//		System.out.println("enter name");
//		sc.nextLine();
//		String name=sc.nextLine();
//		insert.setString(2, name);
//		
//		System.out.println("enter class");
//		int classs=sc.nextInt();
//		insert.setInt(3, classs);
//		sc.nextLine();
//		
//		System.out.println("Enter subject");
//		String sub=sc.nextLine();
//		insert.setString(4, sub);
//		
//		
//		insert.execute();
//
//		System.out.println("Data Inserted Successfully");
		
		// ---------------------------------------------------
		// UPDATE OPERATION
		// ---------------------------------------------------
//
//		PreparedStatement update = c.prepareStatement(
//				"update std_details set std_subject=?,std_name=? ,std_class=? where std_id=?");
//
//		
//		System.out.println("enter new sub");
//		String newsub=sc.nextLine();
//		update.setString(1, newsub);
//		
//		
//		System.out.println("enter new name");
//		String newname=sc.nextLine();
//		update.setString(2, newname);
//		
//		
//		System.out.println("enter class");
//		int newclass= sc.nextInt();
//		update.setInt(3, newclass);
//		
//		System.out.println("Enter Id To Update");
//		int updateId = sc.nextInt();
//		update.setInt(4, updateId);
//
//		update.execute();
//
//		System.out.println("Data Updated Successfully");
		
		
		// ---------------------------------------------------
		// FETCH / SELECT OPERATION
		// ---------------------------------------------------
		
//		PreparedStatement fetch=c.prepareStatement("select * from std_details");
//		ResultSet rs = fetch.executeQuery();
//		
//
//		System.out.println("-------------------------------------");
//		System.out.println("ID\tNAME\t\t CLASS \t SUBJECT");
//		System.out.println("-------------------------------------");
//		
//		while(rs.next()) {
//			int std_id=rs.getInt("std_id");
//			String std_name=rs.getString("Std_name");
//			int std_class=rs.getInt("std_class");
//			String std_subject=rs.getString("std_subject");
//			
//			System.out.println(std_id +"\t"+ std_name +"\t\t"+ std_class+"\t"+ std_subject );
//		}
//			System.out.println("-------------------------------------");
//		
//		
//		
		
		// ---------------------------------------------------
		// DELETE OPERATION
		// ---------------------------------------------------
	
		PreparedStatement delete = c.prepareStatement("delete from std_details where std_id=?");

		System.out.println("Enter Id To Delete");
		int deleteId = sc.nextInt();
		delete.setInt(1, deleteId);
		delete.execute();

		System.out.println("Data Deleted Successfully");
		
		// ---------------------------------------------------
				// CLOSE RESOURCES
				// ---------------------------------------------------

//				rs.close();
//				insert.close();
//				update.close();
//				fetch.close();
				delete.close();
				c.close();
				sc.close();

				System.out.println("Connection Closed");
	}
}
