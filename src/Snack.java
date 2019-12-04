import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Snack1 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private JLabel Menu_Image; // 배경화면 제이라벨
	private Image image; // 이미지 객체화
	private JButton Rbtn; // 오른쪽 버튼
	private Snack win; // Snack1을 더할 프레임위치 클래스
	private JButton x_B; //x버튼
	
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
        Menu_Image = new JLabel(icon);//이미지로 변환
		Menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	  
		add(Menu_Image);
		
		icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    x_B =new JButton(icon); // 이미지 j버튼화
	    x_B.setBounds(1700,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(x_B);
	    
	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    
	    x_B.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		win.setVisible(false);
	    	}
	    });
		
		///////////////// 오른쪽 버튼 ////////////////////////////
		icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(290,290, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Rbtn =new JButton(icon); // 이미지 j버튼화
	    Rbtn.setBounds(1300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
			    
	    Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    Menu_Image.add(Rbtn);
	    
	    //Gosomi
	    icon = new ImageIcon("images/Gosomi.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(200,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Gosomi =new JButton(icon); // 이미지 j버튼화
	    Gosomi.setBounds(250,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Gosomi);
	    
	    Gosomi.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Gosomi.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Gosomi.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class GosomiInfo extends JFrame {
	    	private JLabel Gosomi;
	    	private JButton x_B;
	    	
	    	public GosomiInfo() {
	    		setTitle("패스츄리");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/GosomiInfo.png");
        		Gosomi = new JLabel(icon);//이미지로 변환
        		Gosomi.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Gosomi);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Gosomi.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
		Gosomi.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new GosomiInfo();
	    		
                
            }            
        });
	    //BananaKick
	    icon = new ImageIcon("images/BananaKick.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		BananaKick =new JButton(icon); // 이미지 j버튼화
		BananaKick.setBounds(600,420, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(BananaKick);
	    
	    BananaKick.setBorderPainted(false); // Rbtn 외각선 색 없게
	    BananaKick.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    BananaKick.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    
	    class BananakickInfo extends JFrame {
	    	private JLabel BananaKick;
	    	private JButton x_B;
	    	
	    	public BananakickInfo() {
	    		setTitle("바나나킥");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/BananakickInfo.png");
        		BananaKick = new JLabel(icon);//이미지로 변환
        		BananaKick.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(BananaKick);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    BananaKick.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    BananaKick.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new BananakickInfo();
	    		
                
            }            
        });
	    //Saddobab
	    icon = new ImageIcon("images/Saddobab.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Saddobab =new JButton(icon); // 이미지 j버튼화
		Saddobab.setBounds(250,710, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Saddobab);
	    
	    Saddobab.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Saddobab.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Saddobab.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class SaddobabInfo extends JFrame {
	    	private JLabel Saddobab;
	    	private JButton x_B;
	    	
	    	public SaddobabInfo() {
	    		setTitle("바나나킥");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/SaddobabInfo.png");
        		Saddobab = new JLabel(icon);//이미지로 변환
        		Saddobab.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Saddobab);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Saddobab.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Saddobab.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new SaddobabInfo();
	    		
                
            }            
        });
	    
	    //Chocosongyi
	    icon = new ImageIcon("images/Chocosongyi.png"); // 오른쪽 버튼 사진 불러오기
			image = icon.getImage(); // 이미지 객체에 right 사진 넣기
			image = image.getScaledInstance(300,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
			icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
			Chocosongyi =new JButton(icon); // 이미지 j버튼화
			Chocosongyi.setBounds(600,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
		    Menu_Image.add(Chocosongyi);
		    
		    Chocosongyi.setBorderPainted(false); // Rbtn 외각선 색 없게
		    Chocosongyi.setContentAreaFilled(false); // Rbtn 버튼색 없게
		    Chocosongyi.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		    
		    class ChocosongyiInfo extends JFrame {
		    	private JLabel Chocosongyi;
		    	private JButton x_B;
		    	
		    	public ChocosongyiInfo() {
		    		setTitle("초코송이");// 프레임 이름 설정
	        	    setSize(1920, 1080);// 프레임 크기 설정
	        	    setLocationRelativeTo(null);//프레임 가운데
	        	    
	        		icon = new ImageIcon("images/ChocosongyiInfo.png");
	        		Chocosongyi = new JLabel(icon);//이미지로 변환
	        		Chocosongyi.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	            	add(Chocosongyi);
	            	setResizable(false);
		    	    setVisible(true);
		    	    
		    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    	    x_B =new JButton(icon); // 이미지 j버튼화
		    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
		    	    Chocosongyi.add(x_B);
		    	    
		    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
		    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
		    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		    	    
		    	    
		    	    x_B.addActionListener(new ActionListener() {
		    	    	public void actionPerformed(ActionEvent arg0) {
		    	    		setVisible(false);
		    	    	}
		    	    });
		    	  
		    	}
		    	
		    	
	    	}
		    Chocosongyi.addActionListener(new ActionListener() {
	            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                 
	            public void actionPerformed(ActionEvent arg0) {
	            	
	            	new ChocosongyiInfo();
		    		
	                
	            }            
	        });
		    
		// Chochpie
		    icon = new ImageIcon("images/Chocopie.png"); // 오른쪽 버튼 사진 불러오기
			image = icon.getImage(); // 이미지 객체에 right 사진 넣기
			image = image.getScaledInstance(300,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
			icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
			Chochpie =new JButton(icon); // 이미지 j버튼화
			Chochpie.setBounds(1050,420, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
		    Menu_Image.add(Chochpie);
		    
		    Chochpie.setBorderPainted(false); // Rbtn 외각선 색 없게
		    Chochpie.setContentAreaFilled(false); // Rbtn 버튼색 없게
		    Chochpie.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		    
		    class ChocopieInfo extends JFrame {
		    	private JLabel Chochpie;
		    	private JButton x_B;
		    	
		    	public ChocopieInfo() {
		    		setTitle("초코파이");// 프레임 이름 설정
	        	    setSize(1920, 1080);// 프레임 크기 설정
	        	    setLocationRelativeTo(null);//프레임 가운데
	        	    
	        		icon = new ImageIcon("images/ChocopieInfo.png");
	        		Chochpie = new JLabel(icon);//이미지로 변환
	        		Chochpie.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	            	add(Chochpie);
	            	setResizable(false);
		    	    setVisible(true);
		    	    
		    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    	    x_B =new JButton(icon); // 이미지 j버튼화
		    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
		    	    Chochpie.add(x_B);
		    	    
		    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
		    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
		    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		    	    
		    	    
		    	    x_B.addActionListener(new ActionListener() {
		    	    	public void actionPerformed(ActionEvent arg0) {
		    	    		setVisible(false);
		    	    	}
		    	    });
		    	  
		    	}
		    	
		    	
	    	}
		    Chochpie.addActionListener(new ActionListener() {
	            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                 
	            public void actionPerformed(ActionEvent arg0) {
	            	
	            	new ChocopieInfo();
		    		
	                
	            }            
	        });
		    
		 //Cancho
		    icon = new ImageIcon("images/Cancho.png"); // 오른쪽 버튼 사진 불러오기
			image = icon.getImage(); // 이미지 객체에 right 사진 넣기
			image = image.getScaledInstance(300,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
			icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
			Cancho =new JButton(icon); // 이미지 j버튼화
			Cancho.setBounds(1400,420, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
		    Menu_Image.add(Cancho);
		    
		    Cancho.setBorderPainted(false); // Rbtn 외각선 색 없게
		    Cancho.setContentAreaFilled(false); // Rbtn 버튼색 없게
		    Cancho.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		    
		    class CanchoInfo extends JFrame {
		    	private JLabel Cancho;
		    	private JButton x_B;
		    	
		    	public CanchoInfo() {
		    		setTitle("칸쵸");// 프레임 이름 설정
	        	    setSize(1920, 1080);// 프레임 크기 설정
	        	    setLocationRelativeTo(null);//프레임 가운데
	        	    
	        		icon = new ImageIcon("images/CanchoInfo.png");
	        		Cancho = new JLabel(icon);//이미지로 변환
	        		Cancho.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	            	add(Cancho);
	            	setResizable(false);
		    	    setVisible(true);
		    	    
		    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    	    x_B =new JButton(icon); // 이미지 j버튼화
		    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
		    	    Cancho.add(x_B);
		    	    
		    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
		    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
		    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		    	    
		    	    
		    	    x_B.addActionListener(new ActionListener() {
		    	    	public void actionPerformed(ActionEvent arg0) {
		    	    		setVisible(false);
		    	    	}
		    	    });
		    	  
		    	}
		    	
		    	
	    	}
		    Cancho.addActionListener(new ActionListener() {
	            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                 
	            public void actionPerformed(ActionEvent arg0) {
	            	
	            	new CanchoInfo();
		    		
	                
	            }            
	        });
		    
	//	  Honeybutter  
		    icon = new ImageIcon("images/Honeybutter.png"); // 오른쪽 버튼 사진 불러오기
			image = icon.getImage(); // 이미지 객체에 right 사진 넣기
			image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
			icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
			Honeybutter =new JButton(icon); // 이미지 j버튼화
			Honeybutter.setBounds(1050,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
		    Menu_Image.add(Honeybutter);
		    
		    Honeybutter.setBorderPainted(false); // Rbtn 외각선 색 없게
		    Honeybutter.setContentAreaFilled(false); // Rbtn 버튼색 없게
		    Honeybutter.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		    
		    class HoneybutterInfo extends JFrame {
		    	private JLabel Honeybutter;
		    	private JButton x_B;
		    	
		    	public HoneybutterInfo() {
		    		setTitle("허니버터칩");// 프레임 이름 설정
	        	    setSize(1920, 1080);// 프레임 크기 설정
	        	    setLocationRelativeTo(null);//프레임 가운데
	        	    
	        		icon = new ImageIcon("images/HoneybutterInfo.png");
	        		Honeybutter = new JLabel(icon);//이미지로 변환
	        		Honeybutter.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	            	add(Honeybutter);
	            	setResizable(false);
		    	    setVisible(true);
		    	    
		    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    	    x_B =new JButton(icon); // 이미지 j버튼화
		    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
		    	    Honeybutter.add(x_B);
		    	    
		    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
		    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
		    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		    	    
		    	    
		    	    x_B.addActionListener(new ActionListener() {
		    	    	public void actionPerformed(ActionEvent arg0) {
		    	    		setVisible(false);
		    	    	}
		    	    });
		    	  
		    	}
		    	
		    	
	    	}
		    Honeybutter.addActionListener(new ActionListener() {
	            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                 
	            public void actionPerformed(ActionEvent arg0) {
	            	
	            	new HoneybutterInfo();
		    		
	                
	            }            
	        });
		    
	//	    Honeybutter_Cherry
		    icon = new ImageIcon("images/Honeybutter_Cherry.png"); // 오른쪽 버튼 사진 불러오기
			image = icon.getImage(); // 이미지 객체에 right 사진 넣기
			image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
			icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
			Honeybutter_Cherry =new JButton(icon); // 이미지 j버튼화
			Honeybutter_Cherry.setBounds(1400,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
		    Menu_Image.add(Honeybutter_Cherry);
		    
		    Honeybutter_Cherry.setBorderPainted(false); // Rbtn 외각선 색 없게
		    Honeybutter_Cherry.setContentAreaFilled(false); // Rbtn 버튼색 없게
		    Honeybutter_Cherry.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		    
		    class Honeybutter_CherryblossomInfo extends JFrame {
		    	private JLabel Honeybutter_Cherry;
		    	private JButton x_B;
		    	
		    	public Honeybutter_CherryblossomInfo() {
		    		setTitle("체리블라썸");// 프레임 이름 설정
	        	    setSize(1920, 1080);// 프레임 크기 설정
	        	    setLocationRelativeTo(null);//프레임 가운데
	        	    
	        		icon = new ImageIcon("images/Honeybutter_CherryblossomInfo.png");
	        		Honeybutter_Cherry = new JLabel(icon);//이미지로 변환
	        		Honeybutter_Cherry.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	            	add(Honeybutter_Cherry);
	            	setResizable(false);
		    	    setVisible(true);
		    	    
		    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    	    x_B =new JButton(icon); // 이미지 j버튼화
		    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
		    	    Honeybutter_Cherry.add(x_B);
		    	    
		    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
		    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
		    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		    	    
		    	    
		    	    x_B.addActionListener(new ActionListener() {
		    	    	public void actionPerformed(ActionEvent arg0) {
		    	    		setVisible(false);
		    	    	}
		    	    });
		    	  
		    	}
		    	
		    	
	    	}
		    Honeybutter_Cherry.addActionListener(new ActionListener() {
	            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                 
	            public void actionPerformed(ActionEvent arg0) {
	            	
	            	new Honeybutter_CherryblossomInfo();
		    		
	                
	            }            
	        });
	    
	    
	    //버튼
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
	private JLabel Menu_Image;
	private Image image; // 이미지 객체화
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	private Snack win; // Snack2를 더할 프레임위치 클래스
	private JButton x_B;
	
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
        Menu_Image = new JLabel(icon);//이미지로 변환
        Menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		add(Menu_Image);
		
		icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    x_B =new JButton(icon); // 이미지 j버튼화
	    x_B.setBounds(1700,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(x_B);
	    
	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    
	    x_B.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		win.setVisible(false);
	    	}
	    });
		/////////////////// 오른쪽 버튼 /////////////////////////
		icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(290,290, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Rbtn =new JButton(icon); // 이미지 j버튼화
	    Rbtn.setBounds(1300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    Menu_Image.add(Rbtn);
	    
	    Rbtn.addActionListener(new ActionListener() {
            // 오른쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("Snack2-3");
            }            
        });
	 ///////////////// 왼쪽 버튼//////////////////////////////////////////////
	    icon = new ImageIcon("images/left.png"); // 사진 불러오기
		image=icon.getImage(); //이미지 객체에 넣기
		image=image.getScaledInstance(290, 290, Image.SCALE_SMOOTH); // 객체 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Lbtn=new JButton(icon); // Lbtn Jbutton 추가
	    Lbtn.setBounds(300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Lbtn.setBorderPainted(false); // Lbtn 외각선 색 없게
        Lbtn.setContentAreaFilled(false); // Lbtn 버튼색 없게
        Lbtn.setFocusPainted(false);// Lbtn 선택될 때 테두리 없게
        Menu_Image.add(Lbtn);
	   
        Lbtn.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack1로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("Snack2-1");
            }            
        });
        
        //Amond
	    icon = new ImageIcon("images/Amond.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Amond =new JButton(icon); // 이미지 j버튼화
		Amond.setBounds(250,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Amond);
	    
	    Amond.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Amond.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Amond.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class AmondInfo extends JFrame {
	    	private JLabel Amond;
	    	private JButton x_B;
	    	
	    	public AmondInfo() {
	    		setTitle("Amond");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/AmondInfo.png");
        		Amond = new JLabel(icon);//이미지로 변환
        		Amond.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Amond);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Amond.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Amond.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new AmondInfo();
	    		
                
            }            
        });
	    
	    //Original
	    icon = new ImageIcon("images/Original.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(200,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Original =new JButton(icon); // 이미지 j버튼화
		Original.setBounds(600,410, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Original);
	    
	    Original.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Original.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Original.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class OriginalInfo extends JFrame {
	    	private JLabel Original;
	    	private JButton x_B;
	    	
	    	public OriginalInfo() {
	    		setTitle("Amond");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/OriginalInfo.png");
        		Original = new JLabel(icon);//이미지로 변환
        		Original.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Original);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Original.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Original.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new OriginalInfo();
	    		
                
            }            
        });
	    
	  //Nud
	    icon = new ImageIcon("images/Nud.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Nude =new JButton(icon); // 이미지 j버튼화
		Nude.setBounds(250,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Nude);
	    
	    Nude.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Nude.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Nude.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class NudeInfo extends JFrame {
	    	private JLabel Nude;
	    	private JButton x_B;
	    	
	    	public NudeInfo() {
	    		setTitle("Nude");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/NudeInfo.png");
        		Nude = new JLabel(icon);//이미지로 변환
        		Nude.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Nude);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Nude.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Nude.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new NudeInfo();
	    		
                
            }            
        });
	    
	    //Cham
	    icon = new ImageIcon("images/Cham.jpg"); // 오른쪽 버튼 사진 불러오기
	  		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	  		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	  		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	  		Cham =new JButton(icon); // 이미지 j버튼화
	  		Cham.setBounds(600,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	  	    Menu_Image.add(Cham);
	  	    
	  	  Cham.setBorderPainted(false); // Rbtn 외각선 색 없게
	  	Cham.setContentAreaFilled(false); // Rbtn 버튼색 없게
	  	Cham.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	  	
	    class ChamInfo extends JFrame {
	    	private JLabel Cham;
	    	private JButton x_B;
	    	
	    	public ChamInfo() {
	    		setTitle("Cham");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/ChamInfo.png");
        		Cham = new JLabel(icon);//이미지로 변환
        		Cham.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Cham);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Cham.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Cham.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new ChamInfo();
	    		
                
            }            
        });
	  //Chicken
	    icon = new ImageIcon("images/Chicken.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Chicken =new JButton(icon); // 이미지 j버튼화
		Chicken.setBounds(1050,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Chicken);
	    
	    Chicken.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Chicken.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Chicken.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class ChickenInfo extends JFrame {
	    	private JLabel Chicken;
	    	private JButton x_B;
	    	
	    	public ChickenInfo() {
	    		setTitle("Chicken");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/ChickenInfo.png");
        		Chicken = new JLabel(icon);//이미지로 변환
        		Chicken.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Chicken);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Chicken.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Chicken.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new ChickenInfo();
	    		
                
            }            
        });
	    
	    //HotChicken
	    icon = new ImageIcon("images/HotChicken.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		HotChicken =new JButton(icon); // 이미지 j버튼화
		HotChicken.setBounds(1400,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(HotChicken);
	    
	    HotChicken.setBorderPainted(false); // Rbtn 외각선 색 없게
	    HotChicken.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    HotChicken.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class HotChickenInfo extends JFrame {
	    	private JLabel HotChicken;
	    	private JButton x_B;
	    	
	    	public HotChickenInfo() {
	    		setTitle("HotChicken");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/HotChickenInfo.png");
        		HotChicken = new JLabel(icon);//이미지로 변환
        		HotChicken.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(HotChicken);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    HotChicken.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    HotChicken.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new HotChickenInfo();
	    		
                
            }            
        });
	    
	    //Crown_Milk
	    icon = new ImageIcon("images/Crown_Milk.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Crown_Milk =new JButton(icon); // 이미지 j버튼화
		Crown_Milk.setBounds(1050,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Crown_Milk);
	    
	    Crown_Milk.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Crown_Milk.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Crown_Milk.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class Crown_MilkInfo extends JFrame {
	    	private JLabel Crown_Milk;
	    	private JButton x_B;
	    	
	    	public Crown_MilkInfo() {
	    		setTitle("HotChicken");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/Crown_MilkInfo.png");
        		Crown_Milk = new JLabel(icon);//이미지로 변환
        		Crown_Milk.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Crown_Milk);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Crown_Milk.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Crown_Milk.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new Crown_MilkInfo();
	    		
                
            }            
        });
	    
	    
	  //Crown_Strawberry
	    icon = new ImageIcon("images/Crown_Strawberry.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Crown_Strawberry =new JButton(icon); // 이미지 j버튼화
		Crown_Strawberry.setBounds(1400,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Crown_Strawberry);
	    
	    Crown_Strawberry.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Crown_Strawberry.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Crown_Strawberry.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class Crown_StrawberryInfo extends JFrame {
	    	private JLabel Crown_Strawberry;
	    	private JButton x_B;
	    	
	    	public Crown_StrawberryInfo() {
	    		setTitle("Crown_Strawberry");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/Crown_StrawberryInfo.png");
        		Crown_Strawberry = new JLabel(icon);//이미지로 변환
        		Crown_Strawberry.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Crown_Strawberry);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Crown_Strawberry.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Crown_Strawberry.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new Crown_StrawberryInfo();
	    		
                
            }            
        });
        
	}
}

