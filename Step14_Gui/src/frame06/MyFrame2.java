package frame06;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame2 extends JFrame implements ActionListener{
	JButton sendBtn, deleteBtn,updateBtn;
	
	public MyFrame2(String title) {
		super(title);
		
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		this.sendBtn=new JButton("전송");
		add(sendBtn);
		
		this.deleteBtn=new JButton("삭제");
		add(deleteBtn);
		
		updateBtn= new JButton("수정");
		add(updateBtn);
		
		sendBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		
		setVisible(true);
		
	}//생성자 끝
	
	public static void main(String[] args) {
		new MyFrame2("나의프레임2");
		System.out.println("메인 메소드 종료");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object which = e.getSource();
		if(which == sendBtn) {
		JOptionPane.showMessageDialog(this, "전송합니다");
		}else if(which == deleteBtn) {
			JOptionPane.showMessageDialog(this, "삭제합니다");
		}else if(which == updateBtn) {
			JOptionPane.showMessageDialog(this, "수정합니다");
		}
	}
	   
   
}

