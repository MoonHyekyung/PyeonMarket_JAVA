import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cafeteria_way1 extends JFrame {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JButton Rbtn; // 오른쪽 버튼
	private JButton Xbtn; // x버튼
    Cafeteria_way1() {
    	setTitle("Way");// 프레임 이름 설정
        setSize(1920, 1080);// 프레임 크기 설정
        setLocationRelativeTo(null);//프레임 가운데
      //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 창 누를 시 프로그램 종료
        Container board = getContentPane(); // JFrame 위의 컨테이너
        board.setLayout(null);// 컨테이너 board의 배치관리자 삭제

        //배경화면 추가 
        ImageIcon maindisplay = new ImageIcon("images/way1.png"); // 사진 불러오기
        JLabel imageLabel = new JLabel(maindisplay);//이미지로 변환
		imageLabel.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		board.add(imageLabel);
		
		// 오른쪽 버튼
		icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(190,190, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Rbtn =new JButton(icon); // 이미지 j버튼화
	    Rbtn.setBounds(1600, 800, 190, 190); //가로위치, 세로위치, 가로크기, 세로크기
			    
	    Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
    
      
       //버튼추가
        imageLabel.add(Rbtn);
            
	    Rbtn.addActionListener(new ActionListener() {
	            // 만들어진 버튼 "게임방법"에 버튼이 눌러지면 발생하는 행동을 정의
	                 
	            public void actionPerformed(ActionEvent arg0) {
	                // TODO Auto-generated method stub
	            new Cafeteria_way2();
	            }            
	        });
	       
	    // xbtn
	       icon = new ImageIcon("images/x.png"); // 사진 불러오기
	        image = icon.getImage(); // 이미지객체에 x사진 넣기
	        image = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH); // 객체사이즈 조절
	        icon.setImage(image); // 객체 이미지화
	        Xbtn = new JButton(icon); // xbtn j버튼에 이미지 넣기
	        Xbtn.setBounds(1780, 15, 120, 120); // 버튼 크기 조절, x위치, y위치,x크기, y크기
	        
	       Xbtn.setBorderPainted(false); // Xbtn 외각선 색 없게
	       Xbtn.setContentAreaFilled(false); // Xbtn 버튼색 없게
	       Xbtn.setFocusPainted(false);// Xbtn 선택될 때 테두리 없게
	       
	       imageLabel.add(Xbtn);
	       //Xbtn 눌렀을 때
	        Xbtn.addActionListener(new ActionListener() {
	    	    // 만들어진 왼쪽 버튼이 눌러지면 발생하는 행동을 정의     
	    	    	public void actionPerformed(ActionEvent arg0) {
	    	    		dispose(); // 현재 프레임 닫기
	    	    	}    
	    	});

        setResizable(false);
        setVisible(true);
    }
}