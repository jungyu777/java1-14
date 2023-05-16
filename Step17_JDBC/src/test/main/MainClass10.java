package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {

	public static void main(String[] args) {
		int num=1;
		String name = "호빵";
		String addr = "독산동";
		//MemberDto 객체를 생성해서
		MemberDto dto1 = new MemberDto();
		//수정할 회원의 정보를 담고
		dto1.setName(name);
		dto1.setAddr(addr);
		dto1.setNum(num);
		//update()메소드의 매개변수에 전달해서 회원정보가 수정되도록한다.
		MainClass10.update(dto1);
	}
	
	
	public static void update(MemberDto dto) {
		Connection conn=null;
		//1번 회원의 주소를 정우성으로 주소를 압구정동 으로 수정하고자 한다.
		//SELECT INSERT DELECT 문 다똑같다
		PreparedStatement pstmt =null;
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			String sql="UPDATE member "
					   +" SET name=?, addr=?"
					   +" WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3,dto.getNum());
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정합니다");		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
