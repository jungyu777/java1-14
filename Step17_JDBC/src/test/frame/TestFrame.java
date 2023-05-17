package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class TestFrame extends JFrame implements ActionListener{
   //필요한 필드 정의하기
   JTextField inputName, inputAddr;
   DefaultTableModel model;
   //생성자
   public TestFrame(String title) {
      super(title);
      
      //레이아웃 메니저 설정
      setLayout(new BorderLayout());
      
      JLabel label1=new JLabel("이름");
       inputName=new JTextField(10);
       
       JLabel label2=new JLabel("주소");
       inputAddr=new JTextField(10);
       
       JButton addBtn=new JButton("추가");
       addBtn.setActionCommand("add");
       addBtn.addActionListener(this);
       
       //페널에 UI 를 배치하고    
       JPanel panel=new JPanel();
       panel.add(label1);
       panel.add(inputName);
       panel.add(label2);
       panel.add(inputAddr);
       panel.add(addBtn);
       
       //페널째로 프레임의 북쪽에 배치 
       add(panel, BorderLayout.NORTH);    
       
       panel.setBackground(Color.yellow);
       
       
       JTable table=new JTable();
       
       String[] colNames= {"번호", "이름", "주소"};
       //테이블에 연결할 모델객체 생성 (테이블에 출력할 데이터를 여기에 추가하면 테이블에 출력된다)
       model=new DefaultTableModel(colNames, 0);
       //모델을 테이블에 연결한다.
       table.setModel(model);
       //스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
       JScrollPane scroll=new JScrollPane(table);
       //JScrollPane  을 프레임의 가운데에 배치하기 
       add(scroll, BorderLayout.CENTER);
       
       //회원목록을 얻어오기
       List<MemberDto> list=new MemberDao().getList();
       //반복문 돌면서 
       for(MemberDto tmp:list) {
          //MemberDto 객체 하나당 Object[] 을 하나씩 만들어내서 
          Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
          //모델에 추가하기
          model.addRow(row);
       }
      
   }
   
   
   
   //run 했을때 실행의 흐름이 시작되는 main 메소드
   public static void main(String[] args) {
      TestFrame f=new TestFrame("테스트 프레임");
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      f.setBounds(100, 100, 800, 500);
      f.setVisible(true);
   }
   
   

   @Override
   public void actionPerformed(ActionEvent e) {
      //눌러진 버튼의 액션 command 를 읽어와서 
      String cmd=e.getActionCommand();
      if(cmd.equals("add")) { //만일 추가 버튼을 눌렀다면
         //1. 입력한 이름과 주소를 읽어와서
         String name=inputName.getText();
         String addr=inputAddr.getText();
         //2. MemberDto 객체에 담고
         MemberDto dto=new MemberDto();
         dto.setName(name);
         dto.setAddr(addr);
         //3. MemberDao 객체의 insert() 메소드를 이용해서 DB 에 실제 저장하고 
         boolean isSuccess=new MemberDao().insert(dto);
         //4. 저장성공이면 "저장했습니다" 를 알림에 띄우고
         if(isSuccess) {
            JOptionPane.showMessageDialog(this, "저장했습니다");
            //5. JTable 에 회원목록이 다시 출력되도록 한다.
            //기존에 출력된 내용을 모두 삭제후 다시 출력
            model.setRowCount(0);
            //회원목록을 얻어오기
             List<MemberDto> list=new MemberDao().getList();
             //반복문 돌면서 
             for(MemberDto tmp:list) {
                //MemberDto 객체 하나당 Object[] 을 하나씩 만들어내서 
                Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
                //모델에 추가하기
                model.addRow(row);
             }
         }
      }
   }

}




