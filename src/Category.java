import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Category extends JFrame{
	private ImageIcon RoadImage; // 불러온 사진 
	private JLabel Display; // 배경화면 JLabel
	private Image image; // Choose 이미지 객체
	private Image btnImage; // 버튼 이미지 객체
	private JLabel Choose; // 놀러와 JLabel 객체
	
	private JButton Bread; // 빵 버튼
	private JButton Snack; // 과자 버튼
	private JButton Drink; // 음료수 버튼
	private JButton IceCream; // 아이스크림 버튼
	private JButton Etc; // 기타 등등 버튼
	
	public Category() {
		setTitle("카테고리");// 프레임 이름 설정
        setSize(1920, 1080);// 프레임 크기 설정
        setLocationRelativeTo(null);//프레임 가운데
        setLayout(null);// 컨테이너 board의 배치관리자 삭제
        
        /////////////////////// 배경화면  //////////////////////////////
        RoadImage = new ImageIcon("images/CategoryDisplay.png"); // 배경화면 사진 불러오기
        Display = new JLabel(RoadImage);//이미지로 변환
		Display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		add(Display);
		
		// 골라봐 사진 & 쓰레드 넣기
		RoadImage = new ImageIcon("images/Choose.png");
		image = RoadImage.getImage(); // 이미지 객체화
        image = image.getScaledInstance(340, 190, Image.SCALE_SMOOTH); //  사이즈조절
		RoadImage.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Choose =new JLabel(RoadImage); // 이미지 j버튼화
		Choose.setBounds(900,600, 340, 190);
		
		Display.add(Choose);
		
		class ChooseThread extends Thread{
	    	public void run() {
	    		while(true) {
	    			Choose.setVisible(false); // 골라봐 버튼 안 보이게
	    			try {
	    				sleep(500); // 0.5초 지속
	    			}catch(Exception e) {
	    				e.printStackTrace();
	    			}
	    			Choose.setVisible(true);	// 골라봐 버튼 보이게
	    			try {
	    				sleep(500); // 0.5초 지속
	    			}catch(Exception e) {
	    				e.printStackTrace();
	    			}
	    		}
	    	}
	    }
	    
	    ChooseThread t = new ChooseThread();
	    t.start();
		
		////// 빵 버튼  /////////////////////////////////////////////
		RoadImage = new ImageIcon("images/Bread.png");
	    btnImage = RoadImage.getImage(); // 이미지 객체화
	    btnImage = btnImage.getScaledInstance(300, 450, Image.SCALE_SMOOTH); //  사이즈조절
		RoadImage.setImage(btnImage); //사이즈 조절한거 다시 이미지에 넣기
		Bread =new JButton(RoadImage); // 이미지 j버튼화
		Bread.setBounds(90, 480, 300, 450);
		
		Bread.setBorderPainted(false); // Bread 외각선 색 없게
		Bread.setContentAreaFilled(false); // Bread 버튼색 없게
		Bread.setFocusPainted(false); // Bread 선택될 때 테두리 없게
		Display.add(Bread);
        
		Bread.addActionListener(new ActionListener() {
			// Bread 버튼이 눌러지면 발생하는 행동을 정의
		    public void actionPerformed(ActionEvent arg0) {
		    	new Bread();
		    }            
		});
		
		
		////// 과자 버튼 ///////////////////////////////////////////////
		RoadImage = new ImageIcon("images/Snack.png");
	    image = RoadImage.getImage(); // 이미지 객체화
	    image = image.getScaledInstance(300, 450, Image.SCALE_SMOOTH); //  사이즈조절
		RoadImage.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Snack =new JButton(RoadImage); // 이미지 j버튼화
		Snack.setBounds(350, 250, 300, 450);
		
		Snack.setBorderPainted(false); // Snack 외각선 색 없게
		Snack.setContentAreaFilled(false); // Snack 버튼색 없게
		Snack.setFocusPainted(false); // Snack 선택될 때 테두리 없게
		Display.add(Snack);
        
		Snack.addActionListener(new ActionListener() {
			// Snack 버튼이 눌러지면 발생하는 행동을 정의
		    public void actionPerformed(ActionEvent arg0) {
		    	new Snack();
		    }            
		});
		
		/////// 음료수 버튼 ////////////////////////////////////////
		RoadImage = new ImageIcon("images/Drink.png");
	    image = RoadImage.getImage(); // 이미지 객체화
	    image = image.getScaledInstance(400, 450, Image.SCALE_SMOOTH); //  사이즈조절
		RoadImage.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Drink =new JButton(RoadImage); // 이미지 j버튼화
		Drink.setBounds(710, 20, 400, 450);
		
		Drink.setBorderPainted(false); // Drink 외각선 색 없게
		Drink.setContentAreaFilled(false); // Drink 버튼색 없게
		Drink.setFocusPainted(false); // Drink 선택될 때 테두리 없게
		Display.add(Drink);
        
		Drink.addActionListener(new ActionListener() {
			// Drink 버튼이 눌러지면 발생하는 행동을 정의
		    public void actionPerformed(ActionEvent arg0) {
		    	new Drink();
		    }            
		});
		
		/////// 아이스크림 버튼 ////////////////////////////////////////
		RoadImage = new ImageIcon("images/IceCream.png");
		image = RoadImage.getImage(); // 이미지 객체화
		image = image.getScaledInstance(400, 450, Image.SCALE_SMOOTH); //  사이즈조절
		RoadImage.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		IceCream =new JButton(RoadImage); // 이미지 j버튼화
		IceCream.setBounds(1100, 220, 400, 450);
			
		IceCream.setBorderPainted(false); // IceCream 외각선 색 없게
		IceCream.setContentAreaFilled(false); // IceCream 버튼색 없게
		IceCream.setFocusPainted(false); // IceCream 선택될 때 테두리 없게
		Display.add(IceCream);
	        
		IceCream.addActionListener(new ActionListener() {
			// IceCream 버튼이 눌러지면 발생하는 행동을 정의
			  public void actionPerformed(ActionEvent arg0) {
			    new IceCream();
			   }            
		});
		
		//// 기타 버튼 ////////////////////
		RoadImage = new ImageIcon("images/Etc.png");
		image = RoadImage.getImage(); // 이미지 객체화
		image = image.getScaledInstance(400, 450, Image.SCALE_SMOOTH); //  사이즈조절
		RoadImage.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Etc =new JButton(RoadImage); // 이미지 j버튼화
		Etc.setBounds(1450, 480, 400, 450);
			
		Etc.setBorderPainted(false); // Etc 외각선 색 없게
		Etc.setContentAreaFilled(false); // Etc 버튼색 없게
		Etc.setFocusPainted(false); // Etc 선택될 때 테두리 없게
		Display.add(Etc);
		        
		Etc.addActionListener(new ActionListener() {
			// Etc 버튼이 눌러지면 발생하는 행동을 정의
			  public void actionPerformed(ActionEvent arg0) {
			    new Etc();
			   }            
		});
        setVisible(true);
	}
}
