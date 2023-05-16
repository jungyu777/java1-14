package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * JDBC( java DataBase Connectivity )
 * 
 * DataBase 에 연결해서 SELECT , INSERTM UPDATE, DELETE 작업하기
 * 
 * Oracle 에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar 파일을
 * 사용할수 있도록 설정해야한다.
 * module info java 삭제
 * 프로젝트에 마우스 우클릭=> Build Path = > Configure Build path=> Librarys 탭선택
 * => classpath 선택 => 우측 Add External jar 버튼을 누른후 =>  ojdbc6.jar 팡ㄹ을 찾은 다음 =>Apply
 * 
 * 
 * Execute
1. 수행결과로 Boolean 타입의 값을 반환합니다.
2. 모든 구문을 수행할 수 있습니다.
execute 함수를 사용하는 방법입니다.
  -> 리턴값이 ResultSet 일 경우에는 true, 이 외의 경우에는 false 로 출력됩니다.
  -> 리턴값이 ResultSet 이라고 하여 ResultSet 객체에 결과값을 담을 수 없습니다.
  
ExecuteQuery
1. 수행결과로 ResultSet 객체의 값을 반환합니다.
2. SELECT 구문을 수행할 때 사용되는 함수입니다.
executeQuery 함수를 사용하는 방법입니다.
 -> ResultSet 객체에 결과값을 담을 수 있습니다  
  
  ExecuteUpdate
1. 수행결과로 Int 타입의 값을 반환합니다.
2. SELECT 구문을 제외한 다른 구문을 수행할 때 사용되는 함수입니다.
executeUpdate 함수를 사용하는 방법입니다.
 -> INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환합니다.
 -> CREATE / DROP 관련 구문에서는 -1 을 반환합니다.
  
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//seleCT 문 table 조회
		   //DB 연결객체를 담을 지역 변수 만들기
	      Connection conn=null;
	      
	      try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      //SeLECT 작업을 위해서 필요한 객체의 참조값을 담을 지역 변수 미리 만들기
	      PreparedStatement pstmt = null;
	      ResultSet rs=null;
	      try {
	    	  //실행할 sql 문
	    	  String sql = "SELECT num,name,addr"
	    			     +" FROM member"
	    			     +" ORDER BY num DESC";
	    	  //prepareStatement 객체의 참조값 얻어오기
	    	  pstmt=conn.prepareStatement(sql);
	    	  //SELECT 문 실행하고 결과 값을 ResultSet 으로 얻어내기
	    	  rs=pstmt.executeQuery();
	    	  while(rs.next()) {//rs.next()커서이동
	    		  int num=rs.getInt("num");
	    		  String name = rs.getString("name");
	    		  String addr = rs.getString("addr");
	    		  //콘솔창에 출력해보기
	    		  System.out.println(num + "|" +name +"|" + addr);
	    	  }
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
		
	}
	
	
}
