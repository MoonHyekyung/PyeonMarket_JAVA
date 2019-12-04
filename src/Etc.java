import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Etc extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private Container board; // 바탕화면 컨테이너
	private JLabel menu_Image; // menu 배경화면
	private JButton secom;
	private JButton secom_apple;
	private JButton zzang;
	private JButton zzang_coke;
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
	    		
	    		///secom  
	    		icon = new ImageIcon("images/secom.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(250,350, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		secom =new JButton(icon); // 이미지 j버튼화
	    		secom.setBounds(200,500, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(secom);
	    	    
	    	    secom.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    secom.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    secom.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class SaecomStrawberryInfo extends JFrame {
	    	    	private JLabel secom;
	    	    	private JButton x_B;
	    	    	
	    	    	public SaecomStrawberryInfo() {
	    	    		setTitle("secom");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/SaecomStrawberryInfo.png");
	            		secom = new JLabel(icon);//이미지로 변환
	            		secom.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(secom);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    secom.add(x_B);
	    	    	    
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
	    	    secom.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new SaecomStrawberryInfo();
    	    		
                    
                }            
            });
	    		
	    	    //secom_apple
	    	    icon = new ImageIcon("images/secom_apple.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(250,350, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		secom_apple =new JButton(icon); // 이미지 j버튼화
	    		secom_apple.setBounds(600,500, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(secom_apple);
	    	    
	    	    secom_apple.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    secom_apple.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    secom_apple.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class SaecomAppleInfo extends JFrame {
	    	    	private JLabel secom_apple;
	    	    	private JButton x_B;
	    	    	
	    	    	public SaecomAppleInfo() {
	    	    		setTitle("secom_apple");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/SaecomAppleInfo.png");
	            		secom_apple = new JLabel(icon);//이미지로 변환
	            		secom_apple.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(secom_apple);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    secom_apple.add(x_B);
	    	    	    
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
	    	    secom_apple.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new SaecomAppleInfo();
    	    		
                    
                }            
            });
	    	
	    	    
	    	    //copi
	    	    icon = new ImageIcon("images/zzang.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(250,350, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		zzang =new JButton(icon); // 이미지 j버튼화
	    		zzang.setBounds(1100,500, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(zzang);
	    	    
	    	    zzang.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    zzang.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    zzang.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class JjangfruitsInfo extends JFrame {
	    	    	private JLabel zzang;
	    	    	private JButton x_B;
	    	    	
	    	    	public JjangfruitsInfo() {
	    	    		setTitle("secom");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/JjangfruitsInfo.png");
	            		zzang = new JLabel(icon);//이미지로 변환
	            		zzang.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(zzang);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    zzang.add(x_B);
	    	    	    
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
	    	    zzang.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new JjangfruitsInfo();
    	    		
                    
                }            
            });
	    	
	    	    
	    	    //zzang_coke
	    	    icon = new ImageIcon("images/zzang_coke.png"); // 오른쪽 버튼 사진 불러오기
	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    		image = image.getScaledInstance(250,350, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    		zzang_coke =new JButton(icon); // 이미지 j버튼화
	    		zzang_coke.setBounds(1400,500, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    	    menu_Image.add(zzang_coke);
	    	    
	    	    zzang_coke.setBorderPainted(false); // Rbtn 외각선 색 없게
	    	    zzang_coke.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    	    zzang_coke.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    	    
	    	    class JjangcokeInfo extends JFrame {
	    	    	private JLabel zzang_coke;
	    	    	private JButton x_B;
	    	    	
	    	    	public JjangcokeInfo() {
	    	    		setTitle("zzang_coke");// 프레임 이름 설정
	            	    setSize(1920, 1080);// 프레임 크기 설정
	            	    setLocationRelativeTo(null);//프레임 가운데
	            	    
	            		icon = new ImageIcon("images/JjangcokeInfo.png");
	            		zzang_coke = new JLabel(icon);//이미지로 변환
	            		zzang_coke.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	                	add(zzang_coke);
	                	setResizable(false);
	    	    	    setVisible(true);
	    	    	    
	    	    	    icon = new ImageIcon("images/x.png"); // 오른쪽 버튼 사진 불러오기
	    	    		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
	    	    		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
	    	    		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    	    	    x_B =new JButton(icon); // 이미지 j버튼화
	    	    	    x_B.setBounds(1300,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    	    	    zzang_coke.add(x_B);
	    	    	    
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
	    	    zzang_coke.addActionListener(new ActionListener() {
                // 왼쪽 버튼이 눌러지면 Snack3로 넘어가기
                     
                public void actionPerformed(ActionEvent arg0) {
                	
                	new JjangcokeInfo();
    	    		
                    
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
