package sist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class Basket extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Basket frame = new Basket();
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
	public Basket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setForeground(Color.ORANGE);
		panel2.setBounds(0, 29, 434, 187);
		contentPane.add(panel2);
		
		table = new JTable();
		panel2.add(table);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(0, 218, 434, 43);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		JButton btnNewButton = new JButton("주문하기");
		btnNewButton.setBounds(176, 10, 81, 23);
		panel3.add(btnNewButton);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 434, 31);
		contentPane.add(panel1);
		
		JLabel lblNewLabel = new JLabel("장바구니");
		panel1.add(lblNewLabel);
	}

}
