package sist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;

public class Revenue extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(5, 5, 417, 171);
		contentPane.add(panel1);
		
		table = new JTable();
		panel1.add(table);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(5, 186, 417, 75);
		contentPane.add(panel2);
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
		panel2.add(btnNewButton);
	}
}
