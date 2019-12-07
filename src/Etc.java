import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/////////////// class Etc1
class Etc1 extends JPanel{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> EtcList; // Etc 사진  새콤짱딸기, 새콤짱 사과, 짱셔요 과일, 짱셔요 콜라
	private ArrayList<String> EtcInfoList; // Etc 정보사진
	private JButton Etcbtn[];
	
	private JButton x_B;
	private JButton Rbtn; // 오른쪽 버튼
	private Etc win;
	
	public Etc1(Etc win) {
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
            // 오른쪽 버튼이 눌러지면 way2로 넘어가기
            public void actionPerformed(ActionEvent arg0) {
                win.Change("etc1-2");
            } // actionPerformed
        }); // addActionListener
	    
	    // 메뉴 버튼들
	    Etcbtn = new JButton[12];
	    
	    EtcList = new ArrayList<String>();
	    EtcList.add("images/Etc/Abc.jpg"); // ABC 초콜릿
	    EtcList.add("images/Etc/Birdegg.png"); // 새알 초콜릿
	    EtcList.add("images/Etc/Crunky.jpg"); // 크런키
	    EtcList.add("images/Etc/Egg.jpg"); // 맥반석
	    EtcList.add("images/Etc/Gana.jpg"); // 가나 초콜릿
	    EtcList.add("images/Etc/Gonyak_grape.jpg"); // 곤약젤리 청포도
	    EtcList.add("images/Etc/Gonyak_peach.jpg"); // 곤약젤리 복숭아
	    EtcList.add("images/Etc/Grapeball.jpg"); // 꼬미볼 포도
	    EtcList.add("images/Etc/Sodaball.jpg"); // 꼬미볼 소다
	    EtcList.add("images/Etc/Peachball.jpg"); // 꼬미볼 복숭아
	    EtcList.add("images/Etc/secom.png"); // 새콤짱 딸기 
	    EtcList.add("images/Etc/secom_apple.png"); // 새콤짱 사과
	    
	    win.AddBtn(EtcList, Etcbtn, menu_Image);
	} // Etc1 생성자

} // Etc1

/////////////// class Etc2
class Etc2 extends JPanel  {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> EtcList; // Etc 사진  새콤짱딸기, 새콤짱 사과, 짱셔요 과일, 짱셔요 콜라
	private ArrayList<String> EtcInfoList; // Etc 정보사진
	private JButton Etcbtn[];
	private Etc win; // Snack1을 더할 프레임위치 클래스
	
	private JButton x_B;
	private JButton btn[]; // 왼쪽, 오른쪽 버튼
	
	public Etc2(Etc win) {
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
				 win.Change("etc2-1");
			}  	          
		});
		btn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 오른쪽 버튼이 눌러지면 발생하는 행동을 정의
				 win.Change("etc2-3");
			}
		});
		
		// 메뉴 버튼들
		Etcbtn = new JButton[12];
		    
		EtcList = new ArrayList<String>();
		EtcList.add("images/Etc/zzang.png"); // 짱셔요 과일
		EtcList.add("images/Etc/zzang_coke.png"); // 짱셔요 콜라
		EtcList.add("images/Etc/HambergerJelly.png"); // 햄버거 젤리 
		EtcList.add("images/Etc/Haribo.jpg"); // 하리보
		EtcList.add("images/Etc/HariboMini.jpg"); // 하리보 미니
		EtcList.add("images/Etc/Hotbar.jpg"); // 핫 바
		EtcList.add("images/Etc/KimchiDumpling.png"); // 김치 만두
		EtcList.add("images/Etc/MeatDumpling.jpg"); // 고기 만두
		EtcList.add("images/Etc/Mychu_Apple.jpg"); // 마이쮸 사과
		EtcList.add("images/Etc/Mychu_Grape.jpg"); // 마이쮸 포도
		EtcList.add("images/Etc/Mychu_Peach.jpg"); // 마이쮸 복숭아
		EtcList.add("images/Etc/Mychu_Straw.jpg"); // 마이쮸 딸기
		
		win.AddBtn(EtcList, Etcbtn, menu_Image);
	}
}