class Snack3 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private JLabel Menu_Image; // 배경화면 JLabel
	private Image image; // 이미지 객체화
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	private Snack win; //// Snack3을 더할 프레임위치 클래스
	private JButton x_B;
	
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
        Menu_Image = new JLabel(icon);//이미지로 변환
        Menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		add(Menu_Image);
		
		icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    x_B =new JButton(icon); // 이미지 j버튼화
	    x_B.setBounds(1700,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(x_B);
	    
	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    
	    x_B.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		win.setVisible(false);
	    	}
	    });
		
		//Corn
	    icon = new ImageIcon("images/Corn.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Corn =new JButton(icon); // 이미지 j버튼화
		Corn.setBounds(250,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Corn);
	    
	    Corn.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Corn.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Corn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class CornInfo extends JFrame {
	    	private JLabel Corn;
	    	private JButton x_B;
	    	
	    	public CornInfo() {
	    		setTitle("Corn");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/CornInfo.png");
        		Corn = new JLabel(icon);//이미지로 변환
        		Corn.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Corn);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Corn.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Corn.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new CornInfo();
	    		
                
            }            
        });
        
	    
	  //Ggobuk
	    icon = new ImageIcon("images/Ggobuk.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Ggobuk =new JButton(icon); // 이미지 j버튼화
		Ggobuk.setBounds(600,410, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Ggobuk);
	    
	    Ggobuk.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Ggobuk.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Ggobuk.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class GgobukInfo extends JFrame {
	    	private JLabel Ggobuk;
	    	private JButton x_B;
	    	
	    	public GgobukInfo() {
	    		setTitle("Ggobuk");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/GgobukInfo.png");
        		Ggobuk = new JLabel(icon);//이미지로 변환
        		Ggobuk.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Ggobuk);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Ggobuk.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Ggobuk.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new GgobukInfo();
	    		
                
            }            
        });
	    
	  //Goggal
	    icon = new ImageIcon("images/Ggoggal.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Goggal =new JButton(icon); // 이미지 j버튼화
		Goggal.setBounds(250,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Goggal);
	    
	    Goggal.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Goggal.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Goggal.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class GgoggalInfo extends JFrame {
	    	private JLabel Goggal;
	    	private JButton x_B;
	    	
	    	public GgoggalInfo() {
	    		setTitle("Goggal");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/GgoggalInfo.png");
        		Goggal = new JLabel(icon);//이미지로 변환
        		Goggal.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Goggal);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Goggal.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Goggal.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new GgoggalInfo();
	    		
                
            }            
        });
	    
	    
	    //HotShrimp
	    icon = new ImageIcon("images/HotShrimp.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		HotShrimp =new JButton(icon); // 이미지 j버튼화
		HotShrimp.setBounds(600,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(HotShrimp);
	    
	    HotShrimp.setBorderPainted(false); // Rbtn 외각선 색 없게
	    HotShrimp.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    HotShrimp.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    
	    class HotshrimpInfo extends JFrame {
	    	private JLabel HotShrimp;
	    	private JButton x_B;
	    	
	    	public HotshrimpInfo() {
	    		setTitle("HotShrimp");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/HotshrimpInfo.png");
        		HotShrimp = new JLabel(icon);//이미지로 변환
        		HotShrimp.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(HotShrimp);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    HotShrimp.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    HotShrimp.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new HotshrimpInfo();
	    		
                
            }            
        });
	    
	  //Homerunball
	    icon = new ImageIcon("images/Homerunball.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Homerunball =new JButton(icon); // 이미지 j버튼화
		Homerunball.setBounds(1050,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Homerunball);
	    
	    Homerunball.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Homerunball.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Homerunball.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class HomerunInfo extends JFrame {
	    	private JLabel Homerunball;
	    	private JButton x_B;
	    	
	    	public HomerunInfo() {
	    		setTitle("HomerunInfo");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/HomerunInfo.png");
        		Homerunball = new JLabel(icon);//이미지로 변환
        		Homerunball.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Homerunball);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Homerunball.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Homerunball.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new HomerunInfo();
	    		
                
            }            
        });
	  //Lottesand
	    icon = new ImageIcon("images/Lottesand.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Lottesand =new JButton(icon); // 이미지 j버튼화
		Lottesand.setBounds(1400,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Lottesand);
	    
	    Lottesand.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Lottesand.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Lottesand.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class LottesandInfo extends JFrame {
	    	private JLabel Lottesand;
	    	private JButton x_B;
	    	
	    	public LottesandInfo() {
	    		setTitle("Lottesand");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/LottesandInfo.png");
        		Lottesand = new JLabel(icon);//이미지로 변환
        		Lottesand.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Lottesand);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Lottesand.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Lottesand.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new LottesandInfo();
	    		
                
            }            
        });
	    
	  //MiniChoco
	    icon = new ImageIcon("images/MiniChoco.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		MiniChoco =new JButton(icon); // 이미지 j버튼화
		MiniChoco.setBounds(1050,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(MiniChoco);
	    
	    MiniChoco.setBorderPainted(false); // Rbtn 외각선 색 없게
	    MiniChoco.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    MiniChoco.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class ChocoInfo extends JFrame {
	    	private JLabel MiniChoco;
	    	private JButton x_B;
	    	
	    	public ChocoInfo() {
	    		setTitle("MiniChoco");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/ChocoInfo.png");
        		MiniChoco = new JLabel(icon);//이미지로 변환
        		MiniChoco.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(MiniChoco);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    MiniChoco.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    MiniChoco.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new ChocoInfo();
	    		
                
            }            
        });
	    
	  //Postick
	    icon = new ImageIcon("images/Postick.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Postick =new JButton(icon); // 이미지 j버튼화
		Postick.setBounds(1400,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Postick);
	    
	    Postick.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Postick.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Postick.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    
	    class PosticInfo extends JFrame {
	    	private JLabel Postick;
	    	private JButton x_B;
	    	
	    	public PosticInfo() {
	    		setTitle("PosticInfo");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/PosticInfo.png");
        		Postick = new JLabel(icon);//이미지로 변환
        		Postick.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Postick);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Postick.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Postick.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new PosticInfo();
	    		
                
            }            
        });
	    
		
		/////////////////// 오른쪽 버튼 /////////////////////////
		icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(290,290, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Rbtn =new JButton(icon); // 이미지 j버튼화
		Rbtn.setBounds(1300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기

		Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
		Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
		Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		Menu_Image.add(Rbtn);

		Rbtn.addActionListener(new ActionListener() {
		// 오른쪽 버튼이 눌러지면 Snack4로 넘어가기
       
		public void actionPerformed(ActionEvent arg0) {
			win.Change("Snack3-4");
		}            
		});
		
		 ///////////////// 왼쪽 버튼//////////////////////////////////////////////
	    icon = new ImageIcon("images/left.png"); // 사진 불러오기
		image=icon.getImage(); //이미지 객체에 넣기
		image=image.getScaledInstance(290, 290, Image.SCALE_SMOOTH); // 객체 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Lbtn=new JButton(icon); // Lbtn Jbutton 추가
	    Lbtn.setBounds(300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Lbtn.setBorderPainted(false); // Lbtn 외각선 색 없게
        Lbtn.setContentAreaFilled(false); // Lbtn 버튼색 없게
        Lbtn.setFocusPainted(false);// Lbtn 선택될 때 테두리 없게
        Menu_Image.add(Lbtn);
	   
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
	private JLabel Menu_Image; // 배경화면 JLabel
	private Image image; // 이미지 객체화
	private JButton Lbtn; // 왼쪽 버튼
	private Snack win;// Snack4를 더할 프레임위치 클래스
	private JButton x_B;
	
	private JButton Sun; // 썬칩
	private JButton Ugwa; // 조청 유과
	private JButton AlShrimp; // 알새우 칩 사진 버튼
	
	public Snack4(Snack win) {
		setLayout(null);
		this.win = win;
		
		//배경화면 추가 
        icon = new ImageIcon("images/menu.png"); // 사진 불러오기
        Menu_Image = new JLabel(icon);//이미지로 변환
        Menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		add(Menu_Image);
		
		icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    x_B =new JButton(icon); // 이미지 j버튼화
	    x_B.setBounds(1700,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(x_B);
	    
	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    
	    x_B.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		win.setVisible(false);
	    	}
	    });
	    
	    //Sun
	    icon = new ImageIcon("images/Sun.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Sun =new JButton(icon); // 이미지 j버튼화
		Sun.setBounds(250,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Sun);
	    
	    Sun.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Sun.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Sun.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class SunInfo extends JFrame {
	    	private JLabel Sun;
	    	private JButton x_B;
	    	
	    	public SunInfo() {
	    		setTitle("Sun");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/SunInfo.png");
        		Sun = new JLabel(icon);//이미지로 변환
        		Sun.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Sun);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Sun.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Sun.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new SunInfo();
	    		
                
            }            
        });
	    
	  //Ugwa
	    icon = new ImageIcon("images/Ugwa.jpg"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		Ugwa =new JButton(icon); // 이미지 j버튼화
		Ugwa.setBounds(600,410, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(Ugwa);
	    
	    Ugwa.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Ugwa.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Ugwa.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
		
	    class UgwaInfo extends JFrame {
	    	private JLabel Ugwa;
	    	private JButton x_B;
	    	
	    	public UgwaInfo() {
	    		setTitle("Ugwa");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/UgwaInfo.png");
        		Ugwa = new JLabel(icon);//이미지로 변환
        		Ugwa.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(Ugwa);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    Ugwa.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    Ugwa.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new UgwaInfo();
	    		
                
            }            
        });
	  //AlShrimp
	    icon = new ImageIcon("images/AlShrimp.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		AlShrimp =new JButton(icon); // 이미지 j버튼화
		AlShrimp.setBounds(250,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    Menu_Image.add(AlShrimp);
	    
	    AlShrimp.setBorderPainted(false); // Rbtn 외각선 색 없게
	    AlShrimp.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    AlShrimp.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    class AlshrimpInfo extends JFrame {
	    	private JLabel AlShrimp;
	    	private JButton x_B;
	    	
	    	public AlshrimpInfo() {
	    		setTitle("Ugwa");// 프레임 이름 설정
        	    setSize(1920, 1080);// 프레임 크기 설정
        	    setLocationRelativeTo(null);//프레임 가운데
        	    
        		icon = new ImageIcon("images/AlshrimpInfo.png");
        		AlShrimp = new JLabel(icon);//이미지로 변환
        		AlShrimp.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
            	add(AlShrimp);
            	setResizable(false);
	    	    setVisible(true);
	    	    
	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    AlShrimp.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	}
	    	
	    	
    	}
	    AlShrimp.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
            	
            	new AlshrimpInfo();
	    		
                
            }            
        });
	    
	    
		 ///////////////// 왼쪽 버튼//////////////////////////////////////////////
	    icon = new ImageIcon("images/left.png"); // 사진 불러오기
		image=icon.getImage(); //이미지 객체에 넣기
		image=image.getScaledInstance(290, 290, Image.SCALE_SMOOTH); // 객체 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Lbtn=new JButton(icon); // Lbtn Jbutton 추가
	    Lbtn.setBounds(300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Lbtn.setBorderPainted(false); // Lbtn 외각선 색 없게
        Lbtn.setContentAreaFilled(false); // Lbtn 버튼색 없게
        Lbtn.setFocusPainted(false);// Lbtn 선택될 때 테두리 없게
        Menu_Image.add(Lbtn);
	   
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
	private JButton x_B;
	
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
