package 나코10;

public class _05_TryWithResources {
	public static void main(String[] args) {
		myFileWriter Writer1 = null;
		try{
			Writer1 = new myFileWriter();
			Writer1.write("아이스크림이 먹고싶어요");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				Writer1.close();
			} catch (Exception e) {
				 
				e.printStackTrace();
			}
		}
		
		System.out.println("-------------------------------");
		//close 메소드를 자동으로 어디선가 호출해주었다
		//try 구문에서 사용할 어떤 리소스 어떤 파일객체를 가로속에서  정의를 하게되면 자동으로 try catch 구문을 빠져나올때
		//close() 메소드를 호출해준다
		//다만 한가지 조건이 있는데 AutoCloseable 을 구현해주어야한다 
		try (myFileWriter writer2 = new myFileWriter()){
			writer2.write("빵이 먹고싶어요");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
}



class myFileWriter implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("파일을 정상적으로 닫습니다..");
		
	}
	
	public void write(String line) {
		System.out.println("파일에 내용을 입력합니다..");
		System.out.println("입력내용 : " + line);
	}
	
}