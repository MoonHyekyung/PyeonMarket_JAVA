import java.awt.Container;
import java.awt.Image;

import javax.swing.*;

public class Cafeteria_Menu extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private Container board; // 바탕화면 컨테이너
	private JLabel menu_Image; // menu 배경화면
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Lbtn; // 왼쪽 버튼
	
	public Cafeteria_Menu() {
		setTitle("Cafeteria_Menu");// 프레임 이름 설정
        setSize(1920, 1080);// 프레임 크기 설정
        setLocationRelativeTo(null);//프레임 가운데
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 창 누를 시 프로그램 종료
        board = getContentPane(); // JFrame 위의 컨테이너
        board.setLayout(null);// 컨테이너 board의 배치관리자 삭제
        
		icon = new ImageIcon("images/menu.png");
		menu_Image = new JLabel(icon);//이미지로 변환
		menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		board.add(menu_Image);
		
		 // 오른쪽 버튼
		icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(290,290, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Rbtn =new JButton(icon); // 이미지 j버튼화
	    Rbtn.setBounds(1300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
	    menu_Image.add(Rbtn);
	    
	    Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    
	    
	    // 왼쪽 버튼//////////////////////////////////////////////
	    icon = new ImageIcon("images/left.png"); // 사진 불러오기
		image=icon.getImage(); //이미지 객체에 넣기
		image=image.getScaledInstance(300, 300, Image.SCALE_SMOOTH); // 객체 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Lbtn=new JButton(icon); // Lbtn Jbutton 추가
	    Lbtn.setBounds(300, 80, 300, 300); //가로위치, 세로위치, 가로크기, 세로크기
	    menu_Image.add(Lbtn);
	    
	    Lbtn.setBorderPainted(false); // Lbtn 외각선 색 없게
        Lbtn.setContentAreaFilled(false); // Lbtn 버튼색 없게
        Lbtn.setFocusPainted(false);// Lbtn 선택될 때 테두리 없게
        
		
		
		setResizable(false);
	    setVisible(true);
	}
}
