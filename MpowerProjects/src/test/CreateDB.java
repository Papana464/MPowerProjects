package test;


import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class CreateDB {
	static String st= null;
	static Connection con=DBConnection.getDBConnection();
	public static void main(String[] args) throws Exception {
		CreateDB obj= new CreateDB();
		obj.createDB();
		obj.createTable();
		}
	public void createDB() throws SQLException{
		con=DBConnection.getDBConnection();
		String st="CREATE DATABASE mpowerlogic";
		PreparedStatement stmt= con.prepareStatement(st);
		stmt.executeUpdate();
		System.out.println("Database created successfully...");
		
	}
	public void createTable() throws SQLException{
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mpowerlogic?verifyServerCertificate=false&useSSL=true", "root", "dntlvplz");
		
		String st2 = "CREATE TABLE task "  +
                "(id INTEGER not NULL, " +
                " task_name VARCHAR(255), " + 
                " task_description VARCHAR(255), " + 
                " PRIMARY KEY ( id ))";
		PreparedStatement stmt2= con1.prepareStatement(st2);
		stmt2.executeUpdate();
			String st1 = "CREATE TABLE consultants "  +
                "(id INTEGER not NULL, " +
                " name VARCHAR(255), " +
                " PRIMARY KEY ( id ))";
		PreparedStatement stmt1= con1.prepareStatement(st1);
		stmt1.executeUpdate();
		
		String st3 = "CREATE TABLE consultants_task_status "  +
                "(id INTEGER not NULL, " +
				"consultant_id Integer,"+"INDEX Key_idx (consultant_id) VISIBLE,FOREIGN KEY (consultant_id) REFERENCES consultants (id) ON DELETE NO ACTION ON UPDATE NO ACTION,"+ 
                " task_id Integer, " + "INDEX Key_idx1 (task_id) VISIBLE,FOREIGN KEY (task_id) REFERENCES task (id) ON DELETE NO ACTION ON UPDATE NO ACTION,"+
				"task_start_time Integer,"+
				"task_end_time Integer,"+
				"task_duration Integer,"+
				"grade_achieved VARCHAR(15),"+
                " PRIMARY KEY ( id ))";
		PreparedStatement stmt3= con1.prepareStatement(st3);
		stmt3.executeUpdate();
	}

}
