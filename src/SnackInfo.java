import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

class SnackInfo1 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private SnackInfo win;
	public SnackInfo1(SnackInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/Snack/SnackInfo/AlshrimpInfo.png");
		InfoList.add("images/Snack/SnackInfo/BananakickInfo.png");
		InfoList.add("images/Snack/SnackInfo/BinchInfo.png");
		InfoList.add("images/Snack/SnackInfo/AmondInfo.png");
		InfoList.add("images/Snack/SnackInfo/NudeInfo.png");
		InfoList.add("images/Snack/SnackInfo/OriginalInfo.png");
		InfoList.add("images/Snack/SnackInfo/CanchoInfo.png");
		InfoList.add("images/Snack/SnackInfo/ChamInfo.png");
		InfoList.add("images/Snack/SnackInfo/ChocopieInfo.png");
		InfoList.add("images/Snack/SnackInfo/ChickenInfo.png");
		InfoList.add("images/Snack/SnackInfo/HotChickenInfo.png");
		
		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// SnackInfo1 생성자
} // SnackInfo1

class SnackInfo2 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private SnackInfo win;
	public SnackInfo2(SnackInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/Snack/SnackInfo/CornInfo.png");
		InfoList.add("images/Snack/SnackInfo/Crown_MilkInfo.png");
		InfoList.add("images/Snack/SnackInfo/Crown_StrawberryInfo.png");
		InfoList.add("images/Snack/SnackInfo/GgobukInfo.png");
		InfoList.add("images/Snack/SnackInfo/GgoggalInfo.png");
		InfoList.add("images/Snack/SnackInfo/GosomiInfo.png");
		InfoList.add("images/Snack/SnackInfo/HomerunInfo.png");
		InfoList.add("images/Snack/SnackInfo/HoneybutterInfo.png");
		InfoList.add("images/Snack/SnackInfo/Honeybutter_CherryblossomInfo.png");
		InfoList.add("images/Snack/SnackInfo/HoneytwistInfo.png");
		InfoList.add("images/Snack/SnackInfo/FirejjambbongInfo.png");
		InfoList.add("images/Snack/SnackInfo/HotshrimpInfo.png");
		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// SnackInfo2 생성자
} // SnackInfo2

class SnackInfo3 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private SnackInfo win;
	public SnackInfo3(SnackInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/Snack/SnackInfo/LottesandInfo.png");
		InfoList.add("images/Snack/SnackInfo/ChocoInfo.png");
		InfoList.add("images/Snack/SnackInfo/MizzInfo.png");
		InfoList.add("images/Snack/SnackInfo/OjingInfo.png");
		InfoList.add("images/Snack/SnackInfo/OnionInfo.png");
		InfoList.add("images/Snack/SnackInfo/PizzaInfo.png");
		InfoList.add("images/Snack/SnackInfo/PosticInfo.png");
		InfoList.add("images/Snack/SnackInfo/SaddobabInfo.png");
		InfoList.add("images/Snack/SnackInfo/SunInfo.png");
		InfoList.add("images/Snack/SnackInfo/UgwaInfo.png");
		InfoList.add("images/Snack/SnackInfo/YachaeInfo.png");
		InfoList.add("images/Snack/SnackInfo/ZecInfo.png");
		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// SnackInfo3 생성자
} // SnackInfo3

public class SnackInfo extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JButton x_B; // x버튼
	
	public SnackInfo(int j, int ObjChk) {
		setTitle("기타 정보");
		setLayout(null);
		setSize(1920,1080);
		setVisible(true);
		switch (ObjChk) {
		case 1:
			SnackInfo1 s1 = new SnackInfo1(this,j);
			break;
		case 2: 
			SnackInfo2 s2 = new SnackInfo2(this,j);
		}
	} // Etc생성자

	public void AddXbtn(JButton x_B, JLabel menu_Image) {
		// x버튼
	    icon = new ImageIcon("images/x.png"); // X 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 X 사진 넣기
		icon.setImage(image.getScaledInstance(200,200, Image.SCALE_SMOOTH)); // 사이즈 조절한거 다시 이미지에 넣기
	    x_B =new JButton(icon); // 이미지 j버튼화
	    x_B.setBounds(1720,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
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
}
