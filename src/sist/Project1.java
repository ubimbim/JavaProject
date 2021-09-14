package sist;

import java.awt.BorderLayout;

import javax.swing.*;

public class Project1 extends JFrame{

	String[] tableNo = {"테이블 번호", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	
	
	public Project1() {
	
		setTitle("주문 관리");
	
		JPanel container1 = new JPanel();    // 하단 컨테이너
		
		// 중앙 테이블
		JTable jt = new JTable();
		
		JScrollPane jsp = new JScrollPane(jt,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		setSize(1200, 650);
		setLayout(null);
		
		// 하단 컴포넌트
		JButton jbt1 = new JButton("전체 내역");
		JButton jbt2 = new JButton("추가");
		JButton jbt3 = new JButton("삭제");
		JButton jbt4 = new JButton("결제");
		JComboBox<String> jcb1 = new JComboBox<String>(tableNo);
		
		jbt1.setBounds(20, 500, 100, 50);
		jbt2.setBounds(220, 500, 100, 50);
		jbt3.setBounds(420, 500, 100, 50);
		jbt4.setBounds(620, 500, 100, 50);
		jcb1.setBounds(820, 500, 100, 50);
		jsp.setBounds(200, 100, 800, 400);
		
	
		//	container1.add(jbt1);
		//container1.add(jbt2);
		//container1.add(jbt3);
		//container1.add(jbt4);
		//container1.add(jcb1);
		
		add(jsp);
		add(jbt1); add(jbt2); add(jbt3); add(jbt4); add(jcb1);
		
		//setBounds(50, 20, 1000, 600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
		
		
	}
	
	
	//
	
	
	
	public static void main(String[] args) {
		new Project1();

	}

}
