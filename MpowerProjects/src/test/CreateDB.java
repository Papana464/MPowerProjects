package test;


import java.sql.Connection;
//import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class CreateDB {
	static String st= null;
	Connection con=DBConnection.getDBConnection();
	public static void main(String[] args) throws Exception {
		CreateDB obj= new CreateDB();
		obj.createDB();
		obj.createTable();
		}
	public void createDB() throws SQLException{
		Connection con=DBConnection.getDBConnection();
		String st="CREATE DATABASE registration";
		PreparedStatement stmt= con.prepareStatement(st);
		stmt.executeUpdate();
		System.out.println("Database created successfully...");
		
	}
	public void createTable() throws SQLException{
		Connection con=DBConnection.getDBConnection();
		String st1 = "CREATE TABLE REGISTRATION "  +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))";
		PreparedStatement stmt1= con.prepareStatement(st1);
		stmt1.executeUpdate();
	}

}
