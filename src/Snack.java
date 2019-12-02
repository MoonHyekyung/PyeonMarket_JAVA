import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Snack1 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private JLabel imageLabel; // 배경화면 제이라벨
	private Image image; // 이미지 객체화
	private JButton Rbtn; // 오른쪽 버튼
	private Snack win; // Snack1을 더할 프레임위치 클래스
	
	private JButton Gosomi; // 고소미 사진 버튼
	private JButton BananaKick; // 바나나 킥 사진 버튼
	private JButton Saddobab; // 사또밥 사진 버튼
	private JButton Chocosongyi; // 초코송이 사진 버튼
	private JButton Chochpie; // 초코파이 사진 버튼
	private JButton Cancho; // 칸쵸 사진 버튼
	private JButton Honeybutter; // 허니버터칩 사진 버튼
	private JButton Honeybutter_Cherry; // 허니버터칩 - 체리블라썸 사진 버튼
	
	public Snack1(Snack win) {
		this.win = win;
		setLayout(null);
		
		//배경화면 추가 
        icon = new ImageIcon("images/menu.png"); // 사진 불러오기
        imageLabel = new JLabel(icon);//이미지로 변환
		imageLabel.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		add(imageLabel);
		
		///////////////// 오른쪽 버튼 ////////////////////////////
		icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(190,190, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Rbtn =new JButton(icon); // 이미지 j버튼화
	    Rbtn.setBounds(1600, 800, 190, 190); //가로위치, 세로위치, 가로크기, 세로크기
			    
	    Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    imageLabel.add(Rbtn);
	    
	    Rbtn.addActionListener(new ActionListener() {
            // 오른쪽 버튼이 눌러지면 Snack2로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("Snack1-2");
            }            
        });
	}
}
class Snack2 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private JLabel imageLabel;
	private Image image; // 이미지 객체화
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	private Snack win; // Snack2를 더할 프레임위치 클래스
	
	private JButton Amond; // 아몬드 빼빼로
	private JButton Original; // 오리지널 빼빼로
	private JButton Nude; // 누드 빼빼로
	private JButton Cham; // 참 크래커 
	private JButton Chicken; // 후라이드 닭다리
	private JButton HotChicken; // 핫 치킨
	private JButton Crown_Milk; // 크라운산도 밀크
	private JButton Crown_Strawberry; // 크라운 산도 딸
	
	public Snack2(Snack win) {
		setLayout(null);
		this.win = win; // 넘겨 받은 부모 프레임을 멤버변수에 넣기
		
		//배경화면 추가 
        icon = new ImageIcon("images/menu.png"); // 사진 불러오기
        imageLabel = new JLabel(icon);//이미지로 변환
		imageLabel.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		add(imageLabel);
		
		/////////////////// 오른쪽 버튼 /////////////////////////
		icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(190,190, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Rbtn =new JButton(icon); // 이미지 j버튼화
	    Rbtn.setBounds(1600, 800, 190, 190); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    imageLabel.add(Rbtn);
	    
	    Rbtn.addActionListener(new ActionListener() {
            // 오른쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("Snack2-3");
            }            
        });
	 ///////////////// 왼쪽 버튼//////////////////////////////////////////////
	    icon = new ImageIcon("images/left.png"); // 사진 불러오기
		image=icon.getImage(); //이미지 객체에 넣기
		image=image.getScaledInstance(190, 190, Image.SCALE_SMOOTH); // 객체 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Lbtn=new JButton(icon); // Lbtn Jbutton 추가
	    Lbtn.setBounds(100, 800, 190, 190); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Lbtn.setBorderPainted(false); // Lbtn 외각선 색 없게
        Lbtn.setContentAreaFilled(false); // Lbtn 버튼색 없게
        Lbtn.setFocusPainted(false);// Lbtn 선택될 때 테두리 없게
        imageLabel.add(Lbtn);
	   
        Lbtn.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack1로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("Snack2-1");
            }            
        });
	}
}

