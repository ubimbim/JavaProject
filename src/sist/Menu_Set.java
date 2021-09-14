package sist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu_Set extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Set frame = new Menu_Set();
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
	public Menu_Set() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 31, 424, 155);
		contentPane.add(panel);
		
		table = new JTable();
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 196, 424, 55);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("전체내역");
		btnNewButton.setBounds(35, 10, 81, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.setLayout(null);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("추가");
		btnNewButton_1.setBounds(128, 10, 81, 35);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.setBounds(221, 10, 81, 35);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("삭제");
		btnNewButton_3.setBounds(314, 10, 81, 35);
		panel_1.add(btnNewButton_3);
	}
}
