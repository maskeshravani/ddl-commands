package comexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateEx {

	public void CreateTable() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		PreparedStatement p = c.prepareStatement("create table Stud(id int, name varchar(30), age int, marks int )");
		System.out.println("Table is Created Succesfully.....");
		p.execute();
		// c.commit();
		c.close();
	}

	public void alterTable() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		PreparedStatement p = c.prepareStatement("alter table Stud add address varchar(50)");
		System.out.println("Fild added Succesfully....");
		p.execute();
		c.close();
	}

	public void truncateTable() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		PreparedStatement p = c.prepareStatement("truncate table student");
		System.out.println("Table is emplty.....");
		p.execute();
		c.close();
	}

	public void dropTable() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1197", "root", "root");

		PreparedStatement p = c.prepareStatement("drop table Stud");
		System.out.println("Table is Deleted Succesfully.....");
		p.execute();
		c.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CreateEx c = new CreateEx();
		// c.CreateTable();
		// c.alterTable();
		c.truncateTable();
		// c.dropTable();

	}

}
