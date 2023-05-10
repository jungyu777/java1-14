package test.mypac;

public class MacBook {
	//필드
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//생성자
	public MacBook(Cpu cpu,Memory memory,HardDisk hardDisk) {
		//생성자의 매개변수에 전달된 값을 필드에 저장하기
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
	
	}
	//메소드
	   public void doGame() {
		      if(this.cpu == null || memory == null || hardDisk == null) {
		         System.out.println("부품이 부족해서 게임을 할수가 없어요!");
		         return; //메소드를 여기서 종료하기
		      }
		      System.out.println("신나게 게임을 해요");

	}

}
