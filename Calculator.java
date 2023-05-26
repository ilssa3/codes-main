package meowww;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc extends JFrame {

	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				calc frame = new calc();
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
	public calc() {
		setResizable(false);
		setBackground(new Color(0, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Iscar\\Desktop\\calc.png"));
		setTitle("\u041F\u0440\u043E\u0441\u0442 \u043A\u0430\u043B\u043A\u0443\u043B\u0430\u0442\u043E\u0440");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 595);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setForeground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A:");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 37));
		lblNewLabel.setForeground(new Color(144, 238, 144));
		lblNewLabel.setBackground(new Color(152, 251, 152));
		lblNewLabel.setBounds(47, 63, 46, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblB = new JLabel("B:");
		lblB.setForeground(new Color(144, 238, 144));
		lblB.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 37));
		lblB.setBackground(new Color(152, 251, 152));
		lblB.setBounds(303, 63, 46, 42);
		contentPane.add(lblB);
		
		txta = new JTextField();
		txta.setFont(new Font("Tahoma", Font.BOLD, 21));
		txta.setForeground(new Color(46, 139, 87));
		txta.setBounds(103, 64, 112, 41);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setFont(new Font("Tahoma", Font.BOLD, 21));
		txtb.setForeground(new Color(46, 139, 87));
		txtb.setColumns(10);
		txtb.setBounds(354, 63, 112, 41);
		contentPane.add(txtb);
		
		JLabel rez1 = new JLabel("-");
		rez1.setHorizontalAlignment(SwingConstants.CENTER);
		rez1.setForeground(new Color(144, 238, 144));
		rez1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 37));
		rez1.setBackground(new Color(152, 251, 152));
		rez1.setBounds(152, 428, 254, 53);
		contentPane.add(rez1);
		
		JLabel lbl = new JLabel("\u0420\u0435\u0437\u0443\u043B\u0442\u0430\u0442");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setForeground(new Color(144, 238, 144));
		lbl.setFont(new Font("Tahoma", Font.BOLD, 37));
		lbl.setBackground(new Color(152, 251, 152));
		lbl.setBounds(152, 371, 254, 53);
		contentPane.add(lbl);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 100, 0));
		panel.setBounds(132, 414, 274, 4);
		contentPane.add(panel);
		
		JButton plus = new JButton("A+B");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t1 = txta.getText();
				String t2 = txtb.getText();
				
				int t11 = Integer.parseInt(t1);
				int t22 = Integer.parseInt(t2);
				
				int sbor = t11+t22;
				String sb = Integer.toString(sbor);
				rez1.setText(sb);
			}
		});
		plus.setBackground(new Color(238, 232, 170));
		plus.setForeground(new Color(0, 100, 0));
		plus.setFont(new Font("Tahoma", Font.BOLD, 21));
		plus.setBounds(47, 178, 130, 41);
		contentPane.add(plus);
		
		JButton min = new JButton("A-B");
		min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t1 = txta.getText();
				String t2 = txtb.getText();
				
				int t11 = Integer.parseInt(t1);
				int t22 = Integer.parseInt(t2);
				
				int raz = t11-t22;
				String rz = Integer.toString(raz);
				rez1.setText(rz);
			}
		});
		min.setForeground(new Color(0, 100, 0));
		min.setFont(new Font("Tahoma", Font.BOLD, 21));
		min.setBackground(new Color(238, 232, 170));
		min.setBounds(213, 178, 130, 41);
		contentPane.add(min);
		
		JButton po = new JButton("A*B");
		po.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t1 = txta.getText();
				String t2 = txtb.getText();
				
				int t11 = Integer.parseInt(t1);
				int t22 = Integer.parseInt(t2);
				
				int raz = t11*t22;
				String rz = Integer.toString(raz);
				rez1.setText(rz);
			}
		});
		po.setForeground(new Color(0, 100, 0));
		po.setFont(new Font("Tahoma", Font.BOLD, 21));
		po.setBackground(new Color(238, 232, 170));
		po.setBounds(377, 178, 130, 41);
		contentPane.add(po);
		
		JButton del = new JButton("A/B");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t1 = txta.getText();
				String t2 = txtb.getText();
				
				double t11 = Integer.parseInt(t1);
				double t22 = Integer.parseInt(t2);
				
				double raz = t11/t22;
				String rz = Double.toString(raz);
				rez1.setText(rz);
			}
		});
		del.setForeground(new Color(0, 100, 0));
		del.setFont(new Font("Tahoma", Font.BOLD, 21));
		del.setBackground(new Color(238, 232, 170));
		del.setBounds(47, 271, 130, 41);
		contentPane.add(del);
		
		JButton kor = new JButton("A^B");
		kor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t1 = txta.getText();
				String t2 = txtb.getText();
				
				int t11 = Integer.parseInt(t1);
				int t22 = Integer.parseInt(t2);
				
				int raz = (int) Math.pow(t11, t22);
				String rz = Integer.toString(raz);
				rez1.setText(rz);
			}
		});
		kor.setForeground(new Color(0, 100, 0));
		kor.setFont(new Font("Tahoma", Font.BOLD, 21));
		kor.setBackground(new Color(238, 232, 170));
		kor.setBounds(213, 271, 130, 41);
		contentPane.add(kor);
		
		JButton av = new JButton("AVE");
		av.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t1 = txta.getText();
				String t2 = txtb.getText();
				
				int t11 = Integer.parseInt(t1);
				int t22 = Integer.parseInt(t2);
				
				int raz = (t11+t22)/2;
				String rz = Integer.toString(raz);
				rez1.setText(rz);
			}
		});
		av.setForeground(new Color(0, 100, 0));
		av.setFont(new Font("Tahoma", Font.BOLD, 21));
		av.setBackground(new Color(238, 232, 170));
		av.setBounds(377, 271, 130, 41);
		contentPane.add(av);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 100, 0));
		panel_1.setBounds(132, 245, 274, 4);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 100, 0));
		panel_2.setBounds(354, 200, 4, 112);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 100, 0));
		panel_2_1.setBounds(199, 178, 4, 112);
		contentPane.add(panel_2_1);
	}
}
