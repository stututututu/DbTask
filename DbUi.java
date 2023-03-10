package MySQL_Task;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DbUi {

	private String data;
	private String dbName;

	public DbUi() {

		JFrame jf = new JFrame();
		jf.setSize(300, 500);

		JTextField jtAdd = new JTextField();
		JButton jbDbcreat = new JButton("데이타베이스 생성");
		JButton jbDbdrop = new JButton("데이타베이스 삭제");
		JButton jbTbcreat = new JButton("테이블 생성");
		JButton jbTbdelete = new JButton("테이블 삭제");
		JButton jbDbmanager = new JButton("데이터 관리");
		JButton jbClose = new JButton("종료");

		JPanel jpMain = new JPanel();
		jpMain.setLayout(new GridLayout(7, 1, 10, 10));
		jpMain.setBorder(new EmptyBorder(10, 10, 10, 10));

		jpMain.add(jtAdd);
		jpMain.add(jbDbcreat);
		jpMain.add(jbDbdrop);
		jpMain.add(jbTbcreat);
		jpMain.add(jbTbdelete);
		jpMain.add(jbDbmanager);
		jpMain.add(jbClose);

		jf.add(jpMain, BorderLayout.CENTER);

		jbDbcreat.addActionListener(e -> {
			data = jtAdd.getText();
			dbName = data;
			new DbCreat(data);
		});

		jbDbdrop.addActionListener(e -> {
			data = jtAdd.getText();

			new Dbdrop(data);
		});

		jbTbcreat.addActionListener(e -> {
			data = jtAdd.getText();
			new Tbcreat(data, dbName);
		});
		jbTbdelete.addActionListener(e -> {
			data = jtAdd.getText();
			dbName = data;
			new Tbdelete(data, dbName);

		});
		jbDbmanager.addActionListener(e -> {
			data = jtAdd.getText();
			new Dbmanager(data);

		});
		jbClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		jf.setVisible(true);
	}
}
