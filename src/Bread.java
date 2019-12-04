import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Bread extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private Container board; // 바탕화면 컨테이너
	private JLabel menu_Image; // menu 배경화면
	private JButton cheese;
	private JButton choco;
	private JButton big;
	private JButton castera;
	private JButton honey;
	private JButton mrcheese;
	private JButton pizza;
	private JButton x_B;
	
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	public Bread() {
		setTitle("빵");// 프레임 이름 설정
	    setSize(1920, 1080);// 프레임 크기 설정
	    setLocationRelativeTo(null);//프레임 가운데
	   
	    
	    board = getContentPane(); // JFrame 위의 컨테이너
	    board.setLayout(null);// 컨테이너 board의 배치관리자 삭제
	            
	    		icon = new ImageIcon("images/menu.png");
	    		menu_Image = new JLabel(icon);//이미지로 변환
	    		menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	    		board.add(menu_Image);
	    		
	    		///내일도 치즈
	    		icon = new ImageIcon("images/cheese.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    cheese =new JButton(icon); // 이미지 j버튼화
	    	    cheese.setBounds(250,420, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(cheese);
	    	    
	    	    cheese.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    cheese.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    cheese.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    		
	    	    //초코방울이
	    	    icon = new ImageIcon("images/choco.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    choco =new JButton(icon); // 이미지 j버튼화
	    	    choco.setBounds(600,420, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(choco);
	    	    
	    	    choco.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    choco.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    choco.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    //big
	    	    icon = new ImageIcon("images/big.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    big =new JButton(icon); // 이미지 j버튼화
	    	    big.setBounds(200,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(big);
	    	    
	    	    big.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    big.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    big.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    //castera
	    	    icon = new ImageIcon("images/castera.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(400,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    castera =new JButton(icon); // 이미지 j버튼화
	    	    castera.setBounds(600,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(castera);
	    	    
	    	    castera.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    castera.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    castera.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    //mrcheese
	    	    icon = new ImageIcon("images/mrcheese.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    mrcheese =new JButton(icon); // 이미지 j버튼화
	    	    mrcheese.setBounds(1050,420, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(mrcheese);
	    	    
	    	    mrcheese.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    mrcheese.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    mrcheese.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    

	    	    //honey
	    	    icon = new ImageIcon("images/honey.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(300,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    honey =new JButton(icon); // 이미지 j버튼화
	    	    honey.setBounds(1400,420, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(honey);
	    	    
	    	    honey.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    honey.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    honey.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    

	    	    //pizza
	    	    icon = new ImageIcon("images/lolcake.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(400,300, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    pizza =new JButton(icon); // 이미지 j버튼화
	    	    pizza.setBounds(1200,720, 400, 270); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(pizza);
	    	    
	    	    pizza.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    pizza.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    pizza.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    //PastryInfo
	    	    class PastryInfo extends JFrame {
	    	    	private JLabel Pastry;
	    	    	private JButton x_B;
	    	    	
	    	    	public PastryInfo() {
	    	    		setTitle("패스츄리");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/PastryInfo.png");
	            		Pastry = new JLabel(icon);//이미지로 변환
	            		Pastry.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(Pastry);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    Pastry.add(x_B);
	    	    	    
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
	    	    
	    	    //cheeseInfo
	    	    class cheeseInfo extends JFrame {
	    	    	private JLabel cheese;
	    	    	private JButton x_B;
	    	    	
	    	    	public cheeseInfo() {
	    	    		setTitle("내일도 치즈");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/CheeseInfo.png");
	            		cheese = new JLabel(icon);//이미지로 변환
	            		cheese.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(cheese);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    cheese.add(x_B);
	    	    	    
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
	    	    
	    	    class CheeseCakeInfo extends JFrame {
	    	    	private JLabel CheeseCake;
	    	    	private JButton x_B;
	    	    	
	    	    	public CheeseCakeInfo() {
	    	    		setTitle("패스츄리");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/CheeseCakeInfo.png");
	            		CheeseCake = new JLabel(icon);//이미지로 변환
	            		CheeseCake.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(CheeseCake);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    CheeseCake.add(x_B);
	    	    	    
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
	    	    //PastryInfo
	    	    
	    	    big.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new PastryInfo();
	    	    		
	                    
	                }            
	            });
	    	    
	    	    //cheeseInfo
	    	    cheese.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new cheeseInfo();
	    	    		
	                    
	                }            
	            });
	    	    
	    	    //mrcheeseInfo
	    	    mrcheese.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new CheeseCakeInfo();
	    	    		
	                    
	                }            
	            });
	    	
	    	    class CasteraInfo extends JFrame {
	    	    	private JLabel Castera;
	    	    	private JButton x_B;
	    	    	
	    	    	public CasteraInfo() {
	    	    		setTitle("패스츄리");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/CasteraInfo.png");
	            		Castera = new JLabel(icon);//이미지로 변환
	            		Castera.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(Castera);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    Castera.add(x_B);
	    	    	    
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
	    	
	    	    //castera
	    		castera.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new CasteraInfo();
	    	    		
	                    
	                }            
	            });
	    	    
	    		 class ChocoBellInfo extends JFrame {
		    	    	private JLabel ChocoBell;
		    	    	private JButton x_B;
		    	    	
		    	    	public ChocoBellInfo() {
		    	    		setTitle("패스츄리");// 프레임 이름 설정
		            	    setSize(1920, 1080);// 프레임 크기 설정
		            	    setLocationRelativeTo(null);//프레임 가운데
		            	    
		            		icon = new ImageIcon("images/ChocoBellInfo.png");
		            		ChocoBell = new JLabel(icon);//이미지로 변환
		            		ChocoBell.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		                	add(ChocoBell);
		                	setResizable(false);
		    	    	    setVisible(true);
		    	    	    
		    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    	    	    x_B =new JButton(icon); // 이미지 j버튼화
		    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
		    	    	    ChocoBell.add(x_B);
		    	    	    
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
	    	    //choco
	    		choco.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new ChocoBellInfo();
	    	    		
	                    
	                }            
	            });
	    		
	    		 class HotteokInfo extends JFrame {
		    	    	private JLabel Hotteok;
		    	    	private JButton x_B;
		    	    	
		    	    	public HotteokInfo() {
		    	    		setTitle("패스츄리");// 프레임 이름 설정
		            	    setSize(1920, 1080);// 프레임 크기 설정
		            	    setLocationRelativeTo(null);//프레임 가운데
		            	    
		            		icon = new ImageIcon("images/HotteokInfo.png");
		            		Hotteok = new JLabel(icon);//이미지로 변환
		            		Hotteok.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		                	add(Hotteok);
		                	setResizable(false);
		    	    	    setVisible(true);
		    	    	    
		    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    	    	    x_B =new JButton(icon); // 이미지 j버튼화
		    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
		    	    	    Hotteok.add(x_B);
		    	    	    
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
	    	    
	    	    //honey
	    		honey.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new HotteokInfo();
	    	    		
	                    
	                }            
	            });
	    		 class ChocoCakeInfo extends JFrame {
		    	    	private JLabel ChocoCake;
		    	    	private JButton x_B;
		    	    	
		    	    	public ChocoCakeInfo() {
		    	    		setTitle("패스츄리");// 프레임 이름 설정
		            	    setSize(1920, 1080);// 프레임 크기 설정
		            	    setLocationRelativeTo(null);//프레임 가운데
		            	    
		            		icon = new ImageIcon("images/ChocoCakeInfo.png");
		            		ChocoCake = new JLabel(icon);//이미지로 변환
		            		ChocoCake.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		                	add(ChocoCake);
		                	setResizable(false);
		    	    	    setVisible(true);
		    	    	    
		    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    	    	    x_B =new JButton(icon); // 이미지 j버튼화
		    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
		    	    	    ChocoCake.add(x_B);
		    	    	    
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
	    	    
	    	    //pizza
	    		pizza.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new ChocoCakeInfo();
	    	    		
	                    
	                }            
	            });
	    		
	    		
	    		icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    x_B.setBounds(1700,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(x_B);
	    	    
	    	    x_B.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    x_B.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    x_B.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    x_B.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		setVisible(false);
	    	    	}
	    	    });
	    	  
	    	    
	    	    
	    	    
	    	 

	    		setResizable(false);
	    	    setVisible(true);
	    	}

}
