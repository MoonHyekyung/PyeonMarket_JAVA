import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class IceCream extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private Container board; // 바탕화면 컨테이너
	private JLabel menu_Image; // menu 배경화면
	private JButton who; //
	private JButton candybar;//
	private JButton amatna;//
	private JButton babico;//
	private JButton gugucon;
	private JButton bbong;
	private JButton chocoperge;//
	private JButton melon;//
	private JButton mopi;
	private JButton mori;
	private JButton orange;//
	private JButton pigbar;//
	private JButton pigcon;
	private JButton plain;
	private JButton screwbar;//
	private JButton star;
	private JButton ssang;//
	private JButton supercon;
	private JButton tankboy;
	private JButton world;
	private JButton x_B;
	
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	public IceCream() {
		setTitle("아이스크림");// 프레임 이름 설정
	    setSize(1920, 1080);// 프레임 크기 설정
	    setLocationRelativeTo(null);//프레임 가운데
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    
	    board = getContentPane(); // JFrame 위의 컨테이너
	    board.setLayout(null);// 컨테이너 board의 배치관리자 삭제
	            
	    		icon = new ImageIcon("images/menu.png");
	    		menu_Image = new JLabel(icon);//이미지로 변환
	    		menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	    		board.add(menu_Image);
	    		
	    		///who
	    		icon = new ImageIcon("images/who.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    who =new JButton(icon); // 이미지 j버튼화
	    	    who.setBounds(200,420, 100, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(who);
	    	    
	    	    who.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    who.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    who.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    		
	    	    class NugaInfo extends JFrame {
	    	    	private JLabel who;
	    	    	private JButton x_B;
	    	    	
	    	    	public NugaInfo() {
	    	    		setTitle("who");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/NugaInfo.png");
	            		who = new JLabel(icon);//이미지로 변환
	            		who.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(who);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    who.add(x_B);
	    	    	    
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
	    	    who.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new NugaInfo();
    	    		
                    
                }            
            });
	    	    
	    	    //candybar
	    	    icon = new ImageIcon("images/candybar.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    candybar =new JButton(icon); // 이미지 j버튼화
	    	    candybar.setBounds(350,420, 100, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(candybar);
	    	    
	    	    candybar.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    candybar.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    candybar.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class CandyInfo extends JFrame {
	    	    	private JLabel candybar;
	    	    	private JButton x_B;
	    	    	
	    	    	public CandyInfo() {
	    	    		setTitle("candybar");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/CandyInfo.png");
	            		candybar = new JLabel(icon);//이미지로 변환
	            		candybar.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(candybar);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    candybar.add(x_B);
	    	    	    
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
	    	    candybar.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new CandyInfo();
    	    		
                    
                }            
            });
	    	    
	    	    //amatna
	    	    icon = new ImageIcon("images/amatna.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    amatna =new JButton(icon); // 이미지 j버튼화
	    	    amatna.setBounds(500,420, 100, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(amatna);
	    	    
	    	    amatna.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    amatna.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    amatna.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class AmatnaInfo extends JFrame {
	    	    	private JLabel amatna;
	    	    	private JButton x_B;
	    	    	
	    	    	public AmatnaInfo() {
	    	    		setTitle("amatna");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/AmatnaInfo.png");
	            		amatna = new JLabel(icon);//이미지로 변환
	            		amatna.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(amatna);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    amatna.add(x_B);
	    	    	    
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
	    	    amatna.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new AmatnaInfo();
    	    		
                    
                }            
            });
	    	    //chocoperge
	    	    icon = new ImageIcon("images/chocoperge.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    chocoperge =new JButton(icon); // 이미지 j버튼화
	    	    chocoperge.setBounds(650,420, 100, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(chocoperge);
	    	    
	    	    chocoperge.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    chocoperge.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    chocoperge.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class ChocopugInfo extends JFrame {
	    	    	private JLabel chocoperge;
	    	    	private JButton x_B;
	    	    	
	    	    	public ChocopugInfo() {
	    	    		setTitle("chocoperge");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/ChocopugInfo.png");
	            		chocoperge = new JLabel(icon);//이미지로 변환
	            		chocoperge.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(chocoperge);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    chocoperge.add(x_B);
	    	    	    
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
	    	    chocoperge.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new ChocopugInfo();
    	    		
                    
                }            
            });
	    	    //melon
	    	    icon = new ImageIcon("images/melon.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    melon =new JButton(icon); // 이미지 j버튼화
	    	    melon.setBounds(200,720, 100, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(melon);
	    	    
	    	    melon.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    melon.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    melon.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    
	    	    class MeronInfo extends JFrame {
	    	    	private JLabel melon;
	    	    	private JButton x_B;
	    	    	
	    	    	public MeronInfo() {
	    	    		setTitle("melon");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/MeronInfo.png");
	            		melon = new JLabel(icon);//이미지로 변환
	            		melon.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(melon);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    melon.add(x_B);
	    	    	    
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
	    	    melon.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new MeronInfo();
    	    		
                    
                }            
            });
	    	    
	    	    //orange
	    	    icon = new ImageIcon("images/orange.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    orange =new JButton(icon); // 이미지 j버튼화
	    	    orange.setBounds(350,720, 100, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(orange);
	    	    
	    	    orange.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    orange.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    orange.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class OrangeInfo extends JFrame {
	    	    	private JLabel orange;
	    	    	private JButton x_B;
	    	    	
	    	    	public OrangeInfo() {
	    	    		setTitle("orange");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/OrangeInfo.png");
	            		orange = new JLabel(icon);//이미지로 변환
	            		orange.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(orange);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    orange.add(x_B);
	    	    	    
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
	    	    orange.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new OrangeInfo();
    	    		
                    
                }            
            });
	    	    
	    	    //pigbar
	    	    icon = new ImageIcon("images/pigbar.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    pigbar =new JButton(icon); // 이미지 j버튼화
	    	    pigbar.setBounds(500,720, 100, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(pigbar);
	    	    
	    	    pigbar.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    pigbar.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    pigbar.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class PigInfo extends JFrame {
	    	    	private JLabel pigbar;
	    	    	private JButton x_B;
	    	    	
	    	    	public PigInfo() {
	    	    		setTitle("pigbar");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/PigInfo.png");
	            		pigbar = new JLabel(icon);//이미지로 변환
	            		pigbar.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(pigbar);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    pigbar.add(x_B);
	    	    	    
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
	    	    pigbar.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new PigInfo();
    	    		
                    
                }            
            });
	    	    
	    	    //screwbar
	    	    icon = new ImageIcon("images/screwbar.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    screwbar =new JButton(icon); // 이미지 j버튼화
	    	    screwbar.setBounds(650,720, 100, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(screwbar);
	    	    
	    	    screwbar.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    screwbar.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    screwbar.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class ScrewInfo extends JFrame {
	    	    	private JLabel screwbar;
	    	    	private JButton x_B;
	    	    	
	    	    	public ScrewInfo() {
	    	    		setTitle("screwbar");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/ScrewInfo.png");
	            		screwbar = new JLabel(icon);//이미지로 변환
	            		screwbar.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(screwbar);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    screwbar.add(x_B);
	    	    	    
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
	    	    screwbar.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new ScrewInfo();
    	    		
                    
                }            
            });
	    	    
	    	    //ssang
	    	    icon = new ImageIcon("images/ssang.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    ssang =new JButton(icon); // 이미지 j버튼화
	    	    ssang.setBounds(800,420, 100, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(ssang);
	    	    
	    	    ssang.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    ssang.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    ssang.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class DoubleInfo extends JFrame {
	    	    	private JLabel ssang;
	    	    	private JButton x_B;
	    	    	
	    	    	public DoubleInfo() {
	    	    		setTitle("ssang");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/DoubleInfo.png");
	            		ssang = new JLabel(icon);//이미지로 변환
	            		ssang.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(ssang);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    ssang.add(x_B);
	    	    	    
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
	    	    ssang.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new DoubleInfo();
    	    		
                    
                }            
            });
	    	    
	    	    
	    	    //	    	    babico
	    	    
	    	    icon = new ImageIcon("images/babico.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(200,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		babico =new JButton(icon); // 이미지 j버튼화
	    		babico.setBounds(800,720, 100, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(babico);
	    	    
	    	    babico.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    babico.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    babico.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class BbabbicoInfo extends JFrame {
	    	    	private JLabel babico;
	    	    	private JButton x_B;
	    	    	
	    	    	public BbabbicoInfo() {
	    	    		setTitle("babico");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/BbabbicoInfo.png");
	            		babico = new JLabel(icon);//이미지로 변환
	            		babico.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(babico);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    babico.add(x_B);
	    	    	    
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
	    	    babico.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new BbabbicoInfo();
    	    		
                    
                }            
            });
	    	    

	    	    //gugucon
	    	    
	    	    icon = new ImageIcon("images/99con.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		gugucon =new JButton(icon); // 이미지 j버튼화
	    		gugucon.setBounds(1000,420, 200, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(gugucon);
	    	    
	    	    gugucon.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    gugucon.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    gugucon.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class GuguInfo extends JFrame {
	    	    	private JLabel gugucon;
	    	    	private JButton x_B;
	    	    	
	    	    	public GuguInfo() {
	    	    		setTitle("gugucon");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/GuguInfo.png");
	            		gugucon = new JLabel(icon);//이미지로 변환
	            		gugucon.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(gugucon);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    gugucon.add(x_B);
	    	    	    
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
	    	    gugucon.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new GuguInfo();
    	    		
                    
                }            
            });
	    	    
	    	    	//plain
	    	    
	    	    icon = new ImageIcon("images/plain.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(120,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		plain =new JButton(icon); // 이미지 j버튼화
	    		plain.setBounds(1150,420, 200, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(plain);
	    	    
	    	    plain.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    plain.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    plain.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class YoumomddeaInfo extends JFrame {
	    	    	private JLabel plain;
	    	    	private JButton x_B;
	    	    	
	    	    	public YoumomddeaInfo() {
	    	    		setTitle("plain");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/YoumomddeaInfo.png");
	            		plain = new JLabel(icon);//이미지로 변환
	            		plain.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(plain);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    plain.add(x_B);
	    	    	    
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
	    	    plain.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new YoumomddeaInfo();
    	    		
                    
                }            
            });
//plain
	    	    //bbong
	    	    icon = new ImageIcon("images/bbong.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(120,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		bbong =new JButton(icon); // 이미지 j버튼화
	    		bbong.setBounds(1300,420, 200, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(bbong);
	    	    
	    	    bbong.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    bbong.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    bbong.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class BbongddaInfo extends JFrame {
	    	    	private JLabel bbong;
	    	    	private JButton x_B;
	    	    	
	    	    	public BbongddaInfo() {
	    	    		setTitle("bbong");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/BbongddaInfo.png");
	            		bbong = new JLabel(icon);//이미지로 변환
	            		bbong.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(bbong);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    bbong.add(x_B);
	    	    	    
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
	    	    bbong.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new BbongddaInfo();
    	    		
                    
                }            
            });
	    	    
	    	  //mopi
	    	    icon = new ImageIcon("images/mopi.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		mopi =new JButton(icon); // 이미지 j버튼화
	    		mopi.setBounds(1450,420, 200, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(mopi);
	    	    
	    	    mopi.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    mopi.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    mopi.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class MogupeachInfo extends JFrame {
	    	    	private JLabel mopi;
	    	    	private JButton x_B;
	    	    	
	    	    	public MogupeachInfo() {
	    	    		setTitle("mopi");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/MogupeachInfo.png");
	            		mopi = new JLabel(icon);//이미지로 변환
	            		mopi.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(mopi);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    mopi.add(x_B);
	    	    	    
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
	    	    mopi.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new MogupeachInfo();
    	    		
                    
                }            
            });
	    	    
	    	    
	    	  //mori
	    	    icon = new ImageIcon("images/mori.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		mori =new JButton(icon); // 이미지 j버튼화
	    		mori.setBounds(1600,420, 200, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(mori);
	    	    
	    	    mori.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    mori.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    mori.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class MogurichInfo extends JFrame {
	    	    	private JLabel mori;
	    	    	private JButton x_B;
	    	    	
	    	    	public MogurichInfo() {
	    	    		setTitle("mori");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/MogurichInfo.png");
	            		mori = new JLabel(icon);//이미지로 변환
	            		mori.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(mori);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    mori.add(x_B);
	    	    	    
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
	    	    mori.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new MogurichInfo();
    	    		
                    
                }            
            });
	    	    
	    	  //pigcon
	    	    icon = new ImageIcon("images/pigcon.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		pigcon =new JButton(icon); // 이미지 j버튼화
	    		pigcon.setBounds(1000,720, 200, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(pigcon);
	    	    
	    	    pigcon.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    pigcon.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    pigcon.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class PigcornInfo extends JFrame {
	    	    	private JLabel pigcon;
	    	    	private JButton x_B;
	    	    	
	    	    	public PigcornInfo() {
	    	    		setTitle("pigcon");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/PigcornInfo.png");
	            		pigcon = new JLabel(icon);//이미지로 변환
	            		pigcon.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(pigcon);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    pigcon.add(x_B);
	    	    	    
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
	    	    pigcon.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new PigcornInfo();
    	    		
                    
                }            
            });
	    	    
	    	  //supercon
	    	    icon = new ImageIcon("images/supercon.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		supercon =new JButton(icon); // 이미지 j버튼화
	    		supercon.setBounds(1150,720, 200, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(supercon);
	    	    
	    	    supercon.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    supercon.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    supercon.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	      	    class SuperInfo extends JFrame {
	    	    	private JLabel supercon;
	    	    	private JButton x_B;
	    	    	
	    	    	public SuperInfo() {
	    	    		setTitle("supercon");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/SuperInfo.png");
	            		supercon = new JLabel(icon);//이미지로 변환
	            		supercon.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(supercon);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    supercon.add(x_B);
	    	    	    
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
	      	  supercon.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new SuperInfo();
    	    		
                    
                }            
            });
	    	    
	    	  //mori
	    	    icon = new ImageIcon("images/star.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		star =new JButton(icon); // 이미지 j버튼화
	    		star.setBounds(1300,720, 200, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(star);
	    	    
	    	    star.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    star.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    star.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	      	    class ShottingstarInfo extends JFrame {
	    	    	private JLabel star;
	    	    	private JButton x_B;
	    	    	
	    	    	public ShottingstarInfo() {
	    	    		setTitle("star");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/ShottingstarInfo.png");
	            		star = new JLabel(icon);//이미지로 변환
	            		star.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(star);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    star.add(x_B);
	    	    	    
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
	      	  star.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new ShottingstarInfo();
    	    		
                    
                }            
            });
	    	    
	    	    
	    	  //mori
	    	    icon = new ImageIcon("images/world.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(150,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		world =new JButton(icon); // 이미지 j버튼화
	    		world.setBounds(1450,720, 200, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(world);
	    	    
	    	    world.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    world.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    world.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	      	    class WorldInfo extends JFrame {
	    	    	private JLabel world;
	    	    	private JButton x_B;
	    	    	
	    	    	public WorldInfo() {
	    	    		setTitle("world");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/WorldInfo.png");
	            		world = new JLabel(icon);//이미지로 변환
	            		world.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(world);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    world.add(x_B);
	    	    	    
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
	      	  world.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new WorldInfo();
    	    		
                    
                }            
            });
	    	    
	    	    
	    	    
	    	  //mori
	    	    icon = new ImageIcon("images/tankboy.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(120,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		tankboy =new JButton(icon); // 이미지 j버튼화
	    		tankboy.setBounds(1600,720, 200, 250); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(tankboy);
	    	    
	    	    tankboy.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    tankboy.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    tankboy.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	      	    class TankboyInfo extends JFrame {
		    	    	private JLabel tankboy;
		    	    	private JButton x_B;
		    	    	
		    	    	public TankboyInfo() {
		    	    		setTitle("tankboy");// 프레임 이름 설정
		            	    setSize(1920, 1080);// 프레임 크기 설정
		            	    setLocationRelativeTo(null);//프레임 가운데
		            	    
		            		icon = new ImageIcon("images/TankboyInfo.png");
		            		tankboy = new JLabel(icon);//이미지로 변환
		            		tankboy.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		                	add(tankboy);
		                	setResizable(false);
		    	    	    setVisible(true);
		    	    	    
		    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
		    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    	    	    x_B =new JButton(icon); // 이미지 j버튼화
		    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
		    	    	    tankboy.add(x_B);
		    	    	    
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
	      	  tankboy.addActionListener(new ActionListener() {
	                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
	                     
	                public void actionPerformed(ActionEvent arg0) {
	                	
	                	new TankboyInfo();
	    	    		
	                    
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
