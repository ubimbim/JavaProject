package sist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Revenue extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Revenue frame = new Revenue();
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
	public Revenue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(5, 36, 417, 184);
		contentPane.add(panel2);
		
		table = new JTable();
		panel2.add(table);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(5, 224, 417, 37);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.setBounds(326, 9, 52, 21);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 10));
		panel3.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(50, 9, 116, 21);
		panel3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(193, 9, 116, 21);
		panel3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("~");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(172, 12, 15, 15);
		panel3.add(lblNewLabel_1);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(5, 0, 417, 37);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("매출조회");
		lblNewLabel.setBounds(184, 5, 48, 26);
		panel1.add(lblNewLabel);
	}
}
