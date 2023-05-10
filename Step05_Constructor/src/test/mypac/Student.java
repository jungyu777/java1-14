package test.mypac;
/*	[생성자]
 * 1. 클래스명과 동일하다
 * 2. 메소드 모양과 유사 하지만 리턴 type 이 없다.
 * 3. 객체를 생성할떄(new 할떄) 호출된다.
 * 4. 객체를 생성하는 시점에 무언가 준비 작업을 할떄 유용하다.
 * 5. 생성자를 명시적으로 정의 하지 않아도 기본 생성자는 있다고 간주된다.
 */

public class Student {
	//생성자
	public Student() {
		//생성자는 new 를 통해서 콜하고 메소드는 객체를 만들고 .을 붙여서 콜한다
		//객체를 생성하는 시점에 하고싶은 작업이 있으면 여기서 작업한다
		System.out.println("Student 클래스의 default(기본) 생성자 호출됨");
		//main메소드에서 new Student(); 하면 위에꼐 출력된다 
	}
	
	//메소드
	public void study() {
		System.out.println("공부해요!");
	}
}
