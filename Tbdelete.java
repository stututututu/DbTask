package MySQL_Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Tbdelete {
	
	private String data;
	private String dbName;
	
public Tbdelete(String data, String dbName) {
	// TODO Auto-generated constructor stub
	String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
			+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

	String id = "root";
	String pw = "1234";

	try {
		Connection con = DriverManager.getConnection(url, id, pw);
		System.out.println("connecting succeed");
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("DROP TABLE"+data+";");
		 
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println("error");
	}
}
}
