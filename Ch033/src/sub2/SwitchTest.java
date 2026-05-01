/**
 * 날짜 : 2026.04.27
 * 이름 : 김민찬
 * 내용 : Java 조건문 Switch 실습
 */




package sub2;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		System.out.print("숫자 입력 : ");
		
		// 입력
		Scanner sc = new Scanner(System.in);
		
		// 사용자로 부터 숫자 입력받기
		int number = sc.nextInt();
		
		
		System.out.println("입력한 숫자 " + number);
		
		
		switch(number % 2) { // 조건값에 따라 case별 실행흐름으로 분기
		case 0:
			System.out.println("number는 짝수 입니다.");;
		case 1:
			System.out.println("number는 홀수 입니다.1");;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