/////////////// class Etc3
class Etc3 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> EtcList; // Etc 사진  새콤짱딸기, 새콤짱 사과, 짱셔요 과일, 짱셔요 콜라
	private ArrayList<String> EtcInfoList; // Etc 정보사진
	private JButton Etcbtn[];
	private Etc win; // Snack1을 더할 프레임위치 클래스
	
	private JButton x_B;
	private JButton btn[]; // 왼쪽, 오른쪽 버튼
	
	public Etc3(Etc win) {
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
				 win.Change("etc3-2");
			}  	          
		});
		btn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 오른쪽 버튼이 눌러지면 발생하는 행동을 정의
				 win.Change("etc3-4");
			}
		});
		
		// 메뉴 버튼들
		Etcbtn = new JButton[12];
		    
		EtcList = new ArrayList<String>();
		EtcList.add("images/Etc/Hotbreak.jpg"); // 핫브레이크
		EtcList.add("images/Etc/Mygumi.jpg"); // 마이구미
		EtcList.add("images/Etc/PocketChicken.jpg"); // 포켓치킨 양념
		EtcList.add("images/Etc/PocketChicken_Deri.jpg"); // 포켓치킨 데리
		EtcList.add("images/Etc/Rock.jpg"); // 조약돌
		EtcList.add("images/Etc/Sandwich.jpg"); // 샌드위치
		EtcList.add("images/Etc/Saecomdalcom_Grape.jpg"); // 새콤달콤 포도
		EtcList.add("images/Etc/Saecomdalcom_Lemon.jpg"); // 새콤달콤 레몬
		EtcList.add("images/Etc/Saecomdalcom_Peach.jpg"); // 새콤달콤 복숭아
		EtcList.add("images/Etc/Saecomdalcom_Straw.jpg"); // 새콤달콤 딸기
		EtcList.add("images/Etc/Snickers.jpg"); // 스니커즈
		EtcList.add("images/Etc/Twix.jpg"); // 트윅스
		
		win.AddBtn(EtcList, Etcbtn, menu_Image);
	}
}

/////////////// class Etc4
class Etc4 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> EtcList; // Etc 사진  새콤짱딸기, 새콤짱 사과, 짱셔요 과일, 짱셔요 콜라
	private ArrayList<String> EtcInfoList; // Etc 정보사진
	private JButton Etcbtn[];
	private Etc win; // Snack1을 더할 프레임위치 클래스
	
	private JButton x_B;
	private JButton Lbtn; // 왼쪽 버튼
	
	public Etc4(Etc win) {
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
            // 왼쪽 버튼이 눌러지면 way2로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("etc4-3");
            }            
        });
		
		// 메뉴 버튼들
		Etcbtn = new JButton[5];
		    
		EtcList = new ArrayList<String>();
		EtcList.add("images/Etc/Sinjjolyi_Apple.jpg"); // 핫브레이크
		EtcList.add("images/Etc/Sinjjolyi_Lemon.jpg"); // 마이구미
		EtcList.add("images/Etc/Sinjjolyi_Straw.jpg"); // 햄버거 젤리 
		EtcList.add("images/Etc/Viyott_Berry.png"); // 하리보
		EtcList.add("images/Etc/Viyott_Choco.png"); // 하리보 미니
		
		win.AddBtn(EtcList, Etcbtn, menu_Image);
	} // Etc4 생성자
} // Etc4

public class Etc extends JFrame {
	private ImageIcon icon; // 불러온 이미지
	private Image image; // 이미지 객체
	public Etc1 etc1 = null;
	public Etc2 etc2 = null;
	public Etc3 etc3 = null;
	public Etc4 etc4 = null;
	
	public Etc() {
		setTitle("이용 방법");
		etc1 = new Etc1(this);
		etc2 = new Etc2(this);
		etc3 = new Etc3(this);
		etc4 = new Etc4(this);
	    setSize(1920, 1080);// 프레임 크기 설정
	    setLocationRelativeTo(null);//프레임 가운데
	    add(this.etc1);
	    
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1920,1080);
		setVisible(true);
	} // Etc 생성자
	
	public void Change(String panelName) {
		switch(panelName) {
		case "etc1-2": case "etc3-2":
			getContentPane().removeAll();
			getContentPane().add(etc2);
			revalidate();
			repaint();
			break;
		case "etc2-1":
			getContentPane().removeAll();
			getContentPane().add(etc1);
			revalidate();
			repaint();
			break;
		case "etc2-3": case "etc4-3":
			getContentPane().removeAll();
			getContentPane().add(etc3);
			revalidate();
			repaint();
			break;
		case "etc3-4":
			getContentPane().removeAll();
			getContentPane().add(etc4);
			revalidate();
			repaint();
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
	    		System.exit(0);
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
} 
