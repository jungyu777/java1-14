package test.mypac;

public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	
	//만약 생성자를 정의해서 만들었다면  아무것도 정의하지 않은 (디폴트)생성자도 필요하다면 이렇게 생성자를 만들어주면된다
	public Member() {
		
	};
	
	//생성자 정의하기
	
	public Member(int num,String name, String addr ) {
		this.num=num; // 이렇게 하면 필드에 저장된다
		this.name=name; // 이렇게 하면 필드에 저장된다
		this.addr=addr; // 이렇게 하면 필드에 저장된다
		//this.num 필드의 num  = num은 지역변수(파라미터)num
	}
	
	//메소드
	public void printInfo() {
		System.out.println("번호 : " + num + " 이름 : " + name + "주소" + addr);
	}
	
}
