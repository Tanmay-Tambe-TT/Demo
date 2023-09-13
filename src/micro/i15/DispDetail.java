package micro.i15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DispDetail {

	public static void main(String[] args) throws SQLException {

		DBConnection d = new DBConnection();
		Connection conn = d.getConn();

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the Employee ID");
		String i = sc.nextLine();
		sc.close();
		String sql = "select * from EMP_INFO where E_ID=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, i);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(1) + "    " + rs.getString(2) + "     " + rs.getString(3));
		}

	}

}
