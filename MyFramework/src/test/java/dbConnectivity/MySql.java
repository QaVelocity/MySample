package dbConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {
	/*
	 * public static void main(String[] args) { String organiseQuery =
	 * organiseQuery("S_rec", "rollNo", "Name", "11", "shikhar");
	 * 
	 * String organiseQuery1 = organiseQuery("hrTable", "rollNo", "defaulyter",
	 * "11", "tyrue"); System.out.println(organiseQuery1); }
	 */

	public static void main(String[] args) {
		// jdbc:mysql://localhost:3306/dbname
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String connectionStr = "jdbc:mysql://localhost:3306/studentdb";
			Connection con = DriverManager.getConnection(connectionStr, "root",
					"root");
			Statement st = con.createStatement();
			// st.execute("INSERT INTO S_Record (RollNo, Name) VALUES ('5', 'Ethen')");

			String organiseQuery = organiseQuery("S_Record", "RollNo", "Name",
					"6", "Farhan");
			// st.execute(organiseQuery);

			ResultSet rs = st.executeQuery("Select RollNo, Name from S_Record;");
			while (rs.next()!=false) {
				String colmnZero = rs.getString(1);
				String nameColumn = rs.getString("Name");
				System.out.println(colmnZero + " :: " + nameColumn);
			}
			
			st.executeUpdate("Update S_Record Set Name='Desire' where RollNo=4;");
			System.out.println("---- After Update");
			 rs = st.executeQuery("Select RollNo, Name from S_Record;");
				while (rs.next()==true) {
					String colmnZero = rs.getString(1);
					String nameColumn = rs.getString("Name");
					System.out.println(colmnZero + " :: " + nameColumn);
				}

			System.out.println("--Done--");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static String organiseQuery(String tableName, String col1Name,
			String col2Name, String col1Value, String col2Value) {
		// String string = "INSERT INTO " +tableName+ "("+ col1Name
		// +", "+col2Name+") VALUES ('"+col1Value+"', '"+col2Value+"')";
		// String string2 = "INSERT INTO".concat(tableName"(")+ col1Name
		// +", "+col2Name+") VALUES ('"+col1Value+"', '"+col2Value+"')";

		String format = String.format(
				"INSERT INTO %s (%s, %s) VALUES ('%s', '%s')", tableName,
				col1Name, col2Name, col1Value, col2Value);
		return format;
	}
}
