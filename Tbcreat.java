package MySQL_Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Tbcreat {
	
	private String data;
	
	
public Tbcreat(String data){

	String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
			+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

	String id = "root";
	String pw = "1234";

	try {
		Connection con = DriverManager.getConnection(url, id, pw);
		Statement stmt = con.createStatement();
		stmt.executeUpdate("CREATE TABLE IF NOT EXISTS DbTask."+data);
		System.out.println("Table Creat");
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println("error");
	}
}

}
