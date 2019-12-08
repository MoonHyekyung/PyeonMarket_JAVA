import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
class IceCream1 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> IceCreamList; // IceCreamList
	private JButton IceCreambtn[]; // 아이스크림 메뉴 버튼
	
	private JButton x_B;
	private JButton Rbtn; // 오른쪽 버튼
	private IceCream win;
	
	public IceCream1(IceCream win) {
		this.win = win;
		setLayout(null);
		
		// 배경화면
	    icon = new ImageIcon("images/menu.png");
	    menu_Image = new JLabel(icon);//이미지로 변환
	    menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	    add(menu_Image);
	    
	    // x버튼
	    win.AddXbtn(x_B, menu_Image);
	    
	    // 오른쪽 버튼
	    icon = new ImageIcon("images/right.png"); // 오른쪽 버튼 사진 불러오기
		image = icon.getImage(); // 이미지 객체에 right 사진 넣기
		image = image.getScaledInstance(290,290, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Rbtn =new JButton(icon); // 이미지 j버튼화
	    Rbtn.setBounds(1300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
			    
	    Rbtn.setBorderPainted(false); // Rbtn 외각선 색 없게
	    Rbtn.setContentAreaFilled(false); // Rbtn 버튼색 없게
	    Rbtn.setFocusPainted(false); // Rbtn 선택될 때 테두리 없게
	    menu_Image.add(Rbtn);
	    
	    Rbtn.addActionListener(new ActionListener() {
            // 오른쪽 버튼이 눌러지면 IceCream2로 넘어가기
            public void actionPerformed(ActionEvent arg0) {
                win.Change("icecream1-2");
            } // actionPerformed
        }); // addActionListener
	    
	    // 메뉴 버튼들
	    IceCreambtn = new JButton[20];
	    
	    IceCreamList = new ArrayList<String>();
	    IceCreamList.add("images/IceCream/candybar.png"); // 캔디바
	    IceCreamList.add("images/IceCream/chocoperge.png"); // 초코퍼지
	    IceCreamList.add("images/IceCream/mega.png"); // 메가바
	    IceCreamList.add("images/IceCream/melon.png"); // 메로나
	    IceCreamList.add("images/IceCream/orange.png"); // 생귤탱귤감귤
	    IceCreamList.add("images/IceCream/pigbar.png"); // 돼지바
	    IceCreamList.add("images/IceCream/screwbar.png"); // 스크류바
	    IceCreamList.add("images/IceCream/ssang.png"); // 쌍쌍바
	    IceCreamList.add("images/IceCream/who.png"); // 누가바
	    IceCreamList.add("images/IceCream/tankboy.png"); // 탱크보이
	    IceCreamList.add("images/IceCream/mori.png"); // 모구모구 리치 쭈쭈바
	    IceCreamList.add("images/IceCream/mopi.png"); // 모구모구 피치 쭈쭈바
	    IceCreamList.add("images/IceCream/Mango.png"); // 망고 쭈쭈바
	    IceCreamList.add("images/IceCream/Kiwi.png"); // 키위 쭈쭈바
	    IceCreamList.add("images/IceCream/bbong.png"); // 뽕따
	    IceCreamList.add("images/IceCream/babico.png"); // 빠삐코
	    IceCreamList.add("images/IceCream/99con.png"); // 구구콘
	    IceCreamList.add("images/IceCream/pigcon.png"); // 퇘지콘
	    IceCreamList.add("images/IceCream/plain.png"); // 캔디바
	    IceCreamList.add("images/IceCream/star.png"); // 슈팅스타
	    
	    win.AddBtn(IceCreamList, IceCreambtn, menu_Image);
	} // IceCream1 생성자
} // IceCream1

class IceCream2 extends JPanel {
	private ImageIcon icon; // 사진 불러오기 변수
	private Image image; // 이미지 객체화
	private JLabel menu_Image; // menu 배경화면
	private ArrayList<String> IceCreamList; // IceCreamList
	private JButton IceCreambtn[];
	private IceCream win; // IceCream2를 더할 프레임위치 클래스
	
	private JButton x_B;
	private JButton Lbtn; // 왼쪽 버튼
	
	public IceCream2(IceCream win) {
		this.win = win;
		setLayout(null);
		
		// 배경화면
	    icon = new ImageIcon("images/menu.png");
	    menu_Image = new JLabel(icon);//이미지로 변환
	    menu_Image.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
	    add(menu_Image);
	    
		// x버튼 
		win.AddXbtn(x_B, menu_Image);
		
		// 왼쪽 버튼
		icon = new ImageIcon("images/left.png"); // 사진 불러오기
		image=icon.getImage(); //이미지 객체에 넣기
		image=image.getScaledInstance(290, 290, Image.SCALE_SMOOTH); // 객체 조절하기
		icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    Lbtn=new JButton(icon); // Lbtn Jbutton 추가
	    Lbtn.setBounds(300, 80, 290, 290); //가로위치, 세로위치, 가로크기, 세로크기
	    
	    Lbtn.setBorderPainted(false); // Lbtn 외각선 색 없게
        Lbtn.setContentAreaFilled(false); // Lbtn 버튼색 없게
        Lbtn.setFocusPainted(false);// Lbtn 선택될 때 테두리 없게
        menu_Image.add(Lbtn);
	   
        Lbtn.addActionListener(new ActionListener() {
            // 왼쪽 버튼이 눌러지면 icecrema1로 넘어가기
            public void actionPerformed(ActionEvent arg0) {
                win.Change("icecream2-1");
            }            
        });
		
		// 메뉴 버튼들
        IceCreambtn = new JButton[5];
		    
		IceCreamList = new ArrayList<String>();
		IceCreamList.add("images/IceCream/world.png"); // 월드콘
		IceCreamList.add("images/IceCream/burabo.png"); // 부라보 바닐라
		IceCreamList.add("images/IceCream/burabo_pista.png"); // 부라보 피스타치오
		IceCreamList.add("images/IceCream/supercon.png"); // 슈퍼콘 바닐라
		IceCreamList.add("images/IceCream/supercon_straw.png"); // 부라보 딸기
		
		win.AddBtn(IceCreamList, IceCreambtn, menu_Image);
	} // icecream2 생성자
} // IceCream2

public class IceCream extends JFrame{
	private ImageIcon icon; // 불러온 이미지
	private Image image; // 이미지 객체
	public IceCream1 icecream1 = null;
	public IceCream2 icecream2 = null;
	
	public IceCream() {
		setTitle("아이스크림");
		icecream1 = new IceCream1(this);
		icecream2 = new IceCream2(this);
	    setSize(1920, 1080);// 프레임 크기 설정
	    setLocationRelativeTo(null);//프레임 가운데
	    add(this.icecream1);
	    
		setSize(1920,1080);
		setVisible(true);
	} // Etc 생성자
	
	public void Change(String panelName) {
		switch(panelName) {
		case "icecream1-2": 
			getContentPane().removeAll();
			getContentPane().add(icecream2);
			revalidate();
			repaint();
			break;
		case "icecream2-1":
			getContentPane().removeAll();
			getContentPane().add(icecream1);
			revalidate();
			repaint();
		} // switch
	} // Change
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
	
	public void AddBtn(ArrayList<String> EtcList, JButton Etcbtn[], JLabel menu_Image) {
	    int i = 0, chk = 1;
	    int x = 200, y = 450, width = 100, height = 250;
	    for(String etc: EtcList) { // 향상된 for문
	    	icon = new ImageIcon(etc); // 사진 불러오기
	    	image = icon.getImage(); // 이미지 객체에 사진 넣기
	    	image = image.getScaledInstance(100,250, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		    icon.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
		    Etcbtn[i] = new JButton(icon); // 이미지 j버튼화
		    Etcbtn[i].setBounds(x,y,width,height);
		    menu_Image.add(Etcbtn[i]);
		    		
		    Etcbtn[i].setBorderPainted(false); // 버튼 외각선 색 없게
		    Etcbtn[i].setContentAreaFilled(false); //  버튼색 없게
		    Etcbtn[i].setFocusPainted(false); // 버튼 선택될 때 테두리 없게
		    if(chk % 10 == 0) {  // 두번째 줄로 내리기
		    	y += 300;
		    	x = 40; // 밑에서 160을 더할 것이기 때문
		    } // if
		    i++;
		    chk++;
		    x += 160;
	    } // for
	} // AddBtn
}
