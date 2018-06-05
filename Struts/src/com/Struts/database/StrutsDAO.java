package com.Struts.database;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class StrutsDAO {
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
	
	public List<Object> getUserList() throws SQLException{
		PreparedStatement ps4 =con.prepareStatement("select * from user_details");
		ResultSet rs1 = ps4.executeQuery();
		List<Object> userList = new ArrayList<>();
		while(rs1.next()) {
			int id = rs1.getInt("user_id");
			String name = rs1.getString("user_name");
			String phnNo = rs1.getString("phone_no");
			String emailId = rs1.getString("email");
			String date = rs1.getString("joining_date");
			userList.add(id);
			userList.add(name);
			userList.add(phnNo);
			userList.add(emailId);
			userList.add(date);

		}
		
		return userList;
	}	
}
