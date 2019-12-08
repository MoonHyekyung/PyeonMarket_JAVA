import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

class Drink1 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> DrinkLIst; // DrinkList
	private JButton Drinkbtn[]; // 음료수 메뉴 버튼
	
	private JButton x_B;
	private JButton Rbtn; // 오른쪽 버튼
	private Drink win;
	
	public Drink1(Drink win) {
		this.win = win;
		setLayout(null);
		
		// 배경화면
	    icon = new ImageIcon("images/menu.png");
	    menu_Image = new JLabel(icon);//이미지로 변환
	    menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	    add(menu_Image);
	    
	    // x버튼
	    win.AddXbtn(x_B, menu_Image);
	    
	    // 오른쪽 버튼
	    icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(290,290, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Rbtn =new JButton(icon); // 이미지 j버튼화
	    Rbtn.setBounds(1300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
			    
	    Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    menu_Image.add(Rbtn);
	    
	    Rbtn.addActionListener(new ActionListener() {
            // 오른쪽 버튼이 눌러지면 drink2로 넘어가기
            public void actionPerformed(ActionEvent arg0) {
                win.Change("drink1-2");
            } // actionPerformed
        }); // addActionListener
	    
	    // 메뉴 버튼들
	    Drinkbtn = new JButton[12];
	    
	    DrinkLIst = new ArrayList<String>();
	    DrinkLIst.add("images/Drink/Applemango.jpg"); // 애플망고
	    DrinkLIst.add("images/Drink/Banana.jpg"); // 바나나우유
	    DrinkLIst.add("images/Drink/Bluehawai.jpg"); // 블루하와이
	    DrinkLIst.add("images/Drink/Pocarisweat.jpg"); // 포카리스웨트
	    DrinkLIst.add("images/Drink/chocomilk.jpg"); // 서울 초코우유
	    DrinkLIst.add("images/Drink/Seoul_Straw.jpg"); // 서울 딸기 우유
	    DrinkLIst.add("images/Drink/Seoul.jpeg"); // 서울 우유
	    DrinkLIst.add("images/Drink/orane_juice.jpg"); // 오렌지 드링크
	    DrinkLIst.add("images/Drink/mango.jpg"); // 망고 드링크
	    DrinkLIst.add("images/Drink/grape.jpg"); // 포도 드링크
	    DrinkLIst.add("images/Drink/musket.jpg"); // 청포도 드링크
	    DrinkLIst.add("images/Drink/berry.jpg"); // 석류 드링크
	   
	    win.AddBtn(DrinkLIst, Drinkbtn, menu_Image);
	} // drink1 생성자
} // drink1

class Drink2 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> DrinkLIst; // DrinkList
	private JButton Drinkbtn[]; // 음료수 메뉴 버튼
	
	private JButton x_B;
	private JButton Lbtn; // 왼쪽 버튼
	private Drink win;
	
	public Drink2(Drink win) {
		this.win = win;
		setLayout(null);
		
		// 배경화면
	    icon = new ImageIcon("images/menu.png");
	    menu_Image = new JLabel(icon);//이미지로 변환
	    menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	    add(menu_Image);
	    
	    // x버튼
	    win.AddXbtn(x_B, menu_Image);
	    
	    // 왼쪽 버튼
	    icon = new ImageIcon("images/left.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(290,290, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Lbtn =new JButton(icon); // 이미지 j버튼화
		Lbtn.setBounds(300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
			    
		Lbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
		Lbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
		Lbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    menu_Image.add(Lbtn);
	    
	    Lbtn.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 drink1로 넘어가기
            public void actionPerformed(ActionEvent arg0) {
                win.Change("drink2-1");
            } // actionPerformed
        }); // addActionListener
	    
	    // 메뉴 버튼들
	    Drinkbtn = new JButton[12];
	    
	    DrinkLIst = new ArrayList<String>();
	    DrinkLIst.add("images/Drink/copi.jpg"); // 코코팜 복숭아 드링크
	    DrinkLIst.add("images/Drink/coyo.jpg"); // 코코팜 요구르트 드링크
	    DrinkLIst.add("images/Drink/hershey.jpg"); // 허쉬우유
	    DrinkLIst.add("images/Drink/Jamongwater.jpg"); // 자몽 워터
	    DrinkLIst.add("images/Drink/Lemonwater.jpg"); // 레몬 워터
	    DrinkLIst.add("images/Drink/picnic.jpg"); // 피크닉
	    DrinkLIst.add("images/Drink/Cornsuyum.jpg"); // 옥수수수염차
	    DrinkLIst.add("images/Drink/Water.jpg"); // 물
	    
	    win.AddBtn(DrinkLIst, Drinkbtn, menu_Image);
	} // drink2 생성자
} // drink2

