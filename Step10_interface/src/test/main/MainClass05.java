package test.main;

import test.mupac.Calc;

public class MainClass05 {

	public static void main(String[] args) {
		Calc add1 = new Calc() {

			@Override
			public double execute(double num1, double num2) {
				
				return num1+num2;
			}
			
		};//위에껄 줄여서 아래처럼할수있다
		
		Calc add2 = (num1,num2)->{
			return num1+num2;
		};
		
		Calc add=(num1,num2)->num1+num2;
		Calc sub=(num1,num2)->num1-num2;
		Calc nul=(num1,num2)->num1/num2;
		
		double result1=add.execute(10, 20);
		double result2=sub.execute(10, 20);
		double result3=nul.execute(10, 20);
		
		
		
	}

}
