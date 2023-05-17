import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.DeptDto;
import test.dto.Empdto;
import test.util.DBConnect;

public class Empdao {
	/*
	 * - 결과값을 저장할 수 있다.
- 저장된 값을 한 행 단위로 불러올 수 있다.
- 한 행에서 값을 가져올 때는 타입을 지정해 불러올 수 있다.
(이때, sql은 select, show 등을 실행할 목적으로 사용한다.
	 */
		
	   //인자로 전달되는 번호에 해당하는 회원 한명의 정보를 리턴하는 메소드
	   public Empdto getData(int deptno) {
	      //DeptDto 객체의 참조값을 담을 지역변수 미리 만들기
		   Empdto dto=null;
	      
	      //필요한 객체를 담을 지역 변수를 미리 만들기
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
	         //Connection 객체의 참조값 얻어오기
	         conn = new DBConnect().getConn();
	         //실행할 sql 문(select 문)
	         String sql = "SELECT ename, empno, mgr,deptno"
	               + " FROM emp"
	               + " WHERE deptno=? ";
	         pstmt = conn.prepareStatement(sql);
	         //select 문이 미완성이라면 여기서 완성한다.
	         pstmt.setInt(1, deptno);
	         //select 문 수행하고 결과를 ResultSet 으로 리턴받기
	         rs = pstmt.executeQuery();
	         //반복문 돌면서 ResultSet 에 있는 row 에 있는 정보를 추출한다.
	         while (rs.next()) {
	            //현재 커서가 존재하는 row 에 있는 정보를 추출해서 사용한다.
	        	
	            String ename=rs.getString("ename");
	            int empno = rs.getInt("empno");
	            String mgr=rs.getString("mgr");
	            //MemberDto 객체에 회원 한명의 정보를 담는다.
	            dto=new Empdto();
	            dto.setDeptno(deptno);
	            dto.setEname(ename);
	            dto.setEmpno(empno);
	            dto.setMgr(mgr);
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (rs != null)
	               rs.close();
	            if (pstmt != null)
	               pstmt.close();
	            if (conn != null)
	               conn.close();
	         } catch (Exception e) {
	         }
	      }
	      
	      return dto; //메소드가 여기서 끝나고 호출할떄는 QuizMain04 처럼하면된다
	   }
	   
	   //전체 회원의 정보를 리턴하는 메소드
	   public List<Empdto> getList(){
	      //회원 정보를 누적할 객체 생성
	      List<Empdto> list=new ArrayList<>();
	      
	      //필요한 객체를 담을 지역 변수를 미리 만들기
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      try {
	         //Connection 객체의 참조값 얻어오기
	         conn = new DBConnect().getConn();
	         //실행할 sql 문(select 문)
	         String sql = "SELECT deptno, empno,ename, mgr"
	               + " FROM emp"
	               + " ORDER BY deptno DESC";
	         pstmt = conn.prepareStatement(sql);
	         //select 문이 미완성이라면 여기서 완성한다.

	         //select 문 수행하고 결과를 ResultSet 으로 리턴받기
	         rs = pstmt.executeQuery();
	         //반복문 돌면서 ResultSet 에 있는 row 에 있는 정보를 추출한다.
	         while (rs.next()) {
	            //현재 커서가 존재하는 row 에 있는 정보를 추출해서 사용한다.
	            
	            //row 에 있는 회원 정보를 MemberDto 객체에 담아서 
	        	 Empdto dto=new Empdto();
	        	dto.setEmpno(rs.getInt("empno"));
	            dto.setDeptno(rs.getInt("deptno")););
	            dto.setEname(rs.getString("dname"));
	            dto.setMgr(rs.getString("loc"));
	            //List 에 누적시킨다.
	            list.add(dto);
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (rs != null)
	               rs.close();
	            if (pstmt != null)
	               pstmt.close();
	            if (conn != null)
	               conn.close();
	         } catch (Exception e) {
	         }
	      }