package frame01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/*
 * 일괄 import 하는 방법 ctrl + shift + o
 */
public class MyFrame extends JFrame implements ActionListener{
	   //생성자
	   public MyFrame(String title) {
	      super(title);
	      //프레임의 초기 설정 작업하기 
	      setBounds(100, 100, 500, 500);
	      // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      //레이아웃 설정
	      setLayout(new FlowLayout());
	      
	      JButton startBtn=new JButton("작업 시작");
	      startBtn.addActionListener(this);
	      //프레임에 버튼 추가
	      add(startBtn);
	      
	      JTextField tf=new JTextField(10);
	      //프레임에 JTextField 추가
	      add(tf);
	      
	      // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
	      setVisible(true);
	   }
	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * run을 누르면 main 메소드에서 시작되는 작업단위가 있는데 
		 * 그 작업단위를 main thread (메인 스레드)라고 부른다.
		 * 특별히 작업단위를 늘리지 않는 이상 하나의 작업단위만 존재한다.
		 * 작업단위를 1이상 늘리면 멀티쓰레드라고한다
		 * 새로운 작업단위 즉 새로운 쓰레드에서 할수있다면 GUI 의 반응성이 좋아 지지 않을까...
		 */
		System.out.println("작업을 시작합니다..");
		//10초가 걸리는 작업이라고 가정하자
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("작업이 끝났습니다.");
	}
	//run 했을떄 app 이 시작되는 아주 특별한 main 메소드
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
	
}