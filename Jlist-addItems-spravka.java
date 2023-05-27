import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class touragencysp extends JFrame {

	private JPanel contentPane;
	private JTextField txt;
	
	int i = 0;
	int min=999999999;
	int max;
	int sr ;
	int obsh;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					touragencysp frame = new touragencysp();
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
	public touragencysp() {
		setTitle("\u0421\u043F\u0440\u0430\u0432\u043A\u0430");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Iscar\\Desktop\\download.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0422\u0423\u0420\u0418\u0421\u0422\u0418\u0427\u0415\u0421\u041A\u0418 \u041A\u041E\u041C\u041F\u041B\u0415\u041A\u0421 ");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setBounds(0, 21, 444, 38);
		contentPane.add(lblNewLabel);
		
		txt = new JTextField();
		txt.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txt.setBounds(24, 86, 229, 24);
		contentPane.add(txt);
		txt.setColumns(10);
		
		
		List list = new List();
		list.setFont(new Font("Times New Roman", Font.BOLD, 19));
		list.setBounds(34, 194, 192, 296);
		contentPane.add(list);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.text);
		panel_1.setBounds(0, 143, 444, 3);
		contentPane.add(panel_1);
	
		
		JButton btnNewButton = new JButton("\u0412\u044A\u0432\u0435\u0434\u0438 ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				String t = txt.getText();	i++; 
				if(i<=12) {
				list.addItem(i+" месец : "+t);}
			else JOptionPane.showMessageDialog(null, "Само 12 месеца!");
				int b = Integer.parseInt(t);
				if (max<b)max=b;
				if (min>b)min=b;
				obsh=obsh+b;
				sr =obsh/i;
			
			}
		});
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(303, 88, 127, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Min.брой:");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1.setBounds(248, 208, 109, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Max.брой:");
		lblNewLabel_1_1.setForeground(Color.WHITE);;
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1_1.setBounds(248, 282, 109, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Общ брой:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1_2.setBounds(248, 361, 109, 38);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Средно:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1_3.setBounds(248, 438, 109, 38);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lmin = new JLabel("");
		lmin.setBackground(SystemColor.info);
		lmin.setForeground(Color.WHITE);
		lmin.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lmin.setBounds(248, 241, 109, 38);
		contentPane.add(lmin);
		
		JLabel lmax = new JLabel("");
		lmax.setForeground(Color.WHITE);
		lmax.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lmax.setBackground(SystemColor.info);
		lmax.setBounds(248, 319, 109, 38);
		contentPane.add(lmax);
		
		JLabel lobsht = new JLabel("");
		lobsht.setForeground(Color.WHITE);
		lobsht.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lobsht.setBackground(SystemColor.info);
		lobsht.setBounds(248, 390, 109, 38);
		contentPane.add(lobsht);
		
		JLabel lsr = new JLabel("");
		lsr.setForeground(Color.WHITE);
		lsr.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lsr.setBackground(SystemColor.info);
		lsr.setBounds(248, 475, 109, 38);
		contentPane.add(lsr);
		
		JButton btnNewButton_1 = new JButton("Справка");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lmin.setText(Integer.toString(min));
				lmax.setText(Integer.toString(max));
				lobsht.setText(Integer.toString(obsh));
				lsr.setText(Integer.toString(sr));
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setBounds(67, 496, 127, 21);
		contentPane.add(btnNewButton_1);
	}
}
