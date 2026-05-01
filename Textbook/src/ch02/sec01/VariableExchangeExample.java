package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x : " + x +" , y : " + y);
		
		int temp = x; //temp에 3변수 대입 
		x = y;        // x = 5
		y = temp;     // y = 3
		System.out.println("x :" + x + ", y :" + y);
		
		
		
	}
}
