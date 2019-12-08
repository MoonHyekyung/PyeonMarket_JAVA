import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
class EtcInfo1 extends JPanel{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private EtcInfo win;
	public EtcInfo1(EtcInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/Etc/EtcInfo/ABCInfo.png");
		InfoList.add("images/Etc/EtcInfo/BirldeggInfo.png");
		InfoList.add("images/Etc/EtcInfo/CrunkyInfo.png");
		InfoList.add("images/Etc/EtcInfo/EggInfo.png");
		InfoList.add("images/Etc/EtcInfo/GanaInfo.png");
		InfoList.add("images/Etc/EtcInfo/GonyakChungInfo.png");
		InfoList.add("images/Etc/EtcInfo/GonyakPeachInfo.png");
		InfoList.add("images/Etc/EtcInfo/GgomiGrapeInfo.png");
		InfoList.add("images/Etc/EtcInfo/GgomiSodaInfo.png");
		InfoList.add("images/Etc/EtcInfo/GgomiPeachInfo.png");
		InfoList.add("images/Etc/EtcInfo/SaecomStrawberryInfo.png");
		InfoList.add("images/Etc/EtcInfo/SaecomAppleInfo.png");

		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// EtcInfo1 생성자
} // EtcInfo1

class EtcInfo2 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private EtcInfo win;
	
	public EtcInfo2(EtcInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/Etc/EtcInfo/JjangfruitsInfo.png");
		InfoList.add("images/Etc/EtcInfo/JjangcokeInfo.png");
		InfoList.add("images/Etc/EtcInfo/HambergerInfo.png");
		InfoList.add("images/Etc/EtcInfo/miniHariboInfo.png");
		InfoList.add("images/Etc/EtcInfo/HariboInfo.png");
		InfoList.add("images/Etc/EtcInfo/HotbarInfo.png");
		InfoList.add("images/Etc/EtcInfo/KimchiInfo.png");
		InfoList.add("images/Etc/EtcInfo/MeatInfo.png");
		InfoList.add("images/Etc/EtcInfo/MychyappleInfo.png");
		InfoList.add("images/Etc/EtcInfo/MychgrapeInfo.png");
		InfoList.add("images/Etc/EtcInfo/MychupeachInfo.png");
		InfoList.add("images/Etc/EtcInfo/MychuStrawInfo.png");

		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// EtcInfo2 생성자
} // EtcInfo2

class EtcInfo3 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private EtcInfo win;
	
	public EtcInfo3(EtcInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/Etc/EtcInfo/HotbreakInfo.png");
		InfoList.add("images/Etc/EtcInfo/MygumiInfo.png");
		InfoList.add("images/Etc/EtcInfo/PocketInfo.png");
		InfoList.add("images/Etc/EtcInfo/PocketDeriInfo.png");
		InfoList.add("images/Etc/EtcInfo/RockInfo.png");
		InfoList.add("images/Etc/EtcInfo/SandwichInfo.png");
		InfoList.add("images/Etc/EtcInfo/SaecomDalcomGrapeInfo.png");
		InfoList.add("images/Etc/EtcInfo/SaecomDalcomLemonInfo.png");
		InfoList.add("images/Etc/EtcInfo/SaecomDalcomPeachInfo.png");
		InfoList.add("images/Etc/EtcInfo/SaecomStrawberryInfo.png");
		InfoList.add("images/Etc/EtcInfo/SneakersInfo.png");
		InfoList.add("images/Etc/EtcInfo/TwixInfo.png");

		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// EtcInfo3 생성자
} // EtcInfo3

class EtcInfo4 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private EtcInfo win;
	
	public EtcInfo4(EtcInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/Etc/EtcInfo/SinjjolappleInfo.png");
		InfoList.add("images/Etc/EtcInfo/SinjjolLemonInfo.png");
		InfoList.add("images/Etc/EtcInfo/SinjjolStrawInfo.png");
		InfoList.add("images/Etc/EtcInfo/ViyottberryInfo.png");
		InfoList.add("images/Etc/EtcInfo/ViyottChocoInfo.png");
		
		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// EtcInfo4 생성자
} // EtcInfo4

public class EtcInfo extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JButton x_B; // x버튼
	
	public EtcInfo(int j, int ObjChk) {
		setTitle("기타 정보");
		setLayout(null);
		setSize(1920,1080);
		setVisible(true);
		switch (ObjChk) {
		case 1:
			EtcInfo1 e1 = new EtcInfo1(this,j);
			break;
		case 2: 
			EtcInfo2 e2 = new EtcInfo2(this,j);
			break;
		case 3:
			EtcInfo3 e3 = new EtcInfo3(this,j);
			break;
		case 4:
			EtcInfo4 e4 = new EtcInfo4(this,j);
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
}
