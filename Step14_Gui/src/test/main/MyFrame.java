package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JTextField tf_num1 ,tf_num2;
	JLabel la2;
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100,100,900,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//JTextField 2ro
		tf_num1=new JTextField(10);
		tf_num2=new JTextField(10);
		//JButton 4개
		//기능버튼 객체를 만들어서 
		JButton plusBtn =new JButton("+");
		JButton minusBtn =new JButton("-");
		JButton multiBtn =new JButton("*");
		JButton divideBtn =new JButton("/");
		
		//JLabel 2개
		JLabel la1=new JLabel("=");
		la2=new JLabel("0");
		
		//UI를 프레임에 배치
		add(tf_num1);
		add(plusBtn);
		add(minusBtn);
		add(multiBtn);
		add(divideBtn);
		add(tf_num2);
		add(la1);
		add(la2);
		
		//버튼에 액션 리스너 등록하기
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		//버튼에 action command 설정하기
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("계산기");
	}
	
	//ActionListener 인터페이스를 구현했기 떄문에 강제 오버라이드된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//입력한 문자열 읽어오기
		String strNum1=tf_num1.getText();
		String strNum2=tf_num2.getText();
		
		
		//입력한 문자열을 실수로 (double)로 변경하기  여기서 예외가 발생하면 
		try {
			double num1=Double.parseDouble(strNum1);
			double num2=Double.parseDouble(strNum2);
			
			
			//눌러진 버튼의 command 읽어오기
			String cmd=e.getActionCommand();
			//넒은범위의 result 를 만들어서 결과값에서도 result 를 다시사용한다0
			//연산의 결과값을 담을 변수를 미리 선언하고 초기값 대입하기 ( 왜 미리 선언해야 하나? 를 알아야함)
			double result=0;
			
			//command 가 무엇이냐를 확인해서 분기 하기
			if(cmd.equals("plus")) {
				 result = num1+num2;
				
			}else if(cmd.equals("minus")) {
				 result = num1-num2;
				
			}else if(cmd.equals("multi")) {
				 result = num1*num2;
				
			}else if(cmd.equals("divide")) {
				 result = num1/num2;
				 if(num2==0){
					JOptionPane.showMessageDialog(this, "어떤 수를 0으로 나눌수는 없어요!");
					return;
				 }
	
			}
			//숫자를(double) 문자열(String) 로 바꾸기  
			String resultText=Double.toString(result);
			
			//결과값을 JLable 에 출력하기
			la2.setText(resultText);
		}catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "숫자형식으로 입력해주세요!");
		}
	}
}
