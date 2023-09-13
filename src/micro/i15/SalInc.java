package micro.i15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalInc {

	public static void main(String[] args) throws SQLException {

		DBConnection d = new DBConnection();
		Connection conn = d.getConn();
		
		String sql="update EMP_INFO set E_SAL=E_SAL+3000";
		PreparedStatement ps=conn.prepareStatement(sql);
		System.out.println("update");
		ps.execute();
		

	}

}