public class Drink extends JFrame{
	private ImageIcon icon; // 불러온 이미지
	private Image image; // 이미지 객체
	public Drink1 drink1= null;
	public Drink2 drink2 = null;
	
	public Drink() {
		setTitle("음료수");
		drink1 = new Drink1(this);
		drink2 = new Drink2(this);
		
	    setSize(1920, 1080);// 프레임 크기 설정
	    setLocationRelativeTo(null);//프레임 가운데
	    add(this.drink1);
	   
		setSize(1920,1080);
		setVisible(true);
	} // Drink 생성자
	
	public void Change(String panelName) {
		switch(panelName) {
		case "drink1-2":
			getContentPane().removeAll();
			getContentPane().add(drink2);
			revalidate();
			repaint();
			break;
		case "drink2-1":
			getContentPane().removeAll();
			getContentPane().add(drink1);
			revalidate();
			repaint();
			break;
		} // switch
	} // Change
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
	
	public void AddR_LBtn(JButton btn[], JLabel menu_Image) { // 왼쪽, 오른쪽 버튼 추가하는 메서드
		for(int i =0; i<btn.length; i++) {
			if(i==0) icon = new ImageIcon("images/left.png");
			else icon = new ImageIcon("images/right.png"); // i=1일경우 이용방법 사진 불러오기
			
			image=icon.getImage(); // 불러온 사진 객체화
			image=image.getScaledInstance(290,290, Image.SCALE_SMOOTH); //이미지 사이즈 조절하기
			icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기(객체 말고)
		    btn[i]=new JButton(icon); // 버튼안에 이미지 넣기
		    
		    /////////////////////버튼 창 외곽, 색깔 없애기///////////////// 
		    btn[i].setBorderPainted(false);
		    btn[i].setContentAreaFilled(false);
		    btn[i].setFocusPainted(false);
		} // for
  
		btn[0].setBounds(300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
		btn[1].setBounds(1300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기

		//버튼추가
		for(JButton b : btn) menu_Image.add(b);
	} // AddR_LBtn
	
	public void AddBtn(ArrayList<String> EtcList, JButton Etcbtn[], JLabel menu_Image) {
	    int i = 0, chk = 1;
	    int x = 200, y = 450, width = 250, height = 250;
	    for(String etc: EtcList) { // 향상된 for문
	    	icon = new ImageIcon(etc); // 사진 불러오기
	    	image = icon.getImage(); // 이미지 객체에 사진 넣기
	    	image = image.getScaledInstance(250,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    Etcbtn[i] = new JButton(icon); // 이미지 j버튼화
		    Etcbtn[i].setBounds(x,y,width,height);
		    menu_Image.add(Etcbtn[i]);
		    		
		    Etcbtn[i].setBorderPainted(false); // 버튼 외각선 색 없게
		    Etcbtn[i].setContentAreaFilled(false); //  버튼색 없게
		    Etcbtn[i].setFocusPainted(false); // 버튼 선택될 때 테두리 없게
		    if(chk!=24 && chk!=36 && chk % 6 == 0) {  // 두번째 줄로 내리기
		    	y += 300;
		    	x = -60; // 밑에서 260을 더할 것이기 때문
		    } // if
		    i++;
		    chk++;
		    x += 260;
	    } // for
	} // AddBtn
} // Drink
