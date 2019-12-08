import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

class Snack1 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> SnackList; // 과자 사진들
	private JButton Snackbtn[]; // 과자 메뉴 버튼
	
	private JButton x_B; // x버튼 
	private JButton Rbtn; // 오른쪽 버튼
	private Snack win;
	
	public Snack1(Snack win) {
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
            // 오른쪽 버튼이 눌러지면 snack2로 넘어가기
            public void actionPerformed(ActionEvent arg0) {
                win.Change("snack1-2");
            } // actionPerformed
        }); // addActionListener
	    
	    // 메뉴 버튼들
	    Snackbtn = new JButton[12];
	    
	    SnackList = new ArrayList<String>();
	    SnackList.add("images/Snack/AlShrimp.png"); // 알 새우칩
	    SnackList.add("images/Snack/Bananakick.png"); // 바나나킥
	    SnackList.add("images/Snack/Binch.jpg"); // 빈츠
	    SnackList.add("images/Snack/Amond.jpg"); // 아몬드 빼빼로
	    SnackList.add("images/Snack/Nud.jpg"); // 누드 뻬빼로
	    SnackList.add("images/Snack/Original.jpg"); // 오리지날 빼빼로
	    SnackList.add("images/Snack/Cancho.png"); // 칸초
	    SnackList.add("images/Snack/Cham.jpg"); // 참 크래커
	    SnackList.add("images/Snack/Chocopie.png"); // 초코파이
	    SnackList.add("images/Snack/Chocosongyi.png"); // 초코송이
	    SnackList.add("images/Snack/Chicken.jpg"); // 닭다리 후라이드
	    SnackList.add("images/Snack/HotChicken.jpg"); // 닭다리 숯불바베큐
	    
	    win.AddBtn(SnackList, Snackbtn, menu_Image);
	} // Snack1 생성자
} // Snack1

class Snack2 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> SnackList; // 과자 사진들
	private JButton Snackbtn[]; // 과자 메뉴 버튼
	
	private JButton x_B; // x버튼 
	private JButton btn[]; // 왼쪽, 오른쪽 버튼
	private Snack win;
	
	public Snack2(Snack win) {
		this.win = win;
		setLayout(null);
		
		// 배경화면
	    icon = new ImageIcon("images/menu.png");
	    menu_Image = new JLabel(icon);//이미지로 변환
	    menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	    add(menu_Image);
	    
	    // x버튼
	    win.AddXbtn(x_B, menu_Image);
	    
	 // 왼쪽 버튼, 오른쪽 버튼 
	 	btn = new JButton[2];
	 	win.AddR_LBtn(btn, menu_Image); // 왼쪽, 오른쪽 버튼 추가

	 	btn[0].addActionListener(new ActionListener() {
	 		// 왼쪽 버튼이 눌러지면 발생하는 행동을 정의   
	 		public void actionPerformed(ActionEvent e) {
	 			win.Change("snack2-1");
	 		}  	          
	 	});
	 	btn[1].addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			// 오른쪽 버튼이 눌러지면 발생하는 행동을 정의
	 			 win.Change("snack2-3");
	 		}
	 	});
	    
	    // 메뉴 버튼들
	    Snackbtn = new JButton[12];
	    
	    SnackList = new ArrayList<String>();
	    SnackList.add("images/Snack/Corn.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Crown_Milk.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Crown_Strawberry.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Ggobuk.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Ggoggal.png"); // ABC 초콜릿
	    SnackList.add("images/Snack/Gosomi.png"); // ABC 초콜릿
	    SnackList.add("images/Snack/Homerunball.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Honeybutter.png"); // ABC 초콜릿
	    SnackList.add("images/Snack/Honeybutter_Cherry.png"); // ABC 초콜릿
	    SnackList.add("images/Snack/Honeytwist.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Hotjjambbong.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/HotShrimp.jpg"); // ABC 초콜릿
	    
	    win.AddBtn(SnackList, Snackbtn, menu_Image);
	} // Snack2 생성자
} // Snack2

class Snack3 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> SnackList; // 과자 사진들
	private JButton Snackbtn[]; // 과자 메뉴 버튼
	
	private JButton x_B; // x버튼 
	private JButton Lbtn; // 왼쪽, 오른쪽 버튼
	private Snack win;
	
	public Snack3(Snack win) {
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
	 	icon = new ImageIcon("images/left.png"); // 사진 불러오기
	 	image=icon.getImage(); //이미지 객체에 넣기
	 	image=image.getScaledInstance(290, 290, Image.SCALE_SMOOTH); // 객체 조절하기
	 	icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	 	Lbtn=new JButton(icon); // Lbtn Jbutton 추가
	 	Lbtn.setBounds(300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
	 	    
	 	Lbtn.setBorderPainted(false); // Lbtn 외각선 색 없게
	    Lbtn.setContentAreaFilled(false); // Lbtn 버튼색 없게
	    Lbtn.setFocusPainted(false);// Lbtn 선택될 때 테두리 없게
	    menu_Image.add(Lbtn);
	 	   
	    Lbtn.addActionListener(new ActionListener() {
	        // 왼쪽 버튼이 눌러지면 snack2로 넘어가기     
	        public void actionPerformed(ActionEvent arg0) {
	            win.Change("snack3-2");
	        }            
	    });
	    
	    // 메뉴 버튼들
	    Snackbtn = new JButton[12];
	    
	    SnackList = new ArrayList<String>();
	    SnackList.add("images/Snack/Lottesand.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/MiniChoco.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Miz.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Ojinghouse.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Onion.png"); // ABC 초콜릿
	    SnackList.add("images/Snack/Pizza.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Postick.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Saddobab.png"); // ABC 초콜릿
	    SnackList.add("images/Snack/Sun.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Ugwa.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Yachae.jpg"); // ABC 초콜릿
	    SnackList.add("images/Snack/Zec.jpg"); // ABC 초콜릿
	    
	    win.AddBtn(SnackList, Snackbtn, menu_Image);
	} // Snack3 생성자
}

public class Snack extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private JButton x_B;
	
	public Snack1 snack1 = null;
	public Snack2 snack2 = null;
	public Snack3 snack3 = null;
	
	public Snack() {
		setTitle("과자");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1920,1080);
		
		snack1 = new Snack1(this);
		snack2 = new Snack2(this);
		snack3 = new Snack3(this);
		add(this.snack1);		
		setVisible(true);
	
	} // Snack 생성자
	public void Change(String panelName) {  // 패널 바꾸는 함수
		switch(panelName) {
		case "snack2-1":
			getContentPane().removeAll();
			getContentPane().add(snack1);
			revalidate();
			repaint();
			break;
			
		case "snack1-2": case "snack3-2":
			getContentPane().removeAll();
			getContentPane().add(snack2);
			revalidate();
			repaint();
			break;
			
		case "snack2-3": 
			getContentPane().removeAll();
			getContentPane().add(snack3);
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
} // Snack
