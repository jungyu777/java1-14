package 나코10;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {

	public static void main(String[] args) {
		try {
			writeFile();
		} catch (IOException e) {
			System.out.println("메인메소드에서 해결할게여ㅛ");
			e.printStackTrace();
		}

	}
	
	public static void writeFile() throws IOException {
//		try {
//			FileWriter writer = new FileWriter("test.txt");
//			throw new IOException("파일 쓰기에 실패했어요!!!");
//		} catch (IOException e) {
//			System.out.println("writeFile 메소드 내에서 자체 해결했어요.");
//			e.printStackTrace();
//		}
		FileWriter writer = new FileWriter("test.txt");
		throw new IOException("파일 쓰기에 실패했어요!!!");
		
	}

}
