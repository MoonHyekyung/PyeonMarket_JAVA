import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Bread extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> BreadList; // 빵 메뉴 사진들
	private JButton Breadbtn[]; //빵메뉴 버튼
	
	private JButton x_B; // x버튼
	
	public Bread() {
		setLayout(null);
		setSize(1920,1080);
		setVisible(true);
		
		// 배경화면
	    icon = new ImageIcon("images/menu.png");
	    menu_Image = new JLabel(icon);//이미지로 변환
	    menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	    add(menu_Image);
	    
	    // x버튼
	    AddXbtn(x_B, menu_Image);
	    
	    // 오른쪽 버튼
	    icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(290,290, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	   
	    // 메뉴 버튼들
		Breadbtn = new JButton[12];
	    
		BreadList = new ArrayList<String>();
		BreadList.add("images/Bread/big.png"); // 빅 페스츄리
		BreadList.add("images/Bread/castera.png"); // 카스테라
		BreadList.add("images/Bread/cheese.png"); // 내일도 치즈
		BreadList.add("images/Bread/choco.png"); // 초코 방울이
		BreadList.add("images/Bread/honey.png"); // 꿀호떡
		BreadList.add("images/Bread/mrcheese.png"); // 치즈케잌
		BreadList.add("images/Bread/pizza.jpg"); // 고구마 피자빵
		BreadList.add("images/Bread/lolcake.jpg"); // 고구마 피자빵
	    
	    AddBtn(BreadList, Breadbtn, menu_Image); // 버튼 더하기
	} // Bread 생성자
	
	public void AddXbtn(JButton x_B, JLabel menu_Image) {
		// x버튼
	    icon = new ImageIcon("images/x.png"); // X 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 X 사진 넣기
		icon.setImage(image.getScaledInstance(200,200, Image.SCALE_SMOOTH)); // 사이즈 조절한거 다시 이미지에 넣기
	    x_B =new JButton(icon); // 이미지 j버튼화
	    x_B.setBounds(1700,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    menu_Image.add(x_B);
	    
	    x_B.setBorderPainted(false); //외각선 색 없게
	    x_B.setContentAreaFilled(false); // 버튼색 없게
	    x_B.setFocusPainted(false); // 선택될 때 테두리 없게
	    
	    x_B.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		setVisible(false);
	    	} // actionPerformed
	    }); // addActionListener
	}
	public void AddBtn(ArrayList<String> EtcList, JButton Etcbtn[], JLabel menu_Image) {
	    int i = 0, chk = 1;
	    int x = 280, y = 410, width = 300, height = 300;
	    for(String etc: EtcList) { // 향상된 for문
	    	icon = new ImageIcon(etc); // 사진 불러오기
	    	image = icon.getImage(); // 이미지 객체에 사진 넣기
	    	image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    Etcbtn[i] = new JButton(icon); // 이미지 j버튼화
		    Etcbtn[i].setBounds(x,y,width,height);
		    menu_Image.add(Etcbtn[i]);
		    		
		    Etcbtn[i].setBorderPainted(false); // 버튼 외각선 색 없게
		    Etcbtn[i].setContentAreaFilled(false); //  버튼색 없게
		    Etcbtn[i].setFocusPainted(false); // 버튼 선택될 때 테두리 없게
		    if(chk % 4 == 0) {  // 두번째 줄로 내리기
		    	y += 300;
		    	x = -100; // 밑에서 370을 더할 것이기 때문에 첫시작을 270으로 하고싶어서
		    } // if
		    i++;
		    chk++;
		    x += 370;
	    } // for
	} // AddBtn
}