class Snack3 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private JLabel imageLabel; // 배경화면 JLabel
	private Image image; // 이미지 객체화
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	private Snack win; //// Snack3을 더할 프레임위치 클래스
	
	private JButton Corn; // 콘칩
	private JButton Ggobuk; // 꼬북칩
	private JButton Goggal; // 꼬깔콘 군옥수수맛
	private JButton Homerunball; // 홈런볼
	private JButton HotShrimp; // 매운 새우깡
	private JButton Lottesand; // 롯데 샌드 파인애플
	private JButton MiniChoco; // 미니 초코칩
	private JButton Postick; // 포스틱
	public Snack3(Snack win) {
		setLayout(null);
		this.win = win;
		
		//배경화면 추가 
        icon = new ImageIcon("images/menu.png"); // 사진 불러오기
        imageLabel = new JLabel(icon);//이미지로 변환
		imageLabel.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		add(imageLabel);
		
		/////////////////// 오른쪽 버튼 /////////////////////////
		icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(190,190, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Rbtn =new JButton(icon); // 이미지 j버튼화
		Rbtn.setBounds(1600, 800, 190, 190); //가로위치, 세로위치, 가로크기, 세로크기

		Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
		Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
		Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		imageLabel.add(Rbtn);

		Rbtn.addActionListener(new ActionListener() {
		// 오른쪽 버튼이 눌러지면 Snack4로 넘어가기
       
		public void actionPerformed(ActionEvent arg0) {
			win.Change("Snack3-4");
		}            
		});
		
		 ///////////////// 왼쪽 버튼//////////////////////////////////////////////
	    icon = new ImageIcon("images/left.png"); // 사진 불러오기
		image=icon.getImage(); //이미지 객체에 넣기
		image=image.getScaledInstance(190, 190, Image.SCALE_SMOOTH); // 객체 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Lbtn=new JButton(icon); // Lbtn Jbutton 추가
	    Lbtn.setBounds(100, 800, 190, 190); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Lbtn.setBorderPainted(false); // Lbtn 외각선 색 없게
        Lbtn.setContentAreaFilled(false); // Lbtn 버튼색 없게
        Lbtn.setFocusPainted(false);// Lbtn 선택될 때 테두리 없게
        imageLabel.add(Lbtn);
	   
        Lbtn.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack2로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("Snack3-2");
            }            
        });
	}
}

class Snack4 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private JLabel imageLabel; // 배경화면 JLabel
	private Image image; // 이미지 객체화
	private JButton Lbtn; // 왼쪽 버튼
	private Snack win;// Snack4를 더할 프레임위치 클래스
	
	private JButton Sun; // 썬칩
	private JButton Ugwa; // 조청 유과
	private JButton AlShrimp; // 알새우 칩 사진 버튼
	
	public Snack4(Snack win) {
		setLayout(null);
		this.win = win;
		
		//배경화면 추가 
        icon = new ImageIcon("images/menu.png"); // 사진 불러오기
        imageLabel = new JLabel(icon);//이미지로 변환
		imageLabel.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		add(imageLabel);
		
		 ///////////////// 왼쪽 버튼//////////////////////////////////////////////
	    icon = new ImageIcon("images/left.png"); // 사진 불러오기
		image=icon.getImage(); //이미지 객체에 넣기
		image=image.getScaledInstance(190, 190, Image.SCALE_SMOOTH); // 객체 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Lbtn=new JButton(icon); // Lbtn Jbutton 추가
	    Lbtn.setBounds(100, 800, 190, 190); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Lbtn.setBorderPainted(false); // Lbtn 외각선 색 없게
        Lbtn.setContentAreaFilled(false); // Lbtn 버튼색 없게
        Lbtn.setFocusPainted(false);// Lbtn 선택될 때 테두리 없게
        imageLabel.add(Lbtn);
	   
        Lbtn.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("Snack4-3");
            }            
        });
	}
}
public class Snack extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	
	public Snack1 snack1 = null;
	public Snack2 snack2 = null;
	public Snack3 snack3 = null;
	public Snack4 snack4 = null;
	
	public Snack() {
		setTitle("과자");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1920,1080);
		
		snack1 = new Snack1(this);
		snack2 = new Snack2(this);
		snack3 = new Snack3(this);
		snack4 = new Snack4(this);
		add(this.snack1);		
		setVisible(true);
	}
	public void Change(String panelName) {  // 패널 바꾸는 함수
		switch(panelName) {
		case "Snack2-1":
			getContentPane().removeAll();
			getContentPane().add(snack1);
			revalidate();
			repaint();
			break;
			
		case "Snack1-2": case "Snack3-2":
			getContentPane().removeAll();
			getContentPane().add(snack2);
			revalidate();
			repaint();
			break;
			
		case "Snack2-3": case "Snack4-3":
			getContentPane().removeAll();
			getContentPane().add(snack3);
			revalidate();
			repaint();
			break;
			
		case "Snack3-4":
			getContentPane().removeAll();
			getContentPane().add(snack4);
			revalidate();
			repaint();
			break;
		}
	}
}
