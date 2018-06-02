package com.Struts.database;
import java.sql.*;

public class JdbcDemo {
	String userCheck;
	String pass;
	static Connection con = DBConnection.getDBConnection();
	public Boolean checkUser(String user_name) throws Exception {
		PreparedStatement ps = con.prepareStatement("select * from user_details where user_name=?;");
		ps.setString(1, user_name);
		ResultSet res= ps.executeQuery();
		res.next();
		return res.first();
	}
	public String password(String user_name) throws Exception {
		PreparedStatement ps2 = con.prepareStatement("select * from user_details where user_name=?;");
		ps2.setString(1, user_name);
		ResultSet res= ps2.executeQuery();
		res.next();
		String pass=res.getString(3);
		return pass;
	}
	public String retrivePassword(String user_name,String email) throws Exception {
		PreparedStatement ps3= con.prepareStatement("select * from user_details where (user_name,email) =(?,?)");
		ps3.setString(1,user_name);
		ps3.setString(2, email);
		ResultSet res = ps3.executeQuery();
		res.next();
		if (res.first()==true) {
			pass=res.getString(3);
		}
		return pass;
	}
	
	public  void insertUser( String user_name, String password, String confirm_password,String phone_no,String emergency_contact,String joining_date,String email) throws SQLException{
		
		PreparedStatement ps1 =con.prepareStatement("insert into user_details (user_name,password,confirm_password,phone_no,emergency_contact,joining_date,email)values(?,?,?,?,?,?,?)");
		ps1.setString(1, user_name);
		ps1.setString(2,password);
		ps1.setString(3,confirm_password );
		ps1.setString(4,phone_no );
		ps1.setString(5,emergency_contact );
		ps1.setString(6,joining_date );
		ps1.setString(7, email);
		ps1.executeUpdate();
	}
	
}
