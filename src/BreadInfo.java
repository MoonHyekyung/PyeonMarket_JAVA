import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class BreadInfo extends JFrame{
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private ArrayList<String> InfoList; // 빵 정보 사진들
	private JLabel display; // 정보 화면
	private JButton x_B;
	
	public BreadInfo(int j) {
		setTitle("빵 정보");
		setLayout(null);
		setSize(1920,1080);
		setVisible(true);
		
		InfoList = new ArrayList<String>();
		
		InfoList.add("images/Bread/BreadInfo/PastryInfo.png");
		InfoList.add("images/Bread/BreadInfo/CasteraInfo.png");
		InfoList.add("images/Bread/BreadInfo/CheeseInfo.png");
		InfoList.add("images/Bread/BreadInfo/ChocoBellInfo.png");
		InfoList.add("images/Bread/BreadInfo/HotteokInfo.png");
		InfoList.add("images/Bread/BreadInfo/CheeseCakeInfo.png");
		InfoList.add("images/Bread/BreadInfo/GogumaInfo.png");
		InfoList.add("images/Bread/BreadInfo/ChocoCakeInfo.png");

		icon = new ImageIcon(InfoList.get(j));
		display = new JLabel(icon);//이미지로 변환
		display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		
		add(display);
		AddXbtn(x_B, display);
	}
	
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
	}
}
