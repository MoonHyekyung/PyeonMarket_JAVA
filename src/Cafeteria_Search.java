import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cafeteria_Search extends JFrame {
    Cafeteria_Search() {
       
    	setTitle("검색");// 프레임 이름 설정
        setSize(1600, 930);// 프레임 크기 설정
        setLocationRelativeTo(null);//프레임 가운데
      //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 창 누를 시 프로그램 종료
        Container board = getContentPane(); // JFrame 위의 컨테이너
        board.setLayout(null);// 컨테이너 board의 배치관리자 삭제

     

	   

        setResizable(false);
        setVisible(true);
    }
}