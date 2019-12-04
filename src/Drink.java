import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Drink extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private Container board; // 바탕화면 컨테이너
	private JLabel menu_Image; // menu 배경화면
	private JButton berry;
	private JButton chocomilk;
	private JButton copi;
	private JButton coyo;
	private JButton grape;
	private JButton hershey;
	private JButton orange_juice;
	private JButton mango;
	private JButton muscket;
	private JButton picnic;
	private JButton x_B;
	
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	public Drink() {
		setTitle("음료수");// 프레임 이름 설정
	    setSize(1920, 1080);// 프레임 크기 설정
	    setLocationRelativeTo(null);//프레임 가운데
	   
	    
	    board = getContentPane(); // JFrame 위의 컨테이너
	    board.setLayout(null);// 컨테이너 board의 배치관리자 삭제
	            
	    		icon = new ImageIcon("images/menu.png");
	    		menu_Image = new JLabel(icon);//이미지로 변환
	    		menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	    		board.add(menu_Image);
	    		
	    		///berry  
	    		icon = new ImageIcon("images/berry.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		berry =new JButton(icon); // 이미지 j버튼화
	    		berry.setBounds(200,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(berry);
	    	    
	    	    berry.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    berry.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    berry.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class BerryInfo extends JFrame {
	    	    	private JLabel berry;
	    	    	private JButton x_B;
	    	    	
	    	    	public BerryInfo() {
	    	    		setTitle("berry");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/BerryInfo.png");
	            		berry = new JLabel(icon);//이미지로 변환
	            		berry.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(berry);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    berry.add(x_B);
	    	    	    
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
	    	    berry.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new BerryInfo();
	    	    		
	                    
	                }            
	            });
	    		
	    	    //chocomilk
	    	    icon = new ImageIcon("images/chocomilk.jpg"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		chocomilk =new JButton(icon); // 이미지 j버튼화
	    		chocomilk.setBounds(450,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(chocomilk);
	    	    
	    	    chocomilk.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    chocomilk.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    chocomilk.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class ChocoInfo_2 extends JFrame {
	    	    	private JLabel chocomilk;
	    	    	private JButton x_B;
	    	    	
	    	    	public ChocoInfo_2() {
	    	    		setTitle("chocomilk");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/ChocoInfo_2.png");
	            		chocomilk = new JLabel(icon);//이미지로 변환
	            		chocomilk.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(chocomilk);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    chocomilk.add(x_B);
	    	    	    
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
	    	    chocomilk.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new ChocoInfo_2();
	    	    		
	                    
	                }            
	            });
	    		
	    	    
	    	    //copi
	    	    icon = new ImageIcon("images/copi.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		copi =new JButton(icon); // 이미지 j버튼화
	    		copi.setBounds(700,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(copi);
	    	    
	    	    copi.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    copi.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    copi.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class CocoPeachInfo extends JFrame {
	    	    	private JLabel copi;
	    	    	private JButton x_B;
	    	    	
	    	    	public CocoPeachInfo() {
	    	    		setTitle("chocomilk");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/CocoPeachInfo.png");
	            		copi = new JLabel(icon);//이미지로 변환
	            		copi.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(copi);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    copi.add(x_B);
	    	    	    
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
	    	    copi.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new CocoPeachInfo();
	    	    		
	                    
	                }            
	            });
	    	    
	    	    //coyo
	    	    icon = new ImageIcon("images/coyo.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		coyo =new JButton(icon); // 이미지 j버튼화
	    		coyo.setBounds(250,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(coyo);
	    	    
	    	    coyo.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    coyo.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    coyo.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class CocoYouguInfo extends JFrame {
	    	    	private JLabel coyo;
	    	    	private JButton x_B;
	    	    	
	    	    	public CocoYouguInfo() {
	    	    		setTitle("chocomilk");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/CocoYouguInfo.png");
	            		coyo = new JLabel(icon);//이미지로 변환
	            		coyo.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(coyo);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    coyo.add(x_B);
	    	    	    
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
	    	    coyo.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new CocoYouguInfo();
	    	    		
	                    
	                }            
	            });
	    	    
	    	    
	    	    //grape
	    	    icon = new ImageIcon("images/grape.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		grape =new JButton(icon); // 이미지 j버튼화
	    	    grape.setBounds(600,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(grape);
	    	    
	    	    grape.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    grape.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    grape.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	     	    
	    	    //hershey
	    	    icon = new ImageIcon("images/hershey.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		hershey =new JButton(icon); // 이미지 j버튼화
	    		hershey.setBounds(1000,400, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(hershey);
	    	    
	    	    hershey.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    hershey.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    hershey.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    

	     	    class HushInfo extends JFrame {
	    	    	private JLabel hershey;
	    	    	private JButton x_B;
	    	    	
	    	    	public HushInfo() {
	    	    		setTitle("HushInfo");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/HushInfo.png");
	            		hershey = new JLabel(icon);//이미지로 변환
	            		hershey.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(hershey);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    hershey.add(x_B);
	    	    	    
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
	     	   hershey.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new HushInfo();
	    	    		
	                    
	                }            
	            });
	    	    

	    	    //orange_juice
	    	    icon = new ImageIcon("images/orane_juice.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		orange_juice =new JButton(icon); // 이미지 j버튼화
	    		orange_juice.setBounds(1200,420, 400, 270); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(orange_juice);
	    	    
	    	    orange_juice.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    orange_juice.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    orange_juice.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    

	     	    class OrangeInfo_2 extends JFrame {
	    	    	private JLabel orange_juice;
	    	    	private JButton x_B;
	    	    	
	    	    	public OrangeInfo_2() {
	    	    		setTitle("orange_juice");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/OrangeInfo_2.png");
	            		orange_juice = new JLabel(icon);//이미지로 변환
	            		orange_juice.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(orange_juice);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    orange_juice.add(x_B);
	    	    	    
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
	     	   orange_juice.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new OrangeInfo_2();
	    	    		
	                    
	                }            
	            });
	    	    
	    	    //mango
	    	    icon = new ImageIcon("images/mango.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		mango =new JButton(icon); // 이미지 j버튼화
	    		mango.setBounds(1400,420, 400, 270); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(mango);
	    	    
	    	    mango.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    mango.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    mango.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	     	    class MangoInfo extends JFrame {
	    	    	private JLabel mango;
	    	    	private JButton x_B;
	    	    	
	    	    	public MangoInfo() {
	    	    		setTitle("orange_juice");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/MangoInfo.png");
	            		mango = new JLabel(icon);//이미지로 변환
	            		mango.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(mango);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    mango.add(x_B);
	    	    	    
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
	     	   mango.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new MangoInfo();
	    	    		
	                    
	                }            
	            });
	    	    
	    	    
	    	  //muscket
	    	    icon = new ImageIcon("images/musket.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		muscket =new JButton(icon); // 이미지 j버튼화
	    		muscket.setBounds(1100,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(muscket);
	    	    
	    	    muscket.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    muscket.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    muscket.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	     	    class ChungphodoInfo extends JFrame {
	    	    	private JLabel muscket;
	    	    	private JButton x_B;
	    	    	
	    	    	public ChungphodoInfo() {
	    	    		setTitle("ChungphodoInfo");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/ChungphodoInfo.png");
	            		muscket = new JLabel(icon);//이미지로 변환
	            		muscket.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(muscket);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    muscket.add(x_B);
	    	    	    
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
	     	   muscket.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new ChungphodoInfo();
	    	    		
	                    
	                }            
	            });
	    	    
	    	    
	    	    
	    	  //picnic
	    	    icon = new ImageIcon("images/picnic.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		picnic =new JButton(icon); // 이미지 j버튼화
	    		picnic.setBounds(1400,700, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(picnic);
	    	    
	    	    picnic.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    picnic.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    picnic.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	     	    class PicninInfo extends JFrame {
	    	    	private JLabel picnic;
	    	    	private JButton x_B;
	    	    	
	    	    	public PicninInfo() {
	    	    		setTitle("ChungphodoInfo");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/PicninInfo.png");
	            		picnic = new JLabel(icon);//이미지로 변환
	            		picnic.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(picnic);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    picnic.add(x_B);
	    	    	    
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
	     	   picnic.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new PicninInfo();
	    	    		
	                    
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
