package micro.i15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalMax {

	public static void main(String[] args) throws SQLException {

		DBConnection d = new DBConnection();
		Connection conn = d.getConn();

		String sql = "select * from Emp_INFO where E_SAL<50000";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(1)+"   "+rs.getString(2) +"  "+rs.getString(3));
		}

	}

}
