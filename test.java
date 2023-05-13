import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setAlwaysOnTop(true);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 844, 757);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(51, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" \u0422\u0415\u0421\u0422 ");
		lblNewLabel.setBounds(313, 30, 204, 47);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("*********************************************");
		lblNewLabel_1.setBounds(188, 60, 416, 47);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 17));
		lblNewLabel_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("1* \u041F\u0440\u0435\u0437 \u043A\u043E\u044F \u0433\u043E\u0434\u0438\u043D\u0430 \u0441\u0435 \u0441\u044A\u0437\u0434\u0430\u0432\u0430 \u0411\u0420\u0426\u041A \u0432 \u0411\u0443\u043A\u0443\u0440\u0435\u0448?");
		lblNewLabel_1_1.setBounds(17, 117, 500, 47);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Sitka Subheading", Font.BOLD, 21));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton b11 = new JRadioButton("1877");
		b11.setBounds(47, 170, 86, 35);
		buttonGroup.add(b11);
		b11.setHorizontalAlignment(SwingConstants.CENTER);
		b11.setForeground(new Color(102, 0, 0));
		b11.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11);
		
		JRadioButton b12 = new JRadioButton("1872");
		b12.setBounds(272, 170, 86, 35);
		buttonGroup.add(b12);
		b12.setHorizontalAlignment(SwingConstants.CENTER);
		b12.setForeground(new Color(102, 0, 0));
		b12.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b12);
		
		JRadioButton b13 = new JRadioButton("1870");
		b13.setBounds(505, 170, 86, 35);
		buttonGroup.add(b13);
		b13.setHorizontalAlignment(SwingConstants.CENTER);
		b13.setForeground(new Color(102, 0, 0));
		b13.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b13);
		
		JRadioButton b14 = new JRadioButton("1869");
		b14.setBounds(714, 170, 86, 35);
		buttonGroup.add(b14);
		b14.setHorizontalAlignment(SwingConstants.CENTER);
		b14.setForeground(new Color(102, 0, 0));
		b14.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b14);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("2* \u041D\u0430 \u043A\u043E\u044F \u0434\u0430\u0442\u0430 \u0435 \u0442\u0440\u044F\u0431\u0432\u0430\u043B\u043E \u043F\u043E \u043F\u043B\u0430\u043D \u0434\u0430 \u0438\u0437\u0431\u0443\u0445\u043D\u0435 \u0410\u043F\u0440\u0438\u043B\u0441\u043A\u043E\u0442\u043E \u0432\u044A\u0441\u0442\u0430\u043D\u0438\u0435?");
		lblNewLabel_1_1_1.setBounds(17, 211, 736, 47);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Sitka Subheading", Font.BOLD, 21));
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("3* \u041A\u043E\u0433\u0430 \u0435 \u0438\u0437\u0431\u0443\u0445\u043D\u0430\u043B\u043E \u041A\u0440\u0435\u0441\u043D\u0435\u043D\u0441\u043A\u043E - \u0420\u0430\u0437\u043B\u043E\u0436\u043A\u043E\u0442\u043E \u0432\u044A\u0441\u0442\u0430\u043D\u0438\u0435?");
		lblNewLabel_1_1_1_1.setBounds(17, 319, 736, 47);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Sitka Subheading", Font.BOLD, 21));
		lblNewLabel_1_1_1_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("4* \u041D\u0430 \u043A\u043E\u044F \u0434\u0430\u0442\u0430 \u0441\u0435 \u043F\u0440\u0438\u0435\u043Ca \u041F\u044A\u0440\u0432\u0430\u0442\u0430 \u0431\u044A\u043B\u0433\u0430\u0440\u0441\u043A\u0430 \u041A\u043E\u043D\u0441\u0442\u0438\u0442\u0443\u0446\u0438\u044F?");
		lblNewLabel_1_1_1_2.setBounds(17, 413, 622, 47);
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Sitka Subheading", Font.BOLD, 21));
		lblNewLabel_1_1_1_2.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("5* \u041A\u043E\u0439 \u0435 \u043F\u044A\u0440\u0432\u0438\u044F \u0431\u044A\u043B\u0433\u0430\u0440\u0441\u043A\u0438 \u043A\u043D\u044F\u0437 \u0441\u043B\u0435\u0434 \u041E\u0441\u0432\u043E\u0431\u043E\u0436\u0434\u0435\u043D\u0438\u0435\u0442\u043E?");
		lblNewLabel_1_1_1_3.setBounds(17, 507, 602, 47);
		lblNewLabel_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_3.setFont(new Font("Sitka Subheading", Font.BOLD, 21));
		lblNewLabel_1_1_1_3.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("6* \u041F\u0440\u0435\u0437 \u043A\u043E\u044F \u0433\u043E\u0434\u0438\u043D\u0430 \u0435 \u0421\u044A\u0435\u0434\u0438\u043D\u0435\u043D\u0438\u0435\u0442\u043E?");
		lblNewLabel_1_1_1_4.setBounds(17, 601, 500, 47);
		lblNewLabel_1_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_4.setFont(new Font("Sitka Subheading", Font.BOLD, 21));
		lblNewLabel_1_1_1_4.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1_1_1_4);
		
		JRadioButton b11_1 = new JRadioButton("1-\u0432\u0438 \u043C\u0430\u0439 1877");
		b11_1.setBounds(47, 264, 145, 35);
		buttonGroup_1.add(b11_1);
		b11_1.setHorizontalAlignment(SwingConstants.CENTER);
		b11_1.setForeground(new Color(102, 0, 0));
		b11_1.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11_1);
		
		JRadioButton b22 = new JRadioButton("1-\u0432\u0438 \u043C\u0430\u0439 1876\r\n");
		b22.setBounds(300, 264, 152, 35);
		buttonGroup_1.add(b22);
		b22.setHorizontalAlignment(SwingConstants.CENTER);
		b22.setForeground(new Color(102, 0, 0));
		b22.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b22);
		
		JRadioButton b11_1_1 = new JRadioButton("20-\u0442\u0438 \u0430\u043F\u0440\u0438\u043B 1876");
		b11_1_1.setBounds(567, 264, 186, 35);
		buttonGroup_1.add(b11_1_1);
		b11_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		b11_1_1.setForeground(new Color(102, 0, 0));
		b11_1_1.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11_1_1);
		
		JRadioButton b11_1_2 = new JRadioButton("5 \u043E\u043A\u0442. 1889\r\n");
		b11_1_2.setBounds(47, 372, 145, 35);
		buttonGroup_2.add(b11_1_2);
		b11_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		b11_1_2.setForeground(new Color(102, 0, 0));
		b11_1_2.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11_1_2);
		
		JRadioButton b11_1_3 = new JRadioButton("9 \u0441\u0435\u043F\u0442. 1888\r\n");
		b11_1_3.setBounds(307, 372, 145, 35);
		buttonGroup_2.add(b11_1_3);
		b11_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		b11_1_3.setForeground(new Color(102, 0, 0));
		b11_1_3.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11_1_3);
		
		JRadioButton b11_1_4 = new JRadioButton("5 \u043E\u043A\u0442. 1878");
		b11_1_4.setBounds(567, 372, 145, 35);
		buttonGroup_2.add(b11_1_4);
		b11_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		b11_1_4.setForeground(new Color(102, 0, 0));
		b11_1_4.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11_1_4);
		
		JRadioButton b11_1_5 = new JRadioButton("1-\u0432\u0438 \u043C\u0430\u0439 1880\r\n");
		b11_1_5.setBounds(560, 466, 152, 35);
		buttonGroup_3.add(b11_1_5);
		b11_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		b11_1_5.setForeground(new Color(102, 0, 0));
		b11_1_5.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11_1_5);
		
		JRadioButton b11_1_6 = new JRadioButton("24 \u043C\u0430\u0439 1883\r\n");
		b11_1_6.setBounds(313, 466, 145, 35);
		buttonGroup_3.add(b11_1_6);
		b11_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		b11_1_6.setForeground(new Color(102, 0, 0));
		b11_1_6.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11_1_6);
		
		JRadioButton b11_1_7 = new JRadioButton("16 \u0430\u043F\u0440\u0438\u043B 1879");
		b11_1_7.setBounds(47, 466, 159, 35);
		buttonGroup_3.add(b11_1_7);
		b11_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		b11_1_7.setForeground(new Color(102, 0, 0));
		b11_1_7.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11_1_7);
		
		JRadioButton b11_1_1_1 = new JRadioButton("\r\n \u0410\u043B\u0435\u043A\u0441\u0430\u043D\u0434\u044A\u0440 1 \u0411\u0430\u0442\u0435\u043D\u0431\u0435\u0440\u0433");
		b11_1_1_1.setBounds(47, 560, 298, 35);
		buttonGroup_4.add(b11_1_1_1);
		b11_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		b11_1_1_1.setForeground(new Color(102, 0, 0));
		b11_1_1_1.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11_1_1_1);
		
		JRadioButton b11_1_1_2 = new JRadioButton("\u0412\u043B\u0430\u0434\u0438\u043C\u0438\u0440 \u0427\u0435\u0440\u043A\u0430\u0441\u043A\u0438");
		b11_1_1_2.setBounds(414, 560, 298, 35);
		buttonGroup_4.add(b11_1_1_2);
		b11_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		b11_1_1_2.setForeground(new Color(102, 0, 0));
		b11_1_1_2.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b11_1_1_2);
		
		JRadioButton b12_1 = new JRadioButton("1888");
		b12_1.setBounds(47, 649, 86, 35);
		buttonGroup_5.add(b12_1);
		b12_1.setHorizontalAlignment(SwingConstants.CENTER);
		b12_1.setForeground(new Color(102, 0, 0));
		b12_1.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b12_1);
		
		JRadioButton b12_2 = new JRadioButton("1885");
		b12_2.setBounds(239, 649, 86, 35);
		buttonGroup_5.add(b12_2);
		b12_2.setHorizontalAlignment(SwingConstants.CENTER);
		b12_2.setForeground(new Color(102, 0, 0));
		b12_2.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b12_2);
		
		JRadioButton b12_2_1 = new JRadioButton("1872");
		b12_2_1.setBounds(431, 649, 86, 35);
		buttonGroup_5.add(b12_2_1);
		b12_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		b12_2_1.setForeground(new Color(102, 0, 0));
		b12_2_1.setFont(new Font("Sitka Banner", Font.BOLD, 21));
		contentPane.add(b12_2_1);
		
		JButton butona = new JButton("\u041F\u0440\u0435\u0441\u043C\u0435\u0442\u043D\u0438 \u0440\u0435\u0437\u0443\u043B\u0442\u0430\u0442");
		butona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int b = 0;
			if (buttonGroup.equals(b14)) b++;
			if (buttonGroup_1.equals(b22)) b++;
			if (buttonGroup_2.equals(b11_1_4)) b++;
			if (buttonGroup_3.equals(b11_1_7)) b++;
			if (buttonGroup_4.equals(b11_1_1_1)) b++;
			if (buttonGroup_5.equals(b12_2)) b++;
		
			String f = Integer.toString(b);
		JOptionPane.showMessageDialog(rootPane,"от 0-2т. - 2ка; Останалите точки съответстват на оценката: "+f+"т.");
			}
		});
		butona.setBounds(567, 630, 253, 67);
		butona.setForeground(new Color(51, 0, 0));
		butona.setBackground(new Color(204, 153, 153));
		butona.setFont(new Font("Sitka Small", Font.BOLD, 19));
		contentPane.add(butona);
	}
}
