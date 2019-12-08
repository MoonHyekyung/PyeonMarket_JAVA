import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

class IceCreamInfo1 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private IceCreamInfo win;
	public IceCreamInfo1(IceCreamInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/IceCream/IceCreamInfo/CandyInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/ChocopugInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/MegatonInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/MeronInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/OrangeInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/PigInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/ScrewInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/DoubleInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/NugaInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/TankboyInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/MogurichInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/MogupeachInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/MangoInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/KiwiInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/BbongddaInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/BbabbicoInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/GuguInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/PigcornInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/YoumomddeaInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/ShottingstarInfo.png");
		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// IceCreamInfo1 생성자
} // IceCreamInfo2

class IceCreamInfo2 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 기타 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B; // x버튼
	private IceCreamInfo win;
	public IceCreamInfo2(IceCreamInfo win, int j) {
		this.win = win;
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/IceCream/IceCreamInfo/WorldInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/BuraboInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/BuraboPistaInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/SuperInfo.png");
		InfoList.add("images/IceCream/IceCreamInfo/SuperStrawInfo.png");
		
		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		win.add(display);
		win.AddXbtn(x_B, display);
	}// IceCreamInfo2 생성자
} // IceCreamInfo2
public class IceCreamInfo extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JButton x_B; // x버튼
	
	public IceCreamInfo(int j, int ObjChk) {
		setTitle("기타 정보");
		setLayout(null);
		setSize(1920,1080);
		setVisible(true);
		switch (ObjChk) {
		case 1:
			IceCreamInfo1 i1 = new IceCreamInfo1(this,j);
			break;
		case 2: 
			IceCreamInfo2 i2 = new IceCreamInfo2(this,j);
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
