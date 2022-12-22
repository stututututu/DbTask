package MySQL_Task;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Dadd {



	public Dadd() {
		// TODO Auto-generated constructor stub
		
		JFrame jf = new JFrame();
		jf.setSize(300, 300);
		
		JPanel jpMain = new JPanel();
		JPanel jpCenter = new JPanel(new GridLayout(3,2,10,10));
		JPanel jpBottom = new JPanel();
		
		JLabel jlName = new JLabel("이름");
		JLabel jlAdress = new JLabel("주소");
		JLabel jlPhonenum = new JLabel("전화번호");
		
		JTextField jtName = new JTextField();
		JTextField jtAdress = new JTextField();
		JTextField jtPhonenum = new JTextField();
		
		
		JButton jbAdd = new JButton("추가");
		
		jpCenter.add(jlName);
		jpCenter.add(jtName);
		jpCenter.add(jlAdress);
		jpCenter.add(jtAdress);
		jpCenter.add(jlPhonenum);
		jpCenter.add(jtPhonenum);
		
		jpBottom.add(jbAdd);
		

		jpMain.add(jpCenter, BorderLayout.CENTER);
		jpMain.add(jpBottom, BorderLayout.SOUTH);
		
		jf.add(jpMain);
		
		jf.setVisible(true);
		
		jbAdd.addActionListener(e -> {
			new AddBtn();
		});
		
	}
}
