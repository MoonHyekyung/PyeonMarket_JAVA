import java.awt.*;
import java.awt.event.ActionEvent;  //버튼 실행
import java.awt.event.ActionListener; //버튼 실행
import java.awt.event.MouseAdapter;
import java.io.File; //음원 불러오기

import javax.sound.sampled.AudioInputStream; //음악 입력
import javax.sound.sampled.AudioSystem; //음악 재생
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Java_Cafeteria_main extends JFrame  {
	private ImageIcon RoadImage; // 불러온 사진 
	private JLabel Display; // 배경화면 JLabel
	private Image btImage; // 버튼 이미지 객체
	private Image image; // 이미지 객체
	private JLabel DoorLabel; // 마우스 확인하는 문 JLabel
	private JLabel Welcome; // 어서와 사진 JLabel 
	private JButton Btn[]; // 사용 시작 버튼배열(사용시작, 이용방법)
	private JButton x_B; // x버튼
	private Clip clip; // Audio 받아들이는 객체
	
	Java_Cafeteria_main(){
	        setTitle("편매점");// 프레임 이름 설정
	        setSize(1920, 1080);// 프레임 크기 설정
	        setLocationRelativeTo(null);//프레임 가운데
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 창 누를 시 프로그램 종료
	        setLayout(null);// 컨테이너 board의 배치관리자 삭제

///////////////////////////////// 배경 화면 //////////////////////////////////////////////////
	        // 배경화면 추가 
	        RoadImage = new ImageIcon("images/Maindisplay_open.png"); // 배경화면 불러오기
	        Display = new JLabel(RoadImage);//이미지 JLabel화
			Display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
			add(Display);
			
			RoadImage = new ImageIcon("images/x.png"); // X 버튼 사진 불러오기
			image = RoadImage.getImage(); // 이미지 객체에 X 사진 넣기
			image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
			RoadImage.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    x_B =new JButton(RoadImage); // 이미지 j버튼화
		    x_B.setBounds(1700,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
		    Display.add(x_B);
		    
		    x_B.setBorderPainted(false); //외각선 색 없게
		    x_B.setContentAreaFilled(false); // 버튼색 없게
		    x_B.setFocusPainted(false); // 선택될 때 테두리 없게
		    
		    
		    x_B.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent arg0) {
		    		System.exit(0);
		    	}
		    });
			
			// 어서와 쓰레드 넣기
			RoadImage = new ImageIcon("images/Welcome.png"); // 오른쪽 버튼 사진 불러오기
			image = RoadImage.getImage(); // 이미지 객체에 right 사진 넣기
			image = image.getScaledInstance(300,150, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
			RoadImage.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
			Welcome = new JLabel(RoadImage);
		    Welcome.setBounds(260, 200, 300, 150); //가로위치, 세로위치, 가로크기, 세로크기
		    Display.add(Welcome);
		    
		    class WelcomeThread extends Thread{
		    	public void run() {
		    		while(true) {
		    			Welcome.setVisible(false); // 어서와 사진 안 보이게
		    			try {
		    				sleep(500); // 0.5초 지속
		    			}catch(Exception e) {
		    				e.printStackTrace();
		    			}
		    			Welcome.setVisible(true);	// 어서와 사진 보이게
		    			try {
		    				sleep(500); // 0.5초 지속
		    			}catch(Exception e) {
		    				e.printStackTrace();
		    			}
		    		}
		    	}
		    }
		    
		    WelcomeThread t = new WelcomeThread();
		    t.start();
		    
///////////////////////////  버튼   /////////////////////////////////////////////			
			Btn = new JButton[2]; // 왼쪽 버튼, 오른쪽 버튼
			for(int i =0; i<Btn.length; i++) {
				switch(i) {
				case 0: 
					RoadImage = new ImageIcon("images/PLAY.png"); // i=0일경우 사용시작 사진 불러오기
					break;
				case 1:
					RoadImage = new ImageIcon("images/PLAY-WAY.png"); // i=1일경우 이용방법 사진 불러오기
				}
				
				btImage=RoadImage.getImage(); // 불러온 사진 객체화
				btImage=btImage.getScaledInstance(210,490, Image.SCALE_SMOOTH); //이미지 사이즈 조절하기
				RoadImage.setImage(btImage); //사이즈 조절한거 다시 이미지에 넣기(객체 말고)
			    Btn[i]=new JButton(RoadImage); // 버튼안에 이미지 넣기
			    
			    /////////////////////버튼 창 외곽, 색깔 없애기///////////////// 
				Btn[i].setBorderPainted(false);
		        Btn[i].setContentAreaFilled(false);
		        Btn[i].setFocusPainted(false);
			}
	        
	        Btn[0].setBounds(940, 400, 150, 430); //가로위치, 세로위치, 가로크기, 세로크기
	        Btn[1].setBounds(1240, 405, 150, 430 ); //가로위치, 세로위치, 가로크기, 세로크기
	      
	        //버튼추가
	        for(JButton b : Btn) Display.add(b);
	        
	        Btn[0].addActionListener(new ActionListener() {
    	        // "사용시작" 버튼이 눌러지면 발생하는 행동을 정의   
    	        public void actionPerformed(ActionEvent e) {
    	       		new Cafeteria_start();
    	       	}  	          
    	    });
	        
	        Btn[1].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// " 이용방법" 버튼이 눌러지면 발생하는 행동을 정의
					new Way();
				}
			});
	        
	        PlayMusic("music/Start.wav");
	        
	        setVisible(true);		
		}
///////////////////// 노래 틀어지는 함수 ///////////////////////////////
		public void PlayMusic(String fname) {
			File file = new File(fname);//음악 파일 불러오기
			System.out.println(file.exists()); //파일이 존재하면 true
			try {
				AudioInputStream stream = AudioSystem.getAudioInputStream(file);
				//파일 내에 있는 음악입력
				clip = AudioSystem.getClip(); // 
				clip.open(stream);
				clip.start();
				clip.loop(3);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
///////////////////////////////메인/////////////////////////////////////
		 public static void main(String[] args) {
			new Java_Cafeteria_main();
		}

}