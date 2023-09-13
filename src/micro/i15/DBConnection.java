package micro.i15;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public Connection conn;

	public Connection getConn() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Micro", "root", "root");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn; 

	}

}
