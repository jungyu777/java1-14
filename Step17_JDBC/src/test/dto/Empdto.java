package test.dto;

//[문항10] scott 계정으로 접속하면 사원 정보를 담고 있는 emp 테이블을 사용할수 있다.
//
//	이클립스에서 run 했을때 사원의 사원번호, 사원이름, 부서번호, 직책이 사원번호에 
//대해서 오름차순 정렬되어서 콘솔창에 모두 출력되도록 프로그래밍 해 보세요.
public class Empdto {
	private int empno;
	private String ename;
	private int deptno;
	private String mgr;
	
	public Empdto() {}
	
public Empdto(int empno,  String ename , int deptno,String mgr) {
		
	}

public int getEmpno() {
	return empno;
}

public void setEmpno(int empno) {
	this.empno = empno;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public int getDeptno() {
	return deptno;
}

public void setDeptno(int deptno) {
	this.deptno = deptno;
}

public String getMgr() {
	return mgr;
}

public void setMgr(String mgr) {
	this.mgr = mgr;
}
}
