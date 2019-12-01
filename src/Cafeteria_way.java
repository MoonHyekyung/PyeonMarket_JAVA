import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cafeteria_way extends JFrame{
	private boolean w1 = true;
	private boolean w2 = false;
	private boolean w3 = false;

	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	private JButton Xbtn; // x버튼
	
	public Cafeteria_way() {
		setTitle("Cafeteria-way");// 프레임 이름 설정
        setSize(1600, 930);// 프레임 크기 설정
        setLocationRelativeTo(null);//프레임 가운데
        
        Way1Image one = new Way1Image();
        Way2Image two = new Way2Image();
        Way3Image thr = new Way3Image();
        
        // 오른쪽 버튼
		icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(150,150, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Rbtn =new JButton(icon); // 이미지 j버튼화
	    Rbtn.setBounds(1320, 650, 150, 150); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    
	    // 왼쪽 버튼//////////////////////////////////////////////
	    icon = new ImageIcon("images/left.png"); // 사진 불러오기
		image=icon.getImage(); //이미지 객체에 넣기
		image=image.getScaledInstance(150, 150, Image.SCALE_SMOOTH); // 객체 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Lbtn=new JButton(icon); // Lbtn Jbutton 추가
	    Lbtn.setBounds(140, 660, 150, 150); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Lbtn.setBorderPainted(false); // Lbtn 외각선 색 없게
        Lbtn.setContentAreaFilled(false); // Lbtn 버튼색 없게
        Lbtn.setFocusPainted(false);// Lbtn 선택될 때 테두리 없게
        
        // Lbtn 눌렸을 때 event
    
	    
        // x버튼
        icon = new ImageIcon("images/x.png"); // 사진 불러오기
        image = icon.getImage(); // 이미지객체에 x사진 넣기
        image = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH); // 객체사이즈 조절
        icon.setImage(image); // 객체 이미지화
        Xbtn = new JButton(icon); // xbtn j버튼에 이미지 넣기
        Xbtn.setBounds(1450, 10, 120, 120); // 버튼 크기 조절, x위치, y위치,x크기, y크기
        
        Xbtn.setBorderPainted(false); // Xbtn 외각선 색 없게
        Xbtn.setContentAreaFilled(false); // Xbtn 버튼색 없게
        Xbtn.setFocusPainted(false);// Xbtn 선택될 때 테두리 없게
        //Xbtn 눌렀을 때
//        Xbtn.addActionListener(new ActionListener() {
//    	    // 만들어진 왼쪽 버튼이 눌러지면 발생하는 행동을 정의     
//    	    	public void actionPerformed(ActionEvent arg0) {
//    	    		dispose(); // 현재 프레임 닫기
//    	    	}    
//    	});
        
        setContentPane(one);
	    setLayout(null);
	    one.add(Rbtn);
	    one.add(Xbtn);

        	
	   	setResizable(false);
        setVisible(true);
	}
}

class Way1Image extends JPanel {
	private ImageIcon way1 = new ImageIcon("images\\way1.png");
	private Image img = way1.getImage(); // 이미지 객체화
	public void paintComponent(Graphics g) { // image그리는 메서드
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
}

class Way2Image extends JPanel {
	private ImageIcon way2 = new ImageIcon("images\\way2.png");
	private Image img = way2.getImage(); // 이미지 객체화
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this); 
		// x위치, y위치, componentWidth, componentHeight
	}
}

class Way3Image extends JPanel {
	private ImageIcon way3 = new ImageIcon("images\\way3.png");
	private Image img = way3.getImage(); // 이미지 객체화
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
}