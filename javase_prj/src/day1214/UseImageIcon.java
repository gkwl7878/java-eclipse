package day1214;


import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Icon class를 사용한 이미지 사용.
 * @author owner
 */
@SuppressWarnings("serial")
public class UseImageIcon extends JFrame {
	public UseImageIcon() {
		super("ImageIcon사용");
		ImageIcon ii1=new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\images\\img1.png");
		ImageIcon ii2=new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\images\\img2.png");
		ImageIcon ii3=new ImageIcon("C:\\dev\\workspace\\javase_prj\\src\\day1214\\images\\img3.gif");
		JButton btn1 = new JButton("버튼1",ii1);
		JButton btn2 = new JButton("버튼2",ii2);
		JButton btn3 = new JButton("버튼3",ii3);
		
		//Tooltip Text 설정
		btn1.setToolTipText("버튼1");
		btn2.setToolTipText("버튼을 클릭하세요.");
		btn3.setToolTipText("오늘은 금요일 입니다.");
		
		//RollOver icon
		btn3.setRolloverIcon(ii2);
		
		//버튼 라벨 위치 변경
		//가로위치 변경: LEFT, CENTER, RIGHT
		btn1.setHorizontalTextPosition(JButton.RIGHT);
		//세로위치를 변경: TOP, CENTER, BOTTOM
		btn2.setVerticalTextPosition(JButton.BOTTOM);
		btn3.setHorizontalTextPosition(JButton.CENTER);
		btn3.setVerticalTextPosition(JButton.BOTTOM);
		setLayout(new GridLayout(1, 3));
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		setBounds(100,100,1300,600);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseImageIcon
	public static void main(String[] args) {
		new UseImageIcon();
	}//main
}//class
