package MySQL_Task;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Dbmanager {

	public Dbmanager(String data) {
		// TODO Auto-generated constructor stub
		 JFrame jf = new JFrame();
		 jf.setSize(300, 400);
		 
		 JPanel jpMain = new JPanel(new GridLayout(5, 5, 10, 10));
		 jpMain.setBorder(new EmptyBorder(10, 10, 10, 10));
		 
		 JTextField jtAdd = new JTextField("입력");
		 JButton jbDadd = new JButton("데이터 추가");
		 JButton jbDdelete = new JButton("데이터 삭제");
		 JButton jbDchange = new JButton("데이터 변경");
		 JButton jbDview = new JButton("데이터 보기");	 
		 
		 
		 jpMain.add(jtAdd);
		 jpMain.add(jbDadd);
		 jpMain.add(jbDdelete);
		 jpMain.add(jbDchange);
		 jpMain.add(jbDview);
		
		 jf.add(jpMain);
		 
		 jf.setVisible(true);
		 
		 jbDadd.addActionListener(e ->{
			 new Dadd();
		 });
		 jbDview.addActionListener(e ->{
			try {
				Connection con = DriverManager.getConnection(data, data, data);
				Statement stmt;
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * from"+data+"\\G");
				System.out.println(rs);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		 });
	}
}
