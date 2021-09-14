package sist;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Project extends JFrame{
	
	String[] combo = {"선택", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	
	JComboBox<String> jcb1;
	
	public Project() {
		JPanel container1 = new JPanel();       // 관리자
		JPanel container2 = new JPanel();		// 고객 테이블
		JPanel group = new JPanel();
		
		// 이미지 컨테이너
		JPanel image = new JPanel();
		// 이미지 가져오기
		ImageIcon bar = new ImageIcon("images/bar.jpg");
		// 이미지 컴포넌트
		JLabel ima = new JLabel(bar);
		
		
		
	JButton jb1 = new JButton("관리자");
	JLabel jl1 = new JLabel("고객 테이블  :");
	JComboBox<String> jcb1 = new JComboBox<String>(combo);
	JButton jb2 = new JButton("접속");
			
	
	image.add(ima);
	
	container1.setLayout(new FlowLayout(FlowLayout.CENTER , 90, 230));
	container1.add(jb1); 
	
	container2.add(jl1);
	container2.add(jcb1); container2.add(jb2);
	
	//group.add(container1, BorderLayout.WEST);
	//group.add(container2, BorderLayout.EAST);
	group.add(image);
	
	add(group, BorderLayout.SOUTH);
	
	setBounds(50, 20, 1000, 600);
	
	setResizable(false);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setVisible(true);
	
	
	
	}
	
	
	
	
	public static void main(String[] args) {

		new Project();
	}

}
