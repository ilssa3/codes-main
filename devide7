package meowww;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class igrachkaplachka extends JFrame {

	private JPanel contentPane;
	private JTextField chis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					igrachkaplachka frame = new igrachkaplachka();
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
	public igrachkaplachka() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Iscar\\Desktop\\download_2.jpg"));
		setResizable(false);
		setTitle("\u0414\u0435\u043B\u0435\u043D\u0438\u0435 \u043D\u0430 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 150, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		chis = new JTextField();
		chis.setBounds(364, 22, 127, 33);
		chis.setForeground(new Color(128, 0, 0));
		chis.setFont(new Font("Verdana", Font.BOLD, 23));
		contentPane.add(chis);
		chis.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0446\u044F\u043B\u043E \u0447\u0438\u0441\u043B\u043E: ");
		lblNewLabel.setBounds(28, 22, 304, 33);
		lblNewLabel.setForeground(new Color(255, 235, 205));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 23));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 65, 463, 362);
		panel.setBackground(new Color(255, 248, 220));
		panel.setForeground(new Color(233, 150, 122));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u0427\u0438\u0441\u043B\u0430\u0442\u0430, \u0434\u0435\u043B\u044F\u0449\u0438 \u0441\u0435 \r\n\u0431\u0435\u0437");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 23));
		lblNewLabel_1.setBounds(10, 10, 443, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u043E\u0441\u0442\u0430\u0442\u044A\u043A \u043D\u0430 7:");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(10, 37, 249, 33);
		panel.add(lblNewLabel_1_1);
		
		JLabel rez1 = new JLabel("");
		rez1.setForeground(new Color(233, 150, 122));
		rez1.setFont(new Font("Verdana", Font.BOLD, 23));
		rez1.setBounds(10, 68, 443, 33);
		panel.add(rez1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u0421\u0443\u043C\u0430\u0442\u0430 \u043D\u0430 \u0447\u0438\u0441\u043B\u0430\u0442\u0430:");
		lblNewLabel_1_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.BOLD, 23));
		lblNewLabel_1_2.setBounds(10, 138, 443, 33);
		panel.add(lblNewLabel_1_2);
		
		JLabel rez2 = new JLabel("");
		rez2.setForeground(new Color(233, 150, 122));
		rez2.setFont(new Font("Verdana", Font.BOLD, 23));
		rez2.setBounds(10, 177, 443, 33);
		panel.add(rez2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("\u041F\u0440\u043E\u0438\u0437\u0432\u0435\u0434\u0435\u043D\u0438\u0435\u0442\u043E \u043D\u0430 \u0447\u0438\u0441\u043B\u0430\u0442\u0430:");
		lblNewLabel_1_2_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_2_1.setFont(new Font("Verdana", Font.BOLD, 23));
		lblNewLabel_1_2_1.setBounds(10, 246, 443, 33);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel rez3 = new JLabel("");
		rez3.setForeground(new Color(233, 150, 122));
		rez3.setFont(new Font("Verdana", Font.BOLD, 23));
		rez3.setBounds(10, 278, 443, 33);
		panel.add(rez3);
		
		JButton btnNewButton = new JButton("\u041F\u0440\u0435\u0441\u043C\u0435\u0442\u043D\u0438");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n=Integer.parseInt(chis.getText());
				int pr=1,sum=0;
				
				int []arr=new int[n/7];// /7
				
				
				for(int i=0;i<arr.length;i++)				
					arr[i]=(i+1)*7;
					String chisla=" ";
				for(int i=0;i<arr.length;i++) {
					
					chisla=chisla+arr[i]+"; ";
				sum=sum+arr[i];
				pr = pr*arr[i];}

				rez1.setText(chisla);
				rez2.setText(Integer.toString(sum));
				rez3.setText(Integer.toString(pr));
				}		
				
			}  
		)
		;
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setBackground(new Color(255, 248, 220));
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 17));
		btnNewButton.setBounds(28, 464, 149, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0418\u0437\u043B\u0435\u0437");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 17));
		btnNewButton_1.setBackground(new Color(255, 248, 220));
		btnNewButton_1.setForeground(new Color(128, 0, 0));
		btnNewButton_1.setBounds(354, 464, 137, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u0418\u0437\u0447\u0438\u0441\u0442\u0438");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rez1.setText(" ");
				rez2.setText(" ");
				rez3.setText(" ");
			}
		});
		btnNewButton_2.setForeground(new Color(128, 0, 0));
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 17));
		btnNewButton_2.setBackground(new Color(255, 248, 220));
		btnNewButton_2.setBounds(195, 464, 137, 53);
		contentPane.add(btnNewButton_2);
	}
}
