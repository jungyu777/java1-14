package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	//필드
	JTextField inputMsg;
	JLabel label;
	//생성자
	public MyFrame(String title) {
		super(title);
		//초기 위치와 크기 설정 (this. 생략가능) 
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		//문자열을 한줄 입력 할수 있는 JTextField 객체 생성
		inputMsg = new JTextField(10);
		JButton sendBtn = new JButton("전송");
		JButton sendBtn2 = new JButton("전송2");
		label= new JLabel();
		
		
		
		//MyFrame 을 액션 리스너로 등록을 한다
		sendBtn.addActionListener(this);
		
		//함수 형태로 액션 리스너를 등록 할수도 있다
		sendBtn2.addActionListener((e)->{
			String msg=inputMsg.getText();
			JOptionPane.showMessageDialog(this, msg);
			label.setText(msg); //알림창에뜬걸 전송2옆에 남긴다
		});
		
		
		//모든 UI들은 Component 를 상속한다
		//프레임에 UI 를 추가한다  add한 순서대로 배치댐
		add(inputMsg);
		add(sendBtn);
		add(sendBtn2);
		add(label);
		
		//UI 를 모두 배치하고 나중에 호출하는것이 원칙이다
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//1.JTextField 에 입력한 문자열을 읽어 온다.
		String msg=inputMsg.getText();
		//읽어온 문자열을 알림창에 띄운다.
		JOptionPane.showMessageDialog(this, inputMsg);
		//읽어온 문자열을 Jlabel에 출력하기
		label.setText(msg);
		
	}
}
