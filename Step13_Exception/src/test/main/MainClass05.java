package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass05 {
	/*
	 * 현재 존재하거나 혹은 존재하지 않는 파일이나 폴더를 제어 할수 있는 File 객체를 생성해서
	 * 참조값을 f라는 지역변수에 담기
	 */

	public static void main(String[] args) {
		File f = new File("c:/acorn202304/myFolder/memo.txt");
		
		//File 객체의 메소드를 활용해서
		//실제 memo.txt 파일이 존재하지 않으면 파일을 만들고
		//존재하면 memo.txt파일을 삭제하도록 프로그래밍해보세요
		
//		createNewFile 메서드를 사용 방법을 확인해보면 if문 안에서 사용을 하고 있습니다.
//
//		createNewFile 메서드 반환값이 boolean형이기 때문입니다.
//
//		파일 생성 성공을 하면 true를 반환하고 실패하면 false를 반환합니다.
		
//		주의점으로는 지정한 디렉토리가 존재하지 않는 경우에는 에러가 발생하기 때문에 IOException 예외처리를 해주는 것이 좋습니다.
//
//		또는 미리 지정한 폴더가 존재하는지 확인하는 것이 좋습니다.
//
//		디렉토리를 미리 확인하는 방법은 exists 메서드를 사용해 확인할 수 있습니다.
//
//		exists 메서드는 폴더의 경로뿐만 아니라 파일이 존재하는지도 확인할 수 있습니다.
//	
//		해당 기능을 가지고 있는 객체를 new 해서 메소드를 활용해서 작업을한다 :  객체지향 언어 특징	
		try {
            if (f.exists()) {
            	f.delete();
                System.out.println("파일이 존재하면 txt 파일삭제");
            } else {
            	f.createNewFile();
                System.out.println("File created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		  // 폴더 존재 확인
        if (f.exists()) {
            System.out.println("폴더가 있습니다.");
        } else {
            System.out.println("폴더가 없습니다.");
        }
         
        // 파일 존재 확인
        if (f.exists()) {
            System.out.println("파일이 있습니다.");
        } else {
            System.out.println("파일이 없습니다.");
        }
		
    }
}

	        
	


