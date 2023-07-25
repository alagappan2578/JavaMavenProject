package in.alagappan.sportshub.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {
	// this method use when ever we connect with database. 
	public static Connection getConnection() {
		Connection connection = null;
		String url = null;
		String userName = null;
		String password = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(
			  "jdbc:mysql://aws.connect.psdb.cloud/demo_project?sslMode=VERIFY_IDENTITY",
			  "mmrhu53pr1829maijp8m",
			  "pscale_pw_q3QGD7QBYpgelODpVy30OpNHorGgx6fT2JPV2XS53p");
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection(url, userName, password);
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		return connection;
	}
	public static void close(Connection connection, PreparedStatement ps) {
		try {
			if(ps != null) {
				ps.close();
			}
			if(connection != null) {
				connection.close();
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection connection, PreparedStatement ps, ResultSet rs) {
		try {
			// the order of close is important.
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}
			if(connection != null) {
				connection.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
