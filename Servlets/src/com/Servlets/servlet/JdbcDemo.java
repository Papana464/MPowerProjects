package com.Servlets.servlet;
import java.sql.*;

public class JdbcDemo {
	
	static Connection con = DBConnection.getDBConnection();
	
//	public static void main(String[] args) throws Exception {
//		JdbcDemo obj = new JdbcDemo();
//		obj.addUser("govardhan", 9886, "Hyd");
//		obj.updateUser("buddy",99667792);
//		selectUser();
//		
//	}
	/**
	 * This method will add user into contacts table
	 * @param name
	 * @param phoneNumber
	 * @param place
	 * @throws SQLException
	 */
	public  void addUser(String name, Integer phoneNumber, String place) throws SQLException{
		
		PreparedStatement ps1 =con.prepareStatement("insert into contacts (name,phone_no,place)values(?,?,?)");
		ps1.setString(1, name);
		ps1.setInt(2, phoneNumber);
		ps1.setString(3,place);
		ps1.executeUpdate();
	}
	public void updateUser(String name,Integer phoneNumber) throws SQLException{
		PreparedStatement ps2 = con.prepareStatement("update contacts set name = ? where phone_no = ?");
		ps2.setString(1, name);
		ps2.setInt(2, phoneNumber);
		ps2.executeUpdate();
	}
	public static  void selectUser() throws SQLException{
		Statement st=con.createStatement();
		ResultSet res= st.executeQuery("select * from contacts where phone_no=9886");
		while(res.next()){
			System.out.println(res.getString(4));
		}	
	}
}
