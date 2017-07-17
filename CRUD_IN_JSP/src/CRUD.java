import java.sql.*;

public class CRUD {
	
	public static Connection getConnection() {
		System.out.println("Inside connection");
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","dpchn");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	static int insert(User u) {
		int status = 0;
		System.out.println("Inside CRUD insert");
		Connection con = getConnection();
		String sql = "insert into register(name, age, email, password) values(?,?,?,?)";
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		
/*		ps.setString(1, u.getName());
		ps.setInt(2, u.getAge());
		ps.setString(3, u.getEmail());
		ps.setString(4, u.getPassword());*/
		
		
		ps.setString(1, "XYZ");
		ps.setInt(2, 20);
		ps.setString(3, "jkas@gmail.com");
		ps.setString(4, "01233654");
		
		
		status =ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error while inserting"+ e);
		}
		return status;
	}
	


}
