import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

class DrinkInfo1 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private DrinkInfo win;
	public DrinkInfo1(DrinkInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/Drink/DrinkInfo/AppleMangoInfo.png");
		InfoList.add("images/Drink/DrinkInfo/BananaInfo.png");
		InfoList.add("images/Drink/DrinkInfo/BlueHawaiInfo.png");
		InfoList.add("images/Drink/DrinkInfo/PocariInfo.png");
		InfoList.add("images/Drink/DrinkInfo/ChocoInfo.png");
		InfoList.add("images/Drink/DrinkInfo/StrawInfo.png");
		InfoList.add("images/Drink/DrinkInfo/SeoulInfo.png");
		InfoList.add("images/Drink/DrinkInfo/OrangeInfo.png");
		InfoList.add("images/Drink/DrinkInfo/MangoInfo.png");
		InfoList.add("images/Drink/DrinkInfo/GrapeInfo.png");
		InfoList.add("images/Drink/DrinkInfo/ChungphodoInfo.png");
		InfoList.add("images/Drink/DrinkInfo/BerryInfo.png");
		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// DrinkInfo1 생성자
}

class DrinkInfo2 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private DrinkInfo win;
	public DrinkInfo2(DrinkInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/Drink/DrinkInfo/CocoPeachInfo.png");
		InfoList.add("images/Drink/DrinkInfo/CocoYouguInfo.png");
		InfoList.add("images/Drink/DrinkInfo/HushInfo.png");
		InfoList.add("images/Drink/DrinkInfo/JamongwaterInfo.png");
		InfoList.add("images/Drink/DrinkInfo/LemonwaterInfo.png");
		InfoList.add("images/Drink/DrinkInfo/PicninInfo.png");
		InfoList.add("images/Drink/DrinkInfo/OksusuInfo.png");
		InfoList.add("images/Drink/DrinkInfo/WaterInfo.png");

		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// DrinkInfo2 생성자
}

public class DrinkInfo extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JButton x_B; // x버튼
	
	public DrinkInfo(int j, int ObjChk) {
		setTitle("기타 정보");
		setLayout(null);
		setSize(1920,1080);
		setVisible(true);
		switch (ObjChk) {
		case 1:
			DrinkInfo1 d1 = new DrinkInfo1(this,j);
			break;
		case 2: 
			DrinkInfo2 d2 = new DrinkInfo2(this,j);
		}
	} // Etc생성자

	public void AddXbtn(JButton x_B, JLabel menu_Image) {
		// x버튼
	    icon = new ImageIcon("images/x.png"); // X 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 X 사진 넣기
		icon.setImage(image.getScaledInstance(200,200, Image.SCALE_SMOOTH)); // 사이즈 조절한거 다시 이미지에 넣기
	    x_B =new JButton(icon); // 이미지 j버튼화
	    x_B.setBounds(1700,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    menu_Image.add(x_B);
	    
	    x_B.setBorderPainted(false); //외각선 색 없게
	    x_B.setContentAreaFilled(false); // 버튼색 없게
	    x_B.setFocusPainted(false); // 선택될 때 테두리 없게
	    
	    x_B.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		setVisible(false);
	    	} // actionPerformed
	    }); // addActionListener
	} // AddXbtn
} // DrinkInfo