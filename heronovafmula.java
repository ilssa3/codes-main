import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class heronovafmula extends JFrame {

	private JPanel contentPane;
	private JTextField str1;
	private JTextField str2;
	private JTextField str3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					heronovafmula frame = new heronovafmula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public heronovafmula() {
		setTitle("\u041D\u0430\u043C\u0438\u0440\u0430\u043D\u0435 \u043D\u0430 \u0442\u0440\u0438\u044A\u0433\u044A\u043B\u043D\u0438\u043A ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 635);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setForeground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "*", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		panel.setToolTipText("");
		panel.setBackground(new Color(188, 143, 143));
		panel.setBounds(-36, 10, 131, 279);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(54, -24, 146, 68);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "-", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(153, 50, 204)));
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(437, 310, 131, 279);
		contentPane.add(panel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(188, 143, 143));
		panel_1_1.setBounds(318, 545, 146, 68);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel = new JLabel("\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0441\u0442\u0440\u0430\u043D\u0438\u0442\u0435 \u043D\u0430 \u0442\u0440\u0438\u044A\u0433\u044A\u043B\u043D\u0438\u043A\u0430:");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lblNewLabel.setBounds(111, 54, 362, 73);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0441\u0442\u0440.1:");
		lblNewLabel_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(111, 111, 70, 73);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u0441\u0442\u0440.2:");
		lblNewLabel_1_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(111, 163, 70, 73);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u0441\u0442\u0440.3:");
		lblNewLabel_1_2.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lblNewLabel_1_2.setBounds(111, 217, 70, 73);
		contentPane.add(lblNewLabel_1_2);
		
		str1 = new JTextField();
		str1.setBounds(201, 130, 117, 30);
		contentPane.add(str1);
		str1.setColumns(10);
		
		str2 = new JTextField();
		str2.setColumns(10);
		str2.setBounds(201, 187, 117, 30);
		contentPane.add(str2);
		
		str3 = new JTextField();
		str3.setColumns(10);
		str3.setBounds(201, 241, 117, 30);
		contentPane.add(str3);
		
		JLabel lblNewLabel_2 = new JLabel("\u041E\u0431\u0438\u043A\u043E\u043B\u043A\u0430:");
		lblNewLabel_2.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(46, 322, 99, 73);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u041B\u0438\u0446\u0435:");
		lblNewLabel_2_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lblNewLabel_2_1.setBounds(46, 383, 70, 73);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("\u0412\u0438\u0434 \u0441\u043F\u043E\u0440\u0435\u0434 \u0441\u0442\u0440:");
		lblNewLabel_2_2.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lblNewLabel_2_2.setBounds(46, 448, 154, 73);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel ob1 = new JLabel("");
		ob1.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		ob1.setBounds(179, 322, 154, 73);
		contentPane.add(ob1);
		
		JLabel lic1 = new JLabel("");
		lic1.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		lic1.setBounds(155, 383, 154, 73);
		contentPane.add(lic1);
		
		JLabel vid1 = new JLabel("");
		vid1.setFont(new Font("Palatino Linotype", Font.PLAIN, 19));
		vid1.setBounds(211, 448, 154, 73);
		contentPane.add(vid1);
		
		JButton izch = new JButton("\u0418\u0437\u0447\u0438\u0441\u043B\u0438");
		izch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = str1.getText();
				String s2 = str2.getText();
				String s3 = str3.getText();
				
				int s11=Integer.parseInt(s1);
				int s22=Integer.parseInt(s2);
				int s33=Integer.parseInt(s3);
				
				int ob = s11+s22+s33;
				String obikolka = Integer.toString(ob);
				ob1.setText(obikolka);
				
				double lice =  Math.sqrt((ob/2)*(ob/2-s11)*(ob/2-s22)*ob/2-s33);
				String licee =Double.toString(lice);
				lic1.setText(licee);
				
				if (s11==s22&&s11==s33)vid1.setText("Равностранен");
				else if (s11==s22||s22==s33||s11==s33)vid1.setText("Равнобедрен");
				else vid1.setText("Разностранен");
			}
		});
		izch.setBackground(new Color(173, 216, 230));
		izch.setFont(new Font("Palatino Linotype", Font.PLAIN, 17));
		izch.setBounds(369, 134, 131, 40);
		contentPane.add(izch);
		
		JButton exc = new JButton("\u0418\u0437\u0445\u043E\u0434");
		exc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exc.setBackground(new Color(176, 224, 230));
		exc.setFont(new Font("Palatino Linotype", Font.PLAIN, 17));
		exc.setBounds(369, 217, 131, 40);
		contentPane.add(exc);
	}
}
