import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Etc extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private Container board; // 바탕화면 컨테이너
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> EtcList; // Etc 사진  새콤짱딸기, 새콤짱 사과, 짱셔요 과일, 짱셔요 콜라
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
	    EtcList.add("images/Etc/zzang.png"); // 짱셔요 과일
	    EtcList.add("images/Etc/zzang_coke.png"); // 짱셔요 콜라
	    EtcList.add("images/Etc/zzang_coke.png"); // 짱셔요 콜라
	    
	    int i = 0;
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
		    if(i!=0 && i%5==0) {
		    	y += 300;
		    	x = -60; // 밑에서 260을 더할 것이기 때문
		    }
		    i++;
		    x += 260;
	    }
//	    	    
//	    	    class SaecomStrawberryInfo extends JFrame {
//	    	    	private JLabel secom;
//	    	    	private JButton x_B;
//	    	    	
//	    	    	public SaecomStrawberryInfo() {
//	    	    		setTitle("secom");// 프레임 이름 설정
//	            	    setSize(1920, 1080);// 프레임 크기 설정
//	            	    setLocationRelativeTo(null);//프레임 가운데
//	            	    
//	            		icon = new ImageIcon("images/SaecomStrawberryInfo.png");
//	            		secom = new JLabel(icon);//이미지로 변환
//	            		secom.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
//	                	add(secom);
//	                	setResizable(false);
//	    	    	    setVisible(true);
//	    	    	    
//	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
//	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
//	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
//	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
//	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
//	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
//	    	    	    secom.add(x_B);
//	    	    	    
//	    	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
//	    	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
//	    	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
//	    	    	    
//	    	    	    
//	    	    	    x_B.addActionListener(new ActionListener() {
//	    	    	    	public void actionPerformed(ActionEvent arg0) {
//	    	    	    		setVisible(false);
//	    	    	    	}
//	    	    	    });
//	    	    	  
//	    	    	}
//	    	    	
//	    	    	
//            	}
//    	    
//    	    //honey
//	    	    secom.addActionListener(new ActionListener() {
//                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
//                     
//                public void actionPerformed(ActionEvent arg0) {
//                	
//                	new SaecomStrawberryInfo();
//    	    		
//                    
//                }            
//            });
//	    		
//	    	    //secom_apple
//	    	    icon = new ImageIcon("images/secom_apple.png"); // 오른쪽 버튼 사진 불러오기
//	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
//	    		image = image.getScaledInstance(250,350, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
//	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
//	    		secom_apple =new JButton(icon); // 이미지 j버튼화
//	    		secom_apple.setBounds(600,500, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
//	    	    menu_Image.add(secom_apple);
//	    	    
//	    	    secom_apple.setBorderPainted(false); // Rbtn 외각선 색 없게
//	    	    secom_apple.setContentAreaFilled(false); // Rbtn 버튼색 없게
//	    	    secom_apple.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
//	    	    
//	    	    class SaecomAppleInfo extends JFrame {
//	    	    	private JLabel secom_apple;
//	    	    	private JButton x_B;
//	    	    	
//	    	    	public SaecomAppleInfo() {
//	    	    		setTitle("secom_apple");// 프레임 이름 설정
//	            	    setSize(1920, 1080);// 프레임 크기 설정
//	            	    setLocationRelativeTo(null);//프레임 가운데
//	            	    
//	            		icon = new ImageIcon("images/SaecomAppleInfo.png");
//	            		secom_apple = new JLabel(icon);//이미지로 변환
//	            		secom_apple.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
//	                	add(secom_apple);
//	                	setResizable(false);
//	    	    	    setVisible(true);
//	    	    	    
//	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
//	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
//	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
//	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
//	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
//	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
//	    	    	    secom_apple.add(x_B);
//	    	    	    
//	    	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
//	    	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
//	    	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
//	    	    	    
//	    	    	    
//	    	    	    x_B.addActionListener(new ActionListener() {
//	    	    	    	public void actionPerformed(ActionEvent arg0) {
//	    	    	    		setVisible(false);
//	    	    	    	}
//	    	    	    });
//	    	    	  
//	    	    	}
//	    	    	
//	    	    	
//            	}
//    	    
//    	    //honey
//	    	    secom_apple.addActionListener(new ActionListener() {
//                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
//                     
//                public void actionPerformed(ActionEvent arg0) {
//                	
//                	new SaecomAppleInfo();
//    	    		
//                    
//                }            
//            });    
//	    	    class JjangfruitsInfo extends JFrame {
//	    	    	private JLabel zzang;
//	    	    	private JButton x_B;
//	    	    	
//	    	    	public JjangfruitsInfo() {
//	    	    		setTitle("secom");// 프레임 이름 설정
//	            	    setSize(1920, 1080);// 프레임 크기 설정
//	            	    setLocationRelativeTo(null);//프레임 가운데
//	            	    
//	            		icon = new ImageIcon("images/JjangfruitsInfo.png");
//	            		zzang = new JLabel(icon);//이미지로 변환
//	            		zzang.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
//	                	add(zzang);
//	                	setResizable(false);
//	    	    	    setVisible(true);
//	    	    	    
//	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
//	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
//	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
//	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
//	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
//	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
//	    	    	    zzang.add(x_B);
//	    	    	    
//	    	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
//	    	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
//	    	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
//	    	    	    
//	    	    	    
//	    	    	    x_B.addActionListener(new ActionListener() {
//	    	    	    	public void actionPerformed(ActionEvent arg0) {
//	    	    	    		setVisible(false);
//	    	    	    	}
//	    	    	    });
//	    	    	  
//	    	    	}
//	    	    	
//	    	    	
//            	}
//    	    
//    	    //honey
//	    	    zzang.addActionListener(new ActionListener() {
//                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
//                     
//                public void actionPerformed(ActionEvent arg0) {
//                	
//                	new JjangfruitsInfo();
//    	    		
//                    
//                }            
//            });
	    	    
//	    	    class JjangcokeInfo extends JFrame {
//	    	    	private JLabel zzang_coke;
//	    	    	private JButton x_B;
//	    	    	
//	    	    	public JjangcokeInfo() {
//	    	    		setTitle("zzang_coke");// 프레임 이름 설정
//	            	    setSize(1920, 1080);// 프레임 크기 설정
//	            	    setLocationRelativeTo(null);//프레임 가운데
//	            	    
//	            		icon = new ImageIcon("images/JjangcokeInfo.png");
//	            		zzang_coke = new JLabel(icon);//이미지로 변환
//	            		zzang_coke.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
//	                	add(zzang_coke);
//	                	setResizable(false);
//	    	    	    setVisible(true);
//	    	    	    
//	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
//	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
//	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
//	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
//	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
//	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
//	    	    	    zzang_coke.add(x_B);
//	    	    	    
//	    	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
//	    	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
//	    	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
//	    	    	    
//	    	    	    
//	    	    	    x_B.addActionListener(new ActionListener() {
//	    	    	    	public void actionPerformed(ActionEvent arg0) {
//	    	    	    		setVisible(false);
//	    	    	    	}
//	    	    	    });
//	    	    	  
//	    	    	}
//	    	    	
//	    	    	
//            	}
//    	    
//    	    //honey
//	    	    zzang_coke.addActionListener(new ActionListener() {
//                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
//                     
//                public void actionPerformed(ActionEvent arg0) {
//                	
//                	new JjangcokeInfo();
//    	    		
//                    
//                }            
//            });
	    setResizable(false);
	    setVisible(true);
	  }

}
