import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
class Way1 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private JLabel imageLabel; // 배경화면 제이라벨
	private Image image; // 이미지 객체화
	private JButton Rbtn; // 오른쪽 버튼
	private Way win;
	
	public Way1(Way win) {
		this.win = win;
		setLayout(null);
		
		//배경화면 추가 
        icon = new ImageIcon("images/way1.png"); // 사진 불러오기
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
            // 오른쪽 버튼이 눌러지면 way2로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("way1-2");
            }            
        });
	}
}

class Way2 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private JLabel imageLabel;
	private Image image; // 이미지 객체화
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	private Way win;
	
	public Way2(Way win) {
		setLayout(null);
		this.win = win; // 넘겨 받은 부모 프레임을 멤버변수에 넣기
		
		//배경화면 추가 
        icon = new ImageIcon("images/way2.png"); // 사진 불러오기
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
            // 오른쪽 버튼이 눌러지면 way3로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("way2-3");
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
            // 왼쪽 버튼이 눌러지면 way1로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("way2-1");
            }            
        });
	}
}

class Way3 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private JLabel imageLabel; // 배경화면 JLabel
	private Image image; // 이미지 객체화
	private JButton Lbtn; // 왼쪽 버튼
	private Way win;
	
	public Way3(Way win) {
		setLayout(null);
		this.win = win;
		
		//배경화면 추가 
        icon = new ImageIcon("images/way3.png"); // 사진 불러오기
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
            // 왼쪽 버튼이 눌러지면 way2로 넘어가기
                 
            public void actionPerformed(ActionEvent arg0) {
                win.Change("way3-2");
            }            
        });
	}
}
public class Way extends JFrame{
	
	public Way1 way1 = null;
	public Way2 way2 = null;
	public Way3 way3 = null;
	
	public Way() {
		setTitle("이용 방법");
		way1 = new Way1(this);
		way2 = new Way2(this);
		way3 = new Way3(this);
		add(this.way1);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1920,1080);
		setVisible(true);
	}
	public void Change(String panelName) {
		switch(panelName) {
		case "way1-2": case "way3-2":
			getContentPane().removeAll();
			getContentPane().add(way2);
			revalidate();
			repaint();
			break;
			
		case "way2-1":
			getContentPane().removeAll();
			getContentPane().add(way1);
			revalidate();
			repaint();
			break;
			
		case "way2-3":
			getContentPane().removeAll();
			getContentPane().add(way3);
			revalidate();
			repaint();
		}
	}
}
