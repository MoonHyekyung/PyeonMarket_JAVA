import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;  //버튼 실행
import java.awt.event.ActionListener; //버튼 실행
import java.io.File; //음원 불러오기

import javax.sound.sampled.AudioInputStream; //음악 입력
import javax.sound.sampled.AudioSystem; //음악 재생
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Java_Cafeteria_main extends JFrame  {
	private ImageIcon RoadImage; // 불러온 사진 
	private JLabel Display; // 배경화면 JLabel
	private Image btImage; // 버튼 이미지 객체
	private JButton Btn[]; // 사용 시작 버튼배열(사용시작, 이용방법)
	private Clip clip; // Audio 받아들이는 객체
	
	Java_Cafeteria_main(){
	        setTitle("편매점");// 프레임 이름 설정
	        setSize(1920, 1080);// 프레임 크기 설정
	        setLocationRelativeTo(null);//프레임 가운데
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 창 누를 시 프로그램 종료
	        Container board = getContentPane(); // JFrame 위의 컨테이너
	        board.setLayout(null);// 컨테이너 board의 배치관리자 삭제

///////////////////////////////////////////////////////////////////////////////////
	        // 배경화면 추가 
	        RoadImage = new ImageIcon("images/maindisplay.jpg"); // 배경화면 불러오기
	        Display = new JLabel(RoadImage);//이미지 JLabel화
			Display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
			board.add(Display);
	       
			
			Btn = new JButton[2];
			
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
		        Btn[i].setOpaque(false);
			}
	        
	        Btn[0].setBounds(940, 450, 150, 430); //가로위치, 세로위치, 가로크기, 세로크기
	        Btn[1].setBounds(1240, 455, 150, 430 ); //가로위치, 세로위치, 가로크기, 세로크기
	      
	        //버튼추가
	        for(JButton b : Btn) Display.add(b);
	        
	        Btn[0].addActionListener(new ActionListener() {
    	        // "사용시작" 버튼이 눌러지면 발생하는 행동을 정의   
    	        public void actionPerformed(ActionEvent e) {
    	        	System.out.println("fdjk");
    	        	board.removeAll();
    	       		new Cafeteria_start();
    	       	}  	          
    	    });
	        
	        Btn[1].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Cafeteria_way1();
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
				clip = AudioSystem.getClip(); // ?
				clip.open(stream);
				clip.start();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
///////////////////////////////메인/////////////////////////////////////
		 public static void main(String[] args) {
			new Java_Cafeteria_main();
		}

}