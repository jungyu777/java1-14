package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * 프레임에 
 * JTextField 와 JButton 을 배치해서
 * JTextField에 문자열을 입력하고 저장버튼을 누르면
 * 입력한 문자열이 diart.txt 파일에 누적긹이 되도록
 * 
 */
public class QuizMain extends JFrame implements ActionListener{
	JTextField JText;
	
	
	public QuizMain(String title) {
		setBounds(100,100,900,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JText = new JTextField(10);

		JButton J1 = new JButton("저장");
		add(JText);
		add(J1);
		
		
		JText.addActionListener(this);
		J1.addActionListener(this);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		
			new QuizMain("입력한거 저장하기");
			
			
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String strNum1=JText.getText();
		
		File f = new File("c:/acorn202304/myFolder/diary.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("diary.txt 파일을 만들었다");
			}
			FileWriter fw = new FileWriter(f,true);
			fw.write(strNum1);
			fw.flush();
			fw.close();
			System.out.println("diary.txt ㅠㅏ일에 문자열을 기록했습니다");
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}

}
