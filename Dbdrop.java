package MySQL_Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbdrop {
	private String data;

	public Dbdrop(String data) {

		
		String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
				+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

		String id = "root";
		String pw = "1234";

			try {
				Connection con = DriverManager.getConnection(url, id, pw);
				System.out.println("conectiong succeed");
				Statement stmt = con.createStatement();
				stmt.executeUpdate("DROP SCHEMA IF EXISTS `"+data+"` ;");
				System.out.println("Drop DataBase");
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("error");
			}
	}
	
}
