package test.main;

public class MainClass02 {

	public static void main(String[] args) {
		int num=0;
		num++;
		num++;
		num++;// num이 최종적으로 3이된다.
		
		int num2=0;
		num2--;
		num2--;
		num2--;//num2가 최종적으로 -3이 된다.
		
		int num3=0;
		int result = num3++; //result 에 0이 대입되고 num3가 1 증가한다
		
		int num4=0;
		int result2 = ++num4; //num4가 1증가하고 result2에 1이 대입된다.

	}

}
