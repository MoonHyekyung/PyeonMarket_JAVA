import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cafeteria_start extends JFrame{
	private ImageIcon RoadImage; // 불러온 사진 
	private JLabel Display; // 배경화면 JLabel
	private Image image;
	private Image btnImage; // 버튼 이미지 객체
	
	private JButton x_B;
	private JButton Search;
	private JButton Category;
	
    Cafeteria_start() {
    	setTitle("사용 시작");// 프레임 이름 설정
        setSize(1920, 1080);// 프레임 크기 설정
        setLocationRelativeTo(null);//프레임 가운데
        Container board = getContentPane(); // JFrame 위의 컨테이너
        board.setLayout(null);// 컨테이너 board의 배치관리자 삭제
        
      //배경화면 추가 
        RoadImage = new ImageIcon("images/BackDisplay.png"); // 사진 불러오기
        Display = new JLabel(RoadImage);//이미지로 변환
		Display.setBounds(0,0,1920,1080); //가로위치, 세로위치, 가로크기, 세로크기
		board.add(Display);
		
		// x 버튼 추가
		RoadImage = new ImageIcon("images/x.png"); // X 버튼 사진 불러오기
		image = RoadImage.getImage(); // 이미지 객체에 X 사진 넣기
		image = image.getScaledInstance(200,200, Image.SCALE_SMOOTH); // 객체 사이즈 조절하기
		RoadImage.setImage(image); //사이즈 조절한거 다시 이미지에 넣기
	    x_B =new JButton(RoadImage); // 이미지 j버튼화
	    x_B.setBounds(1700,20, 200, 200); //가로위치, 세로위치, 가로크기, 세로크기
	    Display.add(x_B);
	    
	    x_B.setBorderPainted(false); //외각선 색 없게
	    x_B.setContentAreaFilled(false); // 버튼색 없게
	    x_B.setFocusPainted(false); // 선택될 때 테두리 없게
	    
	    
	    x_B.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		setVisible(false);
	    	}
	    });
		
		//search 버튼
        RoadImage = new ImageIcon("images/search.png");
        btnImage = RoadImage.getImage(); // 이미지 객체화
        btnImage = btnImage.getScaledInstance(600, 660, Image.SCALE_SMOOTH); //  사이즈조절
		RoadImage.setImage(btnImage); //사이즈 조절한거 다시 이미지에 넣기
		Search =new JButton(RoadImage); // 이미지 j버튼화
		Search.setBounds(300,200, 600, 660);
		
		Search.setBorderPainted(false); // Search 외각선 색 없게
	    Search.setContentAreaFilled(false); // Search 버튼색 없게
	    Search.setFocusPainted(false); // Search 선택될 때 테두리 없게
	    Display.add(Search);
	    
	    Search.addActionListener(new ActionListener() {
	       // Search 버튼이 눌러지면 발생하는 행동을 정의
	       public void actionPerformed(ActionEvent arg0) {
	          new Cafeteria_Search();
	       }            
	    });
	    
	    // category 버튼
	    RoadImage = new ImageIcon("images/category.png");
        btnImage = RoadImage.getImage(); //이미지 bt1에 넣기
		btnImage = btnImage.getScaledInstance(600, 660, Image.SCALE_SMOOTH);
		RoadImage.setImage(btnImage); //사이즈 조절한거 다시 이미지에 넣기
		Category =new JButton(RoadImage); // 이미지 j버튼화
		Category.setBounds(1000, 200, 600, 660);
		
		Category.setBorderPainted(false); // Category 외각선 색 없게
	    Category.setContentAreaFilled(false); // Category 버튼색 없게
	    Category.setFocusPainted(false); // Category 선택될 때 테두리 없게
	    Display.add(Category);
	    Category.addActionListener(new ActionListener() {
		       // Category 버튼이 눌러지면 발생하는 행동을 정의
		       public void actionPerformed(ActionEvent arg0) {
		          new Category();
		       }            
		    });
	    
       setResizable(false);
       setVisible(true);
    }
}