import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


class Etc2 extends JPanel  {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> EtcList; // Etc 사진  새콤짱딸기, 새콤짱 사과, 짱셔요 과일, 짱셔요 콜라
	private ArrayList<String> EtcInfoList; // Etc 정보사진
	private JButton Etcbtn[];
	private Etc win; // Snack1을 더할 프레임위치 클래스
	
	private JButton x_B;
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	
	public Etc2(Etc win) {
		this.win = win;
		setLayout(null);
		
		
	}
}

public class Etc extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private Container board; // 바탕화면 컨테이너
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> EtcList1; // Etc 사진  새콤짱딸기, 새콤짱 사과, 짱셔요 과일, 짱셔요 콜라
	private ArrayList<String> EtcList2; 
	private ArrayList<String> EtcInfoList; // Etc 정보사진
	private JButton Etcbtn[];
	
	private JButton x_B;
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	public Etc() {
		setTitle("기타");// 프레임 이름 설정
	    setSize(1920, 1080);// 프레임 크기 설정
	    setLocationRelativeTo(null);//프레임 가운데
	   
	    
	    board = getContentPane(); // JFrame 위의 컨테이너
	    board.setLayout(null);// 컨테이너 board의 배치관리자 삭제
	            
	    icon = new ImageIcon("images/menu.png");
	    menu_Image = new JLabel(icon);//이미지로 변환
	    menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	    board.add(menu_Image);
	    
	    icon = new ImageIcon("images/x.png"); // X 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 X 사진 넣기
		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    x_B =new JButton(icon); // 이미지 j버튼화
	    x_B.setBounds(1700,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    menu_Image.add(x_B);
	    
	    x_B.setBorderPainted(false); //외각선 색 없게
	    x_B.setContentAreaFilled(false); // 버튼색 없게
	    x_B.setFocusPainted(false); // 선택될 때 테두리 없게
	    
	    
	    x_B.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		System.exit(0);
//	    		setVisible(false);
	    	}
	    });
	    
	    // 기타 버튼들
	    Etcbtn = new JButton[37];
	    
	    EtcList1 = new ArrayList<String>();
	    EtcList1.add("images/Etc/Abc.jpg"); // ABC 초콜릿
	    EtcList1.add("images/Etc/Birdegg.png"); // 새알 초콜릿
	    EtcList1.add("images/Etc/Crunky.jpg"); // 크런키
	    EtcList1.add("images/Etc/Egg.jpg"); // 맥반석
	    EtcList1.add("images/Etc/Gana.jpg"); // 가나 초콜릿
	    EtcList1.add("images/Etc/Gonyak_grape.jpg"); // 곤약젤리 청포도
	    EtcList1.add("images/Etc/Gonyak_peach.jpg"); // 곤약젤리 복숭아
	    EtcList1.add("images/Etc/Grapeball.jpg"); // 꼬미볼 포도
	    EtcList1.add("images/Etc/Sodaball.jpg"); // 꼬미볼 소다
	    EtcList1.add("images/Etc/Peachball.jpg"); // 꼬미볼 복숭아
	    EtcList1.add("images/Etc/secom.png"); // 새콤짱 딸기 
	    EtcList1.add("images/Etc/secom_apple.png"); // 새콤짱 사과
	    
	    EtcList2 = new ArrayList<String>();
	    EtcList2.add("images/Etc/zzang.png"); // 짱셔요 과일
	    EtcList2.add("images/Etc/zzang_coke.png"); // 짱셔요 콜라
	    EtcList2.add("images/Etc/Gana.png"); // 가나 초콜릿
	    EtcList2.add("images/Etc/HambergerJelly.png"); // 햄버거 젤리 
	    EtcList2.add("images/Etc/Haribo.png"); // 하리보
	    EtcList2.add("images/Etc/HariboMini.png"); // 하리보 미니
	    EtcList2.add("images/Etc/Hotbar.png"); // 핫 바
	    EtcList2.add("images/Etc/Hotbreak.png"); // 핫브레이크
	    EtcList2.add("images/Etc/KimchiDumpling.png"); // 김치 만두
	    EtcList2.add("images/Etc/MeatDumpling.png"); // 고기 만두
	    
	    int i = 0, chk = 1;
	    int x = 200, y = 450, width = 250, height = 250;
	    for(String etc: EtcList1) { // 향상된 for문
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
		    }
		    else if(chk==24||chk==36) { // 옆장으로 넘기기 줄 내리기
		    	
		    }
		    i++;
		    chk++;
		    x += 260;
	    }
	    setResizable(false);
	    setVisible(true);
	  }

}
