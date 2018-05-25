package test;
import java.sql.*;

public class JdbcDemo {
	
	static Connection con = DBConnection.getDBConnection();
	static String pass;
	public static void main(String[] args) throws Exception {
		JdbcDemo obj = new JdbcDemo();
//		obj.addUser("govardhan", 9886, "Hyd");
//		obj.updateUser("buddy",99667792);
		obj.checkUser("nani");
		
	}
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
	public void checkUser(String user_name) throws Exception {
		PreparedStatement ps = con.prepareStatement("select * from user_details where user_name=?;");
		ps.setString(1,user_name );
		ResultSet res= ps.executeQuery();
		res.next();
		pass=res.getString(3);
		System.out.println(pass);
		
	}
}
