package sist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class First extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame = new First();
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
	public First() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(215, 0, 219, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("테이블 선택");
		lblNewLabel.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(12, 41, 81, 19);
		panel.add(lblNewLabel);
		
		// String[] number = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '10'};
		JComboBox tableno = new JComboBox();
		tableno.setBounds(12, 70, 81, 21);
		panel.add(tableno);
	}
}
