package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass02 {
/*
 * Statement 클래스
- SQL 구문을 실행하는 역할
- 스스로는 SQL 구문 이해 못함(구문해석 X) -> 전달역할
- SQL 관리 O + 연결 정보 X

PreparedStatement 클래스
- Statement 클래스의 기능 향상
- 인자와 관련된 작업이 특화(매개변수)
- 코드 안정성 높음. 가독성 높음.
- 코드량이 증가 -> 매개변수를 set해줘야하기 때문에..
- 텍스트 SQL 호출

Execute
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
  
 */
	public static void main(String[] args) {
		//member 테이블에 추가할 회원의 정보라고 가정
		int num = 4;
		String name="주뎅이";
		String addr="봉천동";
		
			//seleCT 문
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
	      //sql문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기
	      PreparedStatement pstmt =null;
	      try {
	    	  //실행할 미완성의 sql문
	    	  String sql="INSERT INTO member"
	    			  	+" (num , name ,addr)"
	    			  	+" VALUES(? ,? ,?)";
	    	  //미완성의 sql 문을 전달하면서 preparedStatement 객체의 참조값 얻어내기
	    	  pstmt = conn.prepareStatement(sql);
	    	  //preparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
	    	  pstmt.setInt(1, num); //1번쨰 ? 에 숫자 바인딩
	    	  pstmt.setString(2,name);//2번쨰 ? 에 문자열 바인딩
	    	  pstmt.setString(3, addr);//3번쨰 ? 에 문자열 바인딩
	    	  pstmt.executeUpdate();
	    	  System.out.println("회원 정보를 저장했습니다");
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }

	}

}
