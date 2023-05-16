package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {

	public static void main(String[] args) {
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
		//4번 회원을 삭제해보세요.
		int num=5;
		
		PreparedStatement pstmt =null;
		try {
			//실행할 미완성의 sql문
			String sql=" DELETE FROM member"
					  + " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num); //첫번쨰 물음료의  위의 지역변수 4번이 삭제됨
			pstmt.executeUpdate();
			System.out.println("회원 정보를 삭제합니다");		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
