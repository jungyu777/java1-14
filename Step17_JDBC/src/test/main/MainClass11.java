package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass11 {

	public static void main(String[] args) {
		int num=3; //삭제할 회원의 번호라고 가정
		
		//아래의 delete() 메소드를 이용해서 회원 정보를 삭제해 보세요.
		delete(num);
	}
	public static void delete(int num) {
		Connection conn=null;
		
		PreparedStatement pstmt =null;
		try {
			//Connection 객체의 참조값 얻어오기
			
			conn=new DBConnect().getConn();//DBConnect() 클래스에있는getConn() 을 호출
			String sql="DELETE FROM member "
					   +" WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);;
			
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정합니다");		
		}catch(Exception e) {
			e.printStackTrace();
		
		}
	}

}
